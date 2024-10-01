package Clases;

/**
 *
 * @author Gustavo Adolfo Velasquez Granada Owen Andrés Holguin Molina Yely
 * Leana Gómez Vargas
 */
public class Producto {

    protected String codigo;
    protected Colaborador colab;
    protected String anno;
    protected boolean Criterio1;
    protected boolean Criterio2;
    protected boolean Criterio3;
    protected double gan;
    protected int puntaje;

    public Producto() {

    }

    public Producto(String codigo, Colaborador colab, String anno) {
        this.codigo = codigo;
        this.colab = colab;
        this.anno = anno;
        Criterio1 = false;
        Criterio2 = false;
        Criterio3 = false;
        gan = 0;
        puntaje = 0;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Colaborador getColab() {
        return colab;
    }

    public void setColab(Colaborador colab) {
        this.colab = colab;
    }

    public String getAnno() {
        return anno;
    }

    public void setAnno(String anno) {
        this.anno = anno;
    }

    public boolean isCriterio1() {
        return Criterio1;
    }

    public void setCriterio1(boolean Criterio1) {
        this.Criterio1 = Criterio1;
    }

    public boolean isCriterio2() {
        return Criterio2;
    }

    public void setCriterio2(boolean Criterio2) {
        this.Criterio2 = Criterio2;
    }

    public boolean isCriterio3() {
        return Criterio3;
    }

    public void setCriterio3(boolean Criterio3) {
        this.Criterio3 = Criterio3;
    }

    public double getGan() {
        return gan;
    }

    public void setGan(double gan) {
        this.gan = gan;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public String toString() {
        return "~CodPro: " + codigo + ", Colab: " + colab + ", Año: " + anno + ", Cri1=" + Criterio1 + ", Cri2=" + Criterio2 + ", Cri3=" + Criterio3 + ", Ganancia: " + gan + ", Puntaje: "+puntaje+ '_';
    }
    

}
