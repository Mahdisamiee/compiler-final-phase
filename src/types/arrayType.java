package types;

import java.util.ArrayList;

public class arrayType extends Type{

    private Type baseType;
    private ArrayList<Integer> dimention = new ArrayList<Integer>();

    public arrayType(ArrayList<Integer> dimention, Type baseType) {
        super("array", 0, dimention);
        this.dimention = dimention;
        this.baseType = baseType;
    }

    public ArrayList<Integer> getDimentions() {
        return this.dimention;
    }

    public int getWidth() {
        int result = 1;
        for (Integer i : this.dimention){
            result *= i;
        }

        return result * baseType.getWidth();
    }


}
