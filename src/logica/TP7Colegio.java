package logica;

import igu.Menu;

/**
 *
 * @author RAFAEL
 */
public class TP7Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Agregar 3 materias..
        Materia m = new Materia(1, "Ingles 1", 1);
        Materia m1 = new Materia(2, "Matematicas", 1);
        Materia m2 = new Materia(3, "Laboratorio 1", 1);
        Alumno a = new Alumno(1001, "Lopez", "Martin");
        Alumno a1 = new Alumno(1002, "Martinez", "Brenda");
        // Asignar las 3 materias al alumno a
        a.agregarMateria(m);
        a.agregarMateria(m1);
        a.agregarMateria(m2);
        // Asignar las 3 materias al alumno a1
        a1.agregarMateria(m);
        a1.agregarMateria(m1);
        a1.agregarMateria(m2);
        // Volver a asignar Laboratorio1 al alumno a1
        a1.agregarMateria(m2);

        System.out.println("El alumno " + a + " esta inscripto en " + a.cantidadMaterias(a) + " materias ");
        System.out.println("El alumno " + a1 + " esta inscripto en " + a1.cantidadMaterias(a1) + " materias ");

//      EJECUTAR FORMULARIO Menu desde "Run File" para probar IGU.

    }

}
