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

}
