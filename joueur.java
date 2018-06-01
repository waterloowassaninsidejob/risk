import java.util.Vector;
public class Joueur {

	private int id;
	private String nom;
	private Mission mission;
	private int armee;
	private Vector<Territoire> territoire;
	private Vector<Region> region;
	private Vector<Unite> unite;
	
	public Joueur(int id, String nom, Mission mission, int armees) {
		super();
		this.id = id;
		this.nom = nom;
		this.mission = mission;
		this.armees = armees;
		this.territoires = new Vector<>();
		this.regions = new Vector<>();
		this.unites = new Vector<>();	}

	
	public int getId() {
		return id; }
	public void setId(int id) {
		this.id = id;}

	public String getNom() {
		return nom;}
	public void setNom(String nom) {
		this.nom = nom;}

	public Mission getMission() {
		return mission;}
	public void setMission(Mission mission) {
		this.mission = mission;}

	public int getArmee() {
		return armee;	}
	public void setArmee(int armee) {
		this.armee = armee;}

	public Vector<Territoire> getTerritoire() {
		return territoire;}
	public void setTerritoire(Vector<Territoire> territoire) {
		this.territoire = territoire;	}

	public Vector<Region> getRegion() {
		return region;}
	public void setRegion(Vector<Region> region) {
		this.region = region;	}

	public Vector<Unite> getUnite() {
		return unite;}
	public void setUnite(Vector<Unite> unite) {
		this.unite = unite;}
	
	public void addTerritoire(Territoire territoire) {
		this.territoire.add(territoire);}
	
	public void addUnite(Unite unite) {
		this.unite.add(unite);	}
	
	public void addRegion(Region region) {
		this.region.add(region); }
	
}
