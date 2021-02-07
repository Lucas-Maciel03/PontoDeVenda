package Model;

public class Venda {
    private Produto produ;
    private Caixa caixa;
    private float troco;
    private float quantidade;
    private float valortotal;
    private float valorpago;
    
    public Venda(){
    produ= new Produto();
    caixa = new Caixa();
   
    }

    public float getTroco() {
        return troco;
    }
    public void setTroco(float troco) {
        this.troco = troco;
    }

    public float getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    public float getValortotal() {
        return valortotal;
    }
    public void setValortotal(float valortotal) {
        this.valortotal = valortotal;
    }

    public float getValorpago() {
        return valorpago;
    }

    public void setValorpago(float valorpago) {
        this.valorpago = valorpago;
    }
    

}//fim da class
