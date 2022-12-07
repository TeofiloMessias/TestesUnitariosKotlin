//Map coleção de chave e valor

fun main(){
    val map1 = mapOf<String, String>(Pair("França","Paris"), Pair("Alemanhã", "Berlin"))
    val map2 = mutableMapOf<String, String>(Pair("França","Paris"), Pair("Alemanha", "Berlin"))

    println(map1.entries)
    println(map1.values)

    map2["Brasil"] = "Brasilia" // adicionando mais um valor no Map2
    map2.contains("Brasil")
    map2.clear()
    println(map2)
}