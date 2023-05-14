package logica;

import java.util.ArrayList;

/**
 *
 * @author RAFAEL
 */
public class Materia {
    private int idMateria;
    private String nombreMateria;
    private int anio;
    public static ArrayList<Materia> mat = new ArrayList();

    public Materia(int idMateria, String nombreMateria, int anio) {
        this.idMateria = idMateria;
        this.nombreMateria = nombreMateria;
        this.anio = anio;
        mat.add(this);
    }

    public Materia(int id) {
    }
    
    

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return nombreMateria +" año "+ anio +"\n";
    }
    
    
    
}
