package principal;

import figuras.Cubito;
public class Principal {

    public static void main(String[] args) {
        //Instanciación:
        Cubito cubo1 = new Cubito (12,12,12);
        //Llamo al método:
        System.out.println("El resultado del vol de mi cubo es= "+cubo1.volumen());
    }
    
}
