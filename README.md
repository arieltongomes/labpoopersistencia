<div align="center">

💻 PROGRAMAÇÃO ORIENTADA A OBJETOS
📚 Repositório de estudos — POO

<img src="https://images.unsplash.com/photo-1498050108023-c5249f4df085?w=1200&h=350&fit=crop" width="100%" alt="Ambiente de programação"/>

UniAteneu | Centro Universitário

Professor: Arielton Gomes

!Java !POO !Git !GitHub

</div>

🎓 Sobre a disciplina

Este repositório foi criado para armazenar atividades, exercícios, projetos e conteúdos desenvolvidos durante as aulas de Programação Orientada a Objetos (POO), ministradas pelo professor Arielton Gomes, na faculdade UniAteneu.

O objetivo é desenvolver conhecimentos sobre os conceitos fundamentais da programação orientada a objetos, aplicando boas práticas e construindo soluções por meio do código.

🚀 O que estou aprendendo?
🧱 Classes e Objetos: estruturação e criação de objetos.
🔐 Encapsulamento: proteção e organização dos dados.
🧬 Herança: reutilização de código e especialização de classes.
🎭 Polimorfismo: diferentes comportamentos para uma mesma interface.
📦 Abstração: representação dos elementos essenciais de um sistema.
🛠️ Construtores e Métodos: criação e manipulação de objetos.
📂 Organização do repositório
text
📦 programacao-orientada-a-objetos
 ┣ 📂 aulas
 ┃ ┣ 📂 aula-01
 ┃ ┣ 📂 aula-02
 ┃ ┗ 📂 aula-03
 ┣ 📂 atividades
 ┣ 📂 exercicios
 ┣ 📂 projetos
 ┣ 📜 README.md
 ┗ 📜 LICENSE

💡 Conceito de POO

A Programação Orientada a Objetos é um paradigma de programação que organiza o desenvolvimento de software utilizando classes e objetos.

Ela permite criar aplicações mais organizadas, reutilizáveis, flexíveis e fáceis de manter.

Exemplo simples em Java
java
public class Pessoa {

    String nome;
    int idade;

    public void apresentar() {
        System.out.println("Olá! Meu nome é " + nome);
        System.out.println("Tenho " + idade + " anos.");
    }

    public static void main(String[] args) {

        Pessoa aluno = new Pessoa();

        aluno.nome = "Estudante";
        aluno.idade = 20;

        aluno.apresentar();
    }
}

🔥 Git e GitHub

<img src="https://images.unsplash.com/photo-1556075798-4825dfaaf498?w=1000&h=300&fit=crop" width="100%" alt="Desenvolvimento e versionamento"/>

O Git é um sistema de controle de versão utilizado para acompanhar alterações no código-fonte.

O GitHub é uma plataforma que permite hospedar repositórios Git, compartilhar projetos e colaborar com outros desenvolvedores.

📌 Principais comandos Git
1. Configuração inicial
bash
# Configurar nome
git config --global user.name "Seu Nome"

# Configurar e-mail
git config --global user.email "seuemail@email.com"

# Verificar configurações
git config --list

2. Criando um repositório
bash
# Inicializar um repositório
git init

# Clonar um repositório existente
git clone URL_DO_REPOSITORIO

# Verificar estado dos arquivos
git status

3. Salvando alterações
bash
# Adicionar um arquivo
git add arquivo.java

# Adicionar todos os arquivos modificados
git add .

# Criar um commit
git commit -m "feat: adiciona primeira atividade"

# Enviar alterações para o GitHub
git push

4. Atualizando o projeto
bash
# Buscar e integrar alterações remotas
git pull

# Buscar alterações sem integrar
git fetch

# Visualizar histórico de commits
git log

# Visualizar histórico resumido
git log --oneline

# Verificar diferenças
git diff

5. Trabalhando com branches
bash
# Listar branches
git branch

# Criar uma nova branch
git branch nome-da-branch

