# Aurafy API

API REST do **Aurafy**, um player de música inspirado no Spotify. Fornece músicas e playlists para o app mobile (Expo / React Native).

## Tecnologias

- Java 21
- Spring Boot 4 (Spring Web MVC, Spring Data JPA)
- MySQL
- Springdoc OpenAPI (Swagger UI)
- Lombok
- Maven

## Estrutura

```
src/main/java/com/aurafy
├── config        # CORS e carga inicial de dados
├── controller    # Endpoints REST
├── dto           # Objetos de resposta (records)
├── mapper        # Conversão entidade -> DTO
├── model         # Entidades JPA (Musica, Playlist)
├── repository    # Acesso ao banco
└── service       # Regras de negócio
```

## Endpoints

| Método | Rota                  | Descrição                              |
|--------|-----------------------|----------------------------------------|
| GET    | `/api/musicas`        | Lista todas as músicas                 |
| GET    | `/api/playlists`      | Lista todas as playlists com músicas   |
| GET    | `/api/playlists/{id}` | Busca uma playlist pelo id (404 se não existir) |

Exemplo de resposta de `GET /api/playlists/1`:

```json
{
  "id": 1,
  "nome": "Rock Clássico",
  "descricao": "Os maiores hinos do rock",
  "capaUrl": "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQVYDwQ9SrYjO5kB5OIl4qK7hps3STXQ1zuC4WRGoYAwcL9ZiBGDfU4jrKj&s=10",
  "musicas": [
    {
      "id": 2,
      "titulo": "Bohemian Rhapsody",
      "artista": "Queen",
      "album": "A Night at the Opera",
      "duracaoSegundos": 355,
      "capaUrl": "https://upload.wikimedia.org/wikipedia/pt/b/bf/A_Night_at_the_Opera_Queen.jpg?utm_source=pt.wikipedia.org&utm_campaign=index&utm_content=original"
    }
  ]
}
```

Documentação interativa (Swagger UI): `http://localhost:8080/swagger-ui.html`

Na primeira execução, o banco `aurafy` é criado e populado com 6 músicas e 3 playlists de exemplo.

A API sobe em `http://localhost:8080`.
