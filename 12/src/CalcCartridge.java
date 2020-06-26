import java.util.ArrayList;

public class CalcCartridge {
    ArrayList<ArrayList<String>> cartridgelist = new ArrayList<ArrayList<String>>();
    ArrayList<ArrayList<String>> filedatalist= new ArrayList<ArrayList<String>>();
    ArrayList<String> cartridges = new ArrayList<String>();

    CalcCartridge(ArrayList<ArrayList<String>> filedatalist) {
        this.filedatalist = filedatalist;
    }

    public void InnerChangeCartridge() {
        for (int i = 0; i < cartridgelist.size(); i++) {
            if (cartridgelist.get(i).get(0) == "0" && cartridgelist.get(i).get(1) == "0") {
                cartridgelist.get(i).set(3, String.valueOf(Integer.parseInt(cartridgelist.get(i).get(4)) - 1));
                if (cartridgelist.get(i).get(3) == "0") {
                    cartridgelist.get(i).set(4, cartridgelist.get(i).get(3));
                }
            } else {
                cartridges.add("pen");
                cartridges.add("color_num");
                cartridges.add("pen_limit");
                cartridges.add("pen_limit_now");
                cartridges.add("0");
                cartridgelist.add(cartridges);
            }
        }
    }

}
