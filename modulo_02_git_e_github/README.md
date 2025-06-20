# Módulo 2 - Git e GitHub: Anotações e Resumo de Aula

## Principais Comandos Git
- `git init`: Inicia um repositório Git na pasta atual.
- `git status`: Mostra o estado atual dos arquivos monitorados.
- `git add .` ou `git add <arquivo>`: Adiciona arquivos ao staging (pronto para commit).
- `git commit -m "mensagem"`: Salva as alterações com uma descrição.
- `git log`: Mostra o histórico de commits.
- `git diff`: Compara mudanças feitas nos arquivos.

## GitHub
- Plataforma de hospedagem de código e colaboração.
- Permite versionamento de projetos, controle de acesso, issues, pull requests etc.
- Integra com Git para salvar e compartilhar repositórios remotamente.

## Commits
- São pontos de salvamento no histórico do projeto.
- Representam o que foi alterado e por que foi alterado.
- Cada commit deve ter uma mensagem clara e objetiva.

## Resolvendo Conflitos
- Conflitos surgem quando duas pessoas editam a mesma linha de um arquivo.
- O Git marca as áreas com conflito com `<<<<<<<`, `=======`, `>>>>>>>`.
- O desenvolvedor precisa editar manualmente, salvar e depois rodar:
- git add .
- git commit

## Branches
- São linhas paralelas de desenvolvimento.
- Comandos principais:
- `git branch`: Lista as branches.
- `git branch nome-da-branch`: Cria uma nova branch.
- `git checkout nome-da-branch`: Troca de branch.
- `git merge nome-da-branch`: Junta uma branch na atual.
- Usadas para testar, desenvolver novas features ou corrigir bugs sem afetar o código principal.

## Trabalhando com Repositório Remoto
- `git remote add origin <URL>`: Conecta o repositório local com o remoto.
- `git push origin main`: Envia os commits locais para o GitHub.
- `git pull origin main`: Traz alterações do GitHub para sua máquina.
- `git clone <URL>`: Baixa um repositório existente do GitHub.

## Forks
- Usado para copiar um projeto de outra pessoa para sua conta GitHub.
- Muito usado para contribuir com projetos open source.
- Cria uma cópia independente do repositório original.

## Pull Requests (PR)
- Usado para propor alterações em repositórios.
- Exemplo: Após fazer um fork e uma mudança, você cria um PR para que o autor avalie e, se quiser, integre sua mudança ao projeto principal.
- Processo típico de colaboração em equipe.

