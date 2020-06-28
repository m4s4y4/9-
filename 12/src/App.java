public class App {
    public static void main(String[] args) {
        FileRead foo = new FileRead("12/src/testtext.txt");
        foo.MakeDataList();
        System.out.println("filedata : "+foo.getFileData());
        CalcCartridge cr = new CalcCartridge(foo.getFileData());
        cr.ChangeCartridge();
        cr.show();

    }
}
