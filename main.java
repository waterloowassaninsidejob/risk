import edu.princeton.cs.introcs.StdDraw;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StdDraw.setCanvasSize(1227, 628);
		StdDraw.setXscale(0, 1000);/* INITIALISATION DE LA TAILLE DE LA FENETRE */
		StdDraw.setYscale(0, 1000);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.text(500, 500, "RISK");
		StdDraw.text(500, 100, "Jouer");
		int choix = 0;
		int choix2 = 1;
		while (choix != 1) {
			if (StdDraw.isMousePressed()) {
				double x = StdDraw.mouseX();
				double y = StdDraw.mouseY();
				if (0 < y && 1000 > y && 0 < x && 1000 > x) {
					StdDraw.pause(100);
					StdDraw.clear(StdDraw.WHITE);
					StdDraw.setPenColor(StdDraw.BLACK);
					StdDraw.text(500, 800, "MENU");
					StdDraw.text(300, 700, "Sélectionnez le nombre de joueurs : ");
					StdDraw.text(500, 500, "2 joueurs");
					StdDraw.text(500, 400, "3 joueurs");
					StdDraw.text(500, 300, "4 joueurs");
					StdDraw.text(500, 200, "5 joueurs");
					StdDraw.text(500, 100, "6 joueurs");
					choix = 1;
					choix2 = 0;
				}
			}
		}
		while (choix2 != 1) {
			if (StdDraw.isMousePressed()) {
				double i = StdDraw.mouseX();
				double j = StdDraw.mouseY();

				if (450 < j && 550 > j && 450 < i && 550 > i) {
					StdDraw.clear(StdDraw.WHITE);
					choix2 = 2;
					break;
				} else if (350 < j && 450 > j && 450 < i && 550 > i) {
					StdDraw.clear(StdDraw.WHITE);
					choix2 = 3;
					break;
				} else if (250 < j && 350 > j && 450 < i && 550 > i) {
					StdDraw.clear(StdDraw.WHITE);
					choix2 = 4;
					break;
				} else if (150 < j && 250 > j && 450 < i && 550 > i) {
					StdDraw.clear(StdDraw.WHITE);
					choix2 = 5;
					break;
				} else if (50 < j && 150 > j && 450 < i && 550 > i) {
					StdDraw.clear(StdDraw.WHITE);
					choix2 = 6;
					break;
				}
			}
		}

		switch (choix2) {

		case 2:

			StdDraw.picture(500, 500, "image/carte.png");
			StdDraw.text(500, 100, "J1 veuillez regarder votre mission et placer vos armées");
			int choix3 = 1;
			StdDraw.setPenColor(178,190,181);
			StdDraw.filledCircle(68, 885, 20);//Alaska
			StdDraw.filledCircle(140, 885, 20);//Canada
			StdDraw.filledCircle(125, 815, 20);//Montana
			StdDraw.filledCircle(190, 810, 20);//Ontario
			StdDraw.filledCircle(255, 805, 15);//Québec
			StdDraw.filledCircle(240, 185, 15);//Argentine
			StdDraw.filledCircle(237, 307, 15);//Pérou
			StdDraw.filledCircle(284, 340, 20);//Brésil
			StdDraw.filledCircle(223, 466, 20);//Vénézuela
			StdDraw.filledCircle(530, 274, 20);//Afrique du Sud
			StdDraw.filledCircle(610, 281, 15);//Madagascar
			StdDraw.filledCircle(530, 414, 20);//Congo
			StdDraw.filledCircle(582, 480, 20);//Ethiopie
			StdDraw.filledCircle(450, 548, 20);//Sahara
			StdDraw.filledCircle(530, 614, 20);//Egypte
			StdDraw.filledCircle(461, 739, 15);//France
			StdDraw.filledCircle(850,222,20);//Perth
			StdDraw.filledCircle(930,229,18);//Sydney
			StdDraw.filledCircle(934,380,15);//Nouvelle Calédonie
			StdDraw.filledCircle(840,422,15);//Indonésie
			StdDraw.filledCircle(776,659,20);//Chine
			StdDraw.filledCircle(719,585,20);//Inde
			StdDraw.filledCircle(588,669,20);//Turquie
			StdDraw.filledCircle(907,681,15);//Japon
			StdDraw.filledCircle(784,740,20);//Mongolie
			StdDraw.filledCircle(776,800,20);//Irkusta
			StdDraw.filledCircle(885,874,20);//Kamchatka
			StdDraw.filledCircle(792,884,20);//Yakust
			StdDraw.filledCircle(712,877,20);//Sibérie
			StdDraw.filledCircle(654,844,20);//Ural
			StdDraw.filledCircle(662,741,20);//Afghanistan
			StdDraw.filledCircle(526,731,15);//Grèce
			StdDraw.filledCircle(431,800,15);//Angleterre
			StdDraw.filledCircle(412,862,15);//Islande
			StdDraw.filledCircle(504,867,15);//Scandinavie
			StdDraw.filledCircle(569,807,20);//Russie
			StdDraw.filledCircle(500,793,15);//Allemagne
			StdDraw.filledCircle(100,730,20);//West
			StdDraw.filledCircle(180,700,20);//East
			StdDraw.filledCircle(110,600,20);//Mexique
			StdDraw.filledCircle(360,930,20);//Groënland
			StdDraw.filledCircle(800,542,15);//Thaïlande

			while (choix3 != 0) {
				if (StdDraw.isMousePressed()) {
					double i = StdDraw.mouseX();
					double j = StdDraw.mouseY();
				}
			}
			break;
		case 3:
			StdDraw.picture(500, 500, "image/carte.png");
			break;
		case 4:
			StdDraw.picture(500, 500, "image/carte.png");
			break;
		case 5:
			StdDraw.picture(500, 500, "image/carte.png");
			break;
		case 6:
			StdDraw.picture(500, 500, "image/carte.png");
			break;
		}
	}
}
