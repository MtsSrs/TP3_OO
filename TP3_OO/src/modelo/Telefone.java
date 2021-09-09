package modelo;

import test_application.Main;

public class Telefone {

    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {
        this.ddd = ddd;
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public static String cadastrarTelefone(int i) {

        System.out.println("Digite o DDD do telefone (apenas n�meros): " + i + "�");
        String ddd = Main.sc.next();

        System.out.println("Digite o n�mero do telefone (apenas n�meros): " + i + "�");
        String numero = Main.sc.next();

        return ("(" + ddd + ")" + numero);
    }

}