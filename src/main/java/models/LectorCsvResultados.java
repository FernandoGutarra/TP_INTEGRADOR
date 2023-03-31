package models;

import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LectorCsvResultados {
    String rutaArchivo;
    List<Partido> lineasResultado;
    public LectorCsvResultados(String rutaresultadoscsv) {
         this.rutaArchivo=rutaresultadoscsv;
         this.lineasResultado= new ArrayList<>();
    }
    public void parsearArchivoResultado(){
        List<Partido> lineasDeResultado = null;
        try {
            lineasDeResultado = new CsvToBeanBuilder(new FileReader(this.rutaArchivo))
                    .withSkipLines(1)
                    .withSeparator(';')
                    .withType(Partido.class)
                    .build()
                    .parse();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.lineasResultado = lineasDeResultado;
    }
    public List<Partido> getLineasPartido(){
        return lineasResultado;
    }
}
