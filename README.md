# Truck-In

Truck-in é um sistema web criado para auxiliar tanto o motorista de caminhão durante suas viagens quanto fornecer maior visibilidade e controle de sua jornada trabalhista à empresa, que é capaz de enxergar com mais clareza onde se encontra o motorista e que horas ele irá fazer suas pausas.

O sistema consiste em uma API desenvolvida usando Java spring-boot com banco de dados PostgreSQL e um website desenvolvido utilizando HTML, CSS e JavaScript.

## Como funciona?

O sistema é dividido em duas partes: a parte do administrador da empresa e a parte do motorista.  É necessário existir pelo menos um usuário administrador da empresa registrado, que será responsável por iniciar o cadastro de motoristas e caminhões.

Um ou mais administradores da empresa cadastram motoristas, caminhões e pacotes a serem entregues. Os motoristas possuem jornadas de trabalho, em que são guardados os dados de onde o pacote saiu, para onde vai, horários de pausa para descanso e horários não trabalhando.

Afora estas duas partes, o sistema possui uma _landing page_ e uma tela de _login_:

![Landing page](https://github.com/DanVargaa/Truck-in/blob/sprint_3/readme-assets/telaPrincipal.gif)

![Tela de login](https://github.com/DanVargaa/Truck-in/blob/sprint_final/readme-assets/telaLogin.png)

---

### Recursos do Administrador

#### Menu do Administrador

O menu é o lugar onde o administrador encontra uma lista com todas as ações que ele pode executar no sistema.

![Menu do administrador](https://github.com/DanVargaa/Truck-in/blob/sprint_final/readme-assets/telaADM.png)

#### Cadastrar Motorista

Novos caminhoneiros são registrados a partir da tela de cadastro de motorista. Os dados necessários para se registrar um novo motorista são: nome, sobrenome, telefone, CPF, CNH, endereço, data em que iniciou na empresa e senha.

É possível pesquisar os motoristas cadastrados pela tela de pesquisa de motoristas.

![Cadastro de motorista](https://github.com/DanVargaa/Truck-in/blob/sprint_final/readme-assets/cadMot.png)

#### Pesquisar Motoristas

Nesta tela os administradores podem encontrar os motoristas previamente cadastrados.

![Pesquisar motorista](https://github.com/DanVargaa/Truck-in/blob/sprint_final/readme-assets/listaUsuarios.png)

![Resultado de pesquisa por motorista](https://github.com/DanVargaa/Truck-in/blob/sprint_final/readme-assets/telaPesqUsuario.gif)

#### Cadastrar Caminhão

Novos caminhões são cadastrados nesta tela. Para se registrar um caminhão, são necessários: placa do caminhão, montadora, modelo, categoria e seu histórico de manutenções.

É possível pesquisar os caminhões cadastrados pela tela de pesquisa de caminhões.

![Cadastro de caminhão](https://github.com/DanVargaa/Truck-in/blob/sprint_final/readme-assets/cadCam.png)

#### Pesquisar Caminhões

Nesta tela os administradores podem encontrar os caminhões previamente cadastrados.

![Pesquisa por caminhão](https://github.com/DanVargaa/Truck-in/blob/sprint_final/readme-assets/listaVeiculos.png)

![Resultado de pesquisa por caminhão](https://github.com/DanVargaa/Truck-in/blob/sprint_final/readme-assets/telaPesqVeiculo.gif)

#### Cadastrar Pacote

Um pacote é uma unidade que deve ser transportada pelo caminhoneiro de um ponto de origem até um destino. Para cadastrar um pacote, são necessários: título do pacote, cliente, descrição do pacote, ponto de partida e ponto de chegada. Ao ser transportado, ele será relacionado ao motorista responsável pela entrega.

![Cadastro de pacote](https://github.com/DanVargaa/Truck-in/blob/sprint_final/readme-assets/cadPacote.png)

#### Listagem de Pacotes

Nesta tela os administradores podem encontrar os pacotes previamente cadastrados.

![Listagem de pacotes](https://github.com/DanVargaa/Truck-in/blob/sprint_final/readme-assets/listaPacotes.png)

#### Cadastrar Administrador

Um administrador pode também cadastrar outros administadores para dividir e executar as tarefas de gerenciamento.

![Cadastro de administrador](https://github.com/DanVargaa/Truck-in/blob/sprint_final/readme-assets/cadAdm.png)

#### Cadastrar Jornada de Trabalho

Uma jornada de trabalho é a ação de um motorista, utilizando um veículo, coletar determinados pacotes e levá-los até seus destinos. Aqui são inclusos os horários de pausa para descanso e também horários fora da jornada de trabalho.

![Cadastro de jornada de trabalho](https://github.com/DanVargaa/Truck-in/blob/sprint_final/readme-assets/cadTrabalho.png)

---

### Recursos do Motorista

#### Menu do Motorista

O menu é o lugar onde o motorista encontra uma lista com todas as ações que ele pode executar no sistema.

![Menu do motorista](https://github.com/DanVargaa/Truck-in/blob/sprint_final/readme-assets/menuUsu%C3%A1rio.png)

#### Histórico de Jornadas de Trabalho

TODO

![Histórico de jornadas de trabalho](https://github.com/DanVargaa/Truck-in/blob/sprint_final/readme-assets/historicoTrabalho.png)

#### Sessão de Trabalho

TODO

![Sessão de trabalho](https://github.com/DanVargaa/Truck-in/blob/sprint_final/readme-assets/listaTrabalho.png)

#### Visualização de Perfil

Nesta tela o motorista pode visualizar seus próprios dados, como nome, endereço, etc.

![Visualização de perfil do motorista](https://github.com/DanVargaa/Truck-in/blob/sprint_final/readme-assets/telaPerfil.png)

#### Resumo do Mês

TODO

![Resumo do mês](https://github.com/DanVargaa/Truck-in/blob/sprint_final/readme-assets/resumoMes.png)

# Exibição dos Códigos

## Funcionamento do Log e do Login

![Capture20](https://github.com/DanVargaa/Truck-in/blob/sprint_final/readme-assets/Log-Login.png)

