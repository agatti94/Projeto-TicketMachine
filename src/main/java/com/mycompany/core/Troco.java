package com.mycompany.core;


import java.util.Iterator;

/**
 *
 * @author Calebe de Paula Bianchini
 */
class Troco{

    static protected PapelMoeda[] papeisMoeda;

    public Troco(int valor) {
        papeisMoeda = new PapelMoeda[6];
        papeisMoeda[5] = new PapelMoeda(100, (valor/100));
        valor = valor - (valor%100);
        papeisMoeda[4] = new PapelMoeda(50, (valor/50));
        valor = valor - (valor%50);
        papeisMoeda[3] = new PapelMoeda(20, (valor/20));
        valor = valor - (valor%20);
        papeisMoeda[2] = new PapelMoeda(10, (valor/10));
        valor = valor - (valor%10);
        papeisMoeda[1] = new PapelMoeda(5, (valor/5));
        valor = valor - (valor%5);
        papeisMoeda[0] = new PapelMoeda(2, (valor/2));
        valor = valor - (valor%2);
    }

    public Iterator<PapelMoeda> getIterator() {
        return new TrocoIterator(this);
    }

    public static PapelMoeda[] getPapeisMoeda(){
        return papeisMoeda;
    }

    class TrocoIterator implements Iterator<PapelMoeda> {

        protected Troco troco;

        public TrocoIterator(Troco troco) {
            this.troco = troco;
        }

        @Override
        public boolean hasNext() {
            for (int i = 5; i >= 0; i++) {
                if (troco.papeisMoeda[i] != null) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public PapelMoeda next() {
            PapelMoeda ret = null;
            for (int i = 5; i >= 0 && ret != null; i++) {
                if (troco.papeisMoeda[i] != null) {
                    ret = troco.papeisMoeda[i];
                    troco.papeisMoeda[i] = null;
                }
            }
            return ret;
        }

    }
}
