public class iPhone implements ReprodutorMusica, Telefone, Internet  {
    @Override
    public void tocarMusica() {
        System.out.println("Tocando música.");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada.");
    }

    @Override
    public void chamada() {
        System.out.println("Chamada iniciada.");
    }

    @Override
    public void responderChamada() {
        System.out.println("Chamada atendida.");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    @Override
    public void mostrarPagina() {
        System.out.println("Exibindo página da internet.");
    }

    @Override
    public void addNovaPagina() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
}
