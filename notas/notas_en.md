# 📚 General Summary - Java Fundamentals

## 1. Variables and Types
- Structure: `type name = value;`
- Main types:
  - `int` → whole numbers (age, quantity)
  - `double` → decimal numbers (price, height)
  - `boolean` → true/false
  - `char` → 1 character, single quotes ('V')
  - `String` → text, double quotes ("Victor"), capital S
- Every line ends with `;`
- `+` inside `println` concatenates text with a variable
- Unlike Python: Java REQUIRES declaring the type

Example:
```java
String name = "Victor";
int age = 30;
System.out.println("Name: " + name + ", Age: " + age);
```

---

## 2. Operators
- Arithmetic: `+  -  *  /  %` (% = remainder of division)
- ⚠️ int / int = int (drops the decimal part). Ex: 10 / 3 = 3
- Comparison: `>  <  ==  !=` (== compares, = assigns a value)

Example:
```java
int result = 10 % 3; // 1 (remainder)
boolean isGreater = 5 > 3;  // true
```

---

## 3. Scanner (user input)
- `import java.util.Scanner;` → goes at the top of the file, outside the class
- `Scanner reader = new Scanner(System.in);`
- `reader.nextLine()` → reads text
- `reader.nextInt()` → reads a whole number

Example:
```java
Scanner reader = new Scanner(System.in);
System.out.println("What's your name?");
String name = reader.nextLine();
```

---

## 4. Conditionals (if / else if / else)
- `if (condition) { ... }` → runs if true
- `else if (condition) { ... }` → checks another condition
- `else { ... }` → runs if none of the previous conditions were true
- Conditions are checked IN ORDER; as soon as one matches, the rest are skipped
- Indentation doesn't affect execution, but it's essential for readability (`Shift+Alt+F` auto-formats)

Example:
```java
if (age >= 18) {
    System.out.println("Adult");
} else if (age >= 16) {
    System.out.println("Can take driving lessons");
} else {
    System.out.println("Minor");
}
```

---

## 5. Loops (for / while)
- `for (initialization; condition; increment) { ... }`
  - used when you KNOW the number of repetitions
  - ex: `for (int i = 1; i <= 5; i++)`
- `while (condition) { ... }`
  - used when you DON'T know how many repetitions will happen
  - control variable created BEFORE the loop, incremented INSIDE it
  - forgetting to increment = infinite loop
- Nested loop (for inside for): used for 2D structures (board/matrix)
  - outer loop = rows, inner loop = columns
- `print` (without "ln") doesn't jump to a new line — useful for printing items side by side

Example:
```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Counting: " + i);
}
```

---

## 6. Arrays and Matrices
- Simple array: `int[] numbers = {10, 20, 30};`
  - accessed by position, starting at **0**: `numbers[0]`
  - `.length` returns the size (no parentheses)
- Matrix (2D array): `int[][] board = new int[8][8];`
  - represents rows x columns
  - every value starts at `0` automatically
  - mark/access a cell: `board[row][column] = 1;`
- To mark ONE cell: you need both row AND column
- To mark a WHOLE ROW: fix the row, use a `for` only on the column
```java
  for (int column = 0; column < 8; column++) {
      board[4][column] = 1; // row 4 fixed, column varies
  }
```
- `board.length` = number of rows
- `board[row].length` = number of columns in that row

Example (board with matrix):
```java
int[][] board = new int[8][8];
board[0][0] = 1;

for (int row = 0; row < board.length; row++) {
    for (int column = 0; column < board[row].length; column++) {
        if (board[row][column] == 1) {
            System.out.print("# ");
        } else {
            System.out.print(". ");
        }
    }
    System.out.println();
}
```