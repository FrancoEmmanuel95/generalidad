import model.*;

public class Main {
    public static void main(String[] args) {
    caja1<persona> pers = new caja1<>(10);
    caja1<vehiculos> vehi = new caja1<>(10);

    persona p1 = new persona("asd","asd2",12345678);
    persona p2 = new persona("asdasd","asdasd2",45678);
    vehiculos v1 = new vehiculos("ford","ka",1998);
    vehiculos v2 = new vehiculos("ford","ka",2022);

    pers.addElement(p1);
    pers.addElement(p2);
    vehi.addElement(v1);
    vehi.addElement(v2);

    pers.muestraArray();
    vehi.muestraArray();


      /*  for (T p:pers.getElementos()){
            System.out.println(p);
        }
        for (vehiculos p:vehi.getElementos()){
            System.out.println(p);
        }*/


    }
}