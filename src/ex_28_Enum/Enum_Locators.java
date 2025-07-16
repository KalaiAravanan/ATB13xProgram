package ex_28_Enum;

public enum Enum_Locators {
    page_input_email("#login-username"),
    page_input_password("#login-password"),
    page_button("#btn");

    private String locators;

    Enum_Locators(String locators){
        this.locators = locators;
    }

    String getLocators(){
        return this.locators;
    }

}
