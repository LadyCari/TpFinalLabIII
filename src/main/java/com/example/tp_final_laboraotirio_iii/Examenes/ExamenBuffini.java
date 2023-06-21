package com.example.tp_final_laboraotirio_iii.Examenes;

import com.example.tp_final_laboraotirio_iii.Modelos.Personaje;
import com.example.tp_final_laboraotirio_iii.Repositorio.PersonajeRepo;

import java.util.List;

public class ExamenBuffini {
    PersonajeRepo personajeRepo = new PersonajeRepo();
    List<Personaje> personajes = personajeRepo.Listar();
    String[] listaRespuestas;

    //region arreglo de strings
    String[] Preguntas = {"¿Qué es una tabla hash?","¿Qué es una colisión?","¿Por qué no es conveniente utilizar el hashcode default?","En el siguiente ejemplo, que atributo asignarías al hashCode para que tu objeto sea único?","¿Qué otro método utilizamos junto al Hashcode?","¿Qué utilidad tiene el método Equals?","¿Qué estructura utilizamos si no queremos permitir duplicados?","¿Qué es la genericidad?","¿Por qué no es buena práctica utilizar Object como forma de genericidad?","¿Qué representa la T en genericidad?"};
    String[] Respuestas1 ={"1-Es una estructura de datos agrupados por clave-valor","1- Según la RAE: Encuentro violento de dos o más cuerpos, de los cuales al menos uno está en movimiento","1-Puede generar colisiones entre los buckets","1- Dni y dirección","1-Equals","1-Determina si dos objetos son iguales","1-LinkedHashSet","1-Actitud o comportamiento de la persona generosa","1-Es un nivel de abstracción muy alto, y genera errores","1-elementos de una colección"};
    String[] Respuestas2 ={"2-Una estructura de datos con orden de inserción","2-Qué dos objetos distintos se guarden en el mismo bucket o slot","2-Puede lanzar errores en tiempo de ejecución","2- Nombre y edad","2-ToString","2-Determina si los atributos de un objeto no son nulos","2-LinkedList","2-Es la capacidad de trabajar con distintos tipos de datos","2-Hace el código muy difícil de comprender","2-tipo de datos"};
    String[] Respuestas3 ={"3-Tabla hash? eso usaba Tony hawk para hacer ollies","3-Qué dos objetos iguales se guarden en el mismo bucket o slot","3-Porque de manera default no interactúa con el método equals por lo que  tanto traerá varios comportamientos inesperados.\n","3- Dirección y nombre","3-CompareTo","3-Compara dos objetos y devuelve cual es vayor (utilizando algún atributo entero que posea)","3-Vector","3-Permite heredar clases múltiples","3-Es una crotada","3-clave-valor"};
    String[] Respuestas4 ={"4-Una colección de datos de la interfaz List","4-Estoy entre la 3 y la 4, pero nose","4-¿Que era el hashcode?","4- Nombre, edad y altura","4-Respuesta vacía, los desarrolladores se quedaron sin ideas","","4-ArrayList","4-Demasiadas opciones? :) Tranqui pa, una menos","4-Todas son correctas","4-números"};
    //endregion

    //region arreglo respuestas
    String[] respuestasTPFinal = {" 1"," 2"," 3"," 2"," 4"," 1"," 2"," 3"," 2"," 3"};
    //endregion

    //region G y S strings
    public String[] getPreguntas(){
        return Preguntas;
    }
    public String[] getRespuestas1(){
        return Respuestas1;
    }
    public String[] getRespuestas2() {
        return Respuestas2;
    }
    public String[] getRespuestas3() {
        return Respuestas3;
    }
    public String[] getRespuestas4() {
        return Respuestas4;
    }

    public String[] getArregloRespuestas(){
        return respuestasTPFinal;
    }
    //endregion
}
