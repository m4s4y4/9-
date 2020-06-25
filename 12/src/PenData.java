import java.util.ArrayList;

public class PenData implements IData{
    ArrayList<ArrayList<String>> penlist = new ArrayList<ArrayList<String>>();
    int limit;
    PenData(){
        limit = -999;
        ArrayList<String> mannenhitu = new ArrayList<String>();
        mannenhitu.add("F");
        mannenhitu.add("2");
        mannenhitu.add("万年筆");
        penlist.add(mannenhitu);

        ArrayList<String> sainpen = new ArrayList<String>();
        sainpen.add("S");
        sainpen.add("4");
        sainpen.add("サインペン");
        penlist.add(sainpen);

        ArrayList<String> fude = new ArrayList<String>();
        fude.add("B");
        fude.add("1");
        fude.add("筆");
        penlist.add(fude);
    }

    //存在するか
    public void setItem(String n_pen){
        for (int i = 0; i < penlist.size(); i++) {
            if (penlist.get(i).get(0) == n_pen) {
                limit = Integer.parseInt(penlist.get(i).get(1));
            }
        }
    }

    //無ければ-999を返す
    public int getItem(){
        return limit;
    }
}