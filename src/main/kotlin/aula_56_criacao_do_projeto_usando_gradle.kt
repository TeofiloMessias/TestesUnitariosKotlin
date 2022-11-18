import java.lang.NullPointerException

fun countXO(str: String): Boolean {
    //O boolean é o retorno
    var strLower = str.lowercase()
    var countx = 0
    var countO = 0

    var i = 0
    while (i < strLower.length) {
        if (str[i] == 'x') {
            countx++
        } else if (str[i] == 'o') {
            countO++
        }
        i++
    }
    return ((countx == countO )&& (countO != 0))
}

fun abc(): Boolean{
    return true

}

fun abcd(): Boolean{
    var str: String? = null
    return str!!.length == 0
    // throw NullPointerException()
}

fun maiorDeIdade(idade: Int): Boolean{
    if(idade <18){
        return false
    } else{
        return true
    }

}

fun main() {

    println(countXO("xxoo"))
    println(countXO("xxxo"))

}