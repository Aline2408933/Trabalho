//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cabecalho c = new Cabecalho();
        c.escreva();


        Questao q1 = new Questao();
        q1.pergunta = "1 - Qual o valor de 7+3x2?";
        q1.opcaoA = "a - 10";
        q1.opcaoB = "b - 13";
        q1.opcaoC = "c - 17";
        q1.opcaoD = "d - 20";
        q1.opcaoE = "e - 23";
        q1.correta = "b";

        q1.escrevaQuestao();
        String resposta = q1.leiaResposta();
        q1.isCorreta(resposta);

        Questao q2 = new Questao();
        q2.pergunta = "1 - Qual é a raiz quadrada de 144?";
        q2.opcaoA = "a - 10";
        q2.opcaoB = "b - 18";
        q2.opcaoC = "c - 17";
        q2.opcaoD = "d - 11";
        q2.opcaoE = "e - 12";
        q2.correta = "e";

        q2.escrevaQuestao();
        resposta = q2.leiaResposta();
        q2.isCorreta(resposta);
    }
}