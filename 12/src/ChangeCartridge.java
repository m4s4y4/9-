import java.util.ArrayList;

public class ChangeCartridge {
    ArrayList<ArrayList<String>> putcartridge = new ArrayList<ArrayList<String>>();
    ArrayList<String> Innerputcartridge = new ArrayList<String>();
    ChangeCartridge(){
    }
    /**
     * InnerChangeCartridge
     */
    public void InnerChangeCartridge() {
        if (putcartridge.get(i).get(0) == 0) {

            if (putcartridge.get(i).get(1)) {
                putcartridge.get(i).set(3, String.valueOf(Integer.parseInt(putcartridge.get(i).get(4))-1));

                if(putcartridge.get(i).get(3) == "0"){
                    putcartridge.get(i).set(4,putcartridge.get(i).get(3));
                }
            }
        } else {
            Innerputcartridge.add("pen");
            Innerputcartridge.add("color_num");
            Innerputcartridge.add("pen_limit");
            Innerputcartridge.add("pen_limit_now");
            Innerputcartridge.add("0");
            putcartridge.add(Innerputcartridge);
        }
    }

}