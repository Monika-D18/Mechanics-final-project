import java.util.*;
public class FT {
    private double a,b, duration;
    private int n;

    
   
    private void binaryRep(Integer[] system){    
         for(int k = n-1; k >=0; k--){
            if(binRep[k] == 1){
                system.put((int)Math.pow(2, n-k-1), springExpresion( (int)Math.pow(2, n-k-1)));
            }
        }
    }


    double sinCoef(int n) { 
        double t = 0;
        double res = 0;
        for(int i = 0; i<n; i++) {
            res += binaryRep(t)*Math.sin(n*b*t); 
            t += a;
        }
        return 2*a*res/duration;
    }

    double cosCoef( int n) { 
        double res = 0;
        double t = 0;
        for(int i = 0;i<n;i++) {
            res += binaryRep(t)*Math.cos(n*b*t);
            t += a;
        }
        return 2*a*res/duration;

    }

}
