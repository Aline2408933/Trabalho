public class Main {
    public static void main(String[] args) {

        Cabecalho c = new Cabecalho();
        c.escreva();

        int acertos = 0;
        int erros = 0;
        int totalQuestoes = 15;
        Questao[] questao = new Questao[totalQuestoes];

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
        if (q1.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }

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
        if (q2.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }

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
        if (q3.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }

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
        if (q4.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }

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
        if (q5.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }

        Questao q6 = new Questao();
        q6.pergunta = "6 - Qual e o valor de x na equação 3x-7=11?";
        q6.opcaoA = "a - 4";
        q6.opcaoB = "b - 5";
        q6.opcaoC = "c - 6";
        q6.opcaoD = "d - 7";
        q6.opcaoE = "e - 8";
        q6.correta = "a";

        q6.escrevaQuestao();
        resposta = q6.leiaResposta();
        if (q6.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }

        Questao q7 = new Questao();
        q7.pergunta = "7 - Qual é a soma dos ângulos internos de um hexágono?";
        q7.opcaoA = "a - 360º";
        q7.opcaoB = "b - 720º";
        q7.opcaoC = "c - 540º";
        q7.opcaoD = "d - 900º";
        q7.opcaoE = "e - 1080º";
        q7.correta = "c";

        q7.escrevaQuestao();
        resposta = q7.leiaResposta();
        if (q7.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }

        Questao q8 = new Questao();
        q8.pergunta = "8 - Qual o resultado de 10!?";
        q8.opcaoA = "a - 1.000";
        q8.opcaoB = "b - 5.000";
        q8.opcaoC = "c - 10.000";
        q8.opcaoD = "d - 3.628.000";
        q8.opcaoE = "e - 36.288";
        q8.correta = "d";

        q8.escrevaQuestao();
        resposta = q8.leiaResposta();
        if (q8.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }

        Questao q9 = new Questao();
        q9.pergunta = "9 - Qual o valor de 2 elevado a 5?";
        q9.opcaoA = "a - 10";
        q9.opcaoB = "b - 25";
        q9.opcaoC = "c - 64";
        q9.opcaoD = "d - 32";
        q9.opcaoE = "e - 48";
        q9.correta = "d";

        q9.escrevaQuestao();
        resposta = q9.leiaResposta();
        if (q9.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }

        Questao q10 = new Questao();
        q10.pergunta = "10 - Se x+2 =10 qual o valor 3x-4?";
        q10.opcaoA = "a - 6";
        q10.opcaoB = "b - 20";
        q10.opcaoC = "c - 10";
        q10.opcaoD = "d - 12";
        q10.opcaoE = "e - 14";
        q10.correta = "b";

        q10.escrevaQuestao();
        resposta = q10.leiaResposta();
        if (q10.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }

        Questao q11 = new Questao();
        q11.pergunta = "11 - O que é um triângulo obtuso?";
        q11.opcaoA = "a - Um ângulo menor que 90 graus.";
        q11.opcaoB = "b - Um ângulo exatamente igual a 90 graus";
        q11.opcaoC = "c - Um ângulo maior que 90 graus e menor que 180 graus.";
        q11.opcaoD = "d - Um ângulo maior que 180 graus.";
        q11.opcaoE = "e - Um ângulo que soma 360 graus";
        q11.correta = "c";

        q11.escrevaQuestao();
        resposta = q11.leiaResposta();
        if (q11.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }

        Questao q12 = new Questao();
        q12.pergunta = "12 - O que é uma função linear?";
        q12.opcaoA = "a - Uma função que tem a forma y= ax+b.";
        q12.opcaoB = "b - Uma função que nunca cruza o eixo y";
        q12.opcaoC = "c - Uma função que tem um gráfico em forma de parábola.";
        q12.opcaoD = "d - Uma função que sempre tem a mesma inclinação.";
        q12.opcaoE = "e - Uma função que é definida apenas para números inteiros";
        q12.correta = "a";

        q12.escrevaQuestao();
        resposta = q12.leiaResposta();
        if (q12.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }

        Questao q13 = new Questao();
        q13.pergunta = "13 - O que caracteriza uma progressão aritmética (PA)?";
        q13.opcaoA = "a - A soma de termos consecutivos é constante.";
        q13.opcaoB = "b - A diferença entre termos consecutivos é constante.";
        q13.opcaoC = "c - O produto de termos consecutivos é constante.";
        q13.opcaoD = "d - Os termos são sempre números primos.";
        q13.opcaoE = "e - Os termos aumentam exponencialmente.";
        q13.correta = "b";

        q13.escrevaQuestao();
        resposta = q13.leiaResposta();
        if (q13.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }

        Questao q14 = new Questao();
        q14.pergunta = "14 - Qual é a definição de um número primo?";
        q14.opcaoA = "a - Um número que pode ser dividido por 2";
        q14.opcaoB = "b - Um número que tem mais de dois divisores.";
        q14.opcaoC = "c - Um número que é sempre positivo.";
        q14.opcaoD = "d - Um número que termina em 0 ou 5.";
        q14.opcaoE = "e - Um número que é divisível apenas por 1 e por si mesmo.";
        q14.correta = "e";

        q14.escrevaQuestao();
        resposta = q14.leiaResposta();
        if (q14.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }

        Questao q15 = new Questao();
        q15.pergunta = "15 - Qual o valor de 9 elevado a dois - 5 elevado a 2?";
        q15.opcaoA = "a - 46";
        q15.opcaoB = "b - 91.";
        q15.opcaoC = "c - 64.";
        q15.opcaoD = "d - 56.";
        q15.opcaoE = "e - 80";
        q15.correta = "d";

        q15.escrevaQuestao();
        resposta = q15.leiaResposta();
        if (q15.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }

        double porcentagemAcertos = ((double) acertos / totalQuestoes) * 100;

        System.out.println("Resultado Final:");
        System.out.println("Você acertou " + acertos + " questões.");
        System.out.println("Você errou " + erros + " questões.");
        System.out.printf("Porcentagem de acertos: %.2f%%\n", porcentagemAcertos);
    }
}
