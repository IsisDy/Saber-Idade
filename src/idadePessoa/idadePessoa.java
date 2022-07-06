package idadePessoa;
import java.util.Scanner;
/*
Determine qual é a idade que o usuário faz no ano atual. 
Para isso solicite o ano de nascimento do usuário e o ano atual.
 */

public class idadePessoa {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		String nome;
		int ano;
		int anoAtual;
		
		System.out.println("Bem Vindo ao Sistema que Cadastro\n Por Favor Digite seu Nome: ");
		nome = input.nextLine();
		
		System.out.println("Digite o ano Atual: ");
		anoAtual = input.nextInt();
		
		System.out.println("Digite Seu Ano de Nascimento: ");
		ano = input.nextInt();
		
		int idade = anoAtual - ano;
		
		System.out.println(nome + " Atualmente tem " + idade + " anos");
	}

}
