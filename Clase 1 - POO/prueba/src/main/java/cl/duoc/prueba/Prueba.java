package cl.duoc.prueba;

/**
 *
 * @author Sebastian Contreras
 */
import cl.duoc.prueba.models.Pasaje;
import cl.duoc.prueba.models.Pasajero;

public class Prueba {

    public static void main(String[] args) {
        Pasajero persona = new Pasajero();
        persona.setNombre("Sebastián");
        persona.setApellido("Contreras");
        persona.setRut("18742228-0");
        persona.setFechaNacimiento(3, 5, 1989);
        
        Pasaje pasaje = new Pasaje();
        pasaje.setDestino("Bogotá");
        pasaje.setFecha(15,10,2023);
        pasaje.setNumeroAsiento(40);
        pasaje.setNumeroVuelo(447);
        pasaje.setPasajero(persona);
        pasaje.setTraeEquipaje(true);
        pasaje.setValor(50000);
        
        System.out.println(pasaje);
        
    }
}
