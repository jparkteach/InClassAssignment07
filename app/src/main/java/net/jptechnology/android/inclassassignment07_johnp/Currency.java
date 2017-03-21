package net.jptechnology.android.inclassassignment07_johnp;

public class Currency {
    private String country;
    private int exchangeRate;
    private boolean buy;

    public Currency() {
    } // Empty constructor is needed to read from Firebase

    public Currency(String country, int exchangeRate, boolean buy) {
        this.country = country;
        this.exchangeRate = exchangeRate;
        this.buy = buy;
    }

    public String getCountry() {
        return country;
    }

    public int getExchangeRate() {
        return exchangeRate;
    }

    public boolean isBuy() {
        return buy;
    }
}
