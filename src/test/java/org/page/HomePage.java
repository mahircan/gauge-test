package org.page;


import org.base.BasePage;

public class HomePage extends BasePage {

    String clickCategoryButtonLocator = "com.ozdilek.ozdilekteyim:id/nav_categories";


    public void startPageClick(){
        clickByid(clickCategoryButtonLocator);
    }

}
