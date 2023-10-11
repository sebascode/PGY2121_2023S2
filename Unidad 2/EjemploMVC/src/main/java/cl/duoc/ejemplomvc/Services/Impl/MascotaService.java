package cl.duoc.ejemplomvc.Services.Impl;

import cl.duoc.ejemplomvc.DTO.MascotaDTO;
import cl.duoc.ejemplomvc.Services.IMascotaService;

public class MascotaService implements IMascotaService {

    private MascotaDTO[] list = new MascotaDTO[15];
    
    @Override
    public void Guardar(MascotaDTO obj) {
        list[0] = obj;
    }

    @Override
    public void Actualizar(int indice, MascotaDTO obj) {
        list[indice] = obj;
    }

    @Override
    public MascotaDTO Buscar(int indice) {
        return list[indice];
    }

    @Override
    public MascotaDTO[] Listar() {
        return list;
    }

    @Override
    public void Eliminar(int indice) {
        list[indice] = null;
    }

    @Override
    public void Imprimir() {
        boolean salir = true;
        int indice = 0;
        do{
            MascotaDTO obj = list[indice];
            if(obj != null){
                System.out.println(obj);
                indice++;
            }
            else{
                salir = false;
            }
        }while(salir);
    }
}
