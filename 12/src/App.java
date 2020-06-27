public class App {
    public static void main(String[] args) {
        FileRead foo = new FileRead("testtext.txt");
        foo.MakeDataList();
        CalcCartridge c = new CalcCartridge(foo.getFileData());
        c.show();
        // System.out.println(foo);

    }
}
