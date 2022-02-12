package com.mega.cryptorate;

public class CryptoModel {
    int cryptoRank;
    String cryptoName;
    String cryptoImg;
    float cryptoPrice;
    float high_24h;
    float low_24h;

    CryptoModel(){

    }

    public CryptoModel(int cryptoRank, String cryptoName, String cryptoImg, float cryptoPrice, float high_24h, float low_24h) {
        this.cryptoRank = cryptoRank;
        this.cryptoName = cryptoName;
        this.cryptoImg = cryptoImg;
        this.cryptoPrice = cryptoPrice;
        this.high_24h = high_24h;
        this.low_24h = low_24h;
    }

    public int getCryptoRank() {
        return cryptoRank;
    }

    public void setCryptoRank(int cryptoRank) {
        this.cryptoRank = cryptoRank;
    }

    public String getCryptoName() {
        return cryptoName;
    }

    public void setCryptoName(String cryptoName) {
        this.cryptoName = cryptoName;
    }

    public String getCryptoImg() {
        return cryptoImg;
    }

    public void setCryptoImg(String cryptoImg) {
        this.cryptoImg = cryptoImg;
    }

    public float getCryptoPrice() {
        return cryptoPrice;
    }

    public void setCryptoPrice(float cryptoPrice) {
        this.cryptoPrice = cryptoPrice;
    }

    public float getHigh_24h() {
        return high_24h;
    }

    public void setHigh_24h(float high_24h) {
        this.high_24h = high_24h;
    }

    public float getLow_24h() {
        return low_24h;
    }

    public void setLow_24h(float low_24h) {
        this.low_24h = low_24h;
    }
}
