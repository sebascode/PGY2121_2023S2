package cl.duoc.ejemplomvc.Services;

import cl.duoc.ejemplomvc.DTO.MascotaDTO;

public interface IMascotaService {
    
    public void Guardar(MascotaDTO obj); 
    public void Actualizar(int indice, MascotaDTO obj);
    public MascotaDTO Buscar(int indice);
    public MascotaDTO[] Listar();
    public void Eliminar(int indice);
    
    public void Imprimir();
}
