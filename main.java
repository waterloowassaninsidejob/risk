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
			while (choix3 != 0) {
				if (StdDraw.isMousePressed()) {
					double i = StdDraw.mouseX();
					double j = StdDraw.mouseY();
					if (60 < i && 80 > i && 880 < j && 900 > j) {

						StdDraw.text(500, 200, "Alaska");
						break;
					}
					if (130 < i && 150 > i && 880 < j && 900 > j) {

						StdDraw.text(500, 200, "Canada");
						break;
					}
					if (115 < i && 135 > i && 800 < j && 830 > j) {

						StdDraw.text(500, 200, "Montana");
						break;
					}
					if (175 < i && 195 > i && 800 < j && 830 > j) {

						StdDraw.text(500, 200, "Ontario");
						break;
					}
					if (230 < i && 250 > i && 800 < j && 830 > j) {

						StdDraw.text(500, 200, "Québec");
						break;
					}
					if (220 < i && 240 > i && 168 < j && 188 > j) {

						StdDraw.text(500, 200, "Argentine");
						break;
					}
					if (227 < i && 247 > i && 297 < j && 317 > j) {

						StdDraw.text(500, 200, "Pérou");
						break;
					}
					if (274 < i && 294 > i && 330 < j && 350 > j) {
						StdDraw.text(500, 200, "Brésil");
						break;
					}
					if (213 < i && 233 > i && 456 < j && 476 > j) {
						
						StdDraw.text(500, 200, "Vénézuela");
						break;
					}
					if (520 < i && 540 > i && 264 < j && 284 > j) {
						
						StdDraw.text(500, 200, "Afrique du Sud");
						break;
					}
					if (605 < i && 625 > i && 271 < j && 291 > j) {
						
						StdDraw.text(500, 200, "Madagascar");
						break;
					}
					if (520 < i && 540 > i && 404 < j && 424 > j) {
						
						StdDraw.text(500, 200, "Congo");
						break;
					}
					if (572 < i && 592 > i && 476 < j && 499 > j) {
						
						StdDraw.text(500, 200, "Ethiopie");
						break;
					}
					if (440 < i && 460 > i && 538 < j && 558 > j) {
						
						StdDraw.text(500, 200, "Sahara");
						break;
					}
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
