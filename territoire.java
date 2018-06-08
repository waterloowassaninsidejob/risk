import edu.princeton.cs.introcs.StdDraw;
import java.util.ArrayList;

public class Territoire {

	int id_Territoire;
	
	ArrayList<Territoire> voisins;
	public void setVoisins(ArrayList<Territoire> ouloulou) {
		this.voisins = ouloulou;
	}

	public void setId_Territoire(int id_Territoire) {
		this.id_Territoire = id_Territoire;
	}
	

	public int getId_Territoire() {
		return id_Territoire;
	}

	
	int CoordX_Territoire; 
	public int getCoordX_Territoire() {
		return CoordX_Territoire;
	}

	public void setCoordX_Territoire(int CoordX_Territoire) {
		this.CoordX_Territoire = CoordX_Territoire;
	}
	
	int CoordY_Territoire;
	public int getCoordY_Territoire() {
		return CoordY_Territoire;
	}

	public void setCoordY_Territoire(int CoordY_Territoire) {
		this.CoordY_Territoire = CoordY_Territoire;
	}
	
	int nbr_armee;
	public int getNbr_armee() {
		return nbr_armee;
	}

	public void setNbr_armee(int nbr_armee) {
		this.nbr_armee = nbr_armee;
	}
	
	String nom_Territoire;
	public String getnom_Territoire() {
		return nom_Territoire;
	}

	public void setnom_Territoire(String nom_Territoire) {
		this.nom_Territoire = nom_Territoire;
	}
	
	
	public Territoire(String nom_Territoire, int id_Territoire, int CoordX_Territoire, int CoordY_Territoire) {
		this.nom_Territoire=nom_Territoire;
		this.id_Territoire=id_Territoire;
		this.CoordX_Territoire=CoordX_Territoire;
		this.CoordY_Territoire=CoordY_Territoire;
	}
	
	
	
	
	
	
	
	
	
	
	public void placement() {
		int y = 1;
		while (y != 0) {
			if (StdDraw.isMousePressed()) {
				double k = StdDraw.mouseX();
				double l = StdDraw.mouseY();
				if (k < 810 && k > 790 && l < 552 && l > 532) {//Thailande
					
				}
			}
		}
	}
}
