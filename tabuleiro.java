public class tabuleiro {
    public static void main(String[] args) {
        int linhas = 8;
        int colunas = 9;

        for (int linha = 0; linha < linhas; linha++) {
            for (int coluna = 0; coluna < colunas; coluna++) {
                System.out.print(". ");
            }
            System.out.println();
        }
    }
}
