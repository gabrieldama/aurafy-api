package com.aurafy.service;

import com.aurafy.dto.PlaylistResponseDTO;
import com.aurafy.mapper.PlaylistMapper;
import com.aurafy.model.Playlist;
import com.aurafy.repository.PlaylistRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

public class PlaylistService {

    private final PlaylistRepository playlistRepository;

    public PlaylistService(PlaylistRepository playlistRepository) {
        this.playlistRepository = playlistRepository;
    }

    public List<PlaylistResponseDTO> listar() {
        return playlistRepository.findAll().stream()
                .map(PlaylistMapper::toResponseDTO)
                .toList();
    }

    public PlaylistResponseDTO buscarporId(Long id) {
        Playlist playlist = playlistRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Playlist não encontrada"));
        return PlaylistMapper.toResponseDTO(playlist);
    }
}
