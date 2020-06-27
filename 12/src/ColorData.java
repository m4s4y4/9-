import java.util.ArrayList;

public  class ColorData{
    ArrayList<ArrayList<String>> colorlist = new ArrayList<ArrayList<String>>();
    String colorcode;
    String colorname;

    ColorData() {
        colorname = "-999";
        colorcode = "-999";
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
    public void setColorCode(String color) {
        for (int i = 0; i < colorlist.size(); i++) {
            if (Integer.parseInt(colorlist.get(i).get(0)) == Integer.parseInt(color)) {
                this.colorcode = color;
                this.colorname = colorlist.get(i).get(1);
            }
            else{
                this.colorname = "Unknown";
            }
        }
    }
    //無ければ-999を返す
    public String getColorName() {
        return colorname;
    }
}