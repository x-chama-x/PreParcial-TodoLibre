package todolibre;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Domicilio {

    public String calle;
    public int Altura;
    public int comuna;

    public Domicilio(String calle, int Altura, int comuna) {
        this.calle = calle;
        this.Altura = Altura;
        this.comuna = comuna;
    }

    public int getComuna() {
        return comuna;
    }
}