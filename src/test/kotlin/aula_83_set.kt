//Set é um conjuto diferente do List que armazena uma lista ordenada e não podemos inserir em qualquer sequencia.
fun main(){
    val set1: Set<String> = setOf("Paris","Berlim", "Madrid", "Madrid")
    val set2: MutableSet<String> = mutableSetOf<String>()

    set2.add("São Paulo")
    set2.remove("Madrid")
    set2.contains("São Paulo")
    set2.clear()
    set2.size

}