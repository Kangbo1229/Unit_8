public class ThreeByThree {
    public static void main(String [] args){
        double [][] list = new double[3][3];
        System.out.println(list[0][0]);
        System.out.println(list[0][1]);
        System.out.println(list[0][2]);
        System.out.println(list[1][0]);
        System.out.println(list[1][1]);
        System.out.println(list[1][2]);
        System.out.println(list[2][0]);
        System.out.println(list[2][1]);
        System.out.println(list[2][2]);

        list[0][2] = 6;
        list[1][0] = 4;
        list[2][1] = 5;
        list[0][1] = 45;
        list[1][1] = 55;

        list[0][1] = -6;
        list[1][2] = -4;
        list[2][0] = -5;
        list[2][2] = -77;

        System.out.println(" ");

        System.out.println(list[0][0]);
        System.out.println(list[0][1]);
        System.out.println(list[0][2]);
        System.out.println(list[1][0]);
        System.out.println(list[1][1]);
        System.out.println(list[1][2]);
        System.out.println(list[2][0]);
        System.out.println(list[2][1]);
        System.out.println(list[2][2]);
    }
}
