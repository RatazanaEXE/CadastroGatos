# ESTÁGIO 1: Build da Aplicação
# Utiliza a imagem oficial do Maven combinada com o Java 24 (JDK)
# para compilar o código-fonte e gerar o arquivo executável (.jar).
FROM maven:3.9-eclipse-temurin-24 AS build

# Define o diretório de trabalho padrão dentro do container para este estágio
WORKDIR /app

# Copia apenas o arquivo de configuração de dependências (pom.xml) primeiro,
# o que ajuda a aproveitar o cache de camadas do Docker caso as dependências não mudem.
COPY pom.xml .

# Copia a pasta de código-fonte (src) para dentro do container
COPY src ./src

# Executa o empacotamento do projeto via Maven, limpando builds anteriores
# e ignorando a execução de testes automatizados para acelerar o processo.
RUN mvn clean package -DskipTests


# ESTÁGIO 2: Execução da Aplicação (Runtime)

# Utiliza uma imagem mais leve contendo apenas o Java Runtime Environment (JRE 24),
# garantindo que o container final seja menor e mais seguro (sem ferramentas de build).
FROM eclipse-temurin:24-jre

# Define o diretório de trabalho para a execução da aplicação
WORKDIR /app

# Copia apenas o artefato final gerado (.jar) do estágio de build anterior
# para o diretório atual do container, renomeando-o para app.jar.
COPY --from=build /app/target/*-spring-boot.jar app.jar

# Expõe a porta padrão onde a aplicação Spring Boot irá escutar as requisições
EXPOSE 8080

# Configura o comando padrão para iniciar a aplicação Java quando o container subir
ENTRYPOINT ["java", "-jar", "app.jar"]

#docker run --rm -p 8080:8080 cadastro-gatos