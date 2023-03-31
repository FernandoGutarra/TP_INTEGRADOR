package org.grupo14;
import models.LectorCsvResultados;
import models.Partido;
import models.Pronostico;
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


	public static void main(String[] args) {
		LectorCsvResultados lectorCsvPartido = new LectorCsvResultados(RUTARESULTADOSCSV);
        lectorCsvPartido.parsearArchivoResultado();
		List<Partido> pronosticoList = lectorCsvPartido.getLineasPartido();
        for(Partido cadaPronostico : pronosticoList){
			System.out.println(
					"Equipo1: " + cadaPronostico.getEquipo1() + "\n" +
				    "Equipo2: " + cadaPronostico.getEquipo2()+ "\n" +
				    "GolesEquipo1: " + cadaPronostico.getGolesEquipo1()+ "\n" +
			        "GolesEquipo2: " + cadaPronostico.getGolesEquipo2()+ "\n" +
							"-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
		}
	}
}