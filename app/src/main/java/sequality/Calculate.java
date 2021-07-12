package sequality;

public class Calculate{
  public int sum(int x, int y){
    return x+y;
  }
  public int sumAtoB(int a, int b){
    int sum = 0;
    for (int i=a;i<=b;i++){
      sum = sum + i;
    }
    return sum;

  }

  public double ave(double x, double y){
    return (x+y)/2.0;
  }

  public double aveAtoB(double a, double b){
    double sum = 0;
    for (double i=a;i<=b;i++){
      sum = sum + i;
    }
    double ave = sum/(b-a+1);
    return ave;
  }

  public int oddAtoB(int a, int b){
    int sum = 0;
    for (int i=a;i<=b;i++){
      if (i%2 == 1){
        sum = sum + i;
      }
    }
    return sum;

  }

  public int evenAtoB(int a, int b){
    int sum = 0;
    for (int i=a;i<=b;i++){
      if (i%2 == 0){
        sum = sum + i;
      }
    }
    return sum;

  }
}
