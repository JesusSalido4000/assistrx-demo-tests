# AssistRx QA Automation Demo

Este repositorio demuestra un framework básico de automatización de pruebas UI con Java, Selenium y Cucumber, utilizando el sitio [saucedemo.com](https://www.saucedemo.com).

## Tecnologías
- Java
- Selenium WebDriver
- Cucumber (BDD)
- Maven
- JUnit
- GitHub Actions

## Estructura
- `features/`: Escenarios Gherkin
- `stepdefinitions/`: Definiciones de pasos
- `pages/`: Page Object Models
- `runners/`: Archivos de ejecución
- `utils/`: Utilidades generales

## Cómo ejecutar
```bash
mvn clean test
```

## CI/CD
Este proyecto incluye integración continua con GitHub Actions.
