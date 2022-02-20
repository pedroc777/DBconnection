package controlador;

import java.sql.*;
import java.util.ArrayList;

import modelo.Profesor;

public class ProfesorOp {
	
	public ProfesorOp() {
    }
	public boolean insertProfesor(Profesor p) {
        boolean response = false;
        String sql = "insert into profesor (Numero_Económico, Nombre, Edad,idCategoria, idDepartamento)"
                + "values ('" + p.getNumeroEconomico() + "', '" + p.getNombre() + "', " + p.getEdad() + ", " + p.getIdCategoria() + ", " + p.getIdDepartamento() + ")";

        System.out.println(sql);
        return response;
    }
	
	public int insertarProfesor2(Profesor p) {
        int result = 0;

        PreparedStatement stm = null;
        String sql = "insert into profesor (Numero_Económico, Nombre, Edad,idCategoria, idDepartamento)"
                + " values(?,?,?,?,?)";

        Connection con = Conexion.init();

        try {
            stm = con.prepareStatement(sql);

            stm.setString(1, p.getNumeroEconomico());
            stm.setString(2, p.getNombre());
            stm.setInt(3, p.getEdad());
            stm.setInt(4, p.getIdCategoria());
            stm.setInt(5, p.getIdDepartamento());

            result = stm.executeUpdate();
            stm.close();
        } catch (SQLException ex) {
            System.out.println("No se pudo rey");
        }

        return result;
    }
	
	public int insertarProfesor3(ArrayList<Profesor> p) {
        int result = 0;

        PreparedStatement stm = null;
        String sql = "insert into profesor (Numero_Económico, Nombre, Edad,idCategoria, idDepartamento)"
                + " values(?,?,?,?,?)";

        Connection con = Conexion.init();

        try {
            stm = con.prepareStatement(sql);

            for (int i = 0; i < p.size(); i++) {
                stm.setString(1, p.get(i).getNumeroEconomico());
                stm.setString(2, p.get(i).getNombre());
                stm.setInt(3, p.get(i).getEdad());
                stm.setInt(4, p.get(i).getIdCategoria());
                stm.setInt(5, p.get(i).getIdDepartamento());
                result = stm.executeUpdate();
            }

            //result = stm.executeUpdate();
            stm.close();
        } catch (SQLException ex) {
            System.out.println("Nope");
        }

        return result;
    }
	
	
	public ArrayList<Profesor> buscaProfesor(String name) {
		ArrayList<Profesor> profesores = new ArrayList<Profesor>();
		Connection cn= Conexion.init();
		
		String sql="select * from profesor where nombre like ?;";
		//System.out.println(sql);
		
		try {
			PreparedStatement st= cn.prepareStatement(sql);
			
			st.setString(1, "%"+name+"%");
			
			ResultSet rows=st.executeQuery();
			while(rows.next()) {
				Profesor p=new Profesor();
				p.setNumeroEconomico(rows.getString(2));
				p.setNombre(rows.getString(3));
				p.setEdad(rows.getInt(4));
				p.setIdDepartamento(rows.getInt(5));
				p.setIdCategoria(rows.getInt(6));
				profesores.add(p);
			}
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return profesores;
	}
	
	
	public ArrayList<Profesor> profesoresSet() {
		ArrayList<Profesor> profesores = new ArrayList<Profesor>();
		Connection cn= Conexion.init();
		Statement st=null;
		
		String sql="select * from profesor;";
		System.out.println(sql);
		
		try {
			st=cn.createStatement();
			
			ResultSet rows=st.executeQuery(sql);
			while(rows.next()) {
				Profesor p=new Profesor();
				p.setNumeroEconomico(rows.getString(2));
				p.setNombre(rows.getString(3));
				p.setEdad(rows.getInt(4));
				p.setIdDepartamento(rows.getInt(5));
				p.setIdCategoria(rows.getInt(6));
				profesores.add(p);
			}
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return profesores;
	}
	
	public void eliminarProfesor(int ne) {
		Connection cn= Conexion.init();
		
		String sql="delete from profesor where Numero_económico=?;";
		
		try {
			PreparedStatement st= cn.prepareStatement(sql);	
			st.setInt(1, ne);
			st.executeUpdate();
			cn.close();
			System.out.println("Eliminado exitosamente");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
