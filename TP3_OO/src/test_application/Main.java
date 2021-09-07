package test_application;


import java.util.ArrayList;
import java.util.Scanner;

import modelo.Bebida;
import modelo.Cliente;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static ArrayList <Cliente> clientes;
    public static ArrayList <Bebida> bebidas;

    public static void main(String[] args) {
    int caseSelect = 0;
    clientes = new ArrayList<Cliente>();
    bebidas = new ArrayList<Bebida>();


    	do {
        menuInicial();
        caseSelect = sc.nextInt();
        sc.nextLine();
        switch(caseSelect) {
        case 1:
        		System.out.println("Digite o número de clientes que serão cadastrados");
        		int size = sc.nextInt();
        		sc.nextLine();
        		for(int i = 0; i<size; i++ ) {
                Cliente.cadastrarCliente(i);
        		}
            break;
        case 2:
        		Cliente.visualizarClientes();
            break;
        case 3:
        		System.out.println("Digite o número do cliente desejado");
        		int i = sc.nextInt();
        		sc.nextLine();
        		while(i > clientes.size()) {
        			System.out.println("Não temos tantos clientes(ainda)\nDigite um novo número");
        			i = sc.nextInt();
            		sc.nextLine();
        		}
        		Cliente.editarCliente(i, clientes);
            break;
        case 4:
        		System.out.println("Digite o número do cliente desejado");
    			i = sc.nextInt();
    			sc.nextLine();
        		Cliente.deletarCliente(i, clientes);
            break;
        case 5:
            	System.out.println("5");
            break;
        case 6:
            	System.out.println("Digite o número de bebidas que serão cadastadas");
            	size = sc.nextInt();
            	sc.nextLine();
            	for(i = 0; i<size; i++ ) {
            		Bebida.cadastrarBebida(i);
        		}
            break;
        case 7:
            	Bebida.visualizarBebidas();
            break;
        case 8:
	        	System.out.println("Digite o número da bebida desejada");
	    		i = sc.nextInt();
	    		sc.nextLine();
	    		while(i > bebidas.size()) {
	    			System.out.println("Não temos tantas bebidas(ainda)\nDigite um novo número");
	    			i = sc.nextInt();
	        		sc.nextLine();
	    		}
	    		Bebida.editarBebida(i, bebidas);
	    	break;
        case 9:
        	System.out.println("Digite o número da bebida desejada");
			i = sc.nextInt();
			sc.nextLine();
    		Bebida.deletarBebida(i, bebidas);
    		break;
        default:
            System.out.println("error");
            System.exit(0);
        }
    } while (caseSelect != 15);




    sc.close();
    }

    public static void menuInicial() {
        System.out.println("Escolha uma opção\n" + "1.Cadastro de novo Cliente\n" + "2.Visualizar a lista de clientes\n"
                + "3.Editar um cadastro\n" + "4.Deletar um Cliente\n" + "5.Cadastro de venda\n"
                + "6.Cadastro de nova bebida\n" + "7.Visualizar a lista de bebidas\n" + "8.Editar uma bebida\n"
                + "9.Deletar uma bebida\n");
    }

}