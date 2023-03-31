package models;

import com.opencsv.bean.CsvBindByPosition;

public class Pronostico {

	@CsvBindByPosition(position = 0)
	private String partido;
	@CsvBindByPosition(position = 1)
	private String equipo;
	@CsvBindByPosition(position = 2)
	private String resultado;
	public Pronostico(String partido, String equipo) {
		this.setPartido(partido);
		this.setEquipo(equipo);
	}
	
/*	public int puntos() {
		int puntaje = 0;
		
		String nombreGanador = partido.ganadorReal();
		
		if(nombreGanador.equals(this.getEquipo().getNombre())) {
			puntaje++; 
		}
		
		return puntaje;
	}
*/
	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	/*
	public ResultadoEnum getResultado() {
		return resultado;
	}

	public void setResultado(ResultadoEnum resultado) {
		this.resultado = resultado;
	}
	 */
	
}

