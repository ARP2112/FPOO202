public class Main {
    public static void main(String[] args){

        SpartanII jefemaestro = new SpartanII("Jonh", 90, "rifle de salto", 0);
        jefemaestro.mostrarInfo();
        jefemaestro.usarManejoAvanzado();
        jefemaestro.atacar("Convenant");
        jefemaestro.recibirDano(50);
        jefemaestro.recargarEscudo();

        SpartanIII capitanElite = new SpartanIII("Kelly", 100, "rifle de salto", 50);
        capitanElite.mostrarInfo();
        capitanElite.atacar("Convenant");
        capitanElite.recibirDano(50);
        capitanElite.recargarEscudo();




    }
}