package com.example.tp_final_laboraotirio_iii.Examenes;

import com.example.tp_final_laboraotirio_iii.Modelos.Personaje;
import com.example.tp_final_laboraotirio_iii.Repositorio.PersonajeRepo;


import java.util.List;

public class ExamenMalenia {

    PersonajeRepo personajeRepo = new PersonajeRepo();
    List<Personaje> personajes = personajeRepo.Listar();
    String[] listaRespuestas;


    //region arreglo de strings
    String[] Preguntas = {"¿Qué pilar fundamental utilizamos cuando ocultamos los datos?","Que pilar fundamental busca resaltar las características generales de un ente, para crear nuestro software?","¿Cuáles son los 4 pilares fundamentales de la programación orientada a objetos?","¿Cual es la funcionalidad de La JVM?","¿Qué modificador de acceso restringe el acceso a los atributos al resto del programa?","¿Qué ocurre si no declaro un constructor en una clase?","¿Cómo podemos acceder a un atributo privado?","¿Qué significa la sobrecarga de métodos?","¿Qué ocurre si no colocamos el toString en nuestra clase?","Quien fundó el lenguaje Java?"};
    String[] Respuestas1 = {"1-Polimorfismo","1-Polimorfismo","1-public,privado, abstracto,Polimorfismo","1-Permite almacenar datos con identificador","1-Public","1-PERO A VOS TE FALLA? COMO NO VAS A DECLARAR UN CONSTRUCTOR","1- Utilizando el método getter","1-Sobreescritura de los métodos por parte de las subclases","1-El compilador buscará el toString default de la superclase object y mostrará la dirección de memoria de los datos","1-Perón (justo después de los derechos laborales)"};
    String[] Respuestas2 = {"2-Abstracción","2-Abstracción","2-toString, public, private, implements","2-Interpretar el código binario de Java (Bytecode) para ser traducido a binario de máquina, y poder ejecutar el código.","2-Private","2-Lanza un error en tiempo de ejecución, debido a que no se puede instanciar un objeto si su clase no posee un constructor","2-Utilizando el método setter","2-Métodos con mismo nombre pero distintos comportamientos","2-La clase tiene un método toString predeterminado y mostrará los datos correctamente","2-James Gosling y su equipo en Sun Microsystems (carreo James)"};
    String[] Respuestas3 = {"3-Encapsulamiento","3-¿Qué es un pilar? No conozco esa calle","3-Provee herramientas para permitir el desarrollo de aplicaciones con java, además de ser necesario para ejecutar y compilar programas java en cualquier plataforma","3-Provee herramientas para permitir el desarrollo de aplicaciones con java, además de ser necesario para ejecutar y compilar programas java en cualquier plataforma","3-Protected","3-Puedo instanciar un objeto ya que las clases poseen un constructor predefinido","3-Utilizando el método toString","3-Heredar atributos y métodos a las subclases","3-No existe tal método","3- Moyano y los camioneros"};
    String[] Respuestas4 = {"4-Pilar… Pila? FIFO?","4.Herencia","","4-JVM? ¿Es algún anime eso?","4-JVM? ¿Es algún anime eso?","4-Habrá un error en tiempo de compilación ya que el compilador no identificará ningún constructor de la clase","4-Pidiendo por favor, ser educado siempre es opción","4-Qué le pongo mucho peso al método","4-Explota la pc","4-Bill gates, luego de crear Microsoft"};
    //endregion

    //region arreglo respuestas
    String[] respuestasTPFinal = {" 3"," 2"," 3"," 1"," 2"," 3"," 1"," 2"," 1"," 2"};
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

    public String[] getArregloRespuestasMelinaTPFinal(){
        return respuestasTPFinal;
    }
    //endregion

}