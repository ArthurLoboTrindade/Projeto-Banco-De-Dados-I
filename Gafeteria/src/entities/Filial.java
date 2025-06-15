package entities;
public class Filial {
    private String idFilialCnpj;
    private String emailFilial;
    private String telFilial;

    public Filial(String idFilialCnpj, String emailFilial, String telFilial) {
        this.idFilialCnpj = idFilialCnpj;
        this.emailFilial = emailFilial;
        this.telFilial = telFilial;
    }

    public String getIdFilialCnpj() {
        return idFilialCnpj;
    }

    public void setIdFilialCnpj(String idFilialCnpj) {
        this.idFilialCnpj = idFilialCnpj;
    }

    public String getEmailFilial() {
        return emailFilial;
    }

    public void setEmailFilial(String emailFilial) {
        this.emailFilial = emailFilial;
    }

    public String getTelFilial() {
        return telFilial;
    }

    public void setTelFilial(String telFilial) {
        this.telFilial = telFilial;
    }
}