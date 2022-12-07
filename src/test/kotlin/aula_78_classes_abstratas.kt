abstract class Mamifero(val nome: String){
    fun acordar(){
        println("Acordei as 06:00 AM")
    }
    fun dormir(){
        println("Fui dormir as 23:00 PM")
    }
    abstract fun falar()
}

class Cachorro(nome: String): Mamifero(nome){
    override fun falar() {}

}
fun main(){
    
}