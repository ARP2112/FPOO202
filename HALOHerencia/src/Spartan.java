public class Spartan extends Soldado{ // Heredar las propiedas dela clase Soldado
    private int escudo;

    public Spartan(String nombre, int salud, String arma, int escudo){
        super(nombre, salud, arma);
        this.escudo = escudo;
    }
    @Override //Polimorfismo: Sobrescribir el metodo en caso de requerir llmarlo
    public void recibirDano(int dano){
    if(escudo >0) {
        escudo -= dano;
        if(escudo < 0){
            salud += escudo;
            escudo = 0;
        }
        System.out.println(nombre + "Recibió daño: " + escudo + " Salud: " + salud);

    }
    else {
        super.recibirDano(dano); // reutilizar codigo
    }
    }

    public void recargarEscudo(){
        escudo = 100;
        System.out.println(nombre + " ha recargado su escudo al Maximo ");
    }

    @Override
    public void mostrarInfo(){ // reutilizado agregando las diferencias
        super.mostrarInfo();
        System.out.println("Escudo: " + this.escudo);
    }
}
