
package com.TiendaM_IQ2023.service;

import com.TiendaM_IQ2023.domain.Categoria;
import java.util.List;


public interface CategoriaService {
    public List<Categoria> getCategorias(boolean activos);

    public Categoria getCategoria(Categoria categoria);

    public void save(Categoria cliente); // Para insertar o modificar (si viene el idcliente o no)

    public void delete(Categoria cliente);
}
