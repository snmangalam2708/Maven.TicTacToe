package rocks.zipcodewilmington.tictactoe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 6/22/18.
 */
public class Board {

        private Character[][] board;

    public Board(Character[][] matrix) {

        this.board=matrix;
    }

    public boolean horizontalTest(Character xO) {

        for (int i = 0; i <= 2; i++) {

            if ((board[i][0] == xO) && (board[i][1] == xO) && (board[i][2] == xO)) {
                return true;
            }
        }

        return false;
}
    public boolean verticalTest(Character xO) {

        for (int i = 0; i <= 2; i++) {

            if ((board[0][i] == xO) && (board[1][i] == xO) && (board[2][i] == xO)) {
                return true;
            }
        }

        return false;

    }

    public boolean diagonalTest(Character xO) {

        if ((board[0][0] == xO && board[1][1] == xO && board[2][2] == xO) ||

                (board[0][2] == xO && board[1][1] == xO && board[2][0] == xO)) {
            return true;
        }

        return false;
    }

    public Boolean isInFavorOfX() {

        if(horizontalTest('X') || verticalTest('X') || diagonalTest('X')) {
            return true;
        }

        return false;
    }

    public Boolean isInFavorOfO() {

        if (horizontalTest('O') || verticalTest('O') || diagonalTest('O')) {
            return true;
        }

        return false;
    }


    public Boolean isTie() {

        if(!isInFavorOfX() && !isInFavorOfO()){
            return true;
        }

        return false;
    }

    public String getWinner() {

        if(isInFavorOfX()){ return "X";}
        if(isInFavorOfO()){ return "O";}
        return "";
    }

}
