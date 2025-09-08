import java.util.Scanner;

public class conversorTemperatura {
    private double celsius;
    private double fahrenheit;
    private double kelvin;

    public void obterDados(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Celsius: ");
        celsius = leitor.nextDouble();
        exibirResultados();
    }
    public void calcularConversao(){
        fahrenheit = ((celsius/5)*9)+32;
        kelvin = (celsius+273);
    }
    public void exibirResultados(){
        calcularConversao();
        System.out.print("Temperatura em graus Celsius: ");
        System.out.print(celsius);
        System.out.println(" C");
        System.out.print("Temperatura em Fahrenheit: ");
        System.out.print(fahrenheit);
        System.out.println(" F");
        System.out.print("Temperatura em Kelvin: ");
        System.out.print(kelvin);
        System.out.println(" K");
    }
}
