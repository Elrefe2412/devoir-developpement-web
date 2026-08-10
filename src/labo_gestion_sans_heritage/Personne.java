public class Personne {
    // Definitions des attributs
    private String nom ;
    private String prenom;
    private String dateNaissance;
    private String telephone ;

    //Definitions des constructeurs
    public Personne() {

    }
    public Personne (String nom, String prenom, String dateNaissance, String telephone ){
        this.nom = nom ;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.telephone = telephone;
    }

    // Definitions des accesseurs et mutateurs
    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom = nom ;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaissance='" + dateNaissance + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
    public void affiche (){
        System.out.println("Nom : " + nom);
        System.out.println("Prenom : " +prenom );
        System.out.println("Date de Naissance : " +dateNaissance );
        System.out.println("Telephone : " +telephone );
    }
}
