public class Funcao {

    void Hello() { //Funcao sem retorno e sem parametros
        System.out.println("Olá");
    }

    void Hello(String nome) { //Funcao sem retorno e com parametros
        System.out.println("Olá, " + nome);
    }

    String chegada() { //Funcao com retorno e sem parametros
        return "Oi!!!";
    }

    String chegada(String nome) { //Funcao com retorno e com parametros
        return "Eai " + nome;
    }

    public static void main(String[] args) {
        new Funcao().Hello();
        new Funcao().Hello("Rebeca");
        String x = new Funcao().chegada();
            System.out.println(x);
        String y = new Funcao().chegada("Rebeca");
            System.out.println(y);
    }
}
