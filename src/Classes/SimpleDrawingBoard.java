package Classes;

/*Function	Description
Create canvas	Create new empty canvas (filled with ' ') with given width and height

Draw line / rectangle	Draw the line with 'x' which connects the given points.
If the points are diagonal, a rectangle instead of diagonal line should be drawn

Fill color	Fill the entire area connected to the given point with given character, also known as "bucket fill" in paint programs*/
public class SimpleDrawingBoard {

    private char[][] board;
    private int rows;
    private int columns;

    public SimpleDrawingBoard(int width, int height) {
        if (width <= 0 || height <= 0)
            throw new java.lang.IllegalArgumentException("Wrong arguments passed");

        this.board = new char[height + 2][width + 2];
        this.rows = height + 2;
        this.columns = width + 2;

        //assigning each element ' '
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                this.board[i][j] = ' ';
            }
        }

        //top and bottom of the board '-'
        for (int i = 0; i < columns; i++) {
            this.board[0][i] = '-';
            this.board[rows - 1][i] = '-';
        }

        //left and right side '|'
        for (int i = 1; i < rows - 1; i++) {
            this.board[i][0] = '|';
            this.board[i][columns - 1] = '|';
        }
    }

    public SimpleDrawingBoard draw(int x1, int y1, int x2, int y2) {
        if (x1 < 0 || x1 >= this.columns - 2)
            throw new java.lang.IllegalArgumentException("Index out of range");
        if (y1 < 0 || y1 >= this.rows - 2)
            throw new java.lang.IllegalArgumentException("Index out of range");

        if (x2 < 0 || x2 >= this.columns - 2)
            throw new java.lang.IllegalArgumentException("Index out of range");
        if (y2 < 0 || y2 >= this.rows - 2)
            throw new java.lang.IllegalArgumentException("Index out of range");
        //let it be two points: A(x1, y1) B(x2, y2) y - row, x - column
        //checking the position of two point which I have to connect

        //line : (x1 == x2) or (y1 == y2)
        if (x1 == x2) { // vertical line
            if (y1 < y2) { // A is upper than B
                for (int i = y1 + 1; i < y2 + 2; i++) {
                    this.board[i][x1 + 1] = 'x';
                }
            } else if (y1 > y2) {// A is lower than B
                for (int i = y2 + 1; i < y1 + 2; i++) {
                    this.board[i][x1 + 1] = 'x';
                }
            } else {//x1==x2 and y1==y2
                this.board[x1 + 1][y1 + 1] = 'x';
            }
        } else if (y1 == y2) {// horizontal line
            if (x1 < x2) {// A is on the left side from B
                for (int i = x1 + 1; i < x2 + 2; i++) {
                    this.board[y1 + 1][i] = 'x';
                }
            } else if (x1 > x2) { // A is on the right side from B
                for (int i = x2 + 1; i < x1 + 2; i++) {
                    this.board[y1 + 1][i] = 'x';
                }
            }
        } else {// diagonal position => rectangle
            if (x1 < x2) {// A on the left side from B
                if (y1 < y2) {// A is upper than B AND is on the left side from B
                    for (int i = y1 + 1; i < y2 + 2; i++) {//iterate through rows
                        this.board[i][x1 + 1] = 'x';
                        this.board[i][x2 + 1] = 'x';
                    }
                    for (int i = x1 + 1; i < x2 + 2; i++) {//iterate through columns
                        this.board[y1 + 1][i] = 'x';
                        this.board[y2 + 1][i] = 'x';
                    }
                } else if (y1 > y2) {// A is lower than B AND is on the left side from B
                    for (int i = y2 + 1; i < y1 + 2; i++) {//iterate through rows
                        this.board[i][x1 + 1] = 'x';
                        this.board[i][x2 + 1] = 'x';
                    }
                    for (int i = x1 + 1; i < x2 + 2; i++) {//iterate through columns
                        this.board[y1 + 1][i] = 'x';
                        this.board[y2 + 1][i] = 'x';
                    }
                }
            } else if (x1 > x2) {// A is on the right side from B
                if (y1 < y2) {// A is upper than B AND is on the right side from B
                    for (int i = y1 + 1; i < y2 + 2; i++) {//iterate through rows
                        this.board[i][x1 + 1] = 'x';
                        this.board[i][x2 + 1] = 'x';
                    }
                    for (int i = x2 + 1; i < x1 + 2; i++) {//iterate through columns
                        this.board[y1 + 1][i] = 'x';
                        this.board[y2 + 1][i] = 'x';
                    }
                } else if (y1 > y2) {// A is lower than B AND is on the right side from B
                    for (int i = y2 + 1; i < y1 + 2; i++) {//iterate through rows
                        this.board[i][x1 + 1] = 'x';
                        this.board[i][x2 + 1] = 'x';
                    }
                    for (int i = x2 + 1; i < x1 + 2; i++) {//iterate through columns
                        this.board[y1 + 1][i] = 'x';
                        this.board[y2 + 1][i] = 'x';
                    }
                }
            }
        }
        return this;
    }

    public void dfs(int i, int j, char c0, char c1) {
        if (i < 0 || j < 0 || i >= this.rows - 1 || j >= this.columns - 1 || this.board[i][j] != c0)
            return;
        this.board[i][j] = c1;
        dfs(i, j - 1, c0, c1);
        dfs(i, j + 1, c0, c1);
        dfs(i - 1, j, c0, c1);
        dfs(i + 1, j, c0, c1);
    }

    public SimpleDrawingBoard fill(int x, int y, char ch) {
        if (x < 0 || x >= this.columns - 2)
            throw new java.lang.IllegalArgumentException();
        if (y < 0 || y >= this.rows - 2)
            throw new java.lang.IllegalArgumentException();

        if (this.board[y + 1][x + 1] == ' ')
            dfs(y + 1, x + 1, this.board[y + 1][x + 1], ch);
        return this;
    }

    public String drawCanvas() {
        return this.toString();
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                res += board[i][j];
            }
            res += '\n';
        }
        return res.substring(0, res.length() - 1);
    }

    public static void main(String[] args) {
        SimpleDrawingBoard c = new SimpleDrawingBoard(7, 7);
        c.draw(1, 1, 5, 4).fill(3, 3, 'o').draw(0,2,6,2).fill(0,0,'a');
        System.out.println(c);
    }
}
