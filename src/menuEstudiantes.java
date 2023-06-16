import java.util.Scanner;
//menu principal
public class menuEstudiantes {
    public static void main(String[] args) {
        //se crea las instancias de los estudiantes
        EstudiantesNoGraduados() estu1 =new  EstudiantesNoGraduados(" ", " ", " ", " ", " ", " ");
        EstudiantesNoGraduados() estu3 new EstudiantesNoGraduados(" ", " "," "," "," "," ");





        //Variable en donde se va a indicar el valor de la opcion
        int op;
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
                    EstudianteGraduado Est1 = new EstudianteGraduado();
                    Est1.setNombre("Jared");
                    Est1.setApellido("Valenzuela");
                    Est1.setInstitucion("EPN");
                    Est1.setCedula("1719446820");
                    Est1.setPeriodo_graduacion("");
                    Est1.setPromedio_graduacion(0.00);

                    break;
                }
                //si se ingresa la opcion 2 entrará a
                case 2:{
                    EstudiantesNoGraduados Est = new EstudiantesNoGraduados();
                    Est.setNombre("Jared");
                    Est.setApellido("");
                    Est.setInstitucion("");
                    Est.setCedula("");
                    Est.setPeriodo("");
                    Est.setNueva_fecha_prueba("");

                    break;
                }
                default:
            }
            //se indica que si la opcion es igual a 0 el menu se terminará
        }while(op != 0);
    }
}
