import java.util.ArrayList;

public class Color{
    ArrayList<ArrayList<String>> colorlist = new ArrayList<ArrayList<String>>();
    int e_color;

    Color() {
        e_color = -999;
        ArrayList<String> black = new ArrayList<String>();
        black.add("0");
        black.add("黒");
        colorlist.add(black);

        ArrayList<String> red = new ArrayList<String>();
        red.add("1");
        red.add("赤");
        colorlist.add(red);

        ArrayList<String> blue = new ArrayList<String>();
        blue.add("2");
        blue.add("青");
        colorlist.add(blue);

        ArrayList<String> white = new ArrayList<String>();
        white.add("7");
        white.add("白");
        colorlist.add(white);
    }

    // 存在するかどうか
    public void setColor(String n_pen) {
        for (int i = 0; i < colorlist.size(); i++) {
            if (colorlist.get(i).get(0) == n_pen) {
                e_color = Integer.parseInt(colorlist.get(i).get(0));
            }
        }
    }

    //無ければ-999を返す
    public int getPen() {
        return e_color;
    }
}