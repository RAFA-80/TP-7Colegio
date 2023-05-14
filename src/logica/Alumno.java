package logica;

import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JOptionPane;

/**
 *
 * @author RAFAEL
 */
public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> materias = new HashSet();
    public static ArrayList<Alumno> al = new ArrayList();
    
    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public Alumno(int legajo) {
    }
    
    

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Materia> getMaterias() {
        return materias;
    }
    
    
    
    public void agregarMateria(Materia m){
        if(this.materias.contains(m)){
            JOptionPane.showMessageDialog(null, "La Materia "+m+" ya se encuentra asignada el alumno "+this);
        }else{
            this.materias.add(m);
            JOptionPane.showInternalMessageDialog(null, "Inscripcion de "+this+" a "+m+" realizada");
        }
        
    }
    
    public int cantidadMaterias(Alumno a){
        int cant;
        cant = materias.size();
        return cant;
    }
   
    @Override
    public String toString() {
        return apellido +" "+ nombre;
    }
    
}
