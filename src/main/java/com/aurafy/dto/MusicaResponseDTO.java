package com.aurafy.dto;

public record MusicaResponseDTO(
        Long id,
        String titulo,
        String artista,
        String album,
        Integer duracaoSegundos,
        String capaUrl
) {
}
