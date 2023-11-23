package cl.duoc.interfazgrafica.Service.Impl;

import cl.duoc.interfazgrafica.DAO.ConexionDB;
import cl.duoc.interfazgrafica.DTO.PersonaDTO;
import cl.duoc.interfazgrafica.Service.IPersona;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonaService implements IPersona {
    
    ConexionDB db;
    
    public PersonaService(){
        db = new ConexionDB();
    }
    
    @Override
    public void Guardar(PersonaDTO p) {
        try {
            String query = "INSERT INTO `persona` (`nombre`, `color`) values ('"+ p.getNombre() +"', '"+ p.getColor() +"')";
            System.out.println(query);
            db.EjecutarQuery(query);
        } catch (SQLException ex) {
            System.out.println("Hubo un error! " + ex.getMessage());
        }
    }

    @Override
    public void Editar(int i, PersonaDTO p) {
        try {
            String query = "UPDATE `persona` SET `nombre` = '"+ p.getNombre() +"', `color`='"+ p.getColor() +"');";
            db.EjecutarQuery(query);
        } catch (SQLException ex) {
            System.out.println("Hubo un error!");
        }
    }

    @Override
    public List<PersonaDTO> listar() {
        List<PersonaDTO> lista = new ArrayList<>();
        try {
            ResultSet rs = db.EjecutarQuery("select * from `persona`");
            while(rs.next()){
                lista.add(new PersonaDTO(rs.getString("nombre"), rs.getString("color")));
            }
        } catch (SQLException ex) {
            System.out.println("Hubo un error!");
        }
        return lista;
    }

    @Override
    public void Eliminar(PersonaDTO p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public PersonaDTO BuscarPorNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public PersonaDTO BuscarPorColor(String color) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
