import java.util.ArrayList;

public class CalcCartridge {
    ArrayList<ArrayList<String>> filedatalist = new ArrayList<ArrayList<String>>();
    ArrayList<ArrayList<Integer>> cardridgelists = new ArrayList<>();
    ArrayList<ArrayList<String>> penlists = new ArrayList<>();
    ColorData foo = new ColorData();
    int sum;

    CalcCartridge(ArrayList<ArrayList<String>> filedatalist) {
        this.filedatalist = filedatalist;
    }

    public void InnerChangeCartridge() {
        for (int cntflist = 0; cntflist < filedatalist.size(); cntflist++) {
            ArrayList<String> penlist = new ArrayList<>();
            ArrayList<Integer> cardridgelist = new ArrayList<>();
            for (int k = 0; k < penlists.size(); k++) {
                // ペンがない
                if (penlists.get(k).get(0) == filedatalist.get(cntflist).get(0)) {
                    penlist.add(filedatalist.get(cntflist).get(0));
                    penlist.add(filedatalist.get(cntflist).get(1));
                    penlists.add(penlist);
                    for (int j = 0; j < cardridgelists.size(); j++) {
                        // 色がある
                        if (String.valueOf(cardridgelists.get(j).get(0)) == filedatalist.get(cntflist).get(1)) {
                            cardridgelists.get(j).set(1, cardridgelists.get(j).get(1) + 1);
                            // 色がない
                        } else {
                            cardridgelist.add(Integer.parseInt(filedatalist.get(j).get(2)));
                            cardridgelist.add(1);
                        }
                    }
                    // ペンがある
                } else {
                    // 色が一緒
                    if (penlists.get(k).get(1) == filedatalist.get(cntflist).get(1)) {

                        for (int j = 0; j < cardridgelists.size(); j++) {
                            // 色がある
                            if (String.valueOf(cardridgelists.get(j).get(0)) == filedatalist.get(cntflist).get(1)) {
                                cardridgelists.get(j).set(1, cardridgelists.get(j).get(1) + 1);
                                // 色がない
                            } else {
                                cardridgelist.add(Integer.parseInt(filedatalist.get(j).get(2)));
                                cardridgelist.add(1);
                            }
                        }
                        // 色が違う
                    } else {
                        penlists.get(k).set(1, filedatalist.get(cntflist).get(1));
                        for (int j = 0; j < cardridgelists.size(); j++) {
                            // 色がある
                            if (String.valueOf(cardridgelists.get(j).get(0)) == filedatalist.get(cntflist).get(1)) {
                                cardridgelists.get(j).set(1, cardridgelists.get(j).get(1) + 1);
                                // 色がない
                            } else {
                                cardridgelist.add(Integer.parseInt(filedatalist.get(j).get(2)));
                                cardridgelist.add(1);
                            }
                        }
                    }
                    for (int j = 0; j < cardridgelists.size(); j++) {
                        // 色がある
                        if (String.valueOf(cardridgelists.get(j).get(0)) == filedatalist.get(cntflist).get(1)) {
                            cardridgelists.get(j).set(1, cardridgelists.get(j).get(1) + 1);
                            // 色がない
                        } else {
                            cardridgelist.add(Integer.parseInt(filedatalist.get(j).get(2)));
                            cardridgelist.add(1);
                        }
                    }
                }
            }
            cardridgelists.add(cardridgelist);
            penlists.add(penlist);
        }
        // カートリッジの合計
        for (int cntflist = 0; cntflist < cardridgelists.size(); cntflist++) {
            sum += cardridgelists.get(cntflist).get(1);
        }
    }

    public void show() {
        for (int cntflist = 0; cntflist < filedatalist.size(); cntflist++) {
            System.out.print("Type =" + filedatalist.get(cntflist).get(0));
            System.out.print(", Color =" + filedatalist.get(cntflist).get(1));
            System.out.println(", Let =" + filedatalist.get(cntflist).get(2));
        }
        for (int cntflist = 0; cntflist < cardridgelists.size(); cntflist++) {
            foo.setColorCode(String.valueOf(cardridgelists.get(cntflist).get(0)));
            System.out.println(foo.getColorName() + "カートリッジ発行数 :" + cardridgelists.get(cntflist).get(1));
        }
        System.out.println("======================");
        System.out.println("カートリッジ合計数 :" + sum);
    }

}
