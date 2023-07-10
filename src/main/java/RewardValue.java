public class RewardValue {
  private double cashValue;
  private double milesValue;

  // convert cash to miles
  public RewardValue(double cashValue) {
    this.cashValue = cashValue;
    this.milesValue = cashValue / 0.0035;
  }

  // convert miles to cash
  public RewardValue(double milesValue, boolean isMiles) {
    this.milesValue = milesValue;
    this.cashValue = milesValue * 0.0035;
  }

  public double getMilesValue() {
    return milesValue;
  }

  public double getCashValue() {
    return cashValue;
  }
  
}