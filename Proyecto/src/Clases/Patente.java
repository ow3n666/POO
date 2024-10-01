/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Gustavo Adolfo Velasquez Granada
 *                 Owen Andrés Holguin Molina
 *                 Yely Leana Gómez Vargas
 */
public class Patente extends Producto{
    private String codigoPat;
    private String tipo;

    public Patente(String codigoPat, String tipo, String codigo, Colaborador colab, String anno) {
        super(codigo, colab, anno);
        this.codigoPat = codigoPat;
        this.tipo = tipo;
    }

    public String getCodigoPat() {
        return codigoPat;
    }

    public void setCodigoPat(String codigoPat) {
        this.codigoPat = codigoPat;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + " Patente{" + " Codigo: " + codigoPat + ", Tipo: " + tipo + "}\n";
    } 
    
    
}
