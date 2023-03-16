package TP_Grupo14;

import java.io.FileReader;
import java.util.Arrays;
import com.opencsv.CSVReader;

import TP_Grupo14.entidades.Pronostico;
import TP_Grupo14.entidades.Partido;
import TP_Grupo14.entidades.Equipo;
import TP_Grupo14.entidades.Ronda;
import TP_Grupo14.entidades.ResultadoEnum;

public class principal {

	public static void main(String[] args) {
		
		try {
			CSVReader lector1 = new CSVReader(new FileReader("recursos/resultados.csv"));			
			String[] resultCSV;
			String[] resultados = new String[2];
			String[][] contenedor1 = new String[2][4];
			int i = 0;
			
			while((resultCSV = lector1.readNext()) != null) {
				resultados = resultCSV[0].split(";");
				
				//System.out.println("||" + resultados[0] + "||");
				
				contenedor1[i][0] = resultados[0];
				contenedor1[i][1] = resultados[1];
				contenedor1[i][2] = resultados[2];
				contenedor1[i][3] = resultados[3];
				
				i++;
			}
			
//			inicializarEquipos(contenedor1);
			
			Equipo e1 = new Equipo(contenedor1[0][0]);
			//System.out.println(e1.getNombre());
			Equipo e2 = new Equipo(contenedor1[0][3]);
			//System.out.println(e2.getNombre());
			Equipo e3 = new Equipo(contenedor1[1][0]);
			//System.out.println(e3.getNombre());
			Equipo e4 = new Equipo(contenedor1[1][3]);
			//System.out.println(e4.getNombre());
			Equipo e5 = new Equipo("Empate");
			//System.out.println(e5.getNombre());
			
			Partido part1 = new Partido(e1, e2, Integer.parseInt(contenedor1[0][1]), Integer.parseInt(contenedor1[0][2]));
			//System.out.println(part1.getEquipo1().getNombre() + " " + part1.getGolesEquipo1() + " " + part1.getGolesEquipo2() + " " + part1.getEquipo2().getNombre());
			Partido part2 = new Partido(e3, e4, Integer.parseInt(contenedor1[1][1]), Integer.parseInt(contenedor1[1][2]));
			//System.out.println(part2.getEquipo1().getNombre() + " " + part2.getGolesEquipo1() + " " + part2.getGolesEquipo2() + " " + part2.getEquipo2().getNombre());
			
			
			CSVReader lector2 = new CSVReader(new FileReader("recursos/pronosticos.csv"));			
			String[] pronostCSV;
			String[] pronosticos = new String[2];
			String[][] contenedor2 = new String[2][5];
			int j = 0;
			
			while((pronostCSV = lector2.readNext()) != null) {
				pronosticos = pronostCSV[0].split(";");
				
				contenedor2[j][0] = pronosticos[0];
				contenedor2[j][1] = pronosticos[1];
				contenedor2[j][2] = pronosticos[2];
				contenedor2[j][3] = pronosticos[3];
				contenedor2[j][4] = pronosticos[4];
				
				j++;
			}
			
			String[] ganadoresPron = new String[2];
			
			for(int k = 0; k < 2; k++) {
				if(contenedor2[k][1].equals("X")) {
					ganadoresPron[k] = contenedor2[k][0];
				} else if(contenedor2[k][3].equals("X")) {
					ganadoresPron[k] = contenedor2[k][4];
				} else {
					ganadoresPron[k] = "Empate";
				}
			}
			
			Equipo[] equiposGan = new Equipo[2];
			
			for(int l = 0; l < 2; l++) {
				if(ganadoresPron[l].equals(e1.getNombre())) {
					equiposGan[l] = e1;
				} else if(ganadoresPron[l].equals(e2.getNombre())) {
					equiposGan[l] = e2;
				} else if(ganadoresPron[l].equals(e3.getNombre())) {
					equiposGan[l] = e3;
				} else if(ganadoresPron[l].equals(e4.getNombre())) {
					equiposGan[l] = e4;
				} else if(ganadoresPron[l].equals(e5.getNombre())) {
					equiposGan[l] = e5;
				}
			}
			
			Pronostico pronost1 = new Pronostico(part1, equiposGan[0]);
			Pronostico pronost2 = new Pronostico(part2, equiposGan[1]);
			
			//System.out.println(pronost1.getEquipo().getNombre());
			
			int punt = 0;
		
			//System.out.println(pronost1.puntos());
			//System.out.println(pronost2.puntos());
			
			punt = punt + pronost1.puntos();
			punt = punt + pronost2.puntos();
			
			System.out.println("Puntaje = " + punt);
			

		} catch(Exception e) {
			System.out.println(e);
		}

	}

//	private static void inicializarEquipos(String[][] contenedor1) {
//		
//		
//	}

}