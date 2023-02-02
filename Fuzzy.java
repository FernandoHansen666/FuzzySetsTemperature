package FuzzySetsTemperature;

import java.util.Scanner;

// Classe principal que representa o conjunto fuzzy de temperatura
public class Fuzzy {
  // Atributos que representam a temperatura em graus Celsius e o grau de pertencimento
  private double grausCelsius;
  private double pertencimento;

  // Construtor que lê a temperatura em graus Celsius a partir da entrada padrão
  public Fuzzy() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Digite a temperatura atual (em graus Celsius): ");
    this.grausCelsius = scan.nextDouble();
    scan.close();
  }

  // Método que realiza o fuzzyficamento da temperatura
  public void fuzzyfy() {
    // Verifica se a temperatura está entre 15 e 22.5 graus Celsius
    if (grausCelsius >= 15 && grausCelsius <= 22.5) {
      // Calcula o grau de pertencimento ao conjunto fuzzy 'Morno'
      this.pertencimento = 1 - Math.abs(grausCelsius - 18.75) / 3.75;
      System.out.println("Grau de pertencimento ao conjunto fuzzy 'Morno': " + (this.pertencimento * 100) + "%");
    } 
    // Verifica se a temperatura está entre 22.5 e 30 graus Celsius
    else if (grausCelsius > 22.5 && grausCelsius <= 30) {
      // Calcula o grau de pertencimento ao conjunto fuzzy 'Quente'
      this.pertencimento = 1 - Math.abs(grausCelsius - 26.25) / 3.75;
      System.out.println("Grau de pertencimento ao conjunto fuzzy 'Quente': " + (this.pertencimento * 100) + "%");
    } 
    // Verifica se a temperatura está entre 7.5 e 15 graus Celsius
    else if (grausCelsius < 15 && grausCelsius >= 7.5) {
      // Calcula o grau de pertencimento ao conjunto fuzzy 'Frio'
      this.pertencimento = 1 - Math.abs(grausCelsius - 11.25) / 3.75;
      System.out.println("Grau de pertencimento ao conjunto fuzzy 'Frio': " + (this.pertencimento * 100) + "%");
    } 
    // Se a temperatura não estiver dentro dos conjuntos fuzzy 'Frio', 'Morno' e 'Quente'
    else {
      System.out.println("A temperatura está fora da faixa considerada para os conjuntos 'Frio', 'Morno' e 'Quente'.");
    }

    // Verifica se a temperatura é menor que 7.5 graus Celsius
if (grausCelsius < 7.5) {
System.out.println("Está muito frio.");
    // Verifica se a temperatura é maior que 30 graus Celsius
} else if (grausCelsius > 30) {
System.out.println("Está muito quente.");
}
}


public static void main(String[] args) {
Fuzzy fuzzy = new Fuzzy();
fuzzy.fuzzyfy();
}
}
