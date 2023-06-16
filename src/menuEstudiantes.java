import java.util.Scanner;
//menu principal
public class menuEstudiantes {
    public static void main(String[] args) {
        Estudiantes est1 = new EstudiantesNoGraduados("","","","","","");

        //Variable en donde se va a indicar el valor de la opcion
        int op, a = 0;
        Scanner sc = new Scanner(System.in);
        //bucle do while para el menu, en el cual se indicara si el estudiante esta graduado o no graduado
        do {
            //se imprime los textos que indican el inicio del menu
            //Se indica las opciones del menu
            System.out.println("\n\t *** MENU PRINCIPAL *** \n");
            System.out.println("1. Ingresar estudiantes");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("3. SALIR");
            System.out.println("Opcion:");
            //se va a ingrersar la opcion que procederá a indicar si el estudiante es graduado o no
            op = sc.nextInt();
            switch (op){
                //si se ingresa la opcion 1 entrará a
                case 1:{
                    a = 1;
                    String nombre, apellido, institucion, cedula, periodo_actual, fecha_prueba, carrera, periodo_graduacion;
                    double promedio;
                    System.out.print("Nombre: ");
                    nombre = sc.nextLine();
                    System.out.println("Apellido: ");
                    apellido = sc.nextLine();
                    System.out.println("Institucion: ");
                    institucion = sc.nextLine();
                    System.out.println("Cedula: ");
                    cedula = sc.nextLine();
                    System.out.println("Periodo: ");
                    periodo_actual = sc.nextLine();
                    System.out.println("Fecha de prueba: ");
                    fecha_prueba = sc.nextLine();

                    System.out.print("Nombre: ");
                    nombre = sc.nextLine();
                    System.out.println("Apellido: ");
                    apellido = sc.nextLine();
                    System.out.println("Institucion: ");
                    institucion = sc.nextLine();
                    System.out.println("Cedula: ");
                    cedula = sc.nextLine();
                    System.out.println("Periodo: ");
                    periodo_actual = sc.nextLine();
                    System.out.println("Fecha de prueba: ");
                    fecha_prueba = sc.nextLine();
                    System.out.print("Nombre: ");
                    nombre = sc.nextLine();
                    System.out.println("Apellido: ");
                    apellido = sc.nextLine();
                    System.out.println("Institucion: ");
                    institucion = sc.nextLine();
                    System.out.println("Cedula: ");
                    cedula = sc.nextLine();
                    System.out.println("Promedio: ");
                    promedio = sc.nextDouble();
                    System.out.println("Carrera: ");
                    carrera = sc.nextLine();
                    System.out.println("Pediodo de Graduación: ");
                    periodo_graduacion = sc.nextLine();
                    System.out.print("Nombre: ");
                    nombre = sc.nextLine();
                    System.out.println("Apellido: ");
                    apellido = sc.nextLine();
                    System.out.println("Institucion: ");
                    institucion = sc.nextLine();
                    System.out.println("Cedula: ");
                    cedula = sc.nextLine();
                    System.out.println("Promedio: ");
                    promedio = sc.nextDouble();
                    System.out.println("Carrera: ");
                    carrera = sc.nextLine();
                    System.out.println("Pediodo de Graduación: ");
                    periodo_graduacion = sc.nextLine();
                    System.out.print("Nombre: ");
                    nombre = sc.nextLine();
                    System.out.println("Apellido: ");
                    apellido = sc.nextLine();
                    System.out.println("Institucion: ");
                    institucion = sc.nextLine();
                    System.out.println("Cedula: ");
                    cedula = sc.nextLine();
                    System.out.println("Promedio: ");
                    promedio = sc.nextDouble();
                    System.out.println("Carrera: ");
                    carrera = sc.nextLine();
                    System.out.println("Pediodo de Graduación: ");
                    periodo_graduacion = sc.nextLine();
                    break;
                }
                //si se ingresa la opcion 2 entrará a
                case 2:{
                    if (a != 0){
                    }else {
                        System.out.println("\nNo se encuentran registros\n");
                    }
                    break;
                }
                default:
                    System.out.println("\nOpcion incorrecta\n");
            }
            //se indica que si la opcion es igual a 0 el menu se terminará
        }while(op != 0);
    }
    public void ingreso_est(){
        String nombre, apellido, institucion, cedula, periodo_actual, fecha_prueba, carrera, periodo_graduacion;
        double promedio;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        System.out.println("Apellido: ");
        apellido = sc.nextLine();
        System.out.println("Institucion: ");
        institucion = sc.nextLine();
        System.out.println("Cedula: ");
        cedula = sc.nextLine();
        System.out.println("Periodo: ");
        periodo_actual = sc.nextLine();
        System.out.println("Fecha de prueba: ");
        fecha_prueba = sc.nextLine();
        Estudiantes est1 = new EstudiantesNoGraduados(nombre, apellido, institucion, cedula, periodo_actual, fecha_prueba);
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        System.out.println("Apellido: ");
        apellido = sc.nextLine();
        System.out.println("Institucion: ");
        institucion = sc.nextLine();
        System.out.println("Cedula: ");
        cedula = sc.nextLine();
        System.out.println("Periodo: ");
        periodo_actual = sc.nextLine();
        System.out.println("Fecha de prueba: ");
        fecha_prueba = sc.nextLine();
        Estudiantes est2 = new EstudiantesNoGraduados(nombre, apellido, institucion, cedula, periodo_actual, fecha_prueba);
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        System.out.println("Apellido: ");
        apellido = sc.nextLine();
        System.out.println("Institucion: ");
        institucion = sc.nextLine();
        System.out.println("Cedula: ");
        cedula = sc.nextLine();
        System.out.println("Promedio: ");
        promedio = sc.nextDouble();
        System.out.println("Carrera: ");
        carrera = sc.nextLine();
        System.out.println("Pediodo de Graduación: ");
        periodo_graduacion = sc.nextLine();
        Estudiantes est3 = new EstudianteGraduado(nombre, apellido, institucion, cedula, promedio, carrera, periodo_graduacion);
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        System.out.println("Apellido: ");
        apellido = sc.nextLine();
        System.out.println("Institucion: ");
        institucion = sc.nextLine();
        System.out.println("Cedula: ");
        cedula = sc.nextLine();
        System.out.println("Promedio: ");
        promedio = sc.nextDouble();
        System.out.println("Carrera: ");
        carrera = sc.nextLine();
        System.out.println("Pediodo de Graduación: ");
        periodo_graduacion = sc.nextLine();
        Estudiantes est4 = new EstudianteGraduado(nombre, apellido, institucion, cedula, promedio, carrera, periodo_graduacion);
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        System.out.println("Apellido: ");
        apellido = sc.nextLine();
        System.out.println("Institucion: ");
        institucion = sc.nextLine();
        System.out.println("Cedula: ");
        cedula = sc.nextLine();
        System.out.println("Promedio: ");
        promedio = sc.nextDouble();
        System.out.println("Carrera: ");
        carrera = sc.nextLine();
        System.out.println("Pediodo de Graduación: ");
        periodo_graduacion = sc.nextLine();
        Estudiantes est5 = new EstudianteGraduado(nombre, apellido, institucion, cedula, promedio, carrera, periodo_graduacion);
    }
}
