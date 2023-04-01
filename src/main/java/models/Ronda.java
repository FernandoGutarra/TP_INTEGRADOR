package models;

public class Ronda {

	private int nro;
	private Partido[] partidos;
	public Ronda (int nro,int MAXPARTIDOS){
		this.nro=nro;
		this.partidos= new Partido[MAXPARTIDOS];
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



}
