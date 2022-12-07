class Pessoas(var anoNacimento: Int, var nome: String ){
    var doc:String =  ""

    //quando coloca o THIS esta se referindo a classe o this també é usado para referencar ao objeto
    constructor(anoNacimento: Int,nome: String,doc:String):this(anoNacimento,nome){
        this.doc = doc
    }
    fun dormir(){
    }
    fun acordar(){
    }
}

fun main(){


    var pessoa: Pessoa = Pessoa(1974,"Teofilo")

    pessoa.acordar()
    pessoa.dormir()
}