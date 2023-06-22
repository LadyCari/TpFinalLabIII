package com.example.tp_final_laboraotirio_iii.Examenes;

public class ExamenBuffini {

    //region arreglo de strings
    String[] Preguntas = {"¿En qué memoria está alojada una variable estática?","¿Cuántos y cuáles son los modificadores de acceso?","¿Cuál es una característica de los métodos estáticos?","¿Qué indica el OPERADOR FINAL (en una clase)?","¿Cual es una característica de la herencia?","¿Qué función cumple la palabra reservada SUPER?","¿Podemos instanciar una clase abstracta?","¿Qué son las interfaces?","¿Puede heredar una interfaz de otra?","¿Porque devuelve -1 la interfaz comparable?"};
    String[] Respuestas1 ={"1-En la memoria Caché","1-Es 1, llamado emun","1-Puede llamar variables de instancia","1-Que la clase termino","1-Permite reutilizar código","1-Para crear una clase abstracta","1-Claro, como cualquier otra variable","1-Es una colección de métodos abstractos","1-No, no sigas preguntando boludeces","1-Cuando el atributo es NULL"};
    String[] Respuestas2 ={"2-En la memoria Heap","2-Son 2, objeto e instancia","2-Puede llamar sólo a otros métodos estáticos","2-Que el valor del atributo término","2-Todas son correctas","2-Para llamar a los métodos o el constructor de una superclase","2-Si, pero a diferencia de cualquier variable, debemos reservar espacio en la memoria","2-Es un objeto que se hereda solo","2-Si, utilizando el implements","2-Cuando los objetos que se comparan son iguales"};
    String[] Respuestas3 ={"3-En la memoria Ram","3-Son 3; parámetro, público y final","3-Se quedan quietos y no se mueven","3-El valor no puede cambiar una vez finalizado","3-Permite crear una clase en base a una ya creada","3-Para llamar desde un objeto a una superclase","3-No","3-Es un método especial","3-Si x2, pero utilizando el extends","3-Cuando el objeto actual es mayor que el objeto comparado"};
    String[] Respuestas4 ={"4-En la memoria humana","4-son 4; Private, Default, Protected, Public","4-Todas son correctas","4-Que no puede heredar","4-Permite crear una estructura jerárquica de clases","4-Para ir a comprar al super más cercano de casa","4-Esta opción no cuenta, pero la respuesta de arriba fue medio cortante","4-Es una clase abstracta con métodos abstracto","4-Si y como es una interfaz no requiere palabra reservada","4-Cuando el objeto actual es menor que el objeto comparado"};
    //endregion

    //region arreglo respuestas
    String[] respuestasTPFinal = {" 2"," 4"," 4"," 4"," 2"," 2"," 3"," 1"," 3"," 4"};
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
