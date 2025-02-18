public class Main {
    public static void main(String[] args) {


        //Creamos el primer objeto
        Spartan jefemaestro = new Spartan();
        Spartan PatronEstrategia = new Spartan();

        //usar atributos
        jefemaestro.nombre = "John";
        jefemaestro.salud = 100;
        jefemaestro.escudo = 70;
        jefemaestro.armaPrincipal = "Rifle de asalto";
        //Nuevo objeto
        PatronEstrategia.nombre= "The Arbiter";
        PatronEstrategia.salud= 80;
        PatronEstrategia.escudo= 85;
        PatronEstrategia.armaPrincipal= "espada de energía";



        //Invocamos los métodos
        jefemaestro.mostrarInfo();
        jefemaestro.atacar("Grunt");
        jefemaestro.recargarArma(75);
        jefemaestro.correr(true);

        //Nuevos metodos
        PatronEstrategia.mostrarInfo();
        PatronEstrategia.atacar("Guilty");
        PatronEstrategia.recargarArma(90);
        PatronEstrategia.correr(false);

    }
}