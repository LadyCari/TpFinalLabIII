package com.example.tp_final_laboraotirio_iii.TpFinales;


public class TPFinalChulde implements TPFinal{

    //region arreglo de strings
    String[] Preguntas = {"¿Qué es un enum?","¿Cuál o cuáles representan ventajas del enum?","¿Por qué el constructor de un Enum es privado?","¿Qué es una excepción?","Cuando se produce una excepción checked?","¿Cuándo se produce una excepción unchecked?","¿Cual o cuales representan malas prácticas en el manejo de excepciones?","¿Qué es el buffering?","¿Cuáles son las librerías para el manejo de JSON?","¿Qué diferencia hay entre Jackson y Gson?"};
    String[] Respuestas1 ={"1- Estructura de datos que almacena un conjunto de constantes","1-Acotar los valores que puede tomar una variable","1-Porque si, aguanta la propiedad privada, avanza el liberalismo","1-Algo fuera de lo común","1-En tiempo de ejecución","1-En tiempo de ejecución","1-Usar altos niveles de abstracción","1-Utilizar un buffer para que se encargue de la gestión del archivo","1-JACKSON y GSON","1- El nombre"};
    String[] Respuestas2 ={"2- Un enumerador es una variable que sirve como contador","2-Mayor legibilidad al código","2-Para poder utilizar los getters llamándolo","2-Ay re yo la respuesta uno","2-En tiempo de compilación","2-En tiempo de compilación","2-Utilizar nuestras propias excepciones por más de que ya existan las correspondientes","2-Utilizar un buffer para obtener la ruta absoluta del archivo","2-JSON Y GISON","2-Gson utiliza un BufferedWritter y un BufferedReader"};
    String[] Respuestas3 ={"3- Se me terminan las respuestas inventadas","3-Mayor seguridad al código","3-Para seguir con el encapsulamiento, como cualquier otra variable","3-Un objeto en java que utilizamos para tratar los errores","3-No llega ni a compilar, explota la Pc","3-Compila, Ejecuta y luego explota la Pc","3-Las dos primeras son correctas","3-Utilizar un buffer para obtener la ruta relativa  del archivo","3-MICHAEL JACKSON","3-Jackson implementa la interfaz set"};
    String[] Respuestas4 ={"4- No le hagas caso a ninguna, Enum es una interfaz que sirve para enumerar clases","4-Todas son correctas","4-Porque sus instancias ya están definidas","4-Una clase que gestiona los hilos de un programa","4-La interfaz gráfica tiene 4 espacios de rtas, necesitábamos una más","4-*música de ascensor*","4-Respuesta de relleno","4-Los autos esos con equipo de sonido, suelen andar por el Galindez","4-La que está al lado de la lado de la catedral, creo que es Palito","4- La uno es valida, pero ponele voluntad, hablamos de diferencia de implementación"};
    //endregion

    //region arreglo de string tpFinal Chino
    String[] preguntasChino= {"質問をシミュレートするため","十分に質問してください","こんにちは、元気ですか","なんて繊細な男の子なんだろう","イベントはいつありますか","つ以上費やさないでください","ゲームはストレスを軽減する","通訳と話しています","人々はとても失礼です","それは考えられないよ、友達"};
    String[] respuestasChino1={"1-質問をシ","1-ランダムです","1-ランダムです","1-シミュレー","1-シミュレー","1-レートするため","1-レートするため","1-レートするため","1-レートするため","1-レートするため"};
    String[] respuestasChino2={"2-質問をシ","2-ランダムです","2-ランダムです","2-シミュレー","2-シミュレー","2-レートするため","2-レートするため","2-レートするため","2-レートするため","2-レートするため"};

    String[] respuestasChino3={"3-質問をシ","3-ランダムです","3-ランダムです","3-シミュレー","3-シミュレー","3-レートするため","3-レートするため","3-レートするため","3-レートするため","3-レートするため"};
    String[] respuestasChino4={"4-質問をシ","4-ランダムです","4-ランダムです","4-シミュレー","4-シミュレー","4-レートするため","4-レートするため","4-レートするため","4-レートするため","4-レートするため"};
//endregion

    //region arreglo respuestas
    String[] respuestasTPFinal = {" 1"," 4"," 4"," 3"," 2"," 1"," 3"," 1"," 1"," 2"};
    //endregion

    //region G y S strings
    @Override
    public String[] getPreguntas() {
        return Preguntas;
    }
    @Override
    public String[] getRespuestas1() {
        return Respuestas1;
    }
    @Override
    public String[] getRespuestas2() {
        return Respuestas2;
    }
    @Override
    public String[] getRespuestas3() {
        return Respuestas3;
    }
    @Override
    public String[] getRespuestas4() {
        return Respuestas4;
    }
    @Override
    public String[] getRespuestasTPFinal() {
        return respuestasTPFinal;
    }

    @Override
    public String[] getPreguntasChino() {
        return preguntasChino;
    }

    @Override
    public String[] getRespuestas1Chino() {
        return respuestasChino1;
    }

    @Override
    public String[] getRespuestas2Chino() {
        return respuestasChino2;
    }

    @Override
    public String[] getRespuestas3Chino() {
        return respuestasChino3;
    }

    @Override
    public String[] getRespuestas4Chino() {
        return respuestasChino4;
    }
    //endregion
}
