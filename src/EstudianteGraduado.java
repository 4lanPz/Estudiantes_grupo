public class EstudianteGraduado extends Estudiantes{
    //Atributos de la clase EstudiantesGraduados
    private double promedio_graduacion;
    private String carrera;
    private String periodo_graduacion;

    //Constructor
    //se inidica los atributos de la superclase y los atributos de esta clase Estudantesgraduados
    public EstudianteGraduado(String nombre,
                              String apellido,
                              String institucion,
                              String cedula,
                              double promedio_graduacion,
                              String carrera,
                              String periodo_graduacion) {
        super(nombre,apellido,institucion,cedula);
        this.promedio_graduacion = promedio_graduacion;
        this.carrera = carrera;
        this.periodo_graduacion = periodo_graduacion;
    }

    //Getters y setters de los atributos de esta clase EstudiantesGraduados
    public double getPromedio_graduacion() { return promedio_graduacion; }
    public void setPromedio_graduacion(double promedio_graduacion) { this.promedio_graduacion = promedio_graduacion; }
    public String getCarrea() { return carrera; }
    public void setCarrea(String carrea) { this.carrera = carrea; }
    public String getPeriodo_graduacion() { return periodo_graduacion; }
    public void setPeriodo_graduacion(String periodo_graduacion) { this.periodo_graduacion = periodo_graduacion; }

}
