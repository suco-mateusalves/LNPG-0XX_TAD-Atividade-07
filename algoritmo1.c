#include <stdio.h>
#include <string.h>

// Definição da estrutura do livro
struct Livro {
    char titulo[100];
    char autor[100];
    int ano;
    int copiasDisponiveis;
};

// Função para emprestar uma cópia do livro
void emprestarLivro(struct Livro *livro) {

}

// Função para devolver uma cópia do livro
void devolverLivro(struct Livro *livro) {

}

// Função para verificar se há cópias disponíveis do livro
int verificarDisponibilidade(struct Livro *livro) { 
    {...}
    return ...;
}

// Função para obter informações do livro
void obterInformacoesLivro(struct Livro *livro) {
    {...}
}

int main() {
    struct Livro meuLivro = {"Aventuras de Sherlock Holmes", "Arthur Conan Doyle", 1892, 3};
    emprestarLivro(&meuLivro);
    obterInformacoesLivro(&meuLivro);
    devolverLivro(&meuLivro);
    return 0;
}
