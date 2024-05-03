
public class Reporte {
    Carrera carrera;
    double promedioNotas;
    double promedioEdades;

    public Reporte(Carrera carrera, double promedioNotas, double promedioEdades) {
        this.carrera = carrera;
        this.promedioNotas = promedioNotas;
        this.promedioEdades = promedioEdades;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public double getPromedioNotas() {
        return promedioNotas;
    }

    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }

    public double getPromedioEdades() {
        return promedioEdades;
    }

    public void setPromedioEdades(double promedioEdades) {
        this.promedioEdades = promedioEdades;
    }
}
