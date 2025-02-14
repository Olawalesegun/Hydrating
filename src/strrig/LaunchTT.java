package strrig;


public class LaunchTT {
    public static void main(String[] args) {
        char [] charc = {'W', 'E', 'B', '3', 'P', 'A', 'P', 'I'};
        String strr;
        strr = new String(charc, 1, 5);
        String strr2 = new String(charc, 1, 5).intern();
        String strr3 = new String(charc, 2, 4).intern();
        String strr4 = new String(charc, 1, 5).intern();

        String stttr = "Jenlode";
        String stttr1 = "Jenlode";

        System.out.println(strr);
        int result = strr.compareTo(strr2);
        System.out.println(result);
        System.out.println(strr2.equals(strr3));
        boolean res = strr2 == strr4;
        System.out.println(res);

        System.out.println("=================");
        System.out.println(stttr == stttr1);
        System.out.println(stttr.concat("Shade Bangs!!"));

        StringBuffer strBuf = new StringBuffer();
        System.out.println(strBuf.capacity());

        StringBuffer strBuf2 = new StringBuffer("Gh");
        System.out.println(strBuf2.capacity());
    }
}
