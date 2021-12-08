package org.page;

import org.base.BasePage;

public class LoginPage extends BasePage {

    String mailContainerLocator = "com.ozdilek.ozdilekteyim:id/etEposta";
    String passwordContainerLocator = "com.ozdilek.ozdilekteyim:id/etPassword";
    String loginButtonLocator = "com.ozdilek.ozdilekteyim:id/btnLogin";

    public void sendkeyTextMail(){
        loginSendkeys(mailContainerLocator,"mahirsahinkaya@gmail.com");
    }

    public void sendkeyTextPassword(){
        loginSendkeys(passwordContainerLocator,"123456");
    }

    public void clickLoginButton(){
        clickByid(loginButtonLocator);
    }

}
