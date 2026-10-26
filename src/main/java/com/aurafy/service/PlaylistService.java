package com.aurafy.service;

import com.aurafy.dto.PlaylistResponseDTO;
import com.aurafy.mapper.PlaylistMapper;
import com.aurafy.model.Playlist;
import com.aurafy.repository.PlaylistRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PlaylistService {

    private final PlaylistRepository playlistRepository;

    public PlaylistService(PlaylistRepository playlistRepository) {
        this.playlistRepository = playlistRepository;
    }

    @Transactional(readOnly = true)
    public List<PlaylistResponseDTO> listar() {
        return playlistRepository.findAll().stream()
                .map(PlaylistMapper::toResponseDTO)
                .toList();
    }

    @Transactional(readOnly = true)
    public PlaylistResponseDTO buscarporId(Long id) {
        Playlist playlist = playlistRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Playlist não encontrada"));
        return PlaylistMapper.toResponseDTO(playlist);
    }
}
