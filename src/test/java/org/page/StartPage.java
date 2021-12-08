package org.page;

import org.base.BasePage;

public class StartPage extends BasePage {

    String clickStartButtonLocator = "com.ozdilek.ozdilekteyim:id/tv_startShoppingStore";

    public void categoryPageClick(){
    clickByid(clickStartButtonLocator);
}

}
