package com.example.tp_final_laboraotirio_iii.TpFinales;

public class TPFinalBarizi implements TPFinal{

    //region arreglo de strings
    String[] Preguntas = {"¿Qué es una tabla hash?","¿Qué es una colisión?","¿Por qué no es conveniente utilizar el hashcode default?","En el siguiente ejemplo, que atributo asignarías al hashCode para que tu objeto sea único?","¿Qué otro método utilizamos junto al Hashcode?","¿Qué utilidad tiene el método Equals?","¿Qué estructura utilizamos si no queremos permitir duplicados?","¿Qué es la genericidad?","¿Por qué no es buena práctica utilizar Object como forma de genericidad?","¿Qué representa la T en genericidad?"};
    String[] Respuestas1 = {"1-Es una estructura de datos agrupados por clave-valor","1- Según la RAE: Encuentro violento de dos o más cuerpos, de los cuales al menos uno está en movimiento","1-Puede generar colisiones entre los buckets","1- Dni y dirección","1-Equals","1-Determina si dos objetos son iguales","1-LinkedHashSet","Actitud o comportamiento de la persona generosa","1-Es un nivel de abstracción muy alto, y genera errores","1-elementos de una colección"};
    String[] Respuestas2 = {"2-Una estructura de datos con orden de inserción","2-Qué dos objetos distintos se guarden en el mismo bucket o slot","2-Puede lanzar errores en tiempo de ejecución","2- Nombre y edad","2-ToString","2-Lucha por la equidad entre hombres y mujeres","2-LinkedList","2-Es la capacidad de trabajar con distintos tipos de datos","2-Hace el código muy difícil de comprender","2-tipo de datos"};
    String[] Respuestas3 = {"3-Tabla hash? eso usaba Tony hawk para hacer ollies","3-Qué dos objetos iguales se guarden en el mismo bucket o slot","3-Porque de manera default no interactúa con el método equals por lo que  tanto traerá varios comportamientos inesperados","3- Dirección y nombre","3-CompareTo","3-Determina si los atributos de un objeto no son nulos","3-Vector","3-Permite heredar clases múltiples","3-Es una crotada","3-clave-valor"};
    String[] Respuestas4 = {"4-Una colección de datos de la interfaz List","4-Estoy entre la 3 y la 4, pero nose","4-¿Que era el hashcode?","4- Nombre, edad y altura","4-Respuesta vacía, los desarrolladores se quedaron sin ideas","4-Compara dos objetos y devuelve cual es mayor (utilizando algún atributo entero que posea)","4-ArrayList","4-Demasiadas opciones? \uD83D\uDE0E Tranqui pa, una menos","4-Todas son correctas","4-números"};
    //endregion

    //region arreglo de string tpFinal Chino
    String[] preguntasChino= {"質問をシミュレートするため","十分に質問してください","こんにちは、元気ですか","なんて繊細な男の子なんだろう","イベントはいつありますか","つ以上費やさないでください","ゲームはストレスを軽減する","通訳と話しています","人々はとても失礼です","それは考えられないよ、友達"};
    String[] respuestasChino1={"1-質問をシミュレートするため", "1-ランダムです", "1-追加の情報が必要です", "1-なんと繊細な女の子なんだろう", "1-イベントはいつでも開催されます", "1-5つ以上費やさないでください", "1-ゲームはストレスを軽減するのに役立ちます", "1-通訳と話しているのですか？", "1-人々はとても礼儀正しいです", "1-それは考えられますよ、友達"};
    String[] respuestasChino2={"2-質問をシミュレートするため", "2-ランダムです", "2-その質問は明確ではありません", "2-なんて頼もしい男の子なんだろう", "2-イベントは年に一度開催されます", "2-10万円以上費やさないでください", "2-ゲームはストレスを軽減することが証明されています", "2-通訳と話していますか？", "2-人々はとても親切です", "2-それは信じられないよ、友達"};

    String[] respuestasChino3={"3-質問をシミュレートするため", "3-ランダムです", "3-もちろん、元気です！", "3-なんて元気な男の子なんだろう", "3-イベントは年に二度開催されます", "3-1000円以上費やさないでください", "3-ゲームはストレスを軽減する効果があります", "3-通訳と話していますか？", "3-人々はとても親切です", "3-それは素晴らしい考えですよ、友達"};
    String[] respuestasChino4={"4-質問をシミュレートするため", "4-ランダムです", "4-どうやら間違った質問をしています", "4-なんて勇敢な男の子なんだろう", "4-イベントは定期的に開催されます", "4-10000円以上費やさないでください", "4-ゲームはストレスを軽減する効果があります", "4-通訳と話しているのですか？", "4-人々はとても礼儀正しいです","4-それは考えられないよ、友達"};
//endregion

    //region arreglo respuestas
    String[] respuestasTPFinal = {" 1"," 2"," 1"," 1"," 1"," 1"," 1"," 2"," 4"," 2"};
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
