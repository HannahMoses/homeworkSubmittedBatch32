public class TestDuration {
//homework to write a Java program to calculate duration taken to run this program estimate efficiency
/*
===>  Experimenting with git pull command <======
 */
    public static void main(String[] args) {
        int result = 0;
        long startTime = System.currentTimeMillis();
        System.out.println();
        //for (int i=0; i<5000; i++){
        for (int i=0; i<50000; i++){
            result +=i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Total time for String " +(endTime - startTime));
}

}
