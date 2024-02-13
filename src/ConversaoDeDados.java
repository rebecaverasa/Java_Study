public class ConversaoDeDados {
    public static void main(String[] args) {
        String faketexto = "100";
        System.out.println(Integer.valueOf(faketexto));
        System.out.println(Byte.valueOf(faketexto));
        System.out.println(Short.valueOf(faketexto));
        System.out.println(Float.valueOf(faketexto));
        System.out.println(Double.valueOf(faketexto));
        System.out.println("---------------------------------------------");
        Byte b = 10;
        System.out.println(b.intValue());
        System.out.println(b.shortValue());
        System.out.println(b.floatValue());
        System.out.println(b.doubleValue());
        System.out.println(b.toString());
        System.out.println("---------------------------------------------");
        Double c = 1567.98472384703472380472;
        System.out.println(c.intValue());
        System.out.println(c.floatValue());
    }
}
