package org.page;

import org.base.BasePage;

public class CategoryPage extends BasePage {

    String clickWomanButtonLocator = "//*/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]";

    public void womanClick(){
        clickByxpath(clickWomanButtonLocator);
    }
}
