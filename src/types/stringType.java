package types;

public class stringType extends Type {

    public stringType(int length) {
        super("string", 2*length+2, null);
    }
}
