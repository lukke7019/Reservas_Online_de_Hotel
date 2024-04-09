package model;

public class Reserva {
	public int Id;
	public int idQuarto;
	public int idUsuario;
	public int dataInicio;
	public int dataFim;
	public boolean status;
	
	public Reserva (int Id, int idQuarto, int idUsuario, int dataInicio, int dataFim, boolean status) {
		this.Id = Id;
		this.idQuarto = idQuarto;
		this.idUsuario = idUsuario;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.status = status;
	}

	public int getId() {
		return Id;
	}
	
	public void setId(int Id) {
		this.Id = Id;
	}
	
	public int getidQuarto() {
		return idQuarto;
	}
	
	public void setidQuarto(int idQuarto) {
		this.idQuarto = idQuarto;
	}
	
	
}
