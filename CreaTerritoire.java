import java.util.ArrayList;

public class CreaTerritoire {
	
	public ArrayList<Territoire> listVoisins;
	
	
	public CreaTerritoire () {
		super();
		
		Territoire t1 = new Territoire("Alaska", 1, 68,885 );
		Territoire t2 = new Territoire("Canada", 2, 140,885 );
		Territoire t3 = new Territoire("Montana", 3, 125,815);
		Territoire t4 = new Territoire("Ontario", 4, 190,810 );
		Territoire t5 = new Territoire("Quebec", 5, 255,805 );
		Territoire t6 = new Territoire("Argentine", 6, 240,185);
		Territoire t7 = new Territoire("Perou",7, 237,307);
		Territoire t8 = new Territoire("Bresil",8, 284,340);
		Territoire t9 = new Territoire("Venezuela", 9, 223,466);
		Territoire t10 = new Territoire("Afrique du sud", 10, 530,274);
		Territoire t11 = new Territoire("Madagascar", 11, 610,281);
		Territoire t12 = new Territoire("Congo", 12, 530,414 );
		Territoire t13 = new Territoire("Ethiopie", 13, 582,480);
		Territoire t14 = new Territoire("Sahara", 14, 450,548);
		Territoire t15 = new Territoire("Egypte",15, 530,614);
		Territoire t16 = new Territoire("France",16, 461,739);
		Territoire t17 = new Territoire("Perth", 17, 850,222 );
		Territoire t18 = new Territoire("Sydney", 18, 930,229 );
		Territoire t19 = new Territoire("Nouvelle Caledonie", 19, 934,380);
		Territoire t20 = new Territoire("Indonesie", 20, 840, 422);
		Territoire t21 = new Territoire("Chine", 21, 776,659);
		Territoire t22 = new Territoire("Inde",22, 719,585);
		Territoire t23 = new Territoire("Turquie",23, 588,669);
		Territoire t24 = new Territoire("Japon", 24, 907,681);
		Territoire t25 = new Territoire("Mongolie", 25, 784, 740);
		Territoire t26 = new Territoire("Irkusta", 26, 776,800);
		Territoire t27 = new Territoire("Kamchatka", 27, 885,874);
		Territoire t28 = new Territoire("Yakust", 28, 792,884);
		Territoire t29 = new Territoire("Siberie", 29, 712, 877);
		Territoire t30 = new Territoire("Ural",30, 654,844);
		Territoire t31 = new Territoire("Afghanistan",31, 662, 741);
		Territoire t32 = new Territoire("Grèce",32, 526, 731);
		Territoire t33 = new Territoire("Angleterre",33, 431,800);
		Territoire t34 = new Territoire("Islande", 34, 412, 862);
		Territoire t35 = new Territoire("Scandinavie", 35, 504,867);
		Territoire t36 = new Territoire("Russie", 36, 569,807);
		Territoire t37 = new Territoire("Allemagne", 37, 500,793);
		Territoire t38 = new Territoire("West", 38, 100,730);
		Territoire t39 = new Territoire("East", 39, 180,700);
		Territoire t40 = new Territoire("Mexique",40, 110,600);
		Territoire t41 = new Territoire("Groenland",41, 360,930);
		Territoire t42 = new Territoire("Thailande", 42, 800, 542);
		
		listVoisins = new ArrayList<>();
		listVoisins.add(t2);
		listVoisins.add(t3);
		listVoisins.add(t27);
		t1.setVoisins(listVoisins); //Alaska
		
		listVoisins = new ArrayList<>();
		listVoisins.add(t1);
		listVoisins.add(t3);
		listVoisins.add(t41);
		listVoisins.add(t4);
		t2.setVoisins(listVoisins); //Canada
		
		listVoisins = new ArrayList<>();
		listVoisins.add(t1);
		listVoisins.add(t2);
		listVoisins.add(t38);
		listVoisins.add(t4);
		t3.setVoisins(listVoisins); //Montana
		
		listVoisins = new ArrayList<>();
		listVoisins.add(t3);
		listVoisins.add(t2);
		listVoisins.add(t38);
		listVoisins.add(t39);
		listVoisins.add(t41);
		t4.setVoisins(listVoisins); //Ontario
		
		listVoisins = new ArrayList<>();
		listVoisins.add(t4);
		listVoisins.add(t39);
		listVoisins.add(t41);
		t5.setVoisins(listVoisins); //Quebec
		
		/*listVoisins = new ArrayList<>();
		listVoisins.add(t3);
		listVoisins.add(t2);
		listVoisins.add(t38);
		listVoisins.add(t39);
		listVoisins.add(t41);
		t4.setVoisins(listVoisins); //Ontario*/
	}
}
