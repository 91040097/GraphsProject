package graphs;

import java.util.Scanner;

public class FriendsTester {

	static Scanner stdin = new Scanner(System.in);

	static char getOption() {
		System.out.print("\tChoose action: ");
		System.out.print("(p)rint Graph, ");
		System.out.print("(s)hortest intro chain, ");
		System.out.print("(f)ind cliques, ");
		System.out.print("(g)et connectors, or ");
		System.out.print("(q)uit? => ");
		char response = stdin.next().toLowerCase().charAt(0);
		while (response != 'p' && response != 's' && response != 'f' && response != 'g' && response != 'q') {
			System.out.print("\tYou must enter one of p, s, f, g, or q => ");
			response = stdin.next().toLowerCase().charAt(0);
		}
		return response;
	}

	public static void main(String[] args){
		System.out.print("Enter file name => ");
		String file = stdin.next();
		Friends one = new Friends();
		one.build(file);
		char option;
		while ((option = getOption()) != 'q') {
			if (option == 'p') {
				one.print();
			} else if (option == 's') {
				System.out.println("Shortest Path...");
			} else if (option == 'f') {
				System.out.println("Cliques...");
			} else if (option == 'g') {
				System.out.println("Get the connectors...");
			}
		}
	}
}
