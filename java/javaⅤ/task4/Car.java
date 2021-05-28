class Car extends Vehicle {
  // インスタンスフィールドfuelを定義してください
  private int fuel = 50;

  // fuelフィールドのゲッターを定義してください
  public int getFuel() {
    return this.fuel;
  }

  // インスタンスメソッドchargeを定義してください
  public void charge(int charge) {
    System.out.println(charge + "L給油します");
    if (charge <= 0) {
      System.out.println("給油できません");
    } else if (charge + this.fuel >= 100) {
      System.out.println("満タンまで給油します");
      this.fuel = 100;
    } else {
      this.fuel += charge;
    }
    System.out.println("ガソリン量：" + this.fuel + "L");
  }
}
