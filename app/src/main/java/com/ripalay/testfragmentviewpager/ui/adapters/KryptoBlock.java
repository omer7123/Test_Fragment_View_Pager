package com.ripalay.testfragmentviewpager.ui.adapters;

public class KryptoBlock {
    private int imageView;
    private String nameKrypto;
    private String priceKrypto;

    public KryptoBlock(int imageView, String nameKrypto, String priceKrypto) {
        this.imageView = imageView;
        this.nameKrypto = nameKrypto;
        this.priceKrypto = priceKrypto;
    }

    public int getImageView() {
        return imageView;
    }

    public String getNameKrypto() {
        return nameKrypto;
    }

    public String getPriceKrypto() {
        return priceKrypto;
    }
}
