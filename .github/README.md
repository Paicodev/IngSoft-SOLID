# Seguridad y Análisis Estático (SAST y SCA)

Este directorio configura análisis automatizados de seguridad en GitHub para el repositorio:

## 1. SAST — *Static Application Security Testing* ([`workflows/codeql.yml`](workflows/codeql.yml))
* **Qué analiza:** El **código fuente propio** (archivos `.java`), sin necesidad de ejecutar el programa.
* **Herramienta:** **GitHub CodeQL** (`build-mode: none` para Java sin Maven/Gradle).
* **Cuándo corre:** En cada `push` o `pull_request` hacia `main` / `master`, y semanalmente los lunes.
* **Cómo verificarlo:**
  1. Hacer `git push` al repositorio en GitHub.
  2. Ir a la pestaña **Actions → CodeQL (SAST)** y comprobar que el workflow termina en verde.
  3. Ver los resultados en **Security → Code scanning**.

## 2. SCA — *Software Composition Analysis* ([`dependabot.yml`](dependabot.yml))
* **Qué analiza:** Las **dependencias y paquetes externos** (versiones y vulnerabilidades conocidas / CVEs).
* **Herramienta:** **GitHub Dependabot**.
* **Alcance actual:** Monitorea semanalmente las dependencias de `github-actions` usadas en los workflows. Si el proyecto incorporara librerías Java mediante Maven (`pom.xml`) o Gradle (`build.gradle`), se habilita el ecosistema `maven`/`gradle` comentado en `dependabot.yml`.
* **Dónde se ve:** En GitHub, pestaña **Security → Dependabot**.

## 3. Complemento de Deuda Técnica (IDE)
* **SonarLint** (extensión en el IDE) y **SonarQube** complementan este flujo analizando *Code Smells*, duplicación, bugs y complejidad ciclomática sobre el mismo código Java.
