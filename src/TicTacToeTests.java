import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

@SuppressWarnings("WeakerAccess")
public class TicTacToeTests {
    @Test
    public void beginHere(){
        new TicTacToe();
    }

    public void startState() {
        TicTacToe game= new TicTacToe();
        assertEquals(1,game.getStatus());
    }

}
