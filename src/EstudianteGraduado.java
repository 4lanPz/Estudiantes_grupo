public class EstudianteGraduado extends Estudiantes{
    //Atributos de la clase EstudiantesGraduados
    private double promedio_graduacion;
    private String carrea;
    private String periodo_graduacion;
    public EstudianteGraduado(){
        super("","","","");

    }
    //Constructor
    //se inidica los atributos de la superclase y los atributos de esta clase Estudantesgraduados
    public EstudianteGraduado(double promedio_graduacion, String carrea, String periodo_graduacion,String nombre,String apellido,String institucion,String cedula) {
        super(nombre,apellido,institucion,cedula);
        this.promedio_graduacion = promedio_graduacion;
        this.carrea = carrea;
        this.periodo_graduacion = periodo_graduacion;

    }
    //Getters y setters de los atributos de esta clase EstudiantesGraduados
    public double getPromedio_graduacion() {
        return promedio_graduacion;
    }
    public void setPromedio_graduacion(double promedio_graduacion) {
        this.promedio_graduacion = promedio_graduacion;
    }
    public String getCarrea() {
        return carrea;
    }
    public void setCarrea(String carrea) {
        this.carrea = carrea;
    }
    public String getPeriodo_graduacion() {
        return periodo_graduacion;
    }
    public void setPeriodo_graduacion(String periodo_graduacion) {
        this.periodo_graduacion = periodo_graduacion;
    }
}
