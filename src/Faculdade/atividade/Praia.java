package Faculdade.atividade;

public class Praia extends AtrativoTuristico {
    private boolean propriaParaBanho;
    private boolean perigoTubarao;
    private String tipoOrla;

    public static final String TIPO_PISCINA_NATURAIS = "Piscina Naturais";
    public static final String TIPO_ONDAS_FORTES = "Ondas Fortes";
    public static final String TIPO_ONDAS_MEDIAS = "Ondas Médias";

    public Praia(String nome, double latitude, double longitude, String comoChegar, String cidade, String estado, boolean propriaParaBanho, boolean perigoTubarao, String tipoOrla) {
        super(nome, latitude, longitude, comoChegar, cidade, estado);
        this.propriaParaBanho = propriaParaBanho;
        this.perigoTubarao = perigoTubarao;
        this.tipoOrla = tipoOrla;
    }

    public Praia (){
        this("",0.0,0.0,"","","",true,true,"");
    }

    public boolean ehPropriaParaBanho(){
        return this.propriaParaBanho;
    }

    public void setPropriaParaBanho(boolean propriaParaBanho) {
        this.propriaParaBanho = propriaParaBanho;
    }

    public boolean temPerigoTUbarao(){
        return this.perigoTubarao;
    }

    public void setPerigoTubarao(boolean perigoTubarao) {
        this.perigoTubarao = perigoTubarao;
    }

    public void setTipoOrla(String tipoOrla) {
        this.tipoOrla = tipoOrla;
    }

    public String getTipoOrla() {
        return this.tipoOrla;
    }
}
