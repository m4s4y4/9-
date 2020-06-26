import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        FileRead foo2 = new FileRead();
        IData foo = new PenData();
        foo2.predata();
        foo2.setFileName(args[0]);
        for (int i = 0; i <  foo2.getFileData().size(); i++) {
            // ペンの種類
            foo.setItem(foo2.getFileData().get(i).get(0));
            foo.getItem();
        }
        // System.out.println(foo);

    }
}
