public class First{
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++){
            if (i > 6/2){
                for (int k = 5; k >= 1; k--){
                    System.out.print(k);
                }
            } else {
                for (int j = 1; j <= 5; j++){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}