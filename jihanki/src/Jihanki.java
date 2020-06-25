package src;

import java.util.ArrayList;
import java.util.List;

public class Jihanki {

        // 商品名
        protected String mName;
        protected List<String> items = new ArrayList<String>();
        // 押されたボタンによって商品を決定する
        public void setItem(int button) {
            mName = items.get(button);
        }
        // 商品名を取得する
        public String getItem() {
            return mName;
        }

}