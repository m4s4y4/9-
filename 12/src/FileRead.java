import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileRead {
    String filename;
    ArrayList<ArrayList<String>> datalists = new ArrayList<ArrayList<String>>();
    ArrayList<Character> filelist = new ArrayList<>();
    int data;
    PenData pData = new PenData();

    FileRead(String filename) {
        this.filename = filename;
    }

    public void MakeDataList() {
        try {
            File file = new File(filename);
            FileReader filereader = new FileReader(file);

            while ((data = filereader.read()) != -1) {
                filelist.add((char) data);
            }
            filereader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
        for (int i = 0; i < filelist.size(); i++) {
            ArrayList<String> datalist = new ArrayList<>();
            if (filelist.get(i) == ',') {
                continue;
            }
            for (int j = 0; j < 3; i++, j++) {
                datalist.add(String.valueOf(filelist.get(i)));
            }
            //Nullしか帰ってこない！！！！！！！！！！！！！！いけない！！！！！！！！！！！！！
            System.out.println(datalist.get(0));
            pData.setPenCode(datalist.get(0));
            datalist.add(pData.getLimit());
            System.out.println(pData.getLimit());
            // リストに追加
            datalists.add(datalist);
        }
    }

    public ArrayList<ArrayList<String>> getFileData() {
        return datalists;
    }
}