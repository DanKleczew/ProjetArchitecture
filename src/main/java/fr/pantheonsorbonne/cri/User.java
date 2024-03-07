package fr.pantheonsorbonne.cri;

public abstract class User {

    private int Id;
    private String firstName;
    private String lastName;
    private String nickname;
    private String photoLink;
    public User(int Id, String firstName, String lastName, String nickname, String photoLink){

    }

    public String getFirstName() {
        return firstName;
    }

    protected void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return Id;
    }

    public String getLastName() {
        return lastName;
    }

    protected void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickname() {
        return nickname;
    }

    protected void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhotoLink() {
        return photoLink;
    }

    protected void setPhotoLink(String photoLink) {
        this.photoLink = photoLink;
    }
}
