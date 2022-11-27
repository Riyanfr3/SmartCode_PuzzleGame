# SmartCode_Puzzle_Game

Topic : Puzzle_Game
                       
 2108107010075 -> Muhammad Firdaus (Role : Leader, Code Maker)               
 2108107010089 -> Habil Nasution (Role : Desainer, Bug Fixer)              
 2108107010082 -> Sharahiya (Role : Game Guide, Explainer Code)      
 2108107010079 -> Riyan Farhan Ramadhan (Role : FlowChart Maker, Bug Fixer)       
 2108107010097 -> Afifah Nibras (Role : Explainer Code, FlowChart Maker)  

Pemberitahuan :
1. Pemain akan ditampilkan dengan tampilan frame dari puzzle yang dimana ada terdapat kotak 3x3 yang berisi 8 angka didalamnya.
2. Pemain akan ditampilkan 8 angka acak, dan wajib untuk menyusun nya untuk memenangkan game.
3. Apabila pemain ingin me-Restart game nya, pemain dapat menekan button yang berada diatas kotak angka.
4. Adapun syarat untuk mereset angka (Me-Restart game) yaitu pemain harus menempatkan kotak kosong di pojok kanan bawah.
5. Apabila kotak berada di pojok kanan bawah, maka game akan otomatis ter-Restart.
6. Apabila pemain telah berhasil menyusun angka, maka permainan telah selesai.
7. Dan HighScore akan otomatis muncul, HighScore disini yaitu berupa seberapa banyak pemain men-Click kotak untuk menyusun angka supaya berurutan.

Kesimpulan :
1. Puzzle Class = main program dimana puzzle berjalan berdasarkan UserInterface. 
2. User Interface Class = objek yang menjadi frame puzzle.
3. Puzzle Grid Class = objek yang mengektensi Jpanel dan menjadi kanvas untuk seluruh tile puzzle.
4. Control Class = objek yang mengekstensikan MouseAdapter dan menjadi responder untuk pergerakan serta semua click di UserInterface.
5. Logic Class = Objek yang menyimpan logika memulai dan mengakhiri game puzzle.
