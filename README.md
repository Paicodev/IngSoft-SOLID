# Demostración de Principios SOLID (Java)

Cada principio contiene dos versiones de un mismo caso práctico (dominio de clínica médica / turnos):
- `incorrecto/`: viola el principio (código acoplado o frágil).
- `correcto/`: aplica el principio de forma modular y desacoplada.

## Estructura
El prefijo `p01` a `p05` indica el orden didáctico. Los nombres de carpeta coinciden con los paquetes Java:

1. SRP — Single Responsibility Principle (Responsabilidad Única): `src/solid/p01_srp/`
2. OCP — Open/Closed Principle (Abierto/Cerrado): `src/solid/p02_ocp/`
3. LSP — Liskov Substitution Principle (Sustitución de Liskov): `src/solid/p03_lsp/`
4. ISP — Interface Segregation Principle (Segregación de Interfaces): `src/solid/p04_isp/`
5. DIP — Dependency Inversion Principle (Inversión de Dependencias): `src/solid/p05_dip/`

Dentro de cada principio, `correcto/` e `incorrecto/` son paquetes separados para permitir nombres de clases repetidos.

## Cómo compilar y ejecutar un ejemplo
Desde la carpeta de la versión que quieras ejecutar (por ejemplo, `src/solid/p01_srp/correcto`):

```sh
javac -d out *.java
java -cp out solid.p01_srp.correcto.MainSRP
```

Clases principales disponibles:

| Ejemplo | Paquete | Clase principal |
| --- | --- | --- |
| SRP incorrecto | `solid.p01_srp.incorrecto` | `TurnoMonolitico` |
| SRP correcto | `solid.p01_srp.correcto` | `MainSRP` |
| OCP incorrecto | `solid.p02_ocp.incorrecto` | `CalculadoraDescuento` |
| OCP correcto | `solid.p02_ocp.correcto` | `MainOCP` |
| LSP incorrecto/correcto | `solid.p03_lsp.incorrecto` / `solid.p03_lsp.correcto` | `MainLSP` |
| ISP incorrecto/correcto | `solid.p04_isp.incorrecto` / `solid.p04_isp.correcto` | `MainISP` |
| DIP incorrecto/correcto | `solid.p05_dip.incorrecto` / `solid.p05_dip.correcto` | `MainDIP` |

Al ejecutar, reemplaza en el comando `solid.p01_srp.correcto.MainSRP` por el paquete y la clase principal de la fila elegida.
