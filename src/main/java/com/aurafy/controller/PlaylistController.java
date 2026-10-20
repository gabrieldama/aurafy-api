package com.aurafy.controller;

import com.aurafy.dto.PlaylistResponseDTO;
import com.aurafy.service.PlaylistService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/playlists")
public class PlaylistController {

    private final PlaylistService playlistService;

    public PlaylistController(PlaylistService playlistService) {
        this.playlistService = playlistService;
    }

    @GetMapping
    public List<PlaylistResponseDTO> listar() {
        return playlistService.listar();
    }

    @GetMapping("/{id}")
    public PlaylistResponseDTO buscarPorId(@PathVariable Long id) {
        return playlistService.buscarporId(id);
    }
}
