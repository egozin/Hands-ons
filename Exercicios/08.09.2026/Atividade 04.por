programa
{
    funcao inicio()
    {
        real n1, n2

        escreva("Digite o primeiro número: ")
        leia(n1)
        escreva("Digite o segundo número: ")
        leia(n2)

        escreva("Soma: ", n1 + n2, "\n")
        escreva("Subtração: ", n1 - n2, "\n")
        escreva("Multiplicação: ", n1 * n2, "\n")
        
        se (n2 == 0) {
            escreva("Divisão: Erro (divisão por zero)\n")
        } senao {
            escreva("Divisão: ", n1 / n2, "\n")
        }
    }
}