package view;
import java.util.Scanner;
import java.util.zip.Deflater;

import model.Usuario;
public class MenuView {


    Scanner ler = new Scanner(System.in);
    // Metodo


    public void menu() {
     
        System.out.println("***Menu***");
        System.out.println("");
        System.out.println("1-Cadastrar Usu�rio");
        System.out.println("2-Cadastrar Fornecedor");
        System.out.println("3-Castrar Tipo Pessoa");
        System.out.println("5-Cadastrar Cliente");
        System.out.println("6-Cadastrar Produto");
        System.out.println("7-Sair");

        int x=ler.nextInt();
        switch(x){
            case 1 : 
            UsuarioView usuario =new UsuarioView();
            usuario.menuUsuario(null);
                 break;
            case 7: System.out.println("Programa finalizado!");
            break;
            default: System.out.println("Opção inválida");
            break;
        }
    }

}