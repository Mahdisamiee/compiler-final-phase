package symbolTablePackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class symbolTable {

    private ArrayList<symbolTableRow> row;
    private HashMap<String, symbolTableRow> table;
    private Integer scopeWidth;

    public symbolTable(ArrayList<symbolTableRow> row, Integer scopeWidth) {
        this.row = row;
        this.scopeWidth = scopeWidth;

        table = new HashMap<>();
    }





    //*************************************************** Getters ********************************************************\\
    public ArrayList<symbolTableRow> getRow() {
        return row;
    }

    public Integer getScopeWidth() {
        return scopeWidth;
    }

    //**************************************************** Setters *******************************************************\\
    public void setRow(ArrayList<symbolTableRow> row) {
        this.row = row;
    }

    public void setScopeWidth(Integer scopeWidth) {
        this.scopeWidth = scopeWidth;
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
}
