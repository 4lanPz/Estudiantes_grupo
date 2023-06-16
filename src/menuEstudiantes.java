import java.util.Scanner;
//menu principal
public class menuEstudiantes {
    public static void main(String[] args) {
        //Variable en donde se va a indicar el valor de la opcion
        int op;
        Scanner sc = new Scanner(System.in);
        //bucle do while para el menu, en el cual se indicara si el estudiante esta graduado o no graduado
        do {
            //se imprime los textos que indican el inicio del menu
            System.out.println("\n\t *** MENU PRINCIPAL *** \n");
            System.out.println("");
            System.out.println("Opcion:");
            //se va a ingrersar la opcion que procederá a indicar si el estudiante es graduado o no
            op = sc.nextInt();
            switch (op){
                //si se ingresa la opcion 1 entrará a
                case 1:{
                    System.out.println("1. ");
                    break;
                }
                //si se ingresa la opcion 2 entrará a
                case 2:{
                    System.out.println("2");
                    break;
                }
                default:
            }
            //se indica que si la opcion es igual a 0 el menu se terminará
        }while(op != 0);
    }
}
