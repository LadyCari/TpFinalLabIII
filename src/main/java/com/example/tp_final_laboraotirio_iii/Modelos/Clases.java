package com.example.tp_final_laboraotirio_iii.Modelos;

import com.example.tp_final_laboraotirio_iii.Gestion.GestionPersonaje;
import com.example.tp_final_laboraotirio_iii.Repositorio.PersonajeRepo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Clases {


    public String[] getDialogo() {


        PersonajeRepo personajeRepo=new PersonajeRepo();
        List<Personaje> personajes=personajeRepo.Listar();
        String[] auxiliar={" "};

        if (!personajes.isEmpty()) {

            GestionPersonaje gestionPersonaje=new GestionPersonaje();

            ///region Dialogos Melina
            String[] dialogoClase1Melina = {"Soy Malenia Gurcia. En mis tiempos libres me gusta hacer pool dance. Soy su profe encargada de introducirlos a Java.","Java es un lenguaje de programación caracterizado por su portabilidad, desarrollado a mediados de los 90 por James Gosling y su equipo en Sun Microsystems. Se popularizó para aplicaciones de servidor, para la Web", "y por su utilización en la creación de aplicaciones para dispositivos móviles. Cuando mencionamos portabilidad nos referimos a la capacidad que tiene de ser ejecutado  en cualquier plataforma que tenga el JDK que implemente la JVM.", "" +
                    "JDK: Es un conjunto de herramientas de software que permite a los desarrolladores de estos, crear apps en Java. JVM:(Java Virtual Machine) en lenguaje taka taka, la JVM es un traductor entre el codigo de Java y el Sist. operativo, debido a que el codigo fuente se compila en formato bytecode (binario) y la JVM se encarga de interpretar este formato y pasarlo a binario maquina", "" +
                    "Algunos proTips. Java es Keysensitive, es decir las variables o metodos pueden cambiar por el uso de mayusculas. La salida de datos es similar al lenguaje horrible (C) que vimos en el primer año de nuestra NTU. Algo distinto es con la lectura de datos que lo realizamos con nuestro Scanner", "Scanner scan = new Scanner(System.in); // creamos nuestro scanner." + "\n" +
                    "String mensaje = scan.nextLine(); // se escanea la línea ingresada." + "\n" + "scan.close; // se cierra el scanner para no generar errores."};

            String[] dialogoClase2Melina = {"En POO nos enfocamos en pensar como los objetos interactuan entre si. Que es un objeto?Como no somos la Rae, usaremos nuestras palabras, un objeto lo podemos ver como un ente computacional el cual posee comportamientos (métodos) y características(atributos). La programacion orientada a objetos consta de 4 pilares FUNDAMENTALES ", "" +
                    "Abstraccion: implica aislar un objeto, simplificarlo y encapsular sus características relevantes. Se enfoca en la visión externa del objeto y elimina propiedades y acciones innecesarias. Encapsulamiento: Ocultamiento de los datos de un objeto de manera que sólo se pueda cambiar mediante las operaciones definidas por ese objeto. ",
                    "Herencia:La herencia es la capacidad de crear una clase, basada en otra ya existente. Cuando dos o más clases comparten atributos o métodos, nos conviene crear una clase padre (superclase) de las cuales heredarán las clases hijas.", "Polimorfismo: Son las diferentes formas de responder al mismo pedido. Puede haber más de un método con el mismo nombre pero se van a diferenciar por su comportamiento.",
                    "Hay varias formas de hacerlo:\n" +
                            " \n" +
                            "● Sobrecarga de métodos: Los métodos se diferencian por los parámetros.\n" +
                            "● Sobrescritura de métodos: Un hijo sobreescribe un método del padre.\n" +
                            "● Vinculación dinámica: Herencia.\n"};

            String[] dialogoClase3Melina = {"Ya te contamos que es un objeto, pero no te dijimos algo. Un objeto es la instancia de una clase. Y que es una clase? Lo que dictan los profesores... badam tuss","Se entiende por clase a  plantilla que utilizamos para crear nuestros objetos. Dentro de ella vamos a guardar las características del mismo(atributos) y comportamientos (métodos)."
                    ,"Algo importante de las clases son los Accesors, que modifican el nivel de acceso a los atributos desde las distintas partes del programa","Private: Cuando un método o atributo es declarado como private, su uso queda restringido al interior de la misma clase\n"+"Protected: visible para las clases que se encuentren en el mismo paquete y para cualquier subclase\n"+"Public: ofrece la máxima visibilidad, una variable, método o clase con modificador public será visible desde cualquier clase"};
            ///endregion

            ///region Dialogos Benoffi
            String[] dialogoClase1Benoffi = {"Yo soy Gucelda Buniffi, su profesor del segundo cuatrimestre, soy fan de Pokemon y de los Beatles","Hoy vamos a ver algunos temitas","Variables estaticas:Las variables estáticas pertenecen a la clase misma y no a cada instancia de una clase. Por lo tanto, el valor de una variable estática sigue siendo el mismo para cada instancia de la clase. Esta variable es alojada en la memoria Heap"
                    ,"Caracteristicas:\n"+"Reducen la huella de memoria del programa\n"+"Generalmente se declaran como final\n"+"Se puede acceder a traves del nombre de la clase",
                    "Los metodos estaticos, como las variables, pertenecen a la clase y no al objeto. Aqui algunas caracteristicas:\n"+"Solo puede acceder a atributos estáticos.\n"+"Un método estático puede llamar sólo a otros métodos estáticos\n"+"A un método estático se le puede acceder directamente por el nombre de la clase",
                    "Ultima cosita de esta clase y me voy a cazar unos Pokemones. Veamos el operador final. Se puede usar para cualquier tipo de variable, e indica que el valor no se modifica\n"+
                            "En una clase: indica que no se hereda\n"+"En la variable: No puede cambiar su valor\n"+"En el método: No se puede sobreescribir."};

            ///endregion

            switch (gestionPersonaje.ultimoDia()) {
                case 1 -> {
                    return dialogoClase1Melina;
                }
                case 2 -> {
                    return dialogoClase2Melina;
                }
                case 3 ->
                {
                    return dialogoClase3Melina;
                }
                case 5->
                {
                    return dialogoClase1Benoffi;
                }


            }

        }
        return auxiliar;
    }
}
