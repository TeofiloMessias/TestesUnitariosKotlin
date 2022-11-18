import org.junit.jupiter.api.*

class aula_56_teste {

    @Test
    fun testeIfElse(){
        Assertions.assertTrue(maiorDeIdade(26))
    }

    @Test
    @DisplayName("Teste Metodo XXOO")
    fun testCountXO() {
        Assertions.assertAll(
            { Assertions.assertTrue(countXO("xxoo"))},
            { Assertions.assertTrue(countXO("xxxooo"))},
        )
    }
    @Test
    @Disabled
    fun naoImplementado(){

    }
    @Test
    fun vaifalhar(){
        fail("Não posso terminar os testes sem esse metodo")
    }
    @Test
    fun assumption(){
        Assumptions.assumeTrue(countXO("xxo"))//Condição falça
        /*se o assmueTrue for verdade o assert vai
        ser executado, o método baixo so será executado caso a condição acima seje verdade
        */
        Assertions.assertTrue(abcd())
    }
    @Test
    fun exception(){
        assertThrows<NullPointerException> {abcd()}
    }
}
