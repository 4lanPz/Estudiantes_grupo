public class EstudiantesNoGraduados extends Estudiantes {

    //ATRIBUTOS
    private String periodo;
    private String nueva_fecha_prueba;

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getNueva_fecha_prueba() {
        return nueva_fecha_prueba;
    }

    public void setNueva_fecha_prueba(String nueva_fecha_prueba) {
        this.nueva_fecha_prueba = nueva_fecha_prueba;
    }

    public EstudiantesNoGraduados(String nombre,
                                  String apellido,
                                  String institucion,
                                  String cedula,
                                  String periodo,
                                  String nueva_fecha_prueba) {
        super(nombre, apellido, institucion, cedula);
        this.periodo=periodo;
        this.nueva_fecha_prueba=nueva_fecha_prueba;
    }


}
