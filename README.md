# Projeto Api de Jogos - Auxiliar

Esse projeto foi desenvolvido para auxiliar o projeto primário da matéria de Desenvolvimento de Serviços Web e Testes com Java
no 2 semestre de 2025

## Teste da api
Para o teste dessa api foi criado um Workspace no Postman que pode ser acessado pelo seguinte link:
>[Link do Workspace](https://www.postman.com/isaacrodrigues-1576462/dr3-tp3)

## Observações

Feito com o apoio da api liberada pelo MMObomb
>[Link da api usada](https://www.mmobomb.com/api)

## Endpoints

### /jogo/{JogoNome}
Retorna a descrição completa do jogo para html de acordo com o nome passado, caso ache o jogo retornará um status 200
>/descricao/Tibia
```
{
    "title": "Tibia",
    "description": "<p style=\"text-align: justify;\"><strong>Tibia</strong> is a classic 2D medieval MMORPG created by CipSoft. Tibia can now be played in the browser, it is one of the oldest MMORPGs (released in January 1997) and was considered most noteworthy in its early years. For more than 10 years now, players have been visiting the world of Tibia. At present, more than 250,000 players from all over the  world inhabit the Tibian continent enjoying the numerous game features.</p>\r\n<p style=\"text-align: justify;\">It is a free to play game which is open to the public, though players  have the option to pay a fee in order to upgrade to a premium account,  granting special in-game benefits, including additional areas to  explore, access to vocation promotions, and extra spells.</p>\r\n<p style=\"text-align: justify;\">Gameplay  involves advancing levels while training to improve skill levels,  hunting monsters using weapons and magical spells, gathering treasure,  doing quests and exploring the Tibia world. Players interact with each  other in character for conversation, trade and group battles and partake  in guilds for more role-playing opportunities.</p>\r\n<p style=\"text-align: justify;\">On most of the game's  servers, players are also allowed to attack and kill each other,  although there is a system in place to keep hostile actions under  control called the skull system. Some servers do not allow such player  versus player combat at all, while others encourage it by rewarding  experience for kills.</p>"
}
```
Caso haja algum erro de digitação e não foi possível encontrar o jogo, devolverá um status 404
