# Demostración de Principios SOLID (Java)

Cada carpeta contiene dos versiones de un mismo caso práctico (dominio de clínica médica / turnos):
- `incorrecto/`: viola el principio (código acoplado o frágil).
- `correcto/`: aplica el principio de forma modular y desacoplada.

## Estructura
1. `1-SRP/` — Single Responsibility Principle (Responsabilidad Única)
2. `2-OCP/` — Open/Closed Principle (Abierto/Cerrado)
3. `3-LSP/` — Liskov Substitution Principle (Sustitución de Liskov)
4. `4-ISP/` — Interface Segregation Principle (Segregación de Interfaces)
5. `5-DIP/` — Dependency Inversion Principle (Inversión de Dependencias)

## Cómo compilar y ejecutar cada ejemplo
Desde la carpeta del principio (ejemplo `1-SRP/correcto`):
```sh
javac *.java
java MainSRP
```
