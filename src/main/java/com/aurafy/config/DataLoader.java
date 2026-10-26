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

    private static final String CAPA_AWAKE = "https://is1-ssl.mzstatic.com/image/thumb/Music114/v4/cf/80/5c/cf805cc3-de50-fbcb-91ea-74ff14ab3d44/mzi.xxrsyfim.jpg/600x600bb.jpg";
    private static final String CAPA_METEORA = "https://is1-ssl.mzstatic.com/image/thumb/Music115/v4/13/44/05/134405bd-9e27-a678-8953-b5f724201f95/093624948988.jpg/600x600bb.jpg";
    private static final String CAPA_HYBRID_THEORY = "https://is1-ssl.mzstatic.com/image/thumb/Music115/v4/53/a7/7f/53a77fab-c54c-a57b-8130-248fc12d0c80/093624948995.jpg/600x600bb.jpg";
    private static final String CAPA_THREE_DAYS_GRACE = "https://is1-ssl.mzstatic.com/image/thumb/Music211/v4/bb/b9/93/bbb9937d-8afd-69e2-c8f7-d9a1f20c0497/828765347921.jpg/600x600bb.jpg";
    private static final String CAPA_HUMAN = "https://is1-ssl.mzstatic.com/image/thumb/Music211/v4/d2/75/5d/d2755d0a-aeb4-1f8e-900f-1b8027a1e488/886444692298.jpg/600x600bb.jpg";
    private static final String CAPA_FALLEN = "https://is1-ssl.mzstatic.com/image/thumb/Music221/v4/52/49/1a/52491ac9-cef8-4a6a-1a16-a1c01ad44abc/14CMGIM00930.rgb.jpg/600x600bb.jpg";
    private static final String CAPA_THE_OPEN_DOOR = "https://is1-ssl.mzstatic.com/image/thumb/Music124/v4/72/62/7e/72627ec6-772c-7229-6cc4-6ded693506fd/00601501412004.rgb.jpg/600x600bb.jpg";
    private static final String CAPA_EMINEM_SHOW = "https://is1-ssl.mzstatic.com/image/thumb/Music112/v4/c9/02/cd/c902cdef-e179-5b70-8142-112a2abe7f27/22UMGIM49875.rgb.jpg/600x600bb.jpg";
    private static final String CAPA_8_MILE = "https://is1-ssl.mzstatic.com/image/thumb/Music125/v4/08/23/fc/0823fcd9-cb44-695b-32bf-b3bf51d9f800/00606949351229.rgb.jpg/600x600bb.jpg";
    private static final String CAPA_MOON_SHAPED_POOL = "https://is1-ssl.mzstatic.com/image/thumb/Music124/v4/b7/f2/5d/b7f25d91-4320-47c8-146a-6f84d5bc7e78/cover.jpg/600x600bb.jpg";

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

        Musica monster = salvar("Monster", "Skillet", "Awake", 178, CAPA_AWAKE);
        Musica numb = salvar("Numb", "Linkin Park", "Meteora", 187, CAPA_METEORA);
        Musica inTheEnd = salvar("In the End", "Linkin Park", "Hybrid Theory", 216, CAPA_HYBRID_THEORY);
        Musica iHate = salvar("I Hate Everything About You", "Three Days Grace", "Three Days Grace", 231, CAPA_THREE_DAYS_GRACE);
        Musica fallenAngel = salvar("Fallen Angel", "Three Days Grace", "Human", 186, CAPA_HUMAN);
        Musica bringMeToLife = salvar("Bring Me to Life", "Evanescence", "Fallen", 237, CAPA_FALLEN);
        Musica goingUnder = salvar("Going Under", "Evanescence", "Fallen", 214, CAPA_FALLEN);
        Musica callMe = salvar("Call Me When You're Sober", "Evanescence", "The Open Door", 214, CAPA_THE_OPEN_DOOR);
        Musica withoutMe = salvar("Without Me", "Eminem", "The Eminem Show", 290, CAPA_EMINEM_SHOW);
        Musica loseYourself = salvar("Lose Yourself", "Eminem", "8 Mile", 321, CAPA_8_MILE);
        Musica burnTheWitch = salvar("Burn the Witch", "Radiohead", "A Moon Shaped Pool", 220, CAPA_MOON_SHAPED_POOL);

        playlistRepository.saveAll(List.of(
                new Playlist(null, "Treino Pesado", "Playlist para treino e academia", CAPA_FALLEN,
                        new ArrayList<>(List.of(fallenAngel, numb, bringMeToLife, goingUnder, monster))),
                new Playlist(null, "Rock Anos 2000", "Os hinos do rock dos anos 2000", CAPA_HYBRID_THEORY,
                        new ArrayList<>(List.of(inTheEnd, numb, iHate, callMe))),
                new Playlist(null, "Rap Clássico", "O melhor do rap para ouvir no volume máximo", CAPA_EMINEM_SHOW,
                        new ArrayList<>(List.of(withoutMe, loseYourself))),
                new Playlist(null, "Alternativo", "Para ouvir com calma", CAPA_MOON_SHAPED_POOL,
                        new ArrayList<>(List.of(burnTheWitch, goingUnder, iHate)))
        ));
    }

    private Musica salvar(String titulo, String artista, String album, int duracaoSegundos, String capaUrl) {
        return musicaRepository.save(new Musica(null, titulo, artista, album, duracaoSegundos, capaUrl));
    }
}
