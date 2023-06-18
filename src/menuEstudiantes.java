import java.util.ArrayList;
import java.util.Scanner;
//menu principal
public class menuEstudiantes {
    public static void main(String[] args) {

        //Arreglo de objetos de las clases estudiantes graduados y no graduados
        ArrayList<EstudianteGraduado>estudiantesGraduados=new ArrayList<EstudianteGraduado>();
        ArrayList<EstudianteNoGraduado> estudiantesNoGraduados =new ArrayList<EstudianteNoGraduado>();
        //Instancias. Sus atributos serán inicializados luego
        estudiantesNoGraduados.add(new EstudianteNoGraduado("","","","","",""));
        estudiantesNoGraduados.add(new EstudianteNoGraduado("","","","","",""));
        estudiantesNoGraduados.add(new EstudianteNoGraduado("","","","","",""));

        estudiantesGraduados.add(new EstudianteGraduado("","","","",0,"",""));
        estudiantesGraduados.add(new EstudianteGraduado("","","","",0,"",""));

        //Variables donde se guardaran los valores ingresados por teclado
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
            sc.nextLine();
            switch (op){
                //si se ingresa la opcion 1 entrará a
                case 1:
                    int j=1, k=1;
                    a = 1;
                    System.out.println("\n\t\tEstudiantes no graduados");
                    for (EstudianteNoGraduado estudianteNoGraduado : estudiantesNoGraduados){
                        System.out.println("\nEstudiante " + (j) + " \n");
                        System.out.print("Nombre: ");
                        nombre = sc.nextLine();
                        estudianteNoGraduado.setNombre(nombre);
                        System.out.print("Apellido: ");
                        apellido = sc.nextLine();
                        estudianteNoGraduado.setApellido(apellido);
                        System.out.print("Institucion: ");
                        institucion = sc.nextLine();
                        estudianteNoGraduado.setInstitucion(institucion);
                        System.out.print("Cedula: ");
                        cedula = sc.nextLine();
                        estudianteNoGraduado.setCedula(cedula);
                        System.out.print("Periodo: ");
                        periodo_actual = sc.nextLine();
                        estudianteNoGraduado.setPeriodo(periodo_actual);
                        System.out.print("Fecha de prueba: ");
                        fecha_prueba = sc.nextLine();
                        estudianteNoGraduado.setNueva_fecha_prueba(fecha_prueba);
                        j++;
                    }
                    System.out.println("\n\t\tEstudiantes graduados");
                    for (EstudianteGraduado estudianteGraduado : estudiantesGraduados){
                        System.out.println("\nEstudiante " + (k) + " \n");
                        System.out.print("Nombre: ");
                        nombre = sc.nextLine();
                        estudianteGraduado.setNombre(nombre);
                        System.out.print("Apellido: ");
                        apellido = sc.nextLine();
                        estudianteGraduado.setApellido(apellido);
                        System.out.print("Institucion: ");
                        institucion = sc.nextLine();
                        estudianteGraduado.setInstitucion(institucion);
                        System.out.print("Cedula: ");
                        cedula = sc.nextLine();
                        estudianteGraduado.setCedula(cedula);
                        System.out.print("Promedio: ");
                        promedio = sc.nextDouble();
                        estudianteGraduado.setPromedio_graduacion(promedio);
                        System.out.print("Carrera: ");
                        sc.nextLine();
                        carrera = sc.nextLine();
                        estudianteGraduado.setCarrea(carrera);
                        System.out.print("Pediodo de Graduación: ");
                        periodo_graduacion = sc.nextLine();
                        estudianteGraduado.setPeriodo_graduacion(periodo_graduacion);
                        k++;
                    }
                    break;

                //si se ingresa la opcion 2 entrará a
                case 2:
                    if (a == 1){
                        System.out.println("\n\t\tEstudiantes no graduados");
                        for (int i=0; i<estudiantesNoGraduados.size(); i++){
                            System.out.println("\nEstudiante " +(i+1)+" \n");
                            System.out.println("Nombre: " + estudiantesNoGraduados.get(i).getNombre());
                            System.out.println("Apellido: " + estudiantesNoGraduados.get(i).getApellido());
                            System.out.println("Institucion: " + estudiantesNoGraduados.get(i).getInstitucion());
                            System.out.println("Cedula: " + estudiantesNoGraduados.get(i).getCedula());
                            System.out.println("Periodo: " + estudiantesNoGraduados.get(i).getPeriodo());
                            System.out.println("Fecha de prueba: " + estudiantesNoGraduados.get(i).getNueva_fecha_prueba());

                        }
                        int h=1;
                        System.out.println("\n\t\tEstudiantes graduados");
                        for (EstudianteGraduado estudianteG : estudiantesGraduados){
                            System.out.println("\nEstudiante "+h+" \n");
                            System.out.println("Nombre: " + estudianteG.getNombre());
                            System.out.println("Apellido: " + estudianteG.getApellido());
                            System.out.println("Institucion: " + estudianteG.getInstitucion());
                            System.out.println("Cedula: " + estudianteG.getCedula());
                            System.out.println("Promedio: " + estudianteG.getPromedio_graduacion());
                            System.out.println("Carrera: " + estudianteG.getCarrea());
                            System.out.println("Pediodo de Graduación: " + estudianteG.getPeriodo_graduacion());
                            h++;
                        }
                    }else {
                        System.out.println("\nNo se encuentran registros\n");
                    }
                    break;

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
