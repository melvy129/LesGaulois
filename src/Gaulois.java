
public class Gaulois {
	private String nom;
	private int force;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(PrendreParole() + "/" + texte + "/");

	}

	private String PrendreParole() {

		return "Le Gaulois" + nom + " : ";
	}

}
