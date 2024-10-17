public class SessaoNetflix {
    // Atributos
    private String nomeUsuario;
    private String nomeFilme;
    private static int usuariosAtivos = 0; // Inicialização de variável estática

    // Construtor
    public SessaoNetflix(String nomeUsuario, String nomeFilme) {
        this.nomeUsuario = nomeUsuario;
        this.nomeFilme = nomeFilme;
        usuariosAtivos++; // Incrementa o número de usuários ativos
    }

    // Método para obter o nome do usuário
    public String getUsuario() {
        return nomeUsuario;
    }

    // Método para obter o nome do filme
    public String getFilme() {
        return nomeFilme;
    }

    // Método para encerrar a sessão
    public void fimSessao() {
        System.out.println(nomeUsuario + " encerrou a sessão.");
        usuariosAtivos--; // Decrementa o número de usuários ativos
    }

    // Método estático para obter o número de usuários ativos
    public static int getUsuariosAtivos() {
        return usuariosAtivos;
    }

    // Método para alterar o filme que o usuário está assistindo
    public void novoFilme(String novoF) {
        this.nomeFilme = novoF;
        System.out.println(nomeUsuario + " agora está assistindo " + novoF + ".");
    }

    // Método para exibir informações da sessão
    public void informacoes() {
        System.out.println("Usuário: " + nomeUsuario + " | Filme: " + nomeFilme + ".");
    }

    // Método principal para teste
    public static void main(String[] args) {
        // Criando sessões de usuários
        SessaoNetflix sessao01 = new SessaoNetflix("Felipe", "The Witcher");
        SessaoNetflix sessao02 = new SessaoNetflix("Ana Julia", "Stranger Things");
        SessaoNetflix sessao03 = new SessaoNetflix("Otavio", "Avatar");

        // Exibindo informações das sessões
        sessao01.informacoes();
        sessao02.informacoes();
        sessao03.informacoes();

        // Exibindo número de usuários ativos
        System.out.println("Usuários ativos: " + SessaoNetflix.getUsuariosAtivos());

        // Alterando o filme que Ana Julia está assistindo
        sessao02.novoFilme("Mea Culpa");

        // Encerrando a sessão de Felipe
        sessao01.fimSessao();

        // Exibindo número atualizado de usuários ativos
        System.out.println("Usuários ativos: " + SessaoNetflix.getUsuariosAtivos());
    }
}
