package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados do primeiro campeão: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		System.out.print("Armadura: ");
		int armor = sc.nextInt();
		
		Champion champ1 = new Champion(name, life, attack, armor);
		
		sc.nextLine();
		System.out.println();
		System.out.println("Digite os dados do segundo campeão: ");
		System.out.print("Nome: ");
		name = sc.nextLine();
		System.out.print("Vida inicial: ");
		life = sc.nextInt();
		System.out.print("Ataque: ");
		attack = sc.nextInt();
		System.out.print("Armadura: ");
		armor = sc.nextInt();
		
		Champion champ2 = new Champion(name, life, attack, armor);
		
		System.out.println();
		System.out.print("Quantos turnos você deseja executar? ");
		int turns = sc.nextInt();
		int count = 0;
		
		while (count < turns) {
			System.out.println();
			champ1.takeDamage(champ2);
			champ2.takeDamage(champ1);
			
			System.out.println("Resultado do turno " + (count + 1));
			System.out.println(champ1.status());
			System.out.println(champ2.status());
			
			if (champ1.getLife() == 0 || champ2.getLife() == 0) {
				break;
			}
			
			count++;
		}
		
		System.out.println();
		System.out.println("FIM DO COMBATE");
		
		sc.close();
	}

}
