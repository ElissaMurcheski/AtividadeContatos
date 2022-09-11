package atividadecontatos;

import java.util.ArrayList;
import java.util.List;

public class Contatos {

    private String nome;
    private String telefone;
    private String email;
    private String redesSociais;
    private String observacao;

    public Contatos(String nome, String telefone, String email, String redesSociais, String observacao) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.redesSociais = redesSociais;
        this.observacao = observacao;
    }

    public Contatos() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRedesSociais() {
        return redesSociais;
    }

    public void setRedesSociais(String redesSociais) {
        this.redesSociais = redesSociais;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public List<Contatos> buscarNome(List<Contatos> contatos, String nome) {
        List<Contatos> nomesEncontrados = new ArrayList<Contatos>();
        for (int i = 0; i < contatos.size(); i++) {
            Contatos contato = contatos.get(i);
            if (contato.nome.equalsIgnoreCase(nome)) {
                nomesEncontrados.add(contato);
            }
        }
        return nomesEncontrados;
    }

    public List<Contatos> buscarTelefone(List<Contatos> contatos, String telefone) {
        List<Contatos> telefonesEncontrados = new ArrayList<Contatos>();
        for (int i = 0; i < contatos.size(); i++) {
            Contatos contato = contatos.get(i);
            if (contato.telefone.equalsIgnoreCase(telefone)) {
                telefonesEncontrados.add(contato);
            }
        }
        return telefonesEncontrados;
    }

    public List<Contatos> buscarEmail(List<Contatos> contatos, String email) {
        List<Contatos> emailsEncontrados = new ArrayList<Contatos>();
        for (int i = 0; i < contatos.size(); i++) {
            Contatos contato = contatos.get(i);
            if (contato.email.equalsIgnoreCase(email)) {
                emailsEncontrados.add(contato);
            }
        }
        return emailsEncontrados;
    }

    public List<Contatos> buscarRedesSocias(List<Contatos> contatos, String redesSocias) {
        List<Contatos> redesSociasEncontrados = new ArrayList<Contatos>();
        for (int i = 0; i < contatos.size(); i++) {
            Contatos contato = contatos.get(i);
            if (contato.redesSociais.equalsIgnoreCase(redesSocias)) {
                redesSociasEncontrados.add(contato);
            }
        }
        return redesSociasEncontrados;
    }

    public List<Contatos> buscarObservacao(List<Contatos> contatos, String observacao) {
        List<Contatos> observacoesEncontrados = new ArrayList<Contatos>();
        for (int i = 0; i < contatos.size(); i++) {
            Contatos contato = contatos.get(i);
            if (contato.observacao.equalsIgnoreCase(observacao)) {
                observacoesEncontrados.add(contato);
            }
        }
        return observacoesEncontrados;
    }
}
