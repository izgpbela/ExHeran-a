# ExHerança

## Descrição
Este projeto demonstra o uso de herança em Java. Ele inclui várias classes que representam diferentes tipos de contas bancárias, animais e funcionários, mostrando como a herança pode ser usada para compartilhar e estender funcionalidades entre classes.

## Estrutura do projeto

## Principais classes e interfaces
- `heranca.ContaBancaria`: Classe base para diferentes tipos de contas bancárias.
- `heranca.ContaCorrente`: Representa uma conta corrente.
- `heranca.ContaPoupanca`: Representa uma conta poupança.
- `heranca.Animal`: Classe base para diferentes tipos de animais.
- `heranca.Cachorro`: Representa um cachorro.
- `heranca.Gato`: Representa um gato.
- `heranca.Funcionario`: Classe base para diferentes tipos de funcionários.
- `heranca.Administrativo`: Representa um funcionário administrativo.
- `heranca.Assistente`: Representa um assistente.

## Uso
Para usar este projeto, compile e execute as classes de teste incluídas no diretório `bin/heranca`. Por exemplo, para testar a classe `ContaPoupanca`, você pode executar a classe `ContaTeste`.

Exemplo de uso da classe `ContaPoupanca`:
```java
ContaPoupanca conta = new ContaPoupanca("João", 1000.0, 1.5, new Date());
conta.exibirDados();
double rendimentos = conta.calculaRendimentos();
System.out.println("Rendimentos: " + rendimentos);
