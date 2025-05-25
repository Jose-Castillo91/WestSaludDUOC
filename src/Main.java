import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Se da la bienvenida al sistema
        System.out.println("Bienvenido a West Salud");
        System.out.println("Ingrese clave de seguridad: ");

        //Se piden datos al usuario
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();
        System.out.println(password);

        // Ahora hay que validar los requisitos de la clave
        boolean largo = false;
        int largoPassword = password.length();
        if (largoPassword > 5){
            largo = true;
            System.out.println(largo + "Cumple Largo");
        }

        // Validación de letra
        boolean tieneLetra = false;
        for (int i = 0; i < password.length(); i++) {
            char caracter = password.charAt(i);
            if (Character.isLetter(caracter)){
                tieneLetra = true;
                System.out.println(tieneLetra + "Cumple Letra");
                break;
            }
        }

        // Validación de numero
        boolean tieneNumero = false;
        for (int i = 0; i < password.length(); i++) {
            int caracter = password.charAt(i);
            if (Character.isDigit(caracter)){
                tieneNumero = true;
                System.out.println(tieneNumero + "Cumple Numero");
                break;
            }
        }

        // Validación de caracter especial
        boolean tieneEspecial = false;
        for (int i = 0; i < password.length(); i++) {
            char caracter = password.charAt(i);
            if (!Character.isDigit(caracter) && !Character.isLetter(caracter)){
                tieneEspecial = true;
                System.out.println(tieneEspecial + "Cumple Especial");
                break;
            }
        }

        // Validación final
        if (largo && tieneLetra && tieneNumero && tieneEspecial){
            System.out.println("La clave cumple los requisitos");
        } else {
            System.out.println("La clave no cumple con los requisitos");
        }
    }
}

