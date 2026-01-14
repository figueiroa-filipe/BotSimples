package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá! Meu nome é Aid.");
        System.out.println("Fui criado em 2018.");
        System.out.println("Por favor, me relembre o seu nome.");

        String name = scanner.nextLine();

        System.out.println("Que nome incrível você tem, " + name + "!");
        System.out.println("Deixe-me adivinhar a sua idade.");
        System.out.println("Digite os restos da divisão da sua idade por 3, 5 e 7.");

        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();

        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;

        System.out.println("Sua idade é " + age + "; este é um bom momento para começar a programar!");
        System.out.println("Agora vou provar para você que consigo contar até qualquer número que você quiser.");

        // leia um número e conte até ele aqui
        int number = scanner.nextInt();
        if (number > 0) {
            for (int i = 0; i <= number; i++) System.out.printf("%d!\n", i);
        }

        System.out.println("Vamos testar seus conhecimentos de programação.");
        while (true) {
            System.out.println("Por que usamos métodos?");
            System.out.println("1. Para repetir uma instrução várias vezes.");
            System.out.println("2. Para decompor um programa em várias pequenas sub-rotinas.");
            System.out.println("3. Para determinar o tempo de execução de um programa.");
            System.out.println("4. Para interromper a execução de um programa.");
            int answer = scanner.nextInt();
            if (answer == 2) break;
            else System.out.println("Por favor, tente novamente.");
        }

        System.out.println("Parabéns, tenha um ótimo dia!");
    }
}
