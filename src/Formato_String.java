public class Formato_String {
    public static void main(String[] args) {
        String frase = "Curso de Android.";
        System.out.println("Tamanho da string: "+frase.length());
        System.out.println("Terceira posicao do index da string é: "+frase.charAt(2));
        System.out.println(frase.equals("Curso de Android"));
        System.out.println(frase.startsWith("Curso"));
        System.out.println(frase.endsWith("Android."));
        System.out.println(frase.substring(5));
        System.out.println(frase.substring(0,5));
        System.out.println(frase.replace("Curso de", "Aulas sobre"));
        System.out.println(frase.replace("o", "x"));
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());
        String frase2 = "                    Curso de Androis 2.            ";
        System.out.println(frase.trim());

    }
}
