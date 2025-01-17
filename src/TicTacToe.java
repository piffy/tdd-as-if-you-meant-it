public class TicTacToe {
    public int status=1;
    private char[][] tabellone = {{' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}};
    public int getStatus() {
        return status;
    }

    public void move(String b2X) {
        if (status==1 && b2X.charAt(2)!='X')
            status=0;
        if (status==2 && b2X.charAt(2)!='O')
            status=0;
        int x= b2X.charAt(0)-'A';
        int y= b2X.charAt(1)- '0';
        if (tabellone[x][y]==' ')
            tabellone[x][y]= b2X.charAt(2);
        else
            status=0;
        if (status==1) status=2;
        else if (status==2) status=1;
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
