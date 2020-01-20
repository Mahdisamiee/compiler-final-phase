import java.util.ArrayList;
import java.util.HashMap;

enum scopeType {DECLARE, FUNCTION, USER_DEFINE_TYPE};

public class symbolTable {

    private HashMap<String, symbolTableRow> contents; //for keeping contents's informations
    private symbolTable fatherNode;
    private ArrayList<symbolTable> childrens;
    private int scopeWidth;
    private String scopeID;
    private scopeType scopeType;

    public symbolTable(symbolTable fatherNode, String scopeID, scopeType scopeType) {
        contents  = new HashMap<String, symbolTableRow>();

        this.fatherNode = fatherNode;
        this.scopeID = scopeID;
        this.scopeType = scopeType;
    }

    public HashMap<String, symbolTableRow> getContents() {
        return contents;
    }

    public void setContents(HashMap<String, symbolTableRow> contents) {
        this.contents = contents;
    }

    public symbolTable getFatherNode() {
        return fatherNode;
    }

    public void setFatherNode(symbolTable fatherNode) {
        this.fatherNode = fatherNode;
    }

    public ArrayList<symbolTable> getChildrens() {
        return childrens;
    }

    public void setChildrens(ArrayList<symbolTable> childrens) {
        this.childrens = childrens;
    }

    public int getScopeWidth() {
        return scopeWidth;
    }

    public void setScopeWidth(int scopeWidth) {
        this.scopeWidth = scopeWidth;
    }

    public String getScopeID() {
        return scopeID;
    }

    public void setScopeID(String scopeID) {
        this.scopeID = scopeID;
    }

    public scopeType getScopeType() {
        return scopeType;
    }

    public void setScopeType(scopeType scopeType) {
        this.scopeType = scopeType;
    }
}
