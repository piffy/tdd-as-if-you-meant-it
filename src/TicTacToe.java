public class TicTacToe {
    public static int status=1;

    public int getStatus() {
        return status;
    }

    public void move(String b2X) {
        if (status==1) status=2;
    }
    /* Una Mossa è una tripletta lettera-numero-segno */
    /* La partita inizia con il giocatore 1, segno X */
    /* Uno status è uno dei seguenti:
    1 - Tocca al giocatore 1 (X)
    2 - Tocca al giocatore 2 (O)
    3 - Vittoria giocatore 1 (X)
    4 - Vittoria giocatore 2 (O)
    5 - Patta
    0 - Errore, non si può continuare
     */

}
