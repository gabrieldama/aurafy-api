package com.aurafy.dto;

import java.util.List;

public record PlaylistResponseDTO(
        Long id,
        String nome,
        String descricao,
        String capaUrl,
        List<MusicaResponseDTO> musicas
) {
}
