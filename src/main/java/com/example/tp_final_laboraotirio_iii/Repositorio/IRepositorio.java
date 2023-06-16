package com.example.tp_final_laboraotirio_iii.Repositorio;

import java.util.ArrayList;

public interface IRepositorio <T>{

   void Cargar();

  void Guardar();

  ArrayList<T> Listar();

  void Agregar(T...objeto);

  void Eliminar(int id);

  void Modificar(T objeto);

}
