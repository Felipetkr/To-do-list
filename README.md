# To-Do List

## Descrição do projeto

Aplicação Android nativa para gerenciamento de tarefas. O usuário pode criar, visualizar, editar, concluir e excluir tarefas, além de definir uma data e horário de prazo para cada atividade.

As tarefas são armazenadas localmente no dispositivo e são atualizadas automaticamente na interface sempre que ocorre alguma alteração.

## Funcionalidades

- Criar novas tarefas
- Editar título, descrição, data e horário de uma tarefa
- Excluir tarefas
- Marcar tarefas como concluídas
- Visualizar tarefas concluídas com texto riscado
- Definir data e horário de prazo opcional
- Ordenar tarefas com prazo por proximidade
- Destacar visualmente tarefas atrasadas
- Persistir as tarefas localmente usando Room

## Tecnologias utilizadas

- **Kotlin** — linguagem utilizada no desenvolvimento do aplicativo
- **Jetpack Compose** — construção declarativa da interface
- **Room** — persistência local de dados com SQLite
- **KSP** — geração de código necessária para o Room
- **Coroutines e Flow** — operações assíncronas e atualização reativa dos dados
- **ViewModel** — gerenciamento do estado da interface
- **Navigation Compose** — navegação entre a lista e o formulário de tarefas
- **Material 3** — componentes visuais da interface

## Arquitetura

O projeto utiliza uma organização inspirada no padrão MVVM:

- **Tarefa**: entidade que representa uma tarefa no banco de dados.
- **TarefaDao**: define as operações de inserir, listar, atualizar e excluir tarefas.
- **TarefaDatabase**: configura e fornece acesso ao banco de dados Room.
- **TarefaRepository**: centraliza o acesso aos dados por meio do DAO.
- **TarefaViewModel**: gerencia o estado das tarefas e conecta a interface ao repositório.
- **ListaTarefasScreen**: exibe as tarefas, permite concluí-las, editá-las ou excluí-las.
- **FormularioTarefaScreen**: permite cadastrar e editar tarefas, incluindo prazo opcional.
- **AppNavigation**: controla a navegação entre as telas.
- **MainActivity**: ponto de entrada do aplicativo.

## Como executar o projeto

1. Clone ou baixe este repositório.
2. Abra o projeto no Android Studio.
3. Aguarde a sincronização do Gradle terminar.
4. Inicie um emulador Android ou conecte um dispositivo físico com API 24 ou superior.
5. Selecione o dispositivo desejado.
6. Clique em **Run** para compilar e executar o aplicativo.

## Testes

O projeto possui testes instrumentados para validar as operações do banco de dados, como inserção, atualização, exclusão e ordenação de tarefas por prazo.

Para executar os testes instrumentados, conecte um dispositivo ou inicie um emulador e execute:

```bash
./gradlew connectedDebugAndroidTest
```