package lesson15;

public class ONotation {
    public static void main(String[] args) {

        int[] array = new int[100];

        //O(n)
        for(int i = 0; i < args.length; i++) {
            System.out.println(i);
        }

        //O(2n)
        for(int i = 0; i < args.length; i++) {
            System.out.println(i);
        }
        for(int i = 0; i < args.length; i++) {
            System.out.println(i);
        }

        //O(n^2)
        for(int i = 0; i < args.length; i++) {
            for(int j = 0; j < args.length; j++){
                System.out.println(i);
            }
        }

    }
}
