package model;


import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;


import Util.FuncaoHASH;



public class Usuario{
	private String Email, Senha;
	
	FuncaoHASH hash = new FuncaoHASH();
	public Usuario(String Email, String Senha) throws NoSuchAlgorithmException, UnsupportedEncodingException {
	this.Email = Email;
	this.Senha = hash.ConverterHash(Senha);
		
	System.out.println("Digite uma senha:");
	}
}

