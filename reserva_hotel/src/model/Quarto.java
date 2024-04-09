package model;

public class Quarto {
	public int Id;
	public double Preco;
	public String Disponibilidade;
	public String tipoQuarto;
	
	public Quarto(String Disponibilidade, String tipoQuarto) {
		this.Disponibilidade = Disponibilidade;
		this.tipoQuarto = tipoQuarto;
		this.Preco = 0;
		this.Id = 0;
		}
	
	public String getDisponibilidade() {
		return Disponibilidade;
	}
	
	public void setDisponibilidade(String Disponibilidade) {
		this.Disponibilidade = Disponibilidade;
	}
	
	public String gettipoQuarto() {
		return tipoQuarto;
	}
	
	public void settipoQuarto(String tipoQuarto) {
		this.tipoQuarto = tipoQuarto;
	}
	
	public double Preco() {
		return Preco;
	}
	
	public void setPreco (double Preco) {
		this.Preco = Preco;
	}
	
	public int Id() {
		return Id;
	}
	
	public void setId (int Id) {
		this.Id = Id;
	}
	
	

	
	
	
	
}
