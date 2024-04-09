package App;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import javax.swing.JOptionPane;

import controller.UsuarioController;
import view.Mensagens;

public class Main {

	public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		
		UsuarioController usuarioController = new UsuarioController();
		
		
		Mensagens mensagem = new Mensagens(); 
		
		String opcao;
		int opcaoNum;
		
		do {
			opcao = mensagem.solicitarEntrada("San Andreas Hotel"
					+ "\n1 - CADASTRAR"
					+ "\n2 - LOGIN"
					+ "\n3 - SAIR"
					);
		
		opcaoNum = Integer.parseInt(opcao);
		
		switch (opcaoNum) {
			
			case 1: //CADASTRO
		String NomeCadastro = mensagem.solicitarEntrada
				("FAZER CADASTRO"+"\n Digite seu nome");
	 
	 	String EmailCadastro = mensagem.solicitarEntrada
				("\n Digite seu email");
	 
	 	String SenhaCadastro = mensagem.solicitarEntrada
				("\n Digite seu senha");
	 	mensagem.mostrarInformacao(usuarioController.CriarUsuario(NomeCadastro, EmailCadastro, SenhaCadastro));				
				break;
		    
			case 2: //Login
		 String EmailLogin = mensagem.solicitarEntrada
					("\n Digite seu email");
		 
		 String SenhaLogin = mensagem.solicitarEntrada
					("\n Digite seu senha");

				
				
				break;
				
			case 3:
				
				
				
				break;	
			}
		
		
		
		
		} while (opcaoNum == 3); 
		

	}

}
