package model;

import java.util.ArrayList;
import java.util.List;

public class caja1<T> {
    private List<T> elementos1 = new ArrayList<>();
    private Integer tope;

    public caja1(Integer tope) {
        this.tope = tope;
    }

    public List<T> getElementos() {
        return elementos1;
    }

    public void setElementos(List<T> elementos1) {
        this.elementos1 = elementos1;
    }

    public Integer getTope() {
        return tope;
    }

    public void setTope(Integer tope) {
        this.tope = tope;
    }

    public Boolean addElement(T t){
        if(tope>elementos1.size()){
            elementos1.add(t);
            return true;
        }
        return false;
    }

    public void muestraArray(){
        for (T elemento:elementos1) {
            System.out.println(elemento);
        }
    }
}


