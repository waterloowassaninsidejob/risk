import edu.princeton.cs.introcs.StdDraw;

public class main {

	public static void main(String[] args) {
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
				if (50 < y && 150 > y && 450 < x && 550 > x) {
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
					StdDraw.text(500, 500, "2 joueurs");
					choix2 =2;
					break;
				} else if (350 < j && 450 > j && 450 < i && 550 > i) {
					StdDraw.clear(StdDraw.WHITE);
					StdDraw.text(500, 500, "3 joueurs");
					choix2 = 3;
					break;
				} else if (250 < j && 350 > j && 450 < i && 550 > i) {
					StdDraw.clear(StdDraw.WHITE);
					StdDraw.text(500, 500, "4 joueurs");
					choix2 = 4;
					break;
				}
				else if (150 < j && 250 > j && 450 < i && 550 > i) {
					StdDraw.clear(StdDraw.WHITE);
					StdDraw.text(500, 500, "5 joueurs");
					choix2 = 5;
					break;
				}
				else if (50 < j && 150 > j && 450 < i && 550 > i) {
					StdDraw.clear(StdDraw.WHITE);
					StdDraw.text(500, 500, "6 joueurs");
					choix2 = 6;
					break;
				}
			}
		}
	}
}

