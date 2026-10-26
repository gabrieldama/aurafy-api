# Aurafy API

API do Aurafy, um app de músicas inspirado no Spotify. Ela fornece as músicas e playlists que o app mobile (aurafy-app) consome.

## Tecnologias

- Java 21
- Spring Boot
- Spring Data JPA
- MySQL
- Lombok
- Swagger

## Endpoints

- `GET /api/musicas` - lista as músicas
- `GET /api/playlists` - lista as playlists
- `GET /api/playlists/{id}` - busca uma playlist pelo id

## Como rodar

Precisa ter o MySQL rodando com usuário `root` e senha `root`. O banco `aurafy_db` é criado sozinho e os dados de exemplo são carregados pelo `data.sql`.

```bash
./mvnw spring-boot:run
```

A API roda em `http://localhost:8080` e o Swagger em `http://localhost:8080/swagger-ui.html`.

## Protótipo

https://www.figma.com/design/65uD3qznQ2rNCgoUyu3UK6/Untitled?node-id=0-1&t=6wcefZgdHf5SSKry-1
