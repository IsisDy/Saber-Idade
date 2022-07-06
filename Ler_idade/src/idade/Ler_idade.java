package idade;
import java.util.Scanner;

public class Ler_idade {

	public static void main(String[] args) {
		System.out.println("===================================================================================================");
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = input.nextLine();
		
		System.out.println("Digite os anos do seu Nascimento: ");
		int ano = input.nextInt();
		int cal_ano =(ano * 365);
		
		System.out.println("Digite os meses do seu Nascimento: ");
		int mes = input.nextInt();
		int cal_mes = (mes * 30);
		
		System.out.println("Digite os dias do seu Nacimento: ");
		int dias = input.nextInt();
		
		int cal = (cal_ano + cal_mes + dias);
		
		System.out.println(nome + " Nasceu a: " + ano + " anos " + ", " + mes + " meses " + "e " + dias + " dias " + "= " + cal + "dias");
		System.out.println("===================================================================================================");
	}
}
