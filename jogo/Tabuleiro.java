public class Tabuleiro {
    public static void main(String[] args) {
        int[][] tabuleiro = new int[8][8];

        tabuleiro[0][0] = 1;
        tabuleiro[2][3] = 1;
        tabuleiro[7][7] = 1;

        for (int coluna = 0; coluna < 8; coluna++) {
            tabuleiro[4][coluna] = 1;
        }

        for (int linha = 0; linha < tabuleiro.length; linha++) {
            for (int coluna = 0; coluna < tabuleiro[linha].length; coluna++) {
                if (tabuleiro[linha][coluna] == 1) {
                    System.out.print("# ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}