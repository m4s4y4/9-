public class App {
    public static void main(String[] args) {
        FileRead foo2 = new FileRead();
        foo2.setFileName(args[0]);
        foo2.MakeDataList();
        CalcCartridge c = new CalcCartridge(foo2.getFileData());
        // System.out.println(foo);

    }
}
