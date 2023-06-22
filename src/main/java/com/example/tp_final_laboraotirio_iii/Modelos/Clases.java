package com.example.tp_final_laboraotirio_iii.Modelos;

import com.example.tp_final_laboraotirio_iii.Gestion.GestionPersonaje;
import com.example.tp_final_laboraotirio_iii.Repositorio.PersonajeRepo;

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
                    ,"Algo importante de las clases son los Accesors, que modifican el nivel de acceso a los atributos desde las distintas partes del programa","Default: Java asigna uno por defecto \n"+"Private:su uso queda restringido al interior de la misma clase\n"+"Protected:visible para las clases que se encuentren en el mismo paquete y para cualquier subclase\n"+"Public:una variable, método o clase con modificador public será visible desde cualquier clase"};
            ///endregion

            ///region Dialogos Benoffi
            String[] dialogoClase1Benoffi = {"Yo soy Gucelda Buniffi, su profesor del segundo cuatrimestre, soy fan de Pokemon y de los Beatles","Hoy vamos a ver algunos temitas","Variables estaticas:Las variables estáticas pertenecen a la clase misma y no a cada instancia de una clase. Por lo tanto, el valor de una variable estática sigue siendo el mismo para cada instancia de la clase. Esta variable es alojada en la memoria Heap"
                    ,"Caracteristicas:\n"+"Reducen la huella de memoria del programa\n"+"Generalmente se declaran como final\n"+"Se puede acceder a traves del nombre de la clase",
                    "Los metodos estaticos, como las variables, pertenecen a la clase y no al objeto. Aqui algunas caracteristicas:\n"+"Solo puede acceder a atributos estáticos.\n"+"Un método estático puede llamar sólo a otros métodos estáticos\n"+"A un método estático se le puede acceder directamente por el nombre de la clase",
                    "Ultima cosita de esta clase y me voy a cazar unos Pokemones. Veamos el operador final. Se puede usar para cualquier tipo de variable, e indica que el valor no se modifica\n"+
                            "En una clase: indica que no se hereda\n"+"En la variable: No puede cambiar su valor\n"+"En el método: No se puede sobreescribir."};


            String[] dialogoClase2Benoffi={"Ahora veremos la Mamushka mas grande.Empezamos con un objetos, luego la clase y ahora vemos la Herencia. Esta nos permite crear una clase en base a una ya creada, para evitar repetir codigo y facilitar la reutilizacion del mismo. Esto se hace utilizando la palabra reservada Extends",
                    "Tambien esto sirve para crear una estructura jerarquica de clases, donde cada clase hija (subclase) tiene una sola clase padre (superclase),sin embargo esta ultima puede tener cualquier numero de subclases",
                    "En resumen como la vida misma, cada padre puede tener indefinidos hijos(se hagan cargo o no) pero cada hijo puede tener un solo padre(esto es 100% biologia, no hablamos de generos)","En java tenemos la palabra reservada Super. Super, superman?, super que?. No, super es una palabra reservada de Java que utilizamos para llamar a los métodos o al constructor de la superclase desde una subclase",
            };

            String[] dialogoClase3Benoffi={"Hoy es nuestra ultima clase antes del parcial, y veremos clase abstracta.¿Para qué sirve? Ni idea, googlealo. Tranquilo es un chiste. Básicamente una clase abstracta nos sirve como molde, como una clase normal, pero no la podemos instanciar.",
                    "Tambien existen los metodos abstractos y cuentan con las siguientes caracteristicas\n"+"No tienen implementación (cuerpo), solo se anotan con paréntesis y pueden contener atributos\n"+"Su declaración termina con punto y coma\n"+"Sólo puede existir dentro de una clase abstracta",
                    "INTERFACES, perdon por gritar me emocione. Dijimos que cuando 2 o más clases comparten atributos podemos hacer una clase padre. Ahora imaginemos que 2 clases no comparten ni un atributo pero tienen métodos iguales, como podemos ser eficientes? Utilizando interfaces",
                    "Esta es una colección de métodos abstractos los cuales pueden ser implementados por una clase concreta.  Cuando una clase implementa una interfaz, “firma un contrato” en el cual tiene que implementar todos sus métodos"+"Las interfaces pueden heredar de otras interfaces\n","Y por ultimo veremos la interfaz Comparable, la utilizamos para darle un orden natural a los objetos de una clase, ya que van a ser comparados por algún criterio que usemos\n"+
                    "Este método es el que se utiliza para definir el criterio de comparación entre los objetos de la clase. El método debe retornar -1 si el objeto actual es menor que el objeto comparado, 0 si son iguales y 1 si el objeto actual es mayor que el objeto comparado."};
            ///endregion

            ///region Dialogos Agustin
            String[] dialogoAgustin={"Hola soy Adisgustin Batizi, su profe del tercer cuatrimestre. Me gusta el anime, los patitos de ule, regalar cupones de Ayudemi, tocar el piano. Se comenta por los pasillos que soy el mejor profe de la NTU",
                    "Primero comencemos con Tabla Hash, para que mas adelante puedas entender el Hashcode. Esta es una estructura de datos, la cual agrupa claves-valor.Cabe destacar que no poseen un orden y esta compuesta por buckets o slots","Los objetos poseen un hashcode, el cual java transforma en entero para usarlo como entero (utilizado como indice en el bucket). Esto lo hace java con el metodo de dispersion",
                    "Metodo hashcode: Quiza fue chino lo que te dijimos pero ahora cobra sentido. El metodo hashcode permite que un objeto posea un codigo hash.Por defecto si no lo implementamos, Java usa como Hashcode la direccion de memoria algo malo ya que puede generar colisiones (guardar en un mismo bucket diferentes objetos)",
                    "Cuando implementamos el metodo Hashcode debemos elegir los atributos que hagan unico a nuestro objeto ya sea, por ejemplo un Dni, un ID etc.El metodo se creo para ser implementado junto al Equals, un metodo que determina si dos objetos son iguales",
            };
            String[] dialogoAgustin2={"La clase de hoy veremos Collections.Una colección es simplemente un grupo de objetos, y el marco Collections de Java proporciona una serie de interfaces y clases para trabajar con diferentes tipos de colecciones de manera eficiente y fácil",
                    "Algunas subinterfaces de Collections son\n"+"List:define una colección ordenada de elementos, es decir, una secuencia de elementos\n"+"Set:no permite elementos duplicados. Es decir, cada elemento en un Set debe ser único\n"+"Map:La interfaz Map no es una subinterfaz de Collection.se utiliza para almacenar un conjunto de pares clave-valor"};
            String[] dialogoAgustin3={"En nuestra ultima clase antes del parcial veremos Genericidad. Se define como Actitud o comportamiento de la persona generosa. Perdon googlee cualquier cosa",
                    "La genericidad es poder trabajar con distintos tipos de datos, hay una manera macabra de hacerlo y es con Object (padre de todos los objetos, algo asi como Dios, o Messi, son sinonimos)",
                    "Supongamos que creamos una calculadora que trabaja con Object, por un lado es bueno porque podríamos trabajar con enteros, flotantes,decimales, etc. Pero y si no recibe un número y recibe un objeto Persona?",
                    "Este es el problema que tiene Object, quita seguridad ya que, seguramente se nos rompa el código en tiempo de ejecución y también nuestro código será más difícil de interpretar. Para solucionar esto podemos utilizar nuestras clases Genericas",
                    "Este tipo de datos se especificará al momento de instanciar la clase o el método. Por ejemplo: public class MiClase<T>.La convencion de las letras a poner es la siguiente:\n"+"E → elemento de una colección. (estructura de datos)\n"+"T → tipo datos\n"+"K → clave/key\n"+"V → valor"};
            ///endregion

            ///region Dialogos chaldu
            String[] dialogoChaldu1={"Hola soy Gariel chulde, su profesor del cuarto y ultimo cuatrimestre.Tengo un canal de youtube llamado YOUTIPS donde se suben nuestras clases",
                    "En nuestro primer encuentro vamos a hablar de Enum o Enumeradores, son una estructura de datos que permite definir un conjunto de constantes con nombre. Estas constantes representan valores que son fijos y predefinidos, haciendo el código más legible,permiten verificación en tiempo de compilación, y acotan los valores que puede tomar una variable por lo que evitan errores",
                    "Los enum pueden ser declarados dentro de una clase o por fuera, pero nunca dentro de un método. Sus constructores siempre son privados porque las instancias ya están definidas y no vamos a instanciar una nueva.","Ahora tambien veremos excepciones. Como programadores, no podemos evitar la estupidez humana, pero sí prevenirla...\n"+"Imaginemos que creamos un programa donde pedimos el ingreso de un número entero, pero el usuario ingresa un carácter. Esto deriva en un error que corta el flujo del programa y automáticamente habrá que cerrarlo",
                    "Para evitar esto podemos usar las Excepciones.Se representan a través de objetos que heredan de Throwable.Proporcionan una forma clara de comprobar posibles errores sin oscurecer el código. Ahora vamos a ver DE MANERA SENCILLA los tipos de excepciones:",
                    "Excepciones checked:Son aquellas que el compilador nos pide tratar alojandolas en un bloque try-catch, y si no lo hacemos el error se produce en tiempo de compilación.\n"+"Excepciones unchecked:Son errores de programación, donde el compilador no se pone estricto pidiéndonos que manejemos las excepciones, y compila sin problema",
                    "Buenas practicas:\n"+"Utilizar excepciones que ya existen\n"+"Utilizar un nivel bajo de abstracción, por ejemplo nosotros tenemos un programa en el que queremos dividir por cero, esto generará un error de tipo aritmético. Nosotros al tratar los errores en el catch podríamos poner Exception","pero esto hará que sea más difícil de leer el código en cambio una buena práctica sería poner Arithmetic Exception"};

            String[] dialogoChaldu2={"Hoy veremos persistencia. Primero debemos definir que es un archivo, conjunto de bits almacenados en un dispositivo, y accesible a través de un camino de acceso (pathname) que lo identifica, también llamado ruta de acceso.",
                    "Para manejar archivos en Java utilizamos la clase File, hay metodos para escribir en archivos PERO son ineficientes por lo que omitiremos teoria innecesaria y te explicaremos el concepto de Buffering.",
                    "Basicamente es darle la gestion del archivo al buffer, este se cerrara una vez que dejemos de operar en el archivo o se llene el mismo"};

            String[] dialogoChaldu3={"Hoy es nuestra ultima clase y veremos Serializacion y Json","Serializacion es la capacidad de transformar un objeto en un flujo de datos para poder ser leido por un programa o ser enviado por red.JSON es un formato de intercambio de datos ligero y de fácil lectura (tanto para los humanos como para las máquinas) que se utiliza para enviar y recibir datos entre distintos contextos (aplicaciones, sistemas, etc)",
                    "Para manejar Json tenemos dos librerias: JACKSON Y GSON\n"+"JACKSON: Para serializar con Jackson se debe utilizar un objeto de tipo ObjectMapper que permite mapear\n"+"GSON:Para serializar con Gson se utilizan las clases BufferedWriter y BufferedReader. "};
            ///endregion

            //region swich dia dialogos

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
                case 6->
                {
                    return dialogoClase2Benoffi;
                }
                case 7->
                {
                    return dialogoClase3Benoffi;
                }
                case 9->
                {
                    return dialogoAgustin;
                }
                case 10->
                {
                    return dialogoAgustin2;
                }
                case 11->
                {
                    return dialogoAgustin3;
                }
                case 13->
                {
                    return dialogoChaldu1;
                }
                case 14->
                {
                    return dialogoChaldu2;
                }
                case 15->
                {
                    return dialogoChaldu3;
                }
            }
            //endregion

        }

        return auxiliar;
    }
}