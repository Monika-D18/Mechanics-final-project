public class Spring{
  private double k = 1;

  public  Spring(){
    this.k = 1;
  }

  public Spring(double stif){
      this.k  = stif;
  }


  public double getSpring(){
    return this.k;
  }

  private void setSpring(double newK){
      this.k = newK;
  }


  public double[] move(double t, double dt, double x0, double v0){
    double m = 1;
    double freq = Math.sqrt(k/m);
    double t0 = 0;
    int n = (int)Math.ceil((t- t0)/dt);
    double[] array = new double[n];
    for(int i = 0, j = 0; i <= t; i+=t0, j++ ){
        double  res = x0* Math.cos(freq*i) + (v0/freq) * Math.sin(freq*i);
        array[j]= res;
    }
      return array;
  }

  public double[] move(double t, double dt, double x0){
    double v0 = 0;
    double m = 1;
    double freq = Math.sqrt(this.k/m);
    double t0 = 0;
    int num = (int)Math.ceil((t- t0)/dt);
    double[] array = new double[num];
    for(int i = 0; t0 <= t; i++ ){
        double res = x0* Math.cos(freq*t0) + (v0/freq) * Math.sin(freq*t0);
          t0 += dt;
        array[i] = res;
    }
      return array;
  }

  public double[] move(double t0, double t1, double dt, double x0, double v0){
    double m = 1;
    double freq = Math.sqrt(this.k/m);
    int num = (int)Math.ceil((t1- t0)/dt);
    double[] array = new double[num];
    for(int i = 0; t0 <= t1; i++){
      double res = x0* Math.cos(freq*t0) + (v0/freq) * Math.sin(freq*t0);
      t0 += dt;
      array[i] = res;
    }
      return array;
  }

  public double[] move(double t0, double t1, double dt, double x0, double v0, double m){
    double freq = Math.sqrt(this.k/m);
    int num = (int)Math.ceil((t1- t0)/dt);
    double[] array = new double[num];
    for(int i = 0; t0 <= t1; i++ ){
      double res = x0* Math.cos(freq*t0) + (v0/freq) * Math.sin(freq*t0);
      array[i] = res;
    }
      return array;
  }

  public Spring inSeries(Spring that){
    double k =(that.getSpring() * this.getSpring())/(that.getSpring()+this.getSpring());
    Spring newSpring = new Spring(k);
     return newSpring;
  }

  public Spring inParallel(Spring that){
    double k =that.getSpring()+this.getSpring();
    Spring newSpring = new Spring(k);
      return newSpring;
  }

}
