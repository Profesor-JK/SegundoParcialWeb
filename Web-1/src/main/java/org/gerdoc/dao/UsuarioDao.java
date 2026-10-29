package org.gerdoc.dao;

import org.gerdoc.model.Alumno;

import java.util.List;

public interface UsuarioDao
{
    List<Alumno> findAll( );
    Alumno findById(Long id);
    Alumno save(Alumno alumno);
    void deleteById(Long id);
    Alumno update(Alumno alumno);
}
