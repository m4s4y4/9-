import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileRead {
    String filename;
    ArrayList<ArrayList<String>> datalists = new ArrayList<ArrayList<String>>();
    ArrayList<String> datalist = new ArrayList<String>();

    FileRead(String filename) {
        this.filename = filename;
    }

    public void MakeDataList() {
        try {
            File file = new File(filename);
            FileReader filereader = new FileReader(file);
            PenData pData = new PenData();

            while (true) {
                datalists.clear();
                // 1~3
                for (int i = 0; i < 3; i++) {
                    datalist.add(String.valueOf(filereader.read()));
                }
                if (String.valueOf(filereader.read()) != ",") {
                    filereader.read();
                }
                // 4
                pData.setPenCode(datalist.get(0));
                datalist.add(pData.getLimit());
                // 1~4をリストに追加
                datalists.add(datalist);
                if (filereader.read() != -1) {// 空ならば
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

    public ArrayList<ArrayList<String>> getFileData() {
        return datalists;
    }
}