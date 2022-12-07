interface Selvagem{
    fun atacar(){
    }
}
abstract class Mamifero2(val nome: String){
    fun acordar(){
        println("Acordei as 06:00 AM")
    }
    fun dormir(){
        println("Fui dormir as 23:00 PM")
    }
    abstract fun falar()
}

class Cachorro2(nome: String): Mamifero(nome), Selvagem{
    override fun falar() {}
    override fun atacar() {}

}
fun main(){

}