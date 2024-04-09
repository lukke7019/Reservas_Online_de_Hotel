package model;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;


import Util.FuncaoHASH;

public class Usuario{
	private String Email, Senha, Nome; 
	FuncaoHASH hash = new FuncaoHASH();

	public Usuario(String Nome, String Email, String Senha)  {
		this.Nome = Nome;
		this.Email = Email;
		this.Senha = Senha;
		}
}

