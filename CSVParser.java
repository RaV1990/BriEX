package odczytywanieZPlikuDoBazy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class CSVParser {
    public static void zparsujCSV(String ścieżka) {
        String line = "";
        String splitter = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(ścieżka))) {

            while ((line = br.readLine()) != null) {

                String[] daneZWierszaPliku = line.split(splitter);

                System.out.println("Imię : " + daneZWierszaPliku[0] + " , Nazwisko : " + daneZWierszaPliku[1] +
                        " , Wiek : " + daneZWierszaPliku[2] + " , Miasto : " + daneZWierszaPliku[3]);
                //przykładowe zczytanie danych z pliku .txt
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}