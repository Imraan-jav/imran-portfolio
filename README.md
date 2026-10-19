# Mohamed Imran - Portfolio (Java + Spring Boot)

## Run
Requires JDK 17+ and Maven.

    mvn spring-boot:run

Open http://localhost:8080

## Customize
- Projects, skills, contact details: `PortfolioController.java`
  (replace the `your-username` GitHub links)
- Page layout: `src/main/resources/templates/index.html`
- Styling: `src/main/resources/static/css/style.css`

## Deploy
Push to GitHub, then create a Web Service on Render or Railway.
Build command: `mvn clean package -DskipTests`
Start command: `java -jar target/portfolio-1.0.0.jar`
