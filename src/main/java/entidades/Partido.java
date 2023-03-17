package entidades;

public class Partido {

	private Equipo equipo1;
	private Equipo equipo2;
	private int golesEquipo1;
	private int golesEquipo2;
	
	public Partido(Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2) {
		this.setEquipo1(equipo1);
		this.setEquipo2(equipo2);
		this.setGolesEquipo1(golesEquipo1);
		this.setGolesEquipo2(golesEquipo2);
	}	
	
	public String ganadorReal() {
		
		if(this.golesEquipo1 > this.golesEquipo2) {
			return this.getEquipo1().getNombre();
		} else if(this.golesEquipo2 > this.golesEquipo1) {
			return this.getEquipo2().getNombre();
		} else {
			return "Empate";
		}
		
	}
	
	public Equipo getEquipo1() {
		return equipo1;
	}
	
	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}
	
	public Equipo getEquipo2() {
		return equipo2;
	}
	
	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}
	
	public int getGolesEquipo1() {
		return golesEquipo1;
	}
	
	public void setGolesEquipo1(int golesEquipo1) {
		this.golesEquipo1 = golesEquipo1;
	}
	
	public int getGolesEquipo2() {
		return golesEquipo2;
	}
	
	public void setGolesEquipo2(int golesEquipo2) {
		this.golesEquipo2 = golesEquipo2;
	}
	
}