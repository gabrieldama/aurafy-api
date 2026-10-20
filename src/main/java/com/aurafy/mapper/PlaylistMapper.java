package com.aurafy.mapper;

import com.aurafy.dto.MusicaResponseDTO;
import com.aurafy.dto.PlaylistResponseDTO;
import com.aurafy.model.Playlist;

import java.util.List;

public class PlaylistMapper {

    public static PlaylistResponseDTO toResponseDTO(Playlist playlist) {
        List<MusicaResponseDTO> musicas = playlist.getMusicas().stream()
                .map(MusicaMapper::toResponseDTO)
                .toList();

        return new PlaylistResponseDTO(
                playlist.getId(),
                playlist.getNome(),
                playlist.getDescricao(),
                playlist.getCapaUrl(),
                musicas
        );
    }
}
