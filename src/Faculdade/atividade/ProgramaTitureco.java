package Faculdade.atividade;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ProgramaTitureco {

    public static void cadastraAtrativo(Titureco t) {
        boolean cadastrado = false;
        String Nome = JOptionPane.showInputDialog("Nome do atrativo: ");
        double Latitude = Double.parseDouble(JOptionPane.showInputDialog("Latidute:"));
        double Longitude = Double.parseDouble(JOptionPane.showInputDialog("Longitude:"));
        String ComoChegar = JOptionPane.showInputDialog("Como chegar:");
        String Cidade = JOptionPane.showInputDialog("Cidade:");
        String Estado = JOptionPane.showInputDialog("Estado:");
        String tipo_praia = JOptionPane.showInputDialog("O atrativo é do tipo PRAIA? [Sim(S)/Não(N)]");
        if(tipo_praia.equalsIgnoreCase("S")) {
            boolean banho = false;
            String propriaParaBanho = JOptionPane.showInputDialog("Própria para banho: [Sim(S)/Não(N)]");
            if(propriaParaBanho.equalsIgnoreCase("S")) {
                banho = true;
            }
            boolean tubarao = false;
            String perigoTubarao = JOptionPane.showInputDialog("Perigo contra tubarão: [Sim(S)/Não(N)]");
            if(perigoTubarao.equalsIgnoreCase("S")) {
                tubarao = true;
            }
            int tipoAtrativo = Integer.parseInt(JOptionPane.showInputDialog("Qual o tipo de Orla?\n1.Ondas Médias.\n2.Ondas Fortes."));
            switch(tipoAtrativo) {
                case 1:
                    t.cadastrarAtrativos(new Praia(Nome,Latitude,Longitude,ComoChegar,Cidade,Estado, banho, tubarao, Praia.TIPO_ONDAS_MEDIAS));
                    break;
                case 2:
                    t.cadastrarAtrativos(new Praia(Nome,Latitude,Longitude,ComoChegar,Cidade,Estado, banho, tubarao, Praia.TIPO_ONDAS_FORTES));
                    break;
            }
            cadastrado = true;
        } else if(tipo_praia.equalsIgnoreCase("N")) {
            t.cadastrarAtrativos(new AtrativoTuristico(Nome,Latitude,Longitude,ComoChegar,Cidade,Estado));
            cadastrado = true;
        }
        if(cadastrado) {
            JOptionPane.showMessageDialog(null,"Atrativo cadastrado com sucesso.");
        } else {
            JOptionPane.showMessageDialog(null,"Não foi possivel realizar o cadastro. Tente novamente.");
        }
    }

    public static void pesquisaAtrativos(Titureco t) {
        String pesquisa_Cidade = JOptionPane.showInputDialog("Cidade:");
        String pesquisa_Estado = JOptionPane.showInputDialog("Estado:");
        List<AtrativoTuristico> titurescos = t.pesquisaAtrativosDaCidade(pesquisa_Cidade, pesquisa_Estado);
        if(titurescos.size() == 0) {
            JOptionPane.showMessageDialog(null, "Atrativo não encontrado. Tente novamente.");
        } else {
            for(AtrativoTuristico a: titurescos) {
                JOptionPane.showMessageDialog(null, a.toString());
            }
        }
    }

    public static void apagaAtrativo(Titureco t) {
        String dltNome = JOptionPane.showInputDialog("Nome:");
        String dltCidade = JOptionPane.showInputDialog("Cidade:");
        String dltEstado = JOptionPane.showInputDialog("Estado:");
        boolean deletado = t.apagarAtrativo(dltNome, dltCidade, dltEstado);
        if(deletado) {
            JOptionPane.showMessageDialog(null,"Atrativo apagado com sucesso.");
        } else {
            JOptionPane.showMessageDialog(null,"Informações não encontrados para a exclusão do atrativo.");
        }
    }

    public static void listaAtrativos(Titureco t) {
        List<AtrativoTuristico> at = t.getAtrativos();
        if(at.size() == 0) {
            JOptionPane.showMessageDialog(null, "Nenhum atrativo cadastrado.");
        } else {
            JOptionPane.showMessageDialog(null, "LISTA DE ATRATIVOS");
            for(AtrativoTuristico a: at) {
                JOptionPane.showMessageDialog(null, a.toString());
            }
        }
    }
    public static void main (String[] args) {
        List<AtrativoTuristico> atrativos = new ArrayList<>();
        Titureco t = new Titureco(atrativos);
        boolean acabou = false;

        while(!acabou) {
            int opcoes = Integer.parseInt(JOptionPane.showInputDialog("1.Cadastrar Atrativo.\n" +
                    "2.Pesquisar Atrativos da Cidade.\n3.Listar Todos os Atrativos.\n4.Apagar Atrativo.\n5.Sair."));
            switch(opcoes) {
                case 1:
                    cadastraAtrativo(t);
                    break;
                case 2:
                    pesquisaAtrativos(t);
                    break;
                case 3:
                    listaAtrativos(t);
                    break;
                case 4:
                    apagaAtrativo(t);
                    break;
                case 5:
                    acabou = true;
                    JOptionPane.showMessageDialog(null, "FIM DO PROGRAMA");
            }
        }
    }
}