package entities;
public class Mesa {
    private Integer idMesa;
    private String nomeMesa;
    private Integer qtdMesa;

    public Mesa(Integer idMesa, String nomeMesa, Integer qtdMesa) {
        this.idMesa = idMesa;
        this.nomeMesa = nomeMesa;
        this.qtdMesa = qtdMesa;
    }

    public Integer getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(Integer idMesa) {
        this.idMesa = idMesa;
    }

    public String getNomeMesa() {
        return nomeMesa;
    }

    public void setNomeMesa(String nomeMesa) {
        this.nomeMesa = nomeMesa;
    }

    public Integer getQtdMesa() {
        return qtdMesa;
    }

    public void setQtdMesa(Integer qtdMesa) {
        this.qtdMesa = qtdMesa;
    }
}