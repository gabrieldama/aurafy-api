package com.aurafy.service;

import com.aurafy.repository.MusicaRepository;
import org.springframework.stereotype.Service;

@Service
public class MusicaService {

    private final MusicaRepository musicaRepository;

    public MusicaService(MusicaRepository musicaRepository) {
        this.musicaRepository = musicaRepository;
    }

}
