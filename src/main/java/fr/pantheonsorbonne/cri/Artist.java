package fr.pantheonsorbonne.cri;

import java.util.ArrayList;

public class Artist extends User{

    ArrayList<Artwork> artworksList;
    public Artist(int Id, String firstName, String lastName, String nickname, String photoLink) {
        super(Id, firstName, lastName, nickname, photoLink);
    }

    public void modifyAccount(String firstName, String lastName, String nickname, String photoLink){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setNickname(nickname);
        this.setPhotoLink(photoLink);
    }

    public void createArtwork(String name, int[] dimensions, String typeArtwork){
        Artwork newArtwork;

        switch (typeArtwork){
            case "Painting":
                newArtwork = new Painting(name, Integer.MIN_VALUE, new Artist[]{this}, null, dimensions);
            default :
                throw new ArtworkNameDoesNotExist("The artwork type '"+ typeArtwork +"' does not exist");
        }

        this.artworksList.add(newArtwork);
    }
}
