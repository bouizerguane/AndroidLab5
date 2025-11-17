package ma.ens.lab4.entities;

public class Pizza {

    private static int comp;
    private int id;
    private String nom;
    private int nbrIngredients;
    private int photo;
    private double duree;
    private String detailsIngredient;
    private String description;
    private String preparation;

    public Pizza() {
    }

    public Pizza(String nom, int nbrIngredients, int photo, double duree, String detailsIngredient, String description, String preparation) {
        this.id=++comp;
        this.nom = nom;
        this.nbrIngredients = nbrIngredients;
        this.photo = photo;
        this.duree = duree;
        this.detailsIngredient = detailsIngredient;
        this.description = description;
        this.preparation = preparation;
    }

    public static int getComp() {
        return comp;
    }

    public static void setComp(int comp) {
        Pizza.comp = comp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbrIngredients() {
        return nbrIngredients;
    }

    public void setNbrIngredients(int nbrIngredients) {
        this.nbrIngredients = nbrIngredients;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public double getDuree() {
        return duree;
    }

    public void setDuree(double duree) {
        this.duree = duree;
    }

    public String getDetailsIngredient() {
        return detailsIngredient;
    }

    public void setDetailsIngredient(String detailsIngredient) {
        this.detailsIngredient = detailsIngredient;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }
}
