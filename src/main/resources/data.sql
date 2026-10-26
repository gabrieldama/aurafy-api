INSERT INTO musica (id, titulo, artista, album, duracao_segundos, capa_url) VALUES
(1, 'Monster', 'Skillet', 'Awake', 178, 'https://is1-ssl.mzstatic.com/image/thumb/Music114/v4/cf/80/5c/cf805cc3-de50-fbcb-91ea-74ff14ab3d44/mzi.xxrsyfim.jpg/600x600bb.jpg'),
(2, 'Numb', 'Linkin Park', 'Meteora', 187, 'https://is1-ssl.mzstatic.com/image/thumb/Music115/v4/13/44/05/134405bd-9e27-a678-8953-b5f724201f95/093624948988.jpg/600x600bb.jpg'),
(3, 'In the End', 'Linkin Park', 'Hybrid Theory', 216, 'https://is1-ssl.mzstatic.com/image/thumb/Music115/v4/53/a7/7f/53a77fab-c54c-a57b-8130-248fc12d0c80/093624948995.jpg/600x600bb.jpg'),
(4, 'I Hate Everything About You', 'Three Days Grace', 'Three Days Grace', 231, 'https://is1-ssl.mzstatic.com/image/thumb/Music211/v4/bb/b9/93/bbb9937d-8afd-69e2-c8f7-d9a1f20c0497/828765347921.jpg/600x600bb.jpg'),
(5, 'Fallen Angel', 'Three Days Grace', 'Human', 186, 'https://is1-ssl.mzstatic.com/image/thumb/Music211/v4/d2/75/5d/d2755d0a-aeb4-1f8e-900f-1b8027a1e488/886444692298.jpg/600x600bb.jpg'),
(6, 'Bring Me to Life', 'Evanescence', 'Fallen', 237, 'https://is1-ssl.mzstatic.com/image/thumb/Music221/v4/52/49/1a/52491ac9-cef8-4a6a-1a16-a1c01ad44abc/14CMGIM00930.rgb.jpg/600x600bb.jpg'),
(7, 'Going Under', 'Evanescence', 'Fallen', 214, 'https://is1-ssl.mzstatic.com/image/thumb/Music221/v4/52/49/1a/52491ac9-cef8-4a6a-1a16-a1c01ad44abc/14CMGIM00930.rgb.jpg/600x600bb.jpg'),
(8, 'Call Me When You''re Sober', 'Evanescence', 'The Open Door', 214, 'https://is1-ssl.mzstatic.com/image/thumb/Music124/v4/72/62/7e/72627ec6-772c-7229-6cc4-6ded693506fd/00601501412004.rgb.jpg/600x600bb.jpg'),
(9, 'Without Me', 'Eminem', 'The Eminem Show', 290, 'https://is1-ssl.mzstatic.com/image/thumb/Music112/v4/c9/02/cd/c902cdef-e179-5b70-8142-112a2abe7f27/22UMGIM49875.rgb.jpg/600x600bb.jpg'),
(10, 'Lose Yourself', 'Eminem', '8 Mile', 321, 'https://is1-ssl.mzstatic.com/image/thumb/Music125/v4/08/23/fc/0823fcd9-cb44-695b-32bf-b3bf51d9f800/00606949351229.rgb.jpg/600x600bb.jpg'),
(11, 'Burn the Witch', 'Radiohead', 'A Moon Shaped Pool', 220, 'https://is1-ssl.mzstatic.com/image/thumb/Music124/v4/b7/f2/5d/b7f25d91-4320-47c8-146a-6f84d5bc7e78/cover.jpg/600x600bb.jpg');

INSERT INTO playlist (id, nome, descricao, capa_url) VALUES
(1, 'Treino Pesado', 'Playlist para treino e academia', 'https://is1-ssl.mzstatic.com/image/thumb/Music221/v4/52/49/1a/52491ac9-cef8-4a6a-1a16-a1c01ad44abc/14CMGIM00930.rgb.jpg/600x600bb.jpg'),
(2, 'Rock Anos 2000', 'Os hinos do rock dos anos 2000', 'https://is1-ssl.mzstatic.com/image/thumb/Music115/v4/53/a7/7f/53a77fab-c54c-a57b-8130-248fc12d0c80/093624948995.jpg/600x600bb.jpg'),
(3, 'Rap Clássico', 'O melhor do rap para ouvir no volume máximo', 'https://is1-ssl.mzstatic.com/image/thumb/Music112/v4/c9/02/cd/c902cdef-e179-5b70-8142-112a2abe7f27/22UMGIM49875.rgb.jpg/600x600bb.jpg'),
(4, 'Alternativo', 'Para ouvir com calma', 'https://is1-ssl.mzstatic.com/image/thumb/Music124/v4/b7/f2/5d/b7f25d91-4320-47c8-146a-6f84d5bc7e78/cover.jpg/600x600bb.jpg');

INSERT INTO playlist_musica (playlist_id, musicas_id) VALUES
(1, 5), (1, 2), (1, 6), (1, 7), (1, 1),
(2, 3), (2, 2), (2, 4), (2, 8),
(3, 9), (3, 10),
(4, 11), (4, 7), (4, 4);
