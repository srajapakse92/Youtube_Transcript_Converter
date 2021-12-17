import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * Converts Youtube's Transcripts with all of the "\n"'s into a
     * full paragraph block
     * @param args
     */
    public static void main(String[] args)  {

        //creates an empty array list
        List<String> lines = new ArrayList<String>();

        try {

            //create a reader
            BufferedReader fileReader = new BufferedReader(new FileReader("Transcript"));

            //read the first line
            String line = fileReader.readLine();

            //while there is things to read
            while (line != null) {

                //add the line to the list of lines
                lines.add(line);

                //read the next line
                line = fileReader.readLine();

            }

        //catch the following exceptions
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }

        //for each line in the list of lines
        for (String line: lines) {

            //print the line on the same line with a space
            System.out.print(line + " ");

        }

    }
}
