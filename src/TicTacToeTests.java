import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@SuppressWarnings("WeakerAccess")
public class TicTacToeTests {
    @Test
    public void beginHere(){
        new TicTacToe();
    }

    @Test
    public void startState() {
        TicTacToe game= new TicTacToe();
        assertEquals(1,game.getStatus());
    }

    @Test
    public void firstMove() {
        TicTacToe game= new TicTacToe();
        game.move("B2X");
        assertEquals(2,game.getStatus());
    }

    @Test
    public void secondMoveWrongSymbol() {
        TicTacToe game= new TicTacToe();
        game.move("B2X");
        game.move("B1X");
        assertEquals(0,game.getStatus());
    }

    @Test
    public void secondMoveOverlapSymbol() {
        TicTacToe game= new TicTacToe();
        game.move("B2X");
        game.move("B2O");
        assertEquals(0,game.getStatus());
    }


}
