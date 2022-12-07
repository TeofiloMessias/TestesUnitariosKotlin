class Pessoa(var anoNacimento: Int, var nome: String ){
    var olhos:String =  ""
    fun dormir(){

    }
    fun acordar(){

    }
}

fun main(){
    // class -> comportamento e atributo
    //comportamento são os metodos
    // atributos são as caracteristicas
    //atributo -> classe pessoa
    // atributo é a cor dos olhos, a cor do cabelo, nome, ano de nascimento etc

    var pessoa: Pessoa = Pessoa(1974,"Teofilo")

    pessoa.acordar()
    pessoa.dormir()
}