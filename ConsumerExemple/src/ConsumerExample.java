
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Representa uma operação que aceita um argumento do tipo T e não retorna
 * nenhum resultado.
 * É utilizada principalmente para realizar ações, ou efeitos colaterais nos
 * elementos do Stream sem modificar, ou
 * retornar um valor.
 */
public class ConsumerExample {
  public static void main(String[] args) {
    // Criar uma lista de números inteiros
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5); // List<QualquerTipo> pode ser integer, string, double

    // Usar o Consumer com expressão lambda para imprimir números pares
    Consumer<Integer> imprimirNumeroPar = numero -> { // esse numero representa cada numero do meu stream, como se fosse
                                                      // o map do javascript
      if (numero % 2 == 0) {
        System.out.println(numero);
      }

    };

    System.out.println("Imprimindo sem ser direto no stream:");
    numeros.stream().forEach(imprimirNumeroPar);

    // Usar o Consumer para imprimir números pares no Stream
    System.out.println("Imprimindo direto no stream:");
    numeros.stream()
        .filter(n -> n % 2 == 0)
        .forEach(System.out::println);
  }
}