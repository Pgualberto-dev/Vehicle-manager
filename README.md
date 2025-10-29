# Vehicle Manager

Sistema em Java para cadastro e correção de veículos, desenvolvido como projeto didático para praticar conceitos de programação orientada a objetos: classes, encapsulamento, construtores, getters/setters e interação via console. O projeto é funcional e preparado para evoluções futuras — por exemplo: menu interativo, suporte a múltiplos veículos e persistência de dados.

## Visão geral
Este projeto permite criar e corrigir informações de um veículo através de entrada pelo console. É uma base simples e limpa que demonstra boas práticas básicas de modelagem em Java e pode ser estendida para aplicações mais completas.

## Recursos
- Modelagem de veículo com classe dedicada (atributos, construtores, getters/setters).
- Interação via console (entrada e saída).
- Validações básicas (quando aplicáveis).
- Projeto pronto para evoluir com funcionalidades como:
    - menu interativo,
    - gerenciamento de múltiplos veículos (lista/coleção),
    - persistência (arquivo, banco de dados),
    - interface gráfica (Swing/JavaFX) ou API REST.

## Requisitos
- JDK 8 ou superior (recomenda-se JDK 11+).
- Ferramentas opcionais: Maven ou Gradle caso você queira converter o projeto para um sistema de build.

## Como compilar e executar

As instruções abaixo cobrem cenários comuns. Ajuste conforme a estrutura de pacotes do seu projeto.

1. Usando IDE (recomendado para iniciantes)
    - Importe o projeto na sua IDE preferida (IntelliJ IDEA, Eclipse, NetBeans).
    - Localize a classe com o método `public static void main(String[] args)` (ex.: `Main.java`).
    - Execute a classe principal.

2. Usando linha de comando (projeto sem build tool)
    - Compile todos os arquivos Java:
        - Em Unix/macOS:
            - `find . -name "*.java" > sources.txt`
            - `javac -d out @sources.txt`
        - Em Windows (PowerShell):
            - `Get-ChildItem -Recurse -Filter *.java | % { $_.FullName } > sources.txt`
            - `javac -d out @sources.txt`
    - Execute a aplicação:
        - Se o `main` estiver no pacote padrão: `java -cp out Main`
        - Se estiver em pacote (por exemplo `com.exemplo.app.Main`): `java -cp out com.exemplo.app.Main`

3. Usando Maven/Gradle
    - Recomenda-se converter o projeto para Maven/Gradle para facilitar build, execução e testes.
    - Exemplos:
        - Maven: `mvn compile` e `mvn exec:java -Dexec.mainClass="com.exemplo.app.Main"`
        - Gradle: `./gradlew run` (após configuração do plugin `application`)

## Exemplo de uso (fluxo típico)
1. Programa pede dados do veículo:
    - Marca: Toyota
    - Modelo: Corolla
    - Ano: 2018
2. Programa mostra os dados gravados e dá opção de corrigir algum campo.
3. Usuário escolhe o campo a ser alterado e informa o novo valor.
4. Programa exibe dados atualizados e encerra (ou volta ao menu, se implementado).

(As mensagens e campos exatos dependem da implementação contida no código fonte.)

## Estrutura do projeto
Sugestão típica de organização (pode variar conforme o repositório atual):

- src/
    - (pacotes Java) Ex.: com/example/vehicle/
        - Main.java
        - Vehicle.java (classe modelo)
        - VehicleManager.java (lógica de interação/validação)
- README.md
- (opcional) LICENSE
- (opcional) .gitignore

## Boas práticas para evoluir o projeto
- Adicionar um menu interativo para selecionar operações (criar, listar, editar, remover, salvar).
- Trocar armazenamento em memória por persistência (arquivo JSON/CSV ou banco de dados leve como SQLite).
- Separar responsabilidades: model, serviço, persistência e apresentação.
- Adicionar testes unitários (JUnit).
- Configurar um sistema de build (Maven ou Gradle) e CI (GitHub Actions).
- Criar validações mais robustas (formato de placa, intervalo de ano, campos obrigatórios).

## Como contribuir
1. Faça um fork do repositório.
2. Crie uma branch com a sua feature: `git checkout -b feature/minha-feature`.
3. Codifique e escreva testes quando possível.
4. Abra um Pull Request descrevendo a mudança e o motivo.

Se quiser, abra uma issue primeiro descrevendo a feature ou bug para discutir a melhor abordagem.

## Licença
Não há licença definida neste repositório (a menos que exista um arquivo LICENSE). Recomenda-se adicionar uma licença (por exemplo MIT) se você pretende permitir uso externo. Para projetos pessoais/didáticos, escolher uma licença explícita evita ambiguidade sobre direitos de uso.

## Contato
Autor: Pgualberto-dev 
#####
LinkedIn: [linkedin.com/in/pablo-gualberto](https://linkedin.com/in/pablo-gualberto)
#####
GitHub: [github.com/Pgualberto-dev](https://github.com/Pgualberto-dev)
#####
Descrição: Sistema em Java para cadastro e correção de veículos — planejado para evolução.

---