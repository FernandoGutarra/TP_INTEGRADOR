package models;

import com.opencsv.bean.CsvBindByPosition;

import java.security.PublicKey;

public class Partido {
	@CsvBindByPosition(position = 0)
	private String nro;
	@CsvBindByPosition(position = 1)
	private String equipo1;
	@CsvBindByPosition(position = 4)
	private String equipo2;
	@CsvBindByPosition(position = 2)
	private String golesEquipo1;
	@CsvBindByPosition(position = 3)
	private String golesEquipo2;
	public String getEquipo1() {
		return equipo1;
	}
    public void setNro(String nro){
		this.nro = nro;
	}
    public int getNro(){
		int ParseNro= Integer.parseInt(nro);
		return ParseNro;
	}
	public void setEquipo1(String equipo1) {
		this.equipo1 = equipo1;
	}

	public String getEquipo2() {
		return equipo2;
	}

	public void setEquipo2(String equipo2) {
		this.equipo2 = equipo2;
	}

	public String getGolesEquipo1() {
		return golesEquipo1;
	}

	public void setGolesEquipo1(String golesEquipo1) {
		this.golesEquipo1 = golesEquipo1;
	}

	public String getGolesEquipo2() {
		return golesEquipo2;
	}

	public void setGolesEquipo2(String golesEquipo2) {
		this.golesEquipo2 = golesEquipo2;
	}
	public String Resultado(int golesEquipoX,int golesEquipo2){
           ResultadoEnum resultadoEnum = new ResultadoEnum(golesEquipoX,golesEquipo2);
	       String resultado = resultadoEnum.ResultadoGanador();
       return resultado;
	}

}