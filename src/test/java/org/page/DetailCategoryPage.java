package org.page;

import org.base.BasePage;

public class DetailCategoryPage extends BasePage {

    String clickPantolonButtonLocator = "//*/android.widget.RelativeLayout[4]";

    public void pantolonClick(){
        clickByxpath(clickPantolonButtonLocator);
    }
}
