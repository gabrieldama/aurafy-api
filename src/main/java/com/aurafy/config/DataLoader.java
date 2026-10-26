package com.aurafy.config;

import com.aurafy.model.Musica;
import com.aurafy.model.Playlist;
import com.aurafy.repository.MusicaRepository;
import com.aurafy.repository.PlaylistRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    private final MusicaRepository musicaRepository;
    private final PlaylistRepository playlistRepository;

    public DataLoader(MusicaRepository musicaRepository, PlaylistRepository playlistRepository) {
        this.musicaRepository = musicaRepository;
        this.playlistRepository = playlistRepository;
    }

    @Override
    public void run(String... args) {
        if (musicaRepository.count() > 0) {
            return;
        }

        Musica stairway = musicaRepository.save(new Musica(null, "Stairway to Heaven", "Led Zeppelin", "Led Zeppelin IV", 482,
                "https://upload.wikimedia.org/wikipedia/en/2/26/Led_Zeppelin_-_Led_Zeppelin_IV.jpg"));
        Musica bohemian = musicaRepository.save(new Musica(null, "Bohemian Rhapsody", "Queen", "A Night at the Opera", 355,
                "https://upload.wikimedia.org/wikipedia/pt/b/bf/A_Night_at_the_Opera_Queen.jpg"));
        Musica billieJean = musicaRepository.save(new Musica(null, "Billie Jean", "Michael Jackson", "Thriller", 294,
                "https://upload.wikimedia.org/wikipedia/en/5/55/Michael_Jackson_-_Thriller.png"));
        Musica blindingLights = musicaRepository.save(new Musica(null, "Blinding Lights", "The Weeknd", "After Hours", 200,
                "https://upload.wikimedia.org/wikipedia/en/c/c1/The_Weeknd_-_After_Hours.png"));
        Musica garotaDeIpanema = musicaRepository.save(new Musica(null, "Garota de Ipanema", "Tom Jobim", "Getz/Gilberto", 323,
                "https://upload.wikimedia.org/wikipedia/en/b/b6/Getz_Gilberto.jpg"));
        Musica aguasDeMarco = musicaRepository.save(new Musica(null, "Águas de Março", "Elis Regina e Tom Jobim", "Elis & Tom", 213,
                "https://upload.wikimedia.org/wikipedia/pt/0/0e/Elis_%26_Tom.jpg"));

        playlistRepository.saveAll(List.of(
                new Playlist(null, "Rock Clássico", "Os maiores hinos do rock",
                        stairway.getCapaUrl(), new ArrayList<>(List.of(stairway, bohemian))),
                new Playlist(null, "Pop Hits", "Sucessos que marcaram gerações",
                        billieJean.getCapaUrl(), new ArrayList<>(List.of(billieJean, blindingLights))),
                new Playlist(null, "MPB & Bossa Nova", "O melhor da música brasileira",
                        garotaDeIpanema.getCapaUrl(), new ArrayList<>(List.of(garotaDeIpanema, aguasDeMarco)))
        ));
    }
}
