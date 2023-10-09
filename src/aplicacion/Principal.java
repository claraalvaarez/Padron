package aplicacion;
import presentacion.InterfazUsuario;
import java.util.Scanner;
public class SimpleTesting{
	public static void main(String[] args) {
		System.out.println("Enter Input : ");
		Scanner scanner = new Scanner (System.in);
		int a = scanner.nextInt();
		System.out.println(a);
		scanner.close();
	}
	}

public class Principal{
	public static void main(String[] args){ 
		InterfazUsuario.ejecutar(args);
	}
}

