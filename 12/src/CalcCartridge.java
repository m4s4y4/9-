import java.util.ArrayList;

public class CalcCartridge {
    ArrayList<ArrayList<String>> filedatalist = new ArrayList<ArrayList<String>>();
    ArrayList<ArrayList<Integer>> colorlists = new ArrayList<>();
    ArrayList<ArrayList<String>> penlists = new ArrayList<>();
    ColorData foo = new ColorData();
    int sum;

    CalcCartridge(ArrayList<ArrayList<String>> filedatalist) {
        this.filedatalist = filedatalist;
    }

    public void ChangeCartridge() {
        // 計算するデータ
        for (int cnt_fl = 0; cnt_fl < filedatalist.size(); cnt_fl++) {
            boolean colorfound = false;
            boolean flg = false;
            // 計算用のペンリスト
            ArrayList<String> penlist = new ArrayList<>();// ペンのコード,今の色,limit
            ArrayList<Integer> colorlist = new ArrayList<>();// 色のコード,カートリッジの本数
            System.out.println(penlists);
            System.out.println(colorlists);
            // ペンがある
            for (int cnt_p = 0; cnt_p < penlists.size(); cnt_p++) {
                if (penlists.get(cnt_p).get(0).equals(filedatalist.get(cnt_fl).get(0))) {
                    // 色がある
                    for (int cnt_c = 0; cnt_c < colorlists.size(); cnt_c++) {
                        if (String.valueOf(colorlists.get(cnt_c).get(0)).equals(filedatalist.get(cnt_fl).get(1))) {
                            // 色が一緒
                            if (penlists.get(cnt_p).get(1).equals(filedatalist.get(cnt_fl).get(1))) {
                                // limit減産
                                penlists.get(cnt_p).set(2,String.valueOf(Integer.parseInt(penlists.get(cnt_p).get(2)) - 1));
                                if (penlists.get(cnt_p).get(2).equals("0")) {
                                    penlists.get(cnt_p).set(2, filedatalist.get(cnt_fl).get(3));
                                    penlists.get(cnt_p).remove(1);
                                }
                            }
                            // 色が違う
                            else {
                                penlists.get(cnt_p).set(1, filedatalist.get(cnt_fl).get(1));// 新しい色をセット
                                colorlists.get(cnt_c).set(1, colorlists.get(cnt_c).get(1) + 1);
                            }
                            colorfound = true;
                            break;
                        }
                    }
                    // 色がない
                    if (!colorfound) {
                        penlists.get(cnt_p).set(1,filedatalist.get(cnt_fl).get(1));
                        colorlist.add(Integer.parseInt(filedatalist.get(cnt_fl).get(1)));
                        colorlist.add(1);
                        colorlists.add(colorlist);
                    }
                    flg = true;
                    break;
                }
            }
            // ペンがない
            if (!flg) {
                penlist.add(filedatalist.get(cnt_fl).get(0));
                penlist.add(filedatalist.get(cnt_fl).get(1));
                penlist.add(filedatalist.get(cnt_fl).get(3));
                penlists.add(penlist);
                // 色がある
                for (int cnt_c = 0; cnt_c < colorlists.size(); cnt_c++) {
                    if (String.valueOf(colorlists.get(cnt_c).get(0)).equals(filedatalist.get(cnt_fl).get(1))) {
                        colorlists.get(cnt_c).set(1, colorlists.get(cnt_c).get(1) + 1);
                        colorfound = true;
                        break;
                    }
                }
                // 色がない
                if (!colorfound) {
                    colorlist.add(Integer.parseInt(filedatalist.get(cnt_fl).get(1)));
                    colorlist.add(1);
                    colorlists.add(colorlist);
                }
            }
        }
        // カートリッジの合計
        for (int i = 0; i < colorlists.size(); i++) {
            sum += colorlists.get(i).get(1);
        }
    }

    public void show() {
        for (int cnt_fl = 0; cnt_fl < filedatalist.size(); cnt_fl++) {
            System.out.print("Type =" + filedatalist.get(cnt_fl).get(0));
            System.out.print(", Color =" + filedatalist.get(cnt_fl).get(1));
            System.out.println(", Let =" + filedatalist.get(cnt_fl).get(2));
        }
        for (int cnt_fl = 0; cnt_fl < colorlists.size(); cnt_fl++) {
            foo.setColorCode(String.valueOf(colorlists.get(cnt_fl).get(0)));
            System.out.println(foo.getColorName() + "カートリッジ発行数 :" + colorlists.get(cnt_fl).get(1));
        }
        System.out.println("");
        System.out.println("カートリッジ合計数 :" + sum);
    }

}
