package ex_28_Enum;

public enum Enum_APIUrls {
    vwo("https://app.vwo.com"),
    katalon("https://katalon.com"),
    googleUrl("www.google.com");

    private String urls;

    String getUrl(){
        return urls;
    }

    Enum_APIUrls(String urls){
        this.urls = urls;
        }
}
