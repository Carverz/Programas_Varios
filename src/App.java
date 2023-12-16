import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola Master");

        String nombre = "Carlos Zavarce";
        System.out.println(nombre);

        Scanner sc= new Scanner(System.in);
        System.out.println("Como te llamas Master??:");
        String miNombre = sc.nextLine();
        System.out.println("El usuario se llama " + miNombre);

        System.out.println("Cuanto mides mi pana "+ miNombre);
        float altura = sc.nextFloat();

        if (altura >= 1.80){
            System.out.println("Eres alto master");
        }else{
            System.out.println("Eres bajito master");
        }
    }
}
