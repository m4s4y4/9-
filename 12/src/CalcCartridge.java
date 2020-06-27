import java.util.ArrayList;

public class CalcCartridge {
    ArrayList<ArrayList<String>> filedatalist = new ArrayList<ArrayList<String>>();
    ArrayList<ArrayList<Integer>> colorlists = new ArrayList<>();
    ArrayList<ArrayList<String>> penlists = new ArrayList<>();
    ColorData foo = new ColorData();
    int sum;
    int cnt_j;
    boolean penexist = false;
    boolean pennotexist = false;
    boolean flg = false;

    CalcCartridge(ArrayList<ArrayList<String>> filedatalist) {
        this.filedatalist = filedatalist;
    }

    public void ChangeCartridge() {
        // 計算するデータ
        for (int cntflist = 0; cntflist < filedatalist.size(); cntflist++) {
            // 計算用のペンリスト
            ArrayList<String> penlist = new ArrayList<>();
            ArrayList<Integer> colorlist = new ArrayList<>();
            // ペンがある
            System.out.println(penlists);
            System.out.println(colorlist);
            for (int k = 0; k < penlists.size(); k++) {
                if (penlists.get(k).get(0) == filedatalist.get(cntflist).get(0)) {
                    // 色が一緒
                    if (penlists.get(k).get(1) == filedatalist.get(cntflist).get(1)) {
                        // 色がある
                        for (cnt_j = 0; cnt_j < colorlists.size(); cnt_j++) {
                            if (String.valueOf(colorlists.get(cnt_j).get(0)) == filedatalist.get(cntflist).get(1)) {
                                colorlists.get(cnt_j).set(1, colorlists.get(cnt_j).get(1) + 1);
                                break;
                            }
                        }
                        // 色が違う
                        //elseは使えない！！！！！！！！！！！！！
                    } else {
                        penlists.get(k).set(1, filedatalist.get(cntflist).get(1));
                        // 色がある
                        for (cnt_j = 0; cnt_j < colorlists.size(); cnt_j++) {
                            if (String.valueOf(colorlists.get(cnt_j).get(0)) == filedatalist.get(cntflist).get(1)) {
                                colorlists.get(cnt_j).set(1, colorlists.get(cnt_j).get(1) + 1);
                                penexist = true;
                                break;
                            }
                        }
                        // 色がない
                        if (!penexist) {
                            colorlist.add(Integer.parseInt(filedatalist.get(cntflist).get(1)));
                            colorlist.add(1);
                            colorlists.add(colorlist);
                        }
                    }
                    flg = true;
                    break;
                }
            }
            // ペンがない
            if (!flg) {
                penlist.add(filedatalist.get(cntflist).get(0));
                penlist.add(filedatalist.get(cntflist).get(1));
                penlists.add(penlist);
                // 計算用の色リスト
                for (cnt_j = 0; cnt_j < colorlists.size(); cnt_j++) {
                    // 色がある
                    if (String.valueOf(colorlists.get(cnt_j).get(0)) == filedatalist.get(cntflist).get(1)) {
                        colorlists.get(cnt_j).set(1, colorlists.get(cnt_j).get(1) + 1);
                        pennotexist = true;
                        break;
                    }
                }
                // 色がない
                if (!pennotexist) {
                    colorlist.add(Integer.parseInt(filedatalist.get(cnt_j).get(1)));
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
        for (int cntflist = 0; cntflist < filedatalist.size(); cntflist++) {
            System.out.print("Type =" + filedatalist.get(cntflist).get(0));
            System.out.print(", Color =" + filedatalist.get(cntflist).get(1));
            System.out.println(", Let =" + filedatalist.get(cntflist).get(2));
        }
        for (int cntflist = 0; cntflist < colorlists.size(); cntflist++) {
            foo.setColorCode(String.valueOf(colorlists.get(cntflist).get(0)));
            System.out.println(foo.getColorName() + "カートリッジ発行数 :" + colorlists.get(cntflist).get(1));
        }
        System.out.println("======================");
        System.out.println("カートリッジ合計数 :" + sum);
    }

}
