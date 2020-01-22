package scopes;

import lulu2_package.lulu2_grammerParser;

public class scopeTree {
    private scopeClass parentScope;

    public scopeTree(scopeClass parentScope) {
        this.parentScope = parentScope;
    }



    public symbolTableRow find(scopeClass current,String id){
        if(current.getSymbolTable().get(id) != null) {
            return current.getSymbolTable().get(id);
        }else{
            this.parentScope = current.getFatherNode();
            if(this.parentScope != null){
                return find(this.parentScope, id);
            }else {
                return null;
            }
        }
    }


}
