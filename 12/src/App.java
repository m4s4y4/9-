public class App {
    public static void main(String[] args) {
        FileRead foo = new FileRead("src/testtext.txt");
        foo.MakeDataList();
        // System.out.println("filedata : "+foo.getFileData());
        CalcCartridge cc = new CalcCartridge(foo.getFileData());
        cc.ChangeCartridge();
        cc.show();

    }
}
