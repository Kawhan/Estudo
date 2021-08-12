package Faculdade.atividade;

import java.util.Objects;

public class AtrativoTuristico implements Comparable <AtrativoTuristico>  {
    private String nome;
    private double latitude;
    private double longitude;
    private String comoChegar;
    private String cidade;
    private String estado;

    public AtrativoTuristico(String nome, double latitude, double longitude, String comoChegar, String cidade, String estado) {
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
        this.comoChegar = comoChegar;
        this.cidade = cidade;
        this.estado = estado;
    }

    public AtrativoTuristico(){
        this("",0.0,0.0,"","","");
    }

    public String getNome (){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCoordenadas(double latitude, double longitude){
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public String getComoChegar() {
        return this.comoChegar;
    }

    public void setComoChegar(String comoChegar){
        this.comoChegar = comoChegar;
    }

    public String getCidade(){
        return this.cidade;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public String getEstado (){
        return this.estado;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "AtrativoTuristico{" +
                "nome='" + nome + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", comoChegar='" + comoChegar + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AtrativoTuristico)) return false;
        AtrativoTuristico that = (AtrativoTuristico) o;
        return Double.compare(that.getLatitude(), getLatitude()) == 0 && Double.compare(that.getLongitude(), getLongitude()) == 0 && getNome().equals(that.getNome()) && getComoChegar().equals(that.getComoChegar()) && getCidade().equals(that.getCidade()) && getEstado().equals(that.getEstado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getLatitude(), getLongitude(), getComoChegar(), getCidade(), getEstado());
    }


    @Override
    public int compareTo(AtrativoTuristico o) {
        if (this.nome.compareTo(o.getNome()) == 0){
            return 0;
        }
        else if(this.nome.compareTo(o.getNome()) < 0)  {
            return -1;
        }
        else {
            return 1;
        }
    }
}
