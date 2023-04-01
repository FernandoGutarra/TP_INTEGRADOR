package org.grupo14;
import models.*;

import java.lang.module.ResolutionException;
import java.util.ArrayList;
import java.util.List;
import java.awt.*;

/**
 * Hello world!
 *
 */
public class Main
{
	final static String RUTARESULTADOSCSV = "C:\\espacioDeTrabajo\\TP_INTEGRADOR\\src\\main\\resources\\resultados.csv";
	final  static String RUTAPRONOSTICOSCSV="C:\\espacioDeTrabajo\\TP_INTEGRADOR\\src\\main\\resources\\pronosticos.csv";
    final static int CANTIDADMAXRONDAS=2;

	public static void main(String[] args) {
		//LectorCsvResultados lectorCsvPartido = new LectorCsvResultados(RUTARESULTADOSCSV);
        //lectorCsvPartido.parsearArchivoResultado();
		//List<Partido> resultadoList = lectorCsvPartido.getLineasPartido();
       /* for(Partido cadaResultado : resultadoList){
			System.out.println(
					"nro: " + cadaResultado.getNro() + "\n" +
					"Equipo1: " +  cadaResultado.getEquipo1() + "\n" +
				    "Equipo2: " +  cadaResultado.getEquipo2()+ "\n" +
				    "GolesEquipo1: " +  cadaResultado.getGolesEquipo1()+ "\n" +
			        "GolesEquipo2: " +  cadaResultado.getGolesEquipo2()+ "\n" +
							"-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
		} */

		LectorCsvPronosticos lectorCsvPronosticos = new LectorCsvPronosticos(RUTAPRONOSTICOSCSV);
		lectorCsvPronosticos.parsearArchivoPronostico();
		List<Pronostico> pronosticosList = lectorCsvPronosticos.getLineasPronostico();
		for(Pronostico cadaPronostico : pronosticosList){
			System.out.println(
					"Participante: " + cadaPronostico.getParticipante() + "\n" +
							"Equipo1: " + cadaPronostico.getEquipo1() + "\n" +
							"Equipo2: " + cadaPronostico.getEquipo2()+ "\n" +
							"Gana1: " + cadaPronostico.getGana1() + "\n" +
							"Gana2: " + cadaPronostico.getGana2() + "\n" +
							"enpate: " + cadaPronostico.getEmpata() + "\n" +
							"ronda: " + cadaPronostico.getRonda() + "\n" +
							"-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+"
			);
		}
  /*
        String EquipoX = resultadoList.get(0).getEquipo1();
		String Equipo2= resultadoList.get(0).getEquipo2();
		String GolesEquipo1= resultadoList.get(0).getGolesEquipo1();
		String GolesEquipo2 = resultadoList.get(0).getGolesEquipo2();
		int parseoGoles1=Integer.parseInt(GolesEquipo1);
		int parseoGoles2=Integer.parseInt(GolesEquipo2);
		String resultado = resultadoList.get(0).Resultado(parseoGoles1,parseoGoles2);
		System.out.println(
				"goles equipo1 "+ GolesEquipo1 + "\n" +
				"goles equipo2 " + GolesEquipo2 + "\n" +
				"el Equipo: "+EquipoX+ "\n" +
				"termino: "+ resultado+ "\n" +
						"a el equipo: "+ Equipo2
				);
		*/


	}
}