
package Clases;

/**
 *
 * @author Gustavo Adolfo Velasquez Granada
 *                 Owen Andrés Holguin Molina
 *                 Yely Leana Gómez Vargas
 */
public class Articulo extends Producto{
    private String titulo;
    private String ISBN;
    private String categoria;

    public Articulo(String titulo, String ISBN, String categoria, String codigo, Colaborador colab, String anno) {
        super(codigo, colab, anno);
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return super.toString()  + " Articulo{" + " Titulo: " + titulo + ", ISBN:" + ISBN + ", Categoria: " + categoria + "}\n";
    }
    
    
}
