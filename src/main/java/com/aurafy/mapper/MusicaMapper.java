package com.aurafy.mapper;

import com.aurafy.dto.MusicaResponseDTO;
import com.aurafy.model.Musica;

public class MusicaMapper {

    public static MusicaResponseDTO toResponseDTO(Musica musica) {
        return new MusicaResponseDTO(
                musica.getId(),
                musica.getTitulo(),
                musica.getArtista(),
                musica.getAlbum(),
                musica.getDuracaoSegundos(),
                musica.getCapaUrl()
        );
    }
}
