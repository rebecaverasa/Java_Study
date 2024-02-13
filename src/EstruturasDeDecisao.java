public class EstruturasDeDecisao {

    void media(float nota) {
        if (nota>=7){
            System.out.println("Aluno aprovado.");
        } else if (nota>=4 && nota<=6.99) {
            System.out.println("Aluno apto para recuperação.");
        }else{
            System.out.println("Aluno reprovado.");
        }
    }

    public static void main(String[] args) {
        float a=3.5f, b=4.2f, c=7.8f, d=9.6f;
        float mediaIndividual = (a+b+c+d)/4;
        System.out.println("Media do aluno: "+mediaIndividual);
        new EstruturasDeDecisao().media(mediaIndividual);
    }
}
