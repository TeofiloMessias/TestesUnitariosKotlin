fun media(vararg notas: Float): Float{
    var soma = 0f
    for(n in notas){
        soma += n
    }
    return (soma / notas.size)
}

fun main(){
    println(media(7.5f,8.5f))
}