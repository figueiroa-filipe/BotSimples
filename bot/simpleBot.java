package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá! Meu nome é Aid.");
        System.out.println("Fui criado em 2018.");
        System.out.println("Por favor, relembre-me o seu nome.");

        String name = scanner.nextLine();

        System.out.println("Que nome maravilhoso você tem, " + name + "!");
        System.out.println("Deixe-me adivinhar sua idade.");
        System.out.println("Digite os restos da divisão da sua idade por 3, 5 e 7.");

        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();

        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;

        System.out.println("Sua idade é " + age + "; esse é um bom momento para começar a programar!");
        System.out.println("Agora vou provar a você que posso contar até qualquer número que você quiser.");

        // leia um número e conte até ele aqui

        System.out.println("Concluído, tenha um ótimo dia!");
    }
}
