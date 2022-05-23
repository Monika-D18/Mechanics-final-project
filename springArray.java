public class SpringArray{
    public static Spring equivalentSpring(String springExpr, Spring[] springs) {
        Spring spring = new Spring(0)
        for(int i = 0; i,springs.length;i++){
            spring = spring.inParallel(springs[i]);
        }
        return spring
    }     
}