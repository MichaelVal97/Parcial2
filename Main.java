import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListaEstudiante listaEstudiante = new ListaEstudiante();
        ListaCarrera listaCarrera = new ListaCarrera();
        List<Reporte> reportesCarreras = generarReportes(listaEstudiante, listaCarrera);
        imprimirReportes(reportesCarreras);
    }

    private static void imprimirReportes(List<Reporte> reportesCarreras) {
        System.out.println("Reportes de Carreras:");
        for (Reporte reporte : reportesCarreras) {
            System.out.println("Carrera: " + reporte.getCarrera() +
                    ", Promedio de notas: " + reporte.getPromedioNotas() +
                    ", Promedio de edades: " + reporte.getPromedioEdades());
        }
    }

    public static List<Reporte> generarReportes(ListaEstudiante listaEstudiante, ListaCarrera listaCarrera) {
        List<Reporte> reportes = new ArrayList<>();
        for (Carrera carrera : listaCarrera.getCarreras()) {
            List<Estudiante> estudiantesCarrera = listaEstudiante.getEstuPorCarre(carrera.getCodigo());
            double promedioNotas = calcularPromedioNotas(estudiantesCarrera);
            double promedioEdades = calcularPromedioEdades(estudiantesCarrera);
            reportes.add(new Reporte(carrera, promedioNotas, promedioEdades));
        }
        return reportes;
    }

    public static double calcularPromedioNotas(List<Estudiante> estudiantes) {
        double sumaNotas = 0;
        for (Estudiante estudiante : estudiantes) {
            sumaNotas += estudiante.getPromedio();
        }
        return sumaNotas / estudiantes.size();
    }


    public static double calcularPromedioEdades(List<Estudiante> estudiantes) {
        double sumaEdades = 0;
        for (Estudiante estudiante : estudiantes) {
            sumaEdades += estudiante.getEdad();
        }
        return sumaEdades / estudiantes.size();
    }


}

