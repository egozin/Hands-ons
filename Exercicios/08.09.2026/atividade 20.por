programa {
    funcao inicio() {
        cadeia nome
        inteiro idade
        real nota
        caracter sexo
        logico matriculado

        escreva("Nome completo: ")
        leia(nome)
        escreva("Idade: ")
        leia(idade)
        escreva("Nota final: ")
        leia(nota)
        escreva("Sexo: ")
        leia(sexo)
        escreva("Matriculado (verdadeiro/falso): ")
        leia(matriculado)

        escreva("Nome: ", nome, "\n")
        escreva("Idade: ", idade, "\n")
        escreva("Nota Final: ", nota, "\n")
        escreva("Sexo: ", sexo, "\n")
        escreva("Matriculado: ", matriculado)
    }
}