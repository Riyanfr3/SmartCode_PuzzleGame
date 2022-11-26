/*
| NPM           | Nama Anggota                    |
| ------------- | ------------------------------- |
| 2108107010075 | Muhammad Firdaus                |
| 2108107010089 | Habil Nasution                  |
| 2108107010082 | Sharahiya                       |
| 2108107010079 | Riyan Farhan Ramadhan           |
| 2108107010097 | Afifah Nibras                   |
| ------------- | ------------------------------- |
*/

import javax.swing.SwingUtilities;

public class Puzzle {
  public static void main(String[] args) {
    // Mengolah variabel berdasarkan args yang diinput
    int playSize;
    String playMode;
    if (args.length == 0) {
      playSize = 3;
      playMode = "";
    } else if (args.length == 1)

    {
      playSize = Integer.parseInt(args[0]);
      playMode = "";
    } else

    {
      playSize = Integer.parseInt(args[0]);
      playMode = args[1].toLowerCase();
    }
    // Construct UI(size, dimension, margin, mode)
    UserInterface ui = new UserInterface(playSize, 700, 50, playMode);
    SwingUtilities.invokeLater(ui);
  }
}