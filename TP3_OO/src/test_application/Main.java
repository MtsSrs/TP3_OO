package test_application;


import java.util.ArrayList;
import java.util.Scanner;

import modelo.Cliente;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static ArrayList <Cliente> clientes;

    public static void main(String[] args) {
    int caseSelect = 0;
    clientes = new ArrayList<Cliente>();


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
        		Cliente.visualizarLista();
            break;
        case 3:
        		System.out.println("Digite o número do cliente desejado");
        		int i = sc.nextInt();
        		sc.nextLine();
        		Cliente.editarCliente(i, clientes);
            break;
        case 4:
        		System.out.println("Digite o número do cliente desejado");
    			i = sc.nextInt();
    			sc.nextLine();
        		Cliente.deletarCliente(i, clientes);
            break;
        case 5:
            System.out.println("mts é gay5");
            break;
        case 6:
            System.out.println("mts é gay6");
            break;
        case 7:
            System.out.println("mts é gay7 flw");
            break;
        default:
            System.out.println("mts é gay e deu pau");
            System.exit(0);
        }
    } while (caseSelect != 7);




    sc.close();
    }

    public static void menuInicial() {
        System.out.println("Escolha uma opção\n" + "1.Cadastro de novo Cliente\n" + "2.Visualizar a lista de clientes\n"
                + "3.Editar um cadastro\n" + "4.Deletar um Cliente\n" + "5.Cadastro de venda\n"
                + "6.Mostrar produtos em estoque\n" + "7.Sair ");
    }

}
