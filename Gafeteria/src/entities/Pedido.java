package entities;
import java.time.LocalDateTime;

public class Pedido {
    private Integer idPedido;
    private String descricaoPedido;
    private LocalDateTime datahoraPedido;
    private Integer idAtendente;
    private Integer idMesa;
    private Integer idConta;

    public Pedido(Integer idPedido, String descricaoPedido, LocalDateTime datahoraPedido, Integer idAtendente, Integer idMesa, Integer idConta) {
        this.idPedido = idPedido;
        this.descricaoPedido = descricaoPedido;
        this.datahoraPedido = datahoraPedido;
        this.idAtendente = idAtendente;
        this.idMesa = idMesa;
        this.idConta = idConta;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public String getDescricaoPedido() {
        return descricaoPedido;
    }

    public void setDescricaoPedido(String descricaoPedido) {
        this.descricaoPedido = descricaoPedido;
    }

    public LocalDateTime getDatahoraPedido() {
        return datahoraPedido;
    }

    public void setDatahoraPedido(LocalDateTime datahoraPedido) {
        this.datahoraPedido = datahoraPedido;
    }

    public Integer getIdAtendente() {
        return idAtendente;
    }

    public void setIdAtendente(Integer idAtendente) {
        this.idAtendente = idAtendente;
    }

    public Integer getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(Integer idMesa) {
        this.idMesa = idMesa;
    }

    public Integer getIdConta() {
        return idConta;
    }

    public void setIdConta(Integer idConta) {
        this.idConta = idConta;
    }
}