package fr.pantheonsorbonne.cri;

public class Painting extends Artwork{

    private int[] dimensions;

    public Painting(String name, int estimatedPriceInCents, Artist[] artists, Museum currentMuseum, int[] dimensions) {
        super(name, estimatedPriceInCents, artists, currentMuseum);
        this.dimensions = dimensions;
    }


    public int[] getDimensions() {
        return dimensions;
    }

    public void setDimensions(int[] dimensions) {
        this.dimensions = dimensions;
    }


}
