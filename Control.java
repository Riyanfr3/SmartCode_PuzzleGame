/*
/
/ + ------------- + ------------------------------- + ---------------------------------------- +
/ | NPM           | Nama Anggota                    |  Role's Of Members                       |
/ | ------------- + ------------------------------- + ---------------------------------------- +
/ | 2108107010075 | Muhammad Firdaus                |  Role : Leader, Code Maker               |
/ | 2108107010089 | Habil Nasution                  |  Role : Desainer, Bug Fixer              |
/ | 2108107010082 | Sharahiya                       |  Role : Game Guide, Explainer Code       |
/ | 2108107010079 | Riyan Farhan Ramadhan           |  Role : FlowChart Maker, Bug Fixer       |
/ | 2108107010097 | Afifah Nibras                   |  Role : Explainer Code, FlowChart Maker  |
/ + ------------- + ------------------------------- + ---------------------------------------- +
/
*/



import java.awt.event.*;

public class Control extends MouseAdapter
{
  // Ukuran || dimensi tiles di UI
  private int tileSize;

  // Tiles itu sendiri yang memiliki nilai index unique
  private int[] tiles; 

  // Posisi tiles kosong  
  private int blankPos;

  // Ukuran board game yang dimainkan
  private int size;  

  // Ukuran grid UI
  private int gridSize;

  // Margin grid dari frame
  private int margin; 

  // Dimension grid dari frame
  private int dimension; 

  // Gameover
  private boolean gameOver; 

  // Objek PuzzleGrid
  private PuzzleGrid pg;

  // Objek Logic
  private Logic logic;        

  public Control(PuzzleGrid pg)
  {
    this.pg = pg;
    this.logic = new Logic();
    this.size = pg.getGridSize();
    this.margin = pg.getMargin();
    this.dimension = pg.getDimension();

    // Menghitung jumlah tile
    this.tiles = pg.getTiles();

    // Menghitung ukuran grid dan tile puzzle
    this.gridSize = (dimension - 2 * margin);
    this.tileSize = gridSize / size;

    this.blankPos = tiles.length - 1;
  }

  @Override
  public void mousePressed(MouseEvent e)
  {

    // Menyesuaikan gameStatus di PuzzleGrid
    gameOver = pg.getGameStatus();
    if(gameOver)
    {
      pg.newGame();
    }else{
      // Posisi ketika cursor melakakukan 'click'
      int ex = e.getX() - margin;
      int ey = e.getY() - margin;

      // Jika di luar grid (bernilai negatif) atau melebihi ukuran grid
      // maka tidak akan ada yang dijalankan
      if(ex < 0 || ex > gridSize || ey < 0 || ey > gridSize)
        return;

      // Mengambil posisi grid
      int c1 = ex / tileSize;
      int r1 = ey / tileSize;

      // Mengambil posisi blankPos
      int c2 = blankPos % size;
      int r2 = blankPos / size;

      int clickPos = r1 * size + c1;

      // Arah pergerakan
      int dir = 0;

      // Membandingkan grid yang diklik dengan posisi blankPos
      if(c1 == c2 && Math.abs(r1 - r2) > 0)
        dir = (r1 - r2) > 0 ? size : -size;
      else if(r1 == r2 && Math.abs(c1 - c2) > 0)
        dir = (c1 - c2) > 0 ? 1 : -1;

      if(dir != 0){
        // Memindahkan tiles
        do{
          int newBlankPos = blankPos + dir;
          tiles[blankPos] = tiles[newBlankPos];
          blankPos = newBlankPos;
        }
        while(blankPos != clickPos);
        tiles[blankPos] = 0;
        pg.addClickNum(); // Menambah clickNum di PuzzleGrid
        }

        // Jika semua tiles berada di tempat yang seharusnya, maka gameOver
        if(logic.isSolved(this.tiles))
        {
          // Set highscore di PuzzleGrid
          pg.setHighScore(pg.getClickNum());
          pg.setGameOver();
          this.gameOver = true;
        }
      }
    // Paint ulang ketika grid mengalami perubahan di sini
    pg.repaint();
  }
}
