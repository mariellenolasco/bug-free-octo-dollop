# JDBC

- Stands for java database connectivity
- (Tutorial)[https://www.baeldung.com/java-jdbc]
- (Wezley's Code)[https://github.com/211101-java-react-enterprise/quizzard/tree/9354a047f6c676d7ec98ba671c4605de3e604651/src/main/resources]

## JDBC with Postgres

- add postgres driver as dependency on pom.xml

## Components of working with JDBC

- Connection Factory
- DAO
- Driver Manager
- Connection
- (Statement vs Prepared Statement)[https://www.baeldung.com/java-statement-preparedstatement]

## Thinking thoughts

- Theoretically speaking you can make JDBC code first using Statements. Because you can execute DDL commands with Statements.
- Prepared statement performs faster, built on top of statement interface
