package types;

import java.util.ArrayList;

public class Type {
    private String name;
    private int width;
    private ArrayList<Integer> dimention;

    public Type(String name, int width, ArrayList<Integer> dimention){
        this.name = name;
        this.width = width;
        this.dimention = dimention;
    }

    public String getName() {
        return name;
    }

    public int getWidth() {
        return width;
    }

    public ArrayList<Integer> getDimention() {
        return dimention;
    }
}
