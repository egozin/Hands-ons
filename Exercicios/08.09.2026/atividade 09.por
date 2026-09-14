programa {
    funcao inicio() {
        real valor, percentual, desconto, final
        escreva("Digite o valor da compra: ")
        leia(valor)
        escreva("Digite o percentual de desconto: ")
        leia(percentual)
        desconto = valor * (percentual / 100)
        final = valor - desconto
        escreva("Valor do desconto: ", desconto, "\n")
        escreva("Valor final da compra: ", final)
    }
}