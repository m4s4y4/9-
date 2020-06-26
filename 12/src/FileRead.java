import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileRead {
    String filename;
    ArrayList<ArrayList<String>> datalists = new ArrayList<ArrayList<String>>();
    ArrayList<String> datalist = new ArrayList<String>();

    FileRead() {
        filename = "-999";
    }

    public void MakeDataList() {
        try {
            File file = new File(filename);
            FileReader filereader = new FileReader(file);
            IData pData = new PenData();

            while (true) {
                datalists.clear();
                // 1~3
                for (int i = 0; i < 3; i++) {
                    datalist.add(String.valueOf(filereader.read()));
                }
                if (String.valueOf(filereader.read()) != ",") {
                    filereader.read();
                }
                // 4,5
                pData.setItem(datalist.get(0));
                datalist.add(String.valueOf(pData.getItem()));
                datalist.add(String.valueOf(pData.getItem()));
                //1~5をリストに追加
                datalists.add(datalist);
                if (filereader.read() != -1) {//空ならば
                    break;
                }
            }
            filereader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    public void setFileName(String fileString) {
        filename = fileString;
    }
    public ArrayList<ArrayList<String>> getFileData() {
        return datalists;
    }
}