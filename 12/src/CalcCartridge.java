import java.util.ArrayList;

public class CalcCartridge {
    ArrayList<ArrayList<String>> filedatalist = new ArrayList<ArrayList<String>>();
    ArrayList<ArrayList<Integer>> cardridgelists = new ArrayList<>();
    ArrayList<Integer> cardridgelist = new ArrayList<>();
    ArrayList<ArrayList<String>> penlists = new ArrayList<>();
    ArrayList<String> penlist = new ArrayList<>();
    ColorData foo = new ColorData();
    int sum;

    CalcCartridge(ArrayList<ArrayList<String>> filedatalist) {
        this.filedatalist = filedatalist;
    }

    public void InnerChangeCartridge() {
        for (int i = 0; i < filedatalist.size(); i++) {
            cardridgelist.clear();
            penlist.clear();
            for (int k = 0; k < penlists.size(); k++) {
                // ペンがない
                if (penlists.get(k).get(0) == filedatalist.get(i).get(0)) {
                    penlist.add(filedatalist.get(i).get(0));
                    penlist.add(filedatalist.get(i).get(1));
                    penlists.add(penlist);
                    for (int j = 0; j < cardridgelists.size(); j++) {
                        // 色がある
                        if (String.valueOf(cardridgelists.get(j).get(0)) == filedatalist.get(i).get(1)) {
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
                    if (penlists.get(k).get(1) == filedatalist.get(i).get(1)) {

                        for (int j = 0; j < cardridgelists.size(); j++) {
                            // 色がある
                            if (String.valueOf(cardridgelists.get(j).get(0)) == filedatalist.get(i).get(1)) {
                                cardridgelists.get(j).set(1, cardridgelists.get(j).get(1) + 1);
                                // 色がない
                            } else {
                                cardridgelist.add(Integer.parseInt(filedatalist.get(j).get(2)));
                                cardridgelist.add(1);
                            }
                        }
                    // 色が違う
                } else {
                    penlists.get(k).set(1, filedatalist.get(i).get(1));
                    for (int j = 0; j < cardridgelists.size(); j++) {
                            // 色がある
                            if (String.valueOf(cardridgelists.get(j).get(0)) == filedatalist.get(i).get(1)) {
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
                        if (String.valueOf(cardridgelists.get(j).get(0)) == filedatalist.get(i).get(1)) {
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
        for (int i = 0; i < cardridgelists.size(); i++) {
            sum += cardridgelists.get(i).get(1);
        }
    }

    public void show() {
        for (int i = 0; i < filedatalist.size(); i++) {
            System.out.print("Type =" + filedatalist.get(i).get(0));
            System.out.print(", Color =" + filedatalist.get(i).get(1));
            System.out.println(", Let =" + filedatalist.get(i).get(2));
        }
        for (int i = 0; i < cardridgelists.size(); i++) {
            foo.setColorCode(String.valueOf(cardridgelists.get(i).get(0)));
            System.out.println(foo.getColorName() + "カートリッジ発行数 :" + cardridgelists.get(i).get(1));
        }
        System.out.println("======================");
        System.out.println("カートリッジ合計数 :" + sum);
    }

}
