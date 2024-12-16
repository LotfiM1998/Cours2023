public class Album {
    private final String titre, nomArtiste, paysArtiste, label, marqueDisque, producteur, version, genre;
    private final int anneeParution, anneeParutionOriginal, debitStandard, debitAbonne;
    private final boolean albumRemasterise;

    public Album(AlbumBuilder builder){
        this.paysArtiste = builder.paysArtiste;
        this.label = builder.label;
        this.marqueDisque = builder.marqueDisque;
        this.producteur = builder.producteur;
        this.version = builder.version;
        this.anneeParutionOriginal = builder.anneeParutionOriginal;
        this.debitStandard = builder.debitStandard;
        this.debitAbonne = builder.debitAbonne;
        this.albumRemasterise = builder.albumRemasterise;
        if (builder.titre == null || builder.nomArtiste == null) {
            throw new IllegalArgumentException("Titre et artiste sont obligatoires");
        }
        this.titre = builder.titre;
        this.nomArtiste = builder.nomArtiste;
        this.anneeParution = builder.anneeParution;
        this.genre = builder.genre;
    }

    public String getTitre() {
        return titre;
    }

    public String getNomArtiste() {
        return nomArtiste;
    }

    public String getPaysArtiste() {
        return paysArtiste;
    }

    public String getLabel() {
        return label;
    }

    public String getMarqueDisque() {
        return marqueDisque;
    }

    public String getProducteur() {
        return producteur;
    }

    public String getVersion() {
        return version;
    }

    public String getGenre() {
        return genre;
    }

    public int getAnneeParution() {
        return anneeParution;
    }

    public int getAnneeParutionOriginal() {
        return anneeParutionOriginal;
    }

    public int getDebitStandard() {
        return debitStandard;
    }

    public int getDebitAbonne() {
        return debitAbonne;
    }

    public boolean isAlbumRemasterise() {
        return albumRemasterise;
    }

    public static class AlbumBuilder{
        private final  String titre,nomArtiste;
        private  String  paysArtiste, label, marqueDisque, producteur, version, genre;
        private  int anneeParution, anneeParutionOriginal, debitStandard, debitAbonne;
        private  boolean albumRemasterise;
        public AlbumBuilder(String titre, String artiste){
            this.titre=titre;
            this.nomArtiste=artiste;
        }
        public AlbumBuilder paysArtiste(String paysArtiste){
            this.paysArtiste=paysArtiste;
            return this;
        }
        public AlbumBuilder label(String label){
            this.label=label;
            return this;
        }
        public AlbumBuilder marqueDisque(String marqueDisque){
            this.marqueDisque=marqueDisque;
            return this;
        }
        public AlbumBuilder producteur(String producteur){
            this.producteur=producteur;
            return this;
        }
        public AlbumBuilder version(String version){
            this.version=version;
            return this;
        }
        public AlbumBuilder anneeParution(int anneeParution){
            this.anneeParution=anneeParution;
            return this;
        }
        public AlbumBuilder genre(String genre){
            this.genre=genre;
            return this;
        }
        public AlbumBuilder anneeParutionOriginal(int anneeParutionOriginal){
            this.anneeParutionOriginal=anneeParutionOriginal;
            return this;
        }
        public AlbumBuilder debitStandard(int debitStandard){
            this.debitStandard=debitStandard;
            return this;
        }
        public AlbumBuilder debitAbonne(int debitAbonne){
            this.debitAbonne=debitAbonne;
            return this;
        }
        public AlbumBuilder albumRemasterise(boolean albumRemasterise){
            this.albumRemasterise=albumRemasterise;
            return this;
        }
        public Album build(){
            return new Album(this);
        }
    }
}