# Criar e acessar uma nova branch
git switch -c nome-da-branch

# Trocar de branch
git switch main

# Excluir uma branch local já integrada
git branch -d nome-da-branch

# Enviar uma nova branch para o GitHub
git push -u origin nome-da-branch

🌳 Git Flow

O Git Flow é um modelo de organização de branches que ajuda a estruturar o desenvolvimento de projetos.

📍 Estrutura de branches
Branch	Finalidade
main	Versão estável do projeto
develop	Integração das funcionalidades
feature/*	Desenvolvimento de novas funcionalidades
release/*	Preparação de uma versão
hotfix/*	Correção urgente em produção
🔄 Fluxo de desenvolvimento

<img src="https://images.unsplash.com/photo-1519389950473-47ba0277781c?w=1000&h=300&fit=crop" width="100%" alt="Equipe trabalhando em desenvolvimento"/>

1. Criar a branch develop
bash
git switch main

git switch -c develop

2. Criar uma feature
bash
git switch develop

git switch -c feature/cadastro-aluno

3. Desenvolver e salvar alterações
bash
git add .

git commit -m "feat: implementa cadastro de aluno"

4. Enviar a feature para o GitHub
bash
git push -u origin feature/cadastro-aluno

5. Integrar a feature na develop

Após revisar e aprovar a alteração, integrar a branch por Pull Request no GitHub ou localmente:

bash
git switch develop

git merge --no-ff feature/cadastro-aluno

6. Criar uma release
bash
git switch develop

git switch -c release/1.0.0


Após os ajustes e testes, integrar a release na main e na develop:

bash
git switch main

git merge --no-ff release/1.0.0

git tag -a v1.0.0 -m "Versão 1.0.0"

git switch develop

git merge --no-ff release/1.0.0

7. Corrigir problemas urgentes com hotfix
bash
git switch main

git switch -c hotfix/correcao-erro


Depois da correção:

bash
git add .

git commit -m "fix: corrige erro no sistema"

git switch main

git merge --no-ff hotfix/correcao-erro

git switch develop

git merge --no-ff hotfix/correcao-erro

📝 Padrão de mensagens de commit

Uma boa mensagem de commit explica de forma simples o que foi realizado.

Prefixo	Utilização
feat:	Nova funcionalidade
fix:	Correção de erro
docs:	Alteração na documentação
style:	Formatação e estilo
refactor:	Refatoração de código
test:	Criação ou alteração de testes
chore:	Tarefas de manutenção
Exemplos
bash
git commit -m "feat: cria classe Pessoa"

git commit -m "fix: corrige validação de idade"

git commit -m "docs: atualiza README"

git commit -m "refactor: organiza métodos da classe Aluno"

git commit -m "test: adiciona testes de cadastro"

⚡ Fluxo rápido para atividades acadêmicas

Para o desenvolvimento das atividades da faculdade, este pode ser um fluxo simples de trabalho:

bash
# 1. Atualizar o projeto
git pull origin main

# 2. Criar uma branch para a atividade
git switch -c feature/aula-01

# 3. Adicionar alterações
git add .

# 4. Criar commit
git commit -m "feat: adiciona atividade da aula 01"

# 5. Enviar para o GitHub
git push -u origin feature/aula-01

🛠️ Tecnologias e ferramentas

<div align="center">

<img src="https://skillicons.dev/icons?i=java,eclipse,vscode,git,github" alt="Tecnologias"/>

</div>

📖 Referências para estudo
Documentação oficial Java
Dev.java — Aprenda Java
Documentação oficial Git
GitHub Docs
Git Flow — Vincent Driessen

<div align="center">

🌟 Aprender, praticar e evoluir!

Faculdade: UniAteneu

Disciplina: Programação Orientada a Objetos

Professor: Arielton Gomes

<br/>

!Made with love

Cada commit representa mais um passo na evolução como desenvolvedor.

</div>
