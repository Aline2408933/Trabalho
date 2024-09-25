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
        q2.pergunta = "2 - Qual é a raiz quadrada de 144?";
        q2.opcaoA = "a - 10";
        q2.opcaoB = "b - 18";
        q2.opcaoC = "c - 17";
        q2.opcaoD = "d - 11";
        q2.opcaoE = "e - 12";
        q2.correta = "e";

        q2.escrevaQuestao();
        resposta = q2.leiaResposta();
        q2.isCorreta(resposta);

        Questao q3 = new Questao();
        q3.pergunta = "3 - Se um triângulo tem um ângulo de 90 graus, qual é o nome desse triângulo?";
        q3.opcaoA = "a - Equilátero";
        q3.opcaoB = "b - Isósceles";
        q3.opcaoC = "c - Escaleno";
        q3.opcaoD = "d - Retângulo";
        q3.opcaoE = "e - Obtusângulo";
        q3.correta = "d";

        q3.escrevaQuestao();
        resposta = q3.leiaResposta();
        q3.isCorreta(resposta);

        Questao q4 = new Questao();
        q4.pergunta = "4 - Qual é a fração equivalente a 0,25?";
        q4.opcaoA = "a - 1/2";
        q4.opcaoB = "b - 1/4";
        q4.opcaoC = "c - 1/6";
        q4.opcaoD = "d - 3/4";
        q4.opcaoE = "e - 2/5";
        q4.correta = "b";

        q4.escrevaQuestao();
        resposta = q4.leiaResposta();
        q4.isCorreta(resposta);

        Questao q5 = new Questao();
        q5.pergunta = "5 - Qual é a soma dos ângulos internos de um triângulo?";
        q5.opcaoA = "a - 90º";
        q5.opcaoB = "b - 120º";
        q5.opcaoC = "c - 360º";
        q5.opcaoD = "d - 180º";
        q5.opcaoE = "e - 240";
        q5.correta = "d";

        q5.escrevaQuestao();
        resposta = q5.leiaResposta();
        q5.isCorreta(resposta);

    }
}