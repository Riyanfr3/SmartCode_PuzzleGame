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

import javax.swing.*;
import java.awt.*;

public class UserInterface implements Runnable {
  // Frame untuk game
  private JFrame frame;
  // PuzzleGrid berisi grid, logic, dan listener
  private PuzzleGrid pg;
  // Resolusi windows game
  private int dimension;
  // Jarak dari ujung board ke grid puzzle
  private int margin;

  public UserInterface(int size, int dim, int mar, String mode) {
    this.pg = new PuzzleGrid(size, dim, mar, mode);
    this.dimension = dim;
    this.margin = mar;
  }

  public void run() {
    frame = new JFrame("Puzzle SmartCode");
    ImageIcon imageIcon = new ImageIcon("C:\\Tugas UAS Prak PBO\\puzzle_icon.png");

    frame.setPreferredSize(new Dimension(dimension + 400, dimension + margin));
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setResizable(true);

    createComponents(frame.getContentPane());

    frame.pack();
    frame.setVisible(true);
    frame.setIconImage(imageIcon.getImage());
  }

  private void createComponents(Container container) {
    container.add(pg, BorderLayout.CENTER);
  }

  public JFrame getFrame() {
    return frame;
  }
}
