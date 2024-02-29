package ud5.rol.extra2;

public class Armadura extends Item{

    int defensa;
    enum TipoArmadura {YELMO, ARMADURA, ESCUDO}
    TipoArmadura tipo;
    
    public Armadura(String nombre, double peso, int precio, int defensa, String tipo) {
        super(nombre, peso, precio);
        this.defensa = defensa;
        this.tipo = TipoArmadura.valueOf(tipo);
    }
    
    @Override
    public String toString() {
        return nombre + " (+" + defensa + " defensa)";
    }

}
