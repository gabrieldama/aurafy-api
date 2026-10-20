package com.aurafy.service;

import com.aurafy.dto.MusicaResponseDTO;
import com.aurafy.mapper.MusicaMapper;
import com.aurafy.repository.MusicaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicaService {

    private final MusicaRepository musicaRepository;

    public MusicaService(MusicaRepository musicaRepository) {
        this.musicaRepository = musicaRepository;
    }

    public List<MusicaResponseDTO> listar() {
        return musicaRepository.findAll().stream()
                .map(MusicaMapper::toResponseDTO)
                .toList();
    }

}
