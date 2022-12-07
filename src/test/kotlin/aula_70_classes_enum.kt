enum class Prioridade(val value: Int){
    Baixo(1){
        override fun toString(): String {
            return "Prioriade Baixa $value"
        }
    },
    Media(5),
    Alta(15)
}

fun main(){
    for (p in Prioridade.values()){
        println(p)
    }
}