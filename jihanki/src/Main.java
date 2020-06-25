package src;

public class Main {
    public static void main(String[] args) {

        // tabako
        Tabako tabako = new Tabako();
        tabako.setItem(Integer.parseInt(args[0]));
        System.out.println(tabako.getItem());

        //drink
        Drink drink = new Drink();
        drink.setItem(Integer.parseInt(args[1]));
        System.out.println(drink.getItem());
    }
}
