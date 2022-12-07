import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class aula_60_portariaTest {

    @Test
    @DisplayName("Testa os cenarios da portaria")
    fun testePortaria() {

        Assertions.assertEquals(portaria(15, "", ""), "Negado.")
        Assertions.assertEquals(portaria(20, "", ""), "Negado.")
        Assertions.assertEquals(portaria(25, "VIP", ""), "Negado.")
        Assertions.assertEquals(portaria(27, "comum", "xt12345"), "Welcome.")
        Assertions.assertEquals(portaria(30, "comum", "12345"), "Negado.")
        Assertions.assertEquals(portaria(35, "premiumm", "xt12345"), "Negado.")
        Assertions.assertEquals(portaria(24, "premiumm", "12345"), "Negado.")
        Assertions.assertEquals(portaria(25, "premiumm", "xt12345"), "Negado.")
        Assertions.assertEquals(portaria(45, "premiumm", "xl12345"), "Negado.")
        Assertions.assertEquals(portaria(25, "Luxo", "xt12345"), "Negado.")
    }
}