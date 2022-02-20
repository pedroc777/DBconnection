package pruebas;

import java.sql.Connection;
import java.util.ArrayList;

import controlador.Conexion;
import controlador.ProfesorOp;
import modelo.Profesor;

public class Test {
	public static void main(String[] args) {
		//Connection cn = Conexion.init();
		ArrayList <Profesor> q = new ArrayList();
		
		/*Profesor p = new Profesor("SH04TR", "Akira Yamaoka", 28, 2, 2);
        Profesor p4 = new Profesor("SH02", "Mashahiro Ito", 29, 2, 2);
        Profesor p2 = new Profesor("RE010204", "Shinji Mikami", 26, 3, 1);
        Profesor p3 = new Profesor("MGSPT", "Hideo Kojima", 25, 1, 1);*/
		
		//Profesor p = new Profesor("Ale ruelas","4534545",2,1,3);
		ProfesorOp pp1 = new ProfesorOp();
		/*q.add(p);
        q.add(p4);
        q.add(p2);
        q.add(p3);*/
		
		pp1.eliminarProfesor(38574);
		
		/*for(int i = 0; i < q.size(); i++) {
			System.out.println(q.get(i).toString());
		}*/
		
	}
}
