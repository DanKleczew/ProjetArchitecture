package fr.pantheonsorbonne.cri;

import java.util.List;

public class ArtworkRepository {

    private List<Artwork> artworkList;

    public ArtworkRepository(){}

    public ArtworkRepository(List<Artwork> artworks){
        this.artworkList = artworks;
    }

    public List<Artwork> getAll(){
        return this.artworkList;
    }

    public Artwork getByID(int ID) throws NotFoundException {
        for (Artwork i : this.artworkList){
            if (i.getIDArtwork() == ID){
                return i;
            }
        }
        throw new NotFoundException("Il n'y a pas d'oeuvre d'ID " +  ID);
    }


}
