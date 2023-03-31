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
    final static int CANTIDADMAXRONDAS=2;

	public static void main(String[] args) {
		LectorCsvResultados lectorCsvPartido = new LectorCsvResultados(RUTARESULTADOSCSV);
        lectorCsvPartido.parsearArchivoResultado();
		List<Partido> resultadoList = lectorCsvPartido.getLineasPartido();
        for(Partido cadaResultado : resultadoList){
			System.out.println(
					"nro: " + cadaResultado.getNro() + "\n" +
					"Equipo1: " +  cadaResultado.getEquipo1() + "\n" +
				    "Equipo2: " +  cadaResultado.getEquipo2()+ "\n" +
				    "GolesEquipo1: " +  cadaResultado.getGolesEquipo1()+ "\n" +
			        "GolesEquipo2: " +  cadaResultado.getGolesEquipo2()+ "\n" +
							"-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
		}

	}
}