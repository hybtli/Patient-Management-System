import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FileIO {

    public static void readFile(ISortedList<Patient> patient) throws IOException {

        String file = "src\\records.txt";
        String line;
        DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("HH:mm");


        BufferedReader br = new BufferedReader(new FileReader(file));
        while ((line = br.readLine()) != null){

            String[] splitLine = line.split(",");
            patient.add(new Patient(splitLine[1], Integer.parseInt(splitLine[2]), splitLine[3], splitLine[4],
                    splitLine[5], LocalDate.parse(splitLine[6],formatterDate),
                    LocalTime.parse(splitLine[7],formatterTime)));

        }
        br.close();
    }

}
