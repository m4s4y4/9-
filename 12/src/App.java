public class App {
    public static void main(String[] args) {
        FileRead foo = new FileRead("12/src/testtext.txt");
        foo.MakeDataList();
        System.out.println(foo.getFileData());
        CalcCartridge c = new CalcCartridge(foo.getFileData());
        c.InnerChangeCartridge();
        c.show();

    }
}
