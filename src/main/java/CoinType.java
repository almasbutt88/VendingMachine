public enum CoinType {
    ONE(0.01),
    TWO(0.02),
    FIVE(0.05),
    TEN(0.10),
    TWENTY(0.2),
    FIFTY(0.5),
    ONEP(1),
    TWOP(2);

    protected final double coinValue;

    CoinType(double coinValue){
        this.coinValue = coinValue;
}

    public double getCoinValue() {
        return coinValue;
    }
}
