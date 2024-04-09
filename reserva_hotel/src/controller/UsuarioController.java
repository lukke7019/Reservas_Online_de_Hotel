package controller;
import java.util.ArrayList;

import model.Usuario;
public class UsuarioController  {
	private String Senha;
	public String Email;
	private ArrayList<Usuario> usuarios;


	public String CriarUsuario( String Nome, String Email, String Senha) {
	
	Usuario usuarioNovo = new Usuario(Nome, Email,Senha);
	usuarios.add(usuarioNovo);
	
	
	return "Usuario cadastrado com sucesso";
	}

	public String getUsuario() {
		return ("\nEmail" + this.Email
				+"\nSenha" + this.Senha);
	}
	
	void Autenticacao(String Email, String Senha) {
		if (this.Email == Email && this.Senha == Senha);
		{
		
	}
		}
	}

