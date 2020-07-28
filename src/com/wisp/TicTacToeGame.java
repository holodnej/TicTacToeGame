package com.wisp;

//Ctrl+alt+L (CodeStyle выравнивание)
//Ctrl+shift+F6 (Переименовать переменную)
//Ctrl+M (Вынести метод)
public class TicTacToeGame {

    public static void main(String[] args) {
        System.out.println("Start");
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        ticTacToeGame.fillTable(); //Объект класса
        ticTacToeGame.printTable(); //Объект класса
        System.out.println("Finish");
    }

    char[][] field;

    public TicTacToeGame() {
        System.out.println("Constructor");
        field = new char[3][3];
    } //Конструктор класса

    @SuppressWarnings("ForLoopReplaceableByForEach") //Предупреждение системе чтобы среда не отвлекала
    private void printTable() {
        for (int row = 0; row < field.length; row++) {
            for (int col = 0; col < field[row].length; col++) {
                System.out.print(field[row][col]);
            }
            System.out.println();
        }
    } //Метод класса
    @SuppressWarnings("ExplicitArrayFilling")
    private void fillTable() {
        for (int row = 0; row < field.length; row++) {
            for (int col = 0; col < field[row].length; col++) {
                field[row][col] = 'a';
            }
        }
    }
}
