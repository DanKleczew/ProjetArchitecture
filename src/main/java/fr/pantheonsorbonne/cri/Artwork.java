package fr.pantheonsorbonne.cri;

import java.util.Date;

public abstract class Artwork {

    private int IDArtwork;
    private String name;
    private int estimatedPriceInCents;

    private final Date creationDate;
    private Artist[] creators;

    private Museum currentMuseum;

    public Artwork(String name, int estimatedPriceInCents, Date creationDate, Artist[] artists, Museum currentMuseum){
        this.creationDate = creationDate;
        this.creators = artists;
        this.currentMuseum = currentMuseum;
        this.estimatedPriceInCents = estimatedPriceInCents;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEstimatedPriceInCents() {
        return estimatedPriceInCents;
    }

    public void setEstimatedPriceInCents(int estimatedPriceInCents) {
        this.estimatedPriceInCents = estimatedPriceInCents;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Artist[] getCreators() {
        return creators;
    }

    public void setCreators(Artist[] creators) {
        this.creators = creators;
    }

    public Museum getCurrentMuseum() {
        return currentMuseum;
    }

    public void setCurrentMuseum(Museum currentMuseum) {
        this.currentMuseum = currentMuseum;
    }


    public int getIDArtwork() {
        return IDArtwork;
    }

    public void setIDArtwork(int IDArtwork) {
        this.IDArtwork = IDArtwork;
    }
}
