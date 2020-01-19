package types;

public class intType extends Type{

    public intType() {
        super( "int" , 4, null);
    }

    public static String toString(int value) {
        if( value == 0) {
            return "\\X00";
        }else{
            return "\\X01";
        }
    }

    public static float toFloat(int value) {

        return (float) value;
    }

    public static boolean toBool(int value) {
        if(value == 0) {
            return false;
        }else{
            return true;
        }
    }

}
