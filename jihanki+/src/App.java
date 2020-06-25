public class App {
public static void main(String[] args) {
    //drink
    Jihanki foo;
    foo = new Drink();
    foo.setItem(1);
    System.out.println(foo.getItem());
    //tabako
    foo = new Tabako();
    foo.setItem(1);
    System.out.println(foo.getItem());

}
}