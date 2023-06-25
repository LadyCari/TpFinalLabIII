package com.example.tp_final_laboraotirio_iii.TpFinales;


public class TPFinalMalenia implements TPFinal {

    //region arreglo de strings tpFinal normal
    String[] Preguntas = {"¿Qué pilar fundamental utilizamos cuando ocultamos los datos?","Que pilar fundamental busca resaltar las características generales de un ente, para crear nuestro software?","¿Cuáles son los 4 pilares fundamentales de la programación orientada a objetos?","¿Cual es la funcionalidad de La JVM?","¿Qué modificador de acceso restringe el acceso a los atributos al resto del programa?","¿Qué ocurre si no declaro un constructor en una clase?","¿Cómo podemos traer un dato de un atributo privado?","¿Qué significa la sobrecarga de métodos?","¿Qué ocurre si no colocamos el toString en nuestra clase?","¿Quien fundó el lenguaje Java?"};
    String[] Respuestas1 = {"1-Polimorfismo","1-Polimorfismo","1-Public,Private, Abstracción,Polimorfismo","1-Provee herramientas para permitir el desarrollo de aplicaciones con java, además de ser necesario para ejecutar y compilar programas java en cualquier plataforma","1-Public","1-PERO A VOS TE FALLA? COMO NO VAS A DECLARAR UN CONSTRUCTOR","1- Utilizando el método getter","1-Sobreescritura de los métodos por parte de las subclases","1-El compilador buscará el toString default de la superclase object y mostrará la dirección de memoria de los datos","1-Perón (justo después de los derechos laborales)"};
    String[] Respuestas2 = {"2- Abstracción","2-Abstracción","2-toString, Public, Private, Implements","2-Interpretar el código binario de Java (Bytecode) para ser traducido a binario de máquina, y poder ejecutar el código","2-Private","2-Lanza un error en tiempo de ejecución, debido a que no se puede instanciar un objeto si su clase no posee un constructor","2-Utilizando el método setter","2-Métodos con mismo nombre pero distintos comportamientos","2-La clase tiene un método toString predeterminado y mostrará los datos correctamente","2-James Gosling y su equipo en Sun Microsystems (carreo James)"};
    String[] Respuestas3 = {"3-Encapsulamiento","3-¿Qué es un pilar? No conozco esa calle","3-Polimorfismo, Abstracción, Encapsulamiento, Herencia","3-Permite almacenar datos con identificador","3-Protected","3-Puedo instanciar un objeto ya que las clases poseen un constructor predefinido","3-Utilizando el método toString","3-Heredar atributos y métodos a las subclases","3-No existe tal método","3- Moyano y los camioneros"};
    String[] Respuestas4 = {"4-Pilar… Pila? FIFO?","4.Herencia","4-Interfaces, Estatico, Final, Abstracto","4-JVM? ¿Es algún anime eso?","4-Default","4-Habrá un error en tiempo de compilación ya que el compilador no identificará ningún constructor de la clase","4-Pidiendo por favor, ser educado siempre es opción","4-Qué le pongo mucho peso al método","4-Explota la pc","4-Bill gates, luego de crear Microsoft"};
    //endregion

    //region arreglo de string tpFinal Chino
    String[] preguntasChino= {"質問をシミュレートするため","十分に質問してください","こんにちは、元気ですか","なんて繊細な男の子なんだろう","イベントはいつありますか","つ以上費やさないでください","ゲームはストレスを軽減する","通訳と話しています","人々はとても失礼です","それは考えられないよ、友達"};
    String[] respuestasChino1={"1-質問をシミュレートするため", "1-ランダムです", "1-追加の情報が必要です", "1-なんと繊細な女の子なんだろう", "1-イベントはいつでも開催されます", "1-5つ以上費やさないでください", "1-ゲームはストレスを軽減するのに役立ちます", "1-通訳と話しているのですか？", "1-人々はとても礼儀正しいです", "1-それは考えられますよ、友達"};
    String[] respuestasChino2={"2-質問をシミュレートするため", "2-ランダムです", "2-その質問は明確ではありません", "2-なんて頼もしい男の子なんだろう", "2-イベントは年に一度開催されます", "2-10万円以上費やさないでください", "2-ゲームはストレスを軽減することが証明されています", "2-通訳と話していますか？", "2-人々はとても親切です", "2-それは信じられないよ、友達"};
    String[] respuestasChino3={"3-質問をシミュレートするため", "3-ランダムです", "3-もちろん、元気です！", "3-なんて元気な男の子なんだろう", "3-イベントは年に二度開催されます", "3-1000円以上費やさないでください", "3-ゲームはストレスを軽減する効果があります", "3-通訳と話していますか？", "3-人々はとても親切です", "3-それは素晴らしい考えですよ、友達"};
    String[] respuestasChino4={"4-質問をシミュレートするため", "4-ランダムです", "4-どうやら間違った質問をしています", "4-なんて勇敢な男の子なんだろう", "4-イベントは定期的に開催されます", "4-10000円以上費やさないでください", "4-ゲームはストレスを軽減する効果があります", "4-通訳と話しているのですか？", "4-人々はとても礼儀正しいです", "4-それは考えられないよ、友達"};
//endregion

    //region arreglo respuestas
    String[] respuestasTPFinal = {" 3"," 2"," 3"," 2"," 2"," 3"," 1"," 2"," 1"," 2"};
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