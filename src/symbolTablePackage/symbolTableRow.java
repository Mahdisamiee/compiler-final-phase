package symbolTablePackage;

import types.Type;

public class symbolTableRow {
    //private String id;
    private Type type;
    private Object value; //it may contains everything
    private Integer width;
    private Integer address; // address nesbi;


    public symbolTableRow(/*String id,*/ Type type, Integer address, Object value, Integer width) {
        //this.id = id;
        this.type = type;
        this.address = address;
        this.value = value;
        this.width = width;
    }

    //****************************************** Getters ****************************************************\\
//    public String Id() {
//        return id;
//    }

    public Type getType() {
        return type;
    }

    public Integer getAddress() {
        return address;
    }

    public Object getValue() {
        return value;
    }

    public Integer getWidth() {
        return width;
    }

    // **************************************** setters *****************************************************\\
//    public void setName(String id) {
//        this.id = id;
//    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setAddress(Integer address) {
        this.address = address;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }
}
