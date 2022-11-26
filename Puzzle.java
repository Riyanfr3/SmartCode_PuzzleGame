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
    UserInterface ui = new UserInterface(playSize, 650, 50, playMode);
    SwingUtilities.invokeLater(ui);
  }
}
