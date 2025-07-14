package ex_28_Enum;

public enum Enum_Colors {
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");

    private String colors;

    String getColors(){
        return this.colors;
    }

    Enum_Colors (String colors){
        this.colors = colors;
    }
}
