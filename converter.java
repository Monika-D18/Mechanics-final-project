import java.util.*;
public class Converter {
    Map<Integer, String> system = new Map<Integer, String>();
    int n = 8;
    
     private String springExpresion(Map<Integer,String> springs){
        String res = new String();
        res.append("[").toString();
        for(String str : springs.values()){
            res.append(str).toString();
        }
        res.append("]").toString();
        return res;
    }

    public int getSprings()(int[] binRep){
         for(int k = n-1; k >=0; k--){
            if(binRep[k] == 1){
                system.put( (int)Math.pow(2, n-k-1), springExpresion( (int)Math.pow(2, n-k-1)));
            }
        }
        return (int)(new SpringArray().equivalentSpring( springExpresion(system))).getSpring();
    }


    private String springExpresion(double stiff){
        if(stiff == 0)
             return "";
        String res = new String();
        res.append("[").toString();
        for(int i = 0; i<stiff; i++){
            res.append("[]").toString();
        }
        res.append("]").toString();
        return res;
    }
}
