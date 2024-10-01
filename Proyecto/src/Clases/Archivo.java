package Clases;

import java.io.*;

/**
 *
 * @author Gustavo
 */
public class Archivo {

    private File f;
    private FileReader fr;
    private FileWriter fw;
    private BufferedReader br;
    private BufferedWriter bw;

    public void EscribirLColabolador(List lista) {
        f = new File("Colaboladores.txt");
        try {
            fw = new FileWriter(f);
            bw = new BufferedWriter(fw);
            //paso 4 -> recorremos  la lista
            Node aux = lista.getFirst();
            while (aux != null) {
                bw.write(((Colaborador) aux.getData()).getId() + "\t"
                        + ((Colaborador) aux.getData()).getNombre() + "\t"
                        + ((Colaborador) aux.getData()).getRol() + "\r\n");
                aux = aux.getLink();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace(); //imprime donde se genera el error
        }
    }

    public List LeerLColabolador() {
//        System.out.println("aqui voy");
        List lista = new List();
        f = new File("Colaboladores.txt");
        String register, fields[];  //para leer los registros y campos
        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            while ((register = br.readLine()) != null) {
                fields = register.split("\t");
                Colaborador p = new Colaborador(fields[0], fields[1], fields[2]);
                lista.AddFirst(p);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        System.out.println("lista " + lista.toString());
        return lista;
    }

    public void EscribirEvaluador(List eva) {
        f = new File("Evaluadores.txt");
        try {
            fw = new FileWriter(f);
            bw = new BufferedWriter(fw);
            //paso 4 -> recorremos  la lista
            Node aux = eva.getFirst();
            while (aux != null) {
                bw.write(((Evaluador)aux.getData()).getId()+"\t"+
                        ((Evaluador)aux.getData()).getNombre()+"\r\n");
                aux = aux.getLink();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace(); //imprime donde se genera el error
        }
    }
    
    public List LeerEvaluador() {
        List lista = new List();
        f = new File("Evaluadores.txt");
        String register, fields[];  //para leer los registros y campos
        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            while ((register = br.readLine()) != null) {
                fields = register.split("\t");
               Evaluador p = new Evaluador(fields[0], fields[1]);
                lista.AddFirst(p);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    public void Enviar_respuerta(List prod, String colavorador) {
        f = new File(colavorador + ".txt");
        try {
            fw = new FileWriter(f);
            bw = new BufferedWriter(fw);
            //paso 4 -> recorremos  la lista
            Node aux = prod.getFirst();
            double valorT = 0;
            int cont = 1;
            String nombre = "",
                    text = "";
            
            while (aux != null) {
                
                valorT +=((Producto) aux.getData()).getGan();
                if ((Producto) aux.getData() instanceof Articulo) {
                    nombre = "Articulo";
                }
                if ((Producto) aux.getData() instanceof Software) {
                    nombre = "Software";
                }
                if ((Producto) aux.getData() instanceof Patente) {
                    nombre = "Patente";
                }
                text +=cont + "\t"
                        + ((Producto) aux.getData()).getCodigo() + "\t" + ((Producto) aux.getData()).getCodigo() + "\t" + nombre + "\t" + ((Producto) aux.getData()).getPuntaje() +"\t"+
                        +((Producto) aux.getData()).getGan()+ "\n";
                aux = aux.getLink();
                cont += 1;
            }
            bw.write("Señor:" + colavorador
                        + "\n"
                        + " La Dirección de Investigación de la Institución Universitaria de"
                        + " Envigado le agradece su participación en la convocatoria para el reconocimiento de los productos académicos.\n "
                        + "En esta ocasión, la Dirección de Investigación le reconocerá los siguientes productos:\n"
                        + "No \t" + "Codigo \t" + "Nombre \t" + "Puntos \t"+"Valor\n"+
                    text+"En la proxima quincena se le reconocera: "+valorT+ "\r\n");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace(); //imprime donde se genera el error
        }
    }
}
