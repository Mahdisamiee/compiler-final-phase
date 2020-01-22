package scopes;

import enums.AccessLabel;
import enums.Types;

import java.util.ArrayList;
import java.util.Map;



public class symbolTableRow {

    private Types type;
    private int width;
    private int reAddress;
    private AccessLabel accessLabel;
    private ArrayList<Map<String, Types>> arguments;
    private ArrayList<Map<String, Types>> parameters;
    private ArrayList<Integer> dimention;

    //class
    public symbolTableRow(Types type) {
        this.type = type;
    }

    //function
    public symbolTableRow(Types type, ArrayList<Map<String, Types>> arguments, ArrayList<Map<String, Types>> parameters) {
        this.type = type;
        this.arguments = arguments;
        this.parameters = parameters;
    }

    //primitive
    public symbolTableRow(Types type, int width, AccessLabel accessLabel, ArrayList<Integer> dimention) {
        this.type = type;
        this.width = width;
        this.accessLabel = accessLabel;
        this.dimention = dimention;
    }

    public Types getType() {
        return type;
    }

    public void setType(Types type) {
        this.type = type;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getReAddress() {
        return reAddress;
    }

    public void setReAddress(int reAddress) {
        this.reAddress = reAddress;
    }

    public AccessLabel getAccessLabel() {
        return accessLabel;
    }

    public void setAccessLabel(AccessLabel accessLabel) {
        this.accessLabel = accessLabel;
    }

    public ArrayList<Map<String, Types>> getArguments() {
        return arguments;
    }

    public void setArguments(ArrayList<Map<String, Types>> arguments) {
        this.arguments = arguments;
    }

    public ArrayList<Map<String, Types>> getParameters() {
        return parameters;
    }

    public void setParameters(ArrayList<Map<String, Types>> parameters) {
        this.parameters = parameters;
    }

    public ArrayList<Integer> getDimention() {
        return dimention;
    }

    public void setDimention(ArrayList<Integer> dimention) {
        this.dimention = dimention;
    }
}
