import java.util.Scanner;
//menu principal
public class menuEstudiantes {
    public static void main(String[] args) {

        EstudiantesNoGraduados[] noGraduado = new EstudiantesNoGraduados[2];
        EstudianteGraduado[] graduado = new EstudianteGraduado[3];

        String nombre, apellido, institucion, cedula, periodo_actual, fecha_prueba, carrera, periodo_graduacion;
        double promedio;

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
            System.out.println("0. SALIR");
            System.out.print("Opcion:");
            //se va a ingrersar la opcion que procederá a indicar si el estudiante es graduado o no
            op = sc.nextInt();
            switch (op){
                //si se ingresa la opcion 1 entrará a
                case 1:{
                    a = 1;
                    System.out.println("\n\t\tEstudiantes no graduados");
                    for (int i = 0; i < noGraduado.length; i++){
                        noGraduado[i] = new EstudiantesNoGraduados();
                        System.out.println("\nEstudiante " + (i+1) + " \n");
                        System.out.print("Nombre: ");
                        nombre = sc.next();
                        System.out.print("Apellido: ");
                        apellido = sc.next();
                        System.out.print("Institucion: ");
                        institucion = sc.next();
                        System.out.print("Cedula: ");
                        cedula = sc.next();
                        System.out.print("Periodo: ");
                        periodo_actual = sc.next();
                        System.out.print("Fecha de prueba: ");
                        fecha_prueba = sc.next();
                        noGraduado[i].setNombre(nombre);
                        noGraduado[i].setApellido(apellido);
                        noGraduado[i].setInstitucion(institucion);
                        noGraduado[i].setCedula(cedula);
                        noGraduado[i].setPeriodo(periodo_actual);
                        noGraduado[i].setNueva_fecha_prueba(fecha_prueba);
                    }
                    System.out.println("\n\t\tEstudiantes graduados");
                    for (int i = 0; i < graduado.length; i++){
                        graduado[i] = new EstudianteGraduado();
                        System.out.println("\nEstudiante " + (i+1) + " \n");
                        System.out.print("Nombre: ");
                        nombre = sc.next();
                        System.out.print("Apellido: ");
                        apellido = sc.next();
                        System.out.print("Institucion: ");
                        institucion = sc.next();
                        System.out.print("Cedula: ");
                        cedula = sc.next();
                        System.out.print("Promedio: ");
                        promedio = sc.nextDouble();
                        System.out.print("Carrera: ");
                        carrera = sc.next();
                        System.out.print("Pediodo de Graduación: ");
                        periodo_graduacion = sc.next();
                        graduado[i].setNombre(nombre);
                        graduado[i].setApellido(apellido);
                        graduado[i].setInstitucion(institucion);
                        graduado[i].setCedula(cedula);
                        graduado[i].setPromedio_graduacion(promedio);
                        graduado[i].setCarrea(carrera);
                        graduado[i].setPeriodo_graduacion(periodo_graduacion);
                    }
                    break;
                }
                //si se ingresa la opcion 2 entrará a
                case 2:{
                    if (a == 1){
                        System.out.println("\n\t\tEstudiantes no graduados");
                        for (int i = 0; i < (noGraduado.length); i++){
                            System.out.println("\nEstudiante " + (i+1) + " \n");
                            System.out.println("Nombre: " + noGraduado[i].getNombre());
                            System.out.println("Apellido: " + noGraduado[i].getApellido());
                            System.out.println("Institucion: " + noGraduado[i].getInstitucion());
                            System.out.println("Cedula: " + noGraduado[i].getCedula());
                            System.out.println("Periodo: " + noGraduado[i].getPeriodo());
                            System.out.println("Fecha de prueba: " + noGraduado[i].getNueva_fecha_prueba());
                        }
                        System.out.println("\n\t\tEstudiantes graduados");
                        for (int i = 0; i < (noGraduado.length); i++){
                            System.out.println("\nEstudiante " + (i+1) + " \n");
                            System.out.println("Nombre: " + graduado[i].getNombre());
                            System.out.println("Apellido: " + graduado[i].getApellido());
                            System.out.println("Institucion: " + graduado[i].getInstitucion());
                            System.out.println("Cedula: " + graduado[i].getCedula());
                            System.out.println("Promedio: " + graduado[i].getPromedio_graduacion());
                            System.out.println("Carrera: " + graduado[i].getCarrea());
                            System.out.println("Pediodo de Graduación: " + graduado[i].getPeriodo_graduacion());
                        }
                    }else {
                        System.out.println("\nNo se encuentran registros\n");
                    }
                    break;
                }
                case 0:{
                    System.out.println("\n\t\t Gracias por usar");
                    break;
                }
                default: {
                    System.out.println("\nOpcion incorrecta\n");
                }
            }
            //se indica que si la opcion es igual a 0 el menu se terminará
        }while(op != 0);
    }
}
