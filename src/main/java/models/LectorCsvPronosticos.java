package models;

import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LectorCsvPronosticos {
        String rutaArchivo;
        List<Pronostico> lineasPronostico;

        public LectorCsvPronosticos(String pronosticoscsv) {
            this.rutaArchivo = pronosticoscsv;
            this.lineasPronostico = new ArrayList<>();
        }

        public void parsearArchivoPronostico() {
            List<Pronostico> lineasDePronostico = null;
            try {
                lineasDePronostico= new CsvToBeanBuilder(new FileReader(this.rutaArchivo))
                        .withSkipLines(1)
                        .withSeparator(';')
                        .withType(Pronostico.class)
                        .build()
                        .parse();
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.lineasPronostico = lineasDePronostico;
        }

        public List<Pronostico> getLineasPronostico() {
            return lineasPronostico;
        }
    }

