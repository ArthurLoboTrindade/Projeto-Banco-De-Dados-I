package entities;
public class Atendente {
    private Integer idAtendente;
    private String nomeAtendente;
    private String idFilialCnpj;

    public Atendente(Integer idAtendente, String nomeAtendente, String idFilialCnpj) {
        this.idAtendente = idAtendente;
        this.nomeAtendente = nomeAtendente;
        this.idFilialCnpj = idFilialCnpj;
    }

    public Integer getIdAtendente() {
        return idAtendente;
    }

    public void setIdAtendente(int idAtendente) {
        this.idAtendente = idAtendente;
    }

    public String getNomeAtendente() {
        return nomeAtendente;
    }

    public void setNomeAtendente(String nomeAtendente) {
        this.nomeAtendente = nomeAtendente;
    }

    public String getIdFilialCnpj() {
        return idFilialCnpj;
    }

    public void setIdFilialCnpj(String idFilialCnpj) {
        this.idFilialCnpj = idFilialCnpj;
    }
}