package fr.pantheonsorbonne.cri;

public class Curator extends User{

    private Museum museum;
    public Curator(int Id, String firstName, String lastName, String nickname, String photoLink) {
        super(Id, firstName, lastName, nickname, photoLink);
    }

    public void setMuseum(Museum museum){
        this.museum = museum;
    }

    public Museum getMuseum(){
        return this.museum;
    }

    public void estimateArtworkPrice(Artwork artwork){
        //TODO: Raisonnement
        artwork.setEstimatedPriceInCents(10000);
    }
}
