package org.argentinaprograma.TP_Integrador_Grupo14;

import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import entidades.Pronostico;
import entidades.Equipo;
import entidades.Partido;
import entidades.Ronda;
import entidades.ResultadoEnum;

public class Main {
    
	public static void main(String[] args) throws CsvValidationException {
		
		try {
        	CSVReader lector1 = new CSVReader(new FileReader("resources/resultados.csv"));
        	
        	String[] resultCSV;
			String[] resultados = new String[2];
			String[][] contenedor1 = new String[2][4];
			int i = 0;
			
			while((resultCSV = lector1.readNext()) != null) {
				resultados = resultCSV[0].split(";");
						
				contenedor1[i][0] = resultados[0];
				contenedor1[i][1] = resultados[1];
				contenedor1[i][2] = resultados[2];
				contenedor1[i][3] = resultados[3];
				
				i++;
			}
			
			
			Equipo e1 = new Equipo(contenedor1[0][0]);
			Equipo e2 = new Equipo(contenedor1[0][3]);
			Equipo e3 = new Equipo(contenedor1[1][0]);
			Equipo e4 = new Equipo(contenedor1[1][3]);
			Equipo e5 = new Equipo("Empate");
						
			Partido part1 = new Partido(e1, e2, Integer.parseInt(contenedor1[0][1]), Integer.parseInt(contenedor1[0][2]));
			Partido part2 = new Partido(e3, e4, Integer.parseInt(contenedor1[1][1]), Integer.parseInt(contenedor1[1][2]));
			
			
			
			CSVReader lector2 = new CSVReader(new FileReader("resources/pronosticos.csv"));			
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
			
						
			int punt = 0;
							
			punt = punt + pronost1.puntos();
			punt = punt + pronost2.puntos();
			
			System.out.println("Puntaje = " + punt);
		
			
        } catch (IOException e) {
            e.printStackTrace();
        }
	
	}

}