package cl.duoc.ejemplomvc;

import cl.duoc.ejemplomvc.DTO.MascotaDTO;
import cl.duoc.ejemplomvc.Services.IMascotaService;
import cl.duoc.ejemplomvc.Services.Impl.MascotaService;

public class EjemploMVC {

    public static void main(String[] args) {
        // Crear una mascota que se llame cachupin.
        MascotaDTO c = new MascotaDTO("Cachupin", "kiltroberman", 23123123);
        MascotaDTO c2 = new MascotaDTO("Bob Marley", "Poodle", 2323);

        
        IMascotaService service = new MascotaService();
        service.Guardar(c);
        service.Imprimir();
        c.setNombre("bobby");
        service.Guardar(c2);
        service.Actualizar(0, c);
        service.Imprimir();
    }
}
