package symbolTablePackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class symbolTable {

    //private ArrayList<symbolTableRow> row;
    private HashMap<String, symbolTableRow> table;
    private Integer scopeWidth;
    private symbolTable parent;
    private ArrayList<symbolTable> children;

    public symbolTable(/*ArrayList<symbolTableRow> row*/) {
        //this.row = row;
        this.scopeWidth = 0;

        table = new HashMap<>();
    }





    //*************************************************** Getters ********************************************************\\
//    public ArrayList<symbolTableRow> getRow() {
//        return row;
//    }

    public Integer getScopeWidth() {
        for(symbolTableRow row : table.values()) {
            this.scopeWidth += row.getWidth();
        }
        return scopeWidth;
    }

    public symbolTable getParent() {
        return parent;
    }

    public ArrayList<symbolTable> getChildren() {
        return children;
    }

    //**************************************************** Setters *******************************************************\\
//    public void setRow(ArrayList<symbolTableRow> row) {
//        this.row = row;
//    }

    public void setScopeWidth(Integer scopeWidth) {
        this.scopeWidth = scopeWidth;
    }

    public void setParent(symbolTable parent) {
        this.parent = parent;
    }

    public void setChildren(symbolTable child) {
        this.children.add(child);
    }

    //************************************************* Functions *********************************************************\\
    public boolean updateId(String id, symbolTableRow value) {
        if(table.containsKey(id)) {
            table.replace(id, value);
            return true;
        }else{
            return false;
        }
    }

    public boolean addId(String id ,symbolTableRow value){
        if(table.containsKey(id)){
            return false;
        }else{
            table.put(id, value);
            return true;
        }
    }

    public boolean hasId(String id) {
        if(table.containsKey(id)) {
            return true;
        }else{
            return false;
        }
    }


}
