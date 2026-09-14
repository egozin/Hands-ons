programa {
    funcao inicio() {
        real total, taxa, comTaxa, porPessoa
        escreva("Digite o valor consumido: ")
        leia(total)
        taxa = total * 0.10
        comTaxa = total + taxa
        porPessoa = comTaxa / 3
        escreva("Taxa de serviço (10%): ", taxa, "\n")
        escreva("Valor total com a taxa: ", comTaxa, "\n")
        escreva("Valor por pessoa: ", porPessoa)
    }
}