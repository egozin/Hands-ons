programa {
    funcao inicio() {
        real num, x, y
        logico entre
        escreva("Digite o número: ")
        leia(num)
        escreva("Digite o valor de x: ")
        leia(x)
        escreva("Digite o valor de y: ")
        leia(y)
        entre = (num >= x e num <= y)
        escreva("Está entre x e y: ", entre)
    }
}