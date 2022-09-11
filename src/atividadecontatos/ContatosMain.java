package atividadecontatos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ContatosMain {

    public static void main(String[] args) {
        String nome = "";
        String telefone;
        String email;
        String redesSociais;
        String observacao;
        String busca;

        List<Contatos> listaContatos = new ArrayList<Contatos>();
        nome = JOptionPane.showInputDialog("Digite seu Nome: ");

        while (!nome.equalsIgnoreCase("Fim")) {

            telefone = JOptionPane.showInputDialog("Digite seu Telefone: ");
            email = JOptionPane.showInputDialog("Digite seu Email: ");
            redesSociais = JOptionPane.showInputDialog("Digite suas Redes Sociais: ");
            observacao = JOptionPane.showInputDialog("Digite uma Observação: ");

            Contatos objContato = new Contatos(nome, telefone, email, redesSociais, observacao);
            listaContatos.add(objContato);

            nome = JOptionPane.showInputDialog("Digite seu Nome: ");
        }

        Contatos contato = new Contatos();
        busca = JOptionPane.showInputDialog("Digite o contato que deseja buscar: ");
        List<Contatos> nomeEncontrados = contato.buscarNome(listaContatos, busca);
        List<Contatos> telefonesEncontrados = contato.buscarTelefone(listaContatos, busca);
        List<Contatos> emailEncontrados = contato.buscarEmail(listaContatos, busca);
        List<Contatos> redesSociaisEncontrados = contato.buscarRedesSocias(listaContatos, busca);
        List<Contatos> observacoesEncontrados = contato.buscarObservacao(listaContatos, busca);
        
        if (!nomeEncontrados.isEmpty()) {
            JOptionPane.showMessageDialog(null, mostrarResultado(nomeEncontrados));
        } else if (!telefonesEncontrados.isEmpty()) {
            JOptionPane.showMessageDialog(null, mostrarResultado(telefonesEncontrados));
        }
         else if (!emailEncontrados.isEmpty()) {
            JOptionPane.showMessageDialog(null, mostrarResultado(emailEncontrados));
        }
         else if (!redesSociaisEncontrados.isEmpty()) {
            JOptionPane.showMessageDialog(null, mostrarResultado(redesSociaisEncontrados));
        }
         else if (!observacoesEncontrados.isEmpty()) {
            JOptionPane.showMessageDialog(null, mostrarResultado(observacoesEncontrados));
        }

    }

    public static String mostrarResultado(List<Contatos> encontrados) {
        String message = "";
        for (Contatos contato : encontrados) {
            message
                    += "\nNome: " + contato.getNome()
                    + "\nTelefone: " + contato.getTelefone()
                    + "\nE-mail: " + contato.getEmail()
                    + "\nRedes sociais: " + contato.getRedesSociais()
                    + "\nObservação: " + contato.getObservacao()
                    + "\n----------//----------";
        }
        return message;
    }

}
