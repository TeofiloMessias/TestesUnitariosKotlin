//encampsulamento é deixar a variavél como privada para que outras classes não tenha acesso
class Animals(var especie: String){
    var fala: String = ""
        get() {
            println("Acesso gettes - pegando valor")
            return field
        }
        set(value) {
            println("Acesso Setters")
            field = value
        }

}
fun main(){
    var a = Animals("cachorro").fala
 //   a.fala = "AUUUU" -> setando valor
}