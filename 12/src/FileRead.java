import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileRead {
    String filename;
    ArrayList<ArrayList<String>> datalist = new ArrayList<ArrayList<String>>();

    FileRead() {
        filename = "-999";
    }

    public void predata(){
        try {
            File file = new File(filename);
            FileReader filereader = new FileReader(file);
            while (filereader.read() != -1) {
                ArrayList<String> databox = new ArrayList<String>();
                while (true) {
                    databox.add(String.valueOf(filereader.read()));
                    if (String.valueOf(filereader.read()) != ",") {
                        filereader.read();
                        break;
                    }
                }

                datalist.add(databox);
            }
            filereader.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }

    }


    public void setFileName(String fileString){
        filename = fileString;
    }
}