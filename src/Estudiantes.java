public class Estudiantes {
    //atributos de la superclase Estudiantes
     String nombre;
     String apellido;
     String institucion;
     String cedula;

     public Estudiantes(){};

    //Constructor de la superclase estudiantes indicando los atributos principales que van a usar el resto de las clases
    public Estudiantes(String nombre, String apellido, String institucion, String cedula) {
        this.nombre = this.nombre;
        this.apellido = this.apellido;
        this.institucion = this.institucion;
        this.cedula = this.cedula;
    }

    //getters y setter de la superclase Estudiantes
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getInstitucion() {
        return institucion;
    }
    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

}
