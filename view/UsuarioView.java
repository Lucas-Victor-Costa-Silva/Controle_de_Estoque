package view;
import java.util.Scanner;
import model.Usuario;
public class UsuarioView {
	
	public void menuUsuario(Usuario user){
		Scanner ler =new Scanner(System.in);

		System.out.println("*** Menu de Usu�rio ***");
		System.out.println("1- Cadastrar");
		System.out.println("2- Listar Todos");
		System.out.println("3- Atualizar");
		System.out.println("4- Deletar");
		System.out.println("5- Voltar para o Menu");
		int x=ler.nextInt();

		switch(x){
			case 1 : menuCadastro();break;
			case 2 : menuListar(user);break;
			case 3 : menuAtualizar(user);break;
			case 4 : menuDeletar(user);break;
			case 5 : MenuView menu = new MenuView();
			         menu.menu();break;
			default: System.out.println("Opção inválida!");break;
		}


	}
	
	public void menuCadastro() {
		
		Scanner ler = new Scanner(System.in);
		
		Usuario user = new Usuario();

		System.out.println("*** Cadastro de Usu�rio ***");
		System.out.println(" ");
		System.out.println("Informe Username :");
		user.setUsername(ler.nextLine());
		System.out.println("Iforme Password :");
		user.setPassword(ler.nextLine());
		System.out.println("");
		System.out.println("Cadastro Realizado !!!");

		menuUsuario(user);
	}
	public void menuListar(Usuario user) {
		
		System.out.println("Usu�rio :" + user.getUsername() );
		System.out.println("Senha : "+ user.getPassword());
		menuUsuario(null);
	}
	

	
	public void menuAtualizar(Usuario user) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Atualizando username :");
		user.setUsername (ler.nextLine());
		System.out.println("Atualizando password :");
		user.setPassword (ler.nextLine());
		
		System.out.println("Atualizado com sucesso !!!");
		System.out.println("");
		menuUsuario(user);
	}
	
	public void menuDeletar(Usuario user) {
	System.out.println("Cadastro deletado com sucesso !!! ");	
	user.setUsername(null);
	user.setPassword(null);
		menuUsuario(user);
	}
 
	
}
