public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private int copiasDisponiveis;

    // Construtor
    public Livro(String titulo, String autor, int ano, int copiasDisponiveis) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.copiasDisponiveis = copiasDisponiveis;
    }

    // Método para emprestar uma cópia do livro
    public void emprestarLivro() {
        
    }

    // Método para devolver uma cópia do livro
    public void returnLivro() {
        copiasDisponiveis++;
    }

    // Método para verificar se há cópias disponíveis do livro
    public int verificarDisponibilidade() {
        return copiasDisponiveis;
    }

    // Método para obter informações do livro
    public void obterInformacoesLivro() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + ano);
    }

    public static void main(String[] args) {
        Livro meuLivro = new Livro("Aventuras de Sherlock Holmes", "Arthur Conan Doyle", 1892, 3);
        meuLivro.emprestarLivro();
        meuLivro.obterInformacoesLivro();
        meuLivro.returnLivro();
    }
}
