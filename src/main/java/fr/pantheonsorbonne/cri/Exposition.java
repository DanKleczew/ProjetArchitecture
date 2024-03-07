package fr.pantheonsorbonne.cri;

import java.util.Date;
import java.util.List;

public class Exposition {

    private final Date beginningDate;
    private final Date endingDate;

    private List<Artwork> exposedArtworks;

    private Museum museum;

    public Exposition(Date beginningDate, Date endingDate, List<Artwork> exposedArtworks, Museum museum){
        this.beginningDate = beginningDate;
        this.endingDate = endingDate;
        this.museum = museum;
        this.exposedArtworks = exposedArtworks;
    }

    public Date getBeginningDate(){
        return this.beginningDate;
    }

    public Date getEndingDate(){
        return this.endingDate;
    }

    public void addArtwork(Artwork artwork){
        this.exposedArtworks.add(artwork);
    }

}
