
package Clases;

/**
 *
 * @author Gustavo Adolfo Velasquez Granada
 *                 Owen Andrés Holguin Molina
 *                 Yely Leana Gómez Vargas
 */
public class Software extends Producto {
    private String codSoft;

    public Software(String codSoft, String codigo, Colaborador colab, String anno) {
        super(codigo, colab, anno);
        this.codSoft = codSoft;
    }

    public String getCodSoft() {
        return codSoft;
    }

    public void setCodSoft(String codSoft) {
        this.codSoft = codSoft;
    }

    @Override
    public String toString() {
        return super.toString() + " Software{" + "codSoft=" + codSoft + "}\n";
    }

   

    
}
