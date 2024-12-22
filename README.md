# Projeto: Estudo de Consumo de API em Java

Este projeto tem como objetivo estudar o consumo de APIs utilizando Java, além de implementar boas práticas para o tratamento de erros e exceções através de blocos `try-catch`.

## Tecnologias Utilizadas

- **Java**: Linguagem principal do projeto (versão 8 ou superior recomendada).
- **Maven**: Gerenciador de dependências.
- **HTTP Client**: Biblioteca para realizar requisições HTTP (ex.: `HttpURLConnection` ou `HttpClient` do Java 11).
- **IDE**: IntelliJ IDEA.

## Funcionalidades

1. Consumo de dados de uma API pública.
2. Tratamento de possíveis erros nas requisições HTTP.
3. Parse de dados da API para objetos Java.
4. Mensagens claras para o usuário em caso de falha na execução do programa.

## Estrutura do Projeto

```plaintext
src/
|-- main/
    |-- java/
        |-- com.example.api/
            |-- ApiConsumer.java  # Classe principal para consumo da API
            |-- ApiExceptionHandler.java  # Classe para tratamento de exceções
        |-- com.example.model/
            |-- ApiResponse.java  # Classe para mapear a resposta da API
|-- test/
    |-- com.example.api/
        |-- ApiConsumerTest.java  # Testes unitários
```

## Como Configurar o Ambiente

1. **Clone o repositório**:
    ```bash
    git clone https://github.com/seu-usuario/projeto-java-api.git
    ```

2. **Acesse o diretório do projeto**:
    ```bash
    cd projeto-java-api
    ```

3. **Configure as dependências** (caso utilize Maven):
    ```xml
    <dependencies>
        <dependency>
            <groupId>com.google.code.gson</groupId>
            <artifactId>gson</artifactId>
            <version>2.8.9</version>
        </dependency>
    </dependencies>
    ```

4. **Compile o projeto**:
    ```bash
    mvn clean install
    ```

5. **Execute a aplicação**:
    ```bash
    java -cp target/projeto-java-api-1.0.jar com.example.api.ApiConsumer
    ```

## Exemplos de Uso

### Consumo de API

A classe `ApiConsumer` faz uma requisição GET para uma API pública:

```java
try {
    String apiResponse = ApiConsumer.getDataFromApi("https://api.public.com/data");
    System.out.println("Resposta da API: " + apiResponse);
} catch (IOException e) {
    System.err.println("Erro na comunicação com a API: " + e.getMessage());
} catch (Exception e) {
    System.err.println("Erro inesperado: " + e.getMessage());
}
```

### Tratamento de Exceções

A classe `ApiExceptionHandler` centraliza o tratamento de erros e mensagens para o usuário:

```java
public class ApiExceptionHandler {
    public static void handleException(Exception e) {
        if (e instanceof IOException) {
            System.err.println("Erro de I/O: " + e.getMessage());
        } else {
            System.err.println("Erro inesperado: " + e.getMessage());
        }
    }
}
```

## Contribuição

Fique à vontade para abrir issues ou enviar pull requests para melhorias no projeto.

