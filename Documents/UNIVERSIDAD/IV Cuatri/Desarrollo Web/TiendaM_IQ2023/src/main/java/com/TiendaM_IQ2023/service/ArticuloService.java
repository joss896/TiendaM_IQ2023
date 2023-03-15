package com.TiendaM_IQ2023.service;

import com.TiendaM_IQ2023.domain.Articulo;
import java.util.List;

public interface ArticuloService {

    public List<Articulo> getArticulos(boolean activos);

    public Articulo getArticulo(Articulo articulo);

    public void save(Articulo cliente);

    public void delete(Articulo cliente);
}
