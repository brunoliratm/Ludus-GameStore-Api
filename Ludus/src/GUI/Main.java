package GUI;
import java.util.Scanner;
import Tratamento.Limpeza;
import Tratamento.Tratamentos;
import Servico.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
        Limpeza.limpar();
        System.out.print("B");
        Thread.sleep(150);
        System.out.print("e");
        Thread.sleep(150);
        System.out.print("m");
        Thread.sleep(150);
        System.out.print("-");
        Thread.sleep(150);
        System.out.print("v");
        Thread.sleep(150);
        System.out.print("i");
        Thread.sleep(150);
        System.out.print("n");
        Thread.sleep(150);
        System.out.print("d");
        Thread.sleep(150);
        System.out.print("o");
        Thread.sleep(150);
        System.out.print(" ");
        Thread.sleep(150);
        System.out.print("a");
        Thread.sleep(150);
        System.out.print("o");
        Thread.sleep(150);
        System.out.print(" ");
        Thread.sleep(150);
        System.out.print("L");
        Thread.sleep(150);
        System.out.print("u");
        Thread.sleep(150);
        System.out.print("d");
        Thread.sleep(150);
        System.out.print("u");
        Thread.sleep(150);
        System.out.print("s\n");
        Thread.sleep(2000);

        menuPrincipal();
    }

    public static void menuPrincipal() throws InterruptedException {
        System.out.println("[1] Cadastrar Usuario");
        System.out.println("[2] Logar");
        System.out.println("[4] Sair\n");

        try {
            int opcao = sc.nextInt();
            Limpeza.limpar();
            switch (opcao) {
                case 1:

                    break;
                case 2:
                    LoginUsuario.loginUsuario();
                    break;
                case 3:
                    Limpeza.limpar();
                    System.out.println("Listando usuarios...");
                    break;
                case 4:
                    Limpeza.limpar();
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
                default:
                    Tratamentos.opcaoInvalida();
                    menuPrincipal();
                    break;
            }

        } catch (Exception e) {
            Tratamentos.valorInvalido();
            menuPrincipal();
        }
    }
}


