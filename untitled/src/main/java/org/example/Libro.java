package org.example;

public class Libro {

    public static int cantidadLibros=0;
    public static int librosDisponibles=0;
    public static final String ID_LIBROS = "LIB";

    private String titulo;
    private String autor;
    private String id;
    private boolean disponible;
    private Estudiante estudiantePrestado;

    public Libro(String titulo, String autor){

        this.titulo = titulo;
        this.autor = autor;
        disponible = true;
        cantidadLibros ++;
        librosDisponibles ++;
        this.id = calcularID();  //id calcular
        estudiantePrestado = null;

    }

    private String calcularID(){

//        if (cantidadLibros < 10){

//            return ID_LIBROS + "00" + cantidadLibros;

//        } else if (cantidadLibros < 100) {

//            return ID_LIBROS + "0" + cantidadLibros;

//        }else {

//            return ID_LIBROS + cantidadLibros;

//        }

        return ID_LIBROS + String.format("%03d",cantidadLibros);
    }

    public void prestar(Estudiante estudiante){

        if(this.disponible && estudiante.getLibroPrestado() == null){

            this.disponible = false;
            System.out.println("El libro " + getTitulo() + " ha sido prestado con éxito.");
            librosDisponibles--;
            estudiantePrestado = estudiante;
            estudiante.setLibroPrestado(this);


        }else if (estudiante.getLibroPrestado() != null){
            System.out.println("El estudiante " + estudiante.getNombre() + " ya tiene un libro prestado!" );
        } else{
            System.out.println("El libro " + getTitulo() + " no se puede prestar!");
        }
    }

    public void devolver(Estudiante estudiante){

        if(!this.disponible){

            this.disponible = true;
            System.out.println("El libro " + getTitulo() + " se ha devuelto con éxito.");
            librosDisponibles++;
            estudiantePrestado = null;
            estudiante.setLibroPrestado(null);

        }else{
            System.out.println("El libro " + getTitulo() + " ya esta en stock!");
        }
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void estaDisponible (){

        if(getDisponible()){

            System.out.println("El libro " + getTitulo() + " está disponible");

        }else{System.out.println("El libro " + getTitulo() + " no está disponible");}
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getId() {
        return id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public static int getLibrosDisponibles() {
        return librosDisponibles;
    }

    public static int getTotalLibros() {
        return cantidadLibros;
    }

    public Estudiante getEstudiantePrestado() {
        return estudiantePrestado;
    }

    public void setEstudiantePrestado(Estudiante estudiantePrestado) {
        this.estudiantePrestado = estudiantePrestado;
    }

    @Override
    public String toString(){
        if (estudiantePrestado == null){

            return "Libro : [ titulo = " + getTitulo() + " autor = " + getAutor() + " id = " + getId() + " disponible = " + getDisponible() + " ]";


        }else{
            return "Libro : [ titulo = " + getTitulo() + " autor = " + getAutor() + " id = " + getId() + " disponible = " + getDisponible() + " estudiante = " + estudiantePrestado.getNombre() + " ]";

        }
    }
}


