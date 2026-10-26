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
├── config        # CORS
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

Exemplo de resposta de `GET /api/playlists/3`:

```json
{
  "id": 3,
  "nome": "Rap Clássico",
  "descricao": "O melhor do rap para ouvir no volume máximo",
  "capaUrl": "https://is1-ssl.mzstatic.com/image/thumb/Music112/v4/c9/02/cd/c902cdef-e179-5b70-8142-112a2abe7f27/22UMGIM49875.rgb.jpg/600x600bb.jpg",
  "musicas": [
    {
      "id": 10,
      "titulo": "Lose Yourself",
      "artista": "Eminem",
      "album": "8 Mile",
      "duracaoSegundos": 321,
      "capaUrl": "https://is1-ssl.mzstatic.com/image/thumb/Music125/v4/08/23/fc/0823fcd9-cb44-695b-32bf-b3bf51d9f800/00606949351229.rgb.jpg/600x600bb.jpg"
    }
  ]
}
```

Documentação interativa (Swagger UI): `http://localhost:8080/swagger-ui.html`

## Como executar

1. Tenha o Java 21 e o MySQL rodando em `localhost:3306` com usuário `root` e senha `root` (altere em `src/main/resources/application.yaml` se necessário).
2. Na raiz do projeto, rode:

```bash
./mvnw spring-boot:run
```

A API sobe em `http://localhost:8080`.

O banco `aurafy_db` é criado automaticamente. As tabelas são recriadas a cada execução (`ddl-auto: create-drop`) e populadas pelo arquivo `src/main/resources/data.sql`, com 11 músicas e 4 playlists de exemplo.

## Protótipo

O protótipo do app foi feito no Figma: [Aurafy no Figma](https://www.figma.com/design/65uD3qznQ2rNCgoUyu3UK6/Untitled?node-id=0-1&t=6wcefZgdHf5SSKry-1)

O app mobile que consome esta API está no repositório **aurafy-app**.
