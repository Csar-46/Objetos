package org.example.pruebas_lombok;
import lombok.*;
import java.util.ArrayList;
import java.util.Objects;


@Getter @Setter
@ToString
@AllArgsConstructor
public class Instituto {

    @NonNull
    private String nombre;
    private String poblacion;
    private String direccion;
    private ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    private ArrayList<Curso> listaCursos = new ArrayList<>();


    public Instituto (String nombre) {
        this.nombre = Objects.requireNonNullElse(nombre, "Instituto sin nombre");
    }

    public void agregarEstudiante(Estudiante estudiante) {

        if (listaEstudiantes.contains(estudiante)) {
            System.out.println("El estudiante ya existe.");
        }

    }

    public void agregarCurso(Curso curso) {

        if (listaCursos.contains(curso)) {
            System.out.println("El curso ya existe.");
        }else{
            listaCursos.add(curso);
        }
    }

}


