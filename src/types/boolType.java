package types;

public class boolType extends Type {

    public boolType () {
        super("bool", 1, null);
    }

    //*** NOTICE **\\
    public static int toInteger(boolean value) {
        //here we need some rule for change type
        return 0;
    }

    public static boolean isBool(Type type){
        return type instanceof intType;
    }
}
