package main;

import domain.estudiante;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author reych
 */
public class main {

    public static void main(String[] args) {
        grupoAlumnos grupo = new grupoAlumnos();
        grupo.agregarEstudiante(new estudiante("Reychell", 24));
        //grupo.agregarEstudiante(new estudiante("Paulo", 28));

       // mostrarDatos datos = new mostrarDatos();
       // datos.mostrar(grupo.getAlumnos());

        
       // System.out.println(grupo.getAlumnos().get(0));
        
        ArrayList<estudiante> alumnos = new ArrayList<>();
        alumnos.add(new estudiante("Reychell", 24));
        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println(alumnos.get(i));
            alumnos.get(i).setEdad(15);
            System.out.println(alumnos.get(i));

        }
        
        int option = 1;
        String nombre;
        int edad;

      /*  while (option == 1) {
            nombre = JOptionPane.showInputDialog("Digite un nombre");
            edad = Integer.parseInt(JOptionPane.showInputDialog("Digite una edad"));
            grupo.agregarEstudiante(new estudiante(nombre, edad));
            option = Integer.parseInt(JOptionPane.showInputDialog("Desea ingresar otro alumno?\n1.Si\n 2.No"));
        }
        datos.mostrar(grupo.getAlumnos());*/

    }

    private static class grupoAlumnos {

        private ArrayList<estudiante> alumnos;

        public grupoAlumnos() {
            alumnos = new ArrayList<>();
        }

        public void agregarEstudiante(estudiante alumno) {
            this.alumnos.add(alumno);
        }

        public ArrayList<estudiante> getAlumnos() {
            return alumnos;
        }

        public void setAlumnos(ArrayList<estudiante> alumnos) {
            this.alumnos = alumnos;
        }

    }

    private static class mostrarDatos {

        public mostrarDatos() {
        }

        public void mostrar(ArrayList<estudiante> datos) {

            for (estudiante alumno : datos) {
                JOptionPane.showMessageDialog(
                        null, "Alumno: " + alumno.toString());
            }

        }

    }

}
