import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();  //esquerda estamos informando a necessidade de uma variável que saiba referenciar um objeto do tipo Filme, direita é onde criamos o espaço na memória
        meuFilme.nome = "Interestelar";
        meuFilme.anoDeLancamento = 2014;
        meuFilme.duracaoEmMinutos = 169;
        meuFilme.incluidoNoPlano = true;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(10);

        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.pegaMedia());
    }
}
