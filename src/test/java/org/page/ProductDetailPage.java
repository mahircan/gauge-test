package org.page;

import org.base.BasePage;

public class ProductDetailPage extends BasePage {
    String clickFavoriteButtonLocator = "com.ozdilek.ozdilekteyim:id/imgFav";

    public void clickFavoritePage(){
        clickByid(clickFavoriteButtonLocator);
    }
}
