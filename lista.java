import java.util.Scanner;
public class lista {
    public static void main(String[]args){
        int num1;
        int num2;
        Scanner sc= new Scanner(System.in);
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicacion");
        System.out.println("4.Division");
        System.out.println("5.Salir");
        int op;
        System.out.println("Ingresa una opcion:");
        op= sc.nextInt();
        System.out.println("Dame un numero:");
        num1=sc.nextInt();
        System.out.println("Dame otro numero:");
        num2=sc.nextInt();
        switch (op){
            case 1:
                int suma=num1+num2;
                System.out.println("El resultado es: "+suma);
		break;
             case 2:
                    int resta=num1-num2;
                    System.out.println("El resultado es: "+resta);
                    break;
case 3:
                    int multiplicacion=num1*num2;
                    System.out.println("El resultado es: "+multiplicacion);
                    break;
        }
    }
}
