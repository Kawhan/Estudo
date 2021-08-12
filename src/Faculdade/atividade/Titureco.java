package Faculdade.atividade;


import java.util.ArrayList;
import java.util.List;

public class Titureco {
    private List<AtrativoTuristico> atrativos;

    public Titureco(List<AtrativoTuristico> atrativos) {
        this.atrativos = atrativos;
    }

    public boolean cadastrarAtrativos (AtrativoTuristico atrativo) {
        if (this.atrativos.size() == 0){
            this.atrativos.add(atrativo);
            return true;
        }
        else {
            for(AtrativoTuristico atratas:this.atrativos){
                if (atratas.getNome().compareTo(atrativo.getNome()) != 0){
                    this.atrativos.add(atrativo);
                    return true;
                }
            }
        }
        return false;
    }

    public List<AtrativoTuristico> getAtrativos() {
        return this.atrativos;
    }

    public boolean apagarAtrativo(String nome, String cidade, String estado) {
        for(AtrativoTuristico atratas: atrativos) {
            if(atratas.getNome().compareTo(nome) == 0 && atratas.getCidade().compareTo(cidade) == 0 && atratas.getEstado().compareTo(estado) == 0) {
                atrativos.remove(atratas);
                return true;
            }
        }
        return false;
    }

    public List<AtrativoTuristico> pesquisaAtrativosDaCidade(String cidade, String estado) {
        List<AtrativoTuristico> listaPesquisa = new ArrayList<>();
        for(AtrativoTuristico atratas: atrativos) {
            if(atratas.getCidade().compareTo(cidade) == 0 && atratas.getEstado().compareTo(estado) == 0) {
                listaPesquisa.add(atratas);
            }
        }
        return  listaPesquisa;
    }
}
