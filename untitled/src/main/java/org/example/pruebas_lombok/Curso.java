package org.example.pruebas_lombok;
import lombok.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class Curso {

    @NonNull
    private String nombre;
    private int horas;

}
