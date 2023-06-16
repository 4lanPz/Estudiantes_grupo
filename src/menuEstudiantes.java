import java.util.Scanner;

public class menuEstudiantes {
    public static void main(String[] args) {
        int op;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n\t *** MENU PRINCIPAL *** \n");
            System.out.println("");
            System.out.println("Opcion:");
            op = sc.nextInt();
            switch (op){
                case 1:{
                    System.out.println("1");
                    break;
                }
                case 2:{
                    System.out.println("2");
                    break;
                }
                default:
            }
        }while(op != 0);
    }
}
