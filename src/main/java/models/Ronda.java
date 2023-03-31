package models;

import java.util.List;

public class Ronda {

	private int nro;
	private Partido[] partidos;
	public Ronda (int nro, List<Partido> resultadoList){
		this.nro=nro;
		this.partidos= new Partido[resultadoList.size()];
	}
	public int getNro() {
		return nro;
	}
	
	public void setNro(int nro) {
		this.nro = nro;
	}
	
	public Partido[] getPartidos() {
		return partidos;
	}
	
	public void setPartidos(Partido[] partidos) {
		this.partidos = partidos;
	}
	
}
