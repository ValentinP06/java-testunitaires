public class MathUtils {
    public static int additionner (int a,int b){
        return a+b;
    }
    public static int additionner (int [] tab){
        int somme=0;
        for (int i =0; i<tab.length;i++){
            somme+=tab[i];
        }
        return somme;
    }
    //    public static int additionner(int[] nombres){
//        return Arrays.stream(nombres).sum();
//    }
//
//    public static int additionner2(int... nbrs){
//        return Arrays.stream(nbrs).sum();
//    }
    public static int multiplier(int a,int b) {
        return a*b;
    }
    public static int soustraire(int a,int b){
        return a-b;
    }
}