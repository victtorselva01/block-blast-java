# Notas de Estudo - Java

## Variáveis e Tipos (30/07)
- Estrutura: `tipo nome = valor;`
- Tipos principais:
  - `int` → números inteiros
  - `double` → números decimais
  - `boolean` → true/false
  - `char` → 1 caractere (aspas simples)
  - `String` → texto (aspas duplas, S maiúsculo)
- Toda linha termina com `;`
- `+` dentro do `println` concatena texto com variável
- Java exige declarar o tipo da variável (diferente de Python)

## Operadores e Scanner (30/07)
- Aritméticos: + - * / % (% é resto da divisão)
- ATENÇÃO: int / int = int (corta decimal). Ex: 10 / 3 = 3
- Comparação: > < == != (== compara, = atribui)
- Scanner lê dados do usuário:
  - import java.util.Scanner; (topo do arquivo, fora da classe)
  - Scanner leitor = new Scanner(System.in);
  - leitor.nextLine() → lê texto
  - leitor.nextInt() → lê número inteiro

  ## Condicionais (30/07)
- if (condição) { ... } → executa se verdadeiro
- else if (condição) { ... } → checa outra condição se a anterior for falsa
- else { ... } → executa se nenhuma condição anterior foi verdadeira
- Condições são checadas em ordem; assim que uma bate, o resto é ignorado
- Indentação não afeta funcionamento em Java, mas é essencial pra legibilidade
- Shift + Alt + F no VS Code formata/indenta automaticamente