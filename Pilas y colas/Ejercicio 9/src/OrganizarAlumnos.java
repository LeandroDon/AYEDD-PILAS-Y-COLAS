import java.util.*;

public class OrganizarAlumnos {
    public static List<Queue<String>> organizarAlumnosPorMateria(Queue<String> colaAlumnos, String[] materias) {
        List<Queue<String>> alumnosPorMateria = new ArrayList<>();

        for (int i = 0; i < materias.length; i++) {
            alumnosPorMateria.add(new LinkedList<>());
        }

        while (!colaAlumnos.isEmpty()) {
            String alumno = colaAlumnos.poll();
            String[] partes = alumno.split(":");
            
            if (partes.length == 2) {
                String nombre = partes[0];
                String materia = partes[1];

                int indiceMateria = -1;
                for (int i = 0; i < materias.length; i++) {
                    if (materias[i].equals(materia)) {
                        indiceMateria = i;
                        break;
                    }
                }

                if (indiceMateria != -1) {
                    alumnosPorMateria.get(indiceMateria).add(nombre);
                }
            }
        }

        return alumnosPorMateria;
    }

    public static void main(String[] args) {
        Queue<String> colaAlumnos = new LinkedList<>();
        colaAlumnos.add("Juan:Matemáticas");
        colaAlumnos.add("María:Física");
        colaAlumnos.add("Carlos:Matemáticas");
        colaAlumnos.add("Laura:Física");
        colaAlumnos.add("Pedro:Química");

        String[] materias = {"Matemáticas", "Física", "Química"};

        List<Queue<String>> alumnosPorMateria = organizarAlumnosPorMateria(colaAlumnos, materias);

        for (int i = 0; i < materias.length; i++) {
            String materia = materias[i];
            Queue<String> alumnos = alumnosPorMateria.get(i);

            System.out.println("Materia: " + materia);
            System.out.println("Alumnos: " + alumnos);
            System.out.println();
        }
    }
}
