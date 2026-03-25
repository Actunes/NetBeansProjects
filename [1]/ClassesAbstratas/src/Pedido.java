/**
 *
 * @author igor
 */
public class Pedido implements Recebe {
    private String codProduto;
    private String descricaoProduto;
    private double quantidade;
    private double precoItem;

    public Pedido(String cod, String desc, double quant, double preco) {
        this.codProduto = cod;
        this.descricaoProduto = desc;
        setQuantidade(quant); 
        setPrecoItem(preco); 
    }


    public String getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        if (quantidade < 0) {
            this.quantidade = 0;
        } else {
            this.quantidade = quantidade;
        }
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(double precoItem) {
        if (precoItem < 0) {
            this.precoItem = 0.0;
        } else {
            this.precoItem = precoItem;
        }
    }

    @Override
    public double getPagamento() {
        return this.quantidade * this.precoItem;
    }

    @Override
    public String toString() {
        return "\nCodigo: " + this.codProduto + 
               "\nDescricao: " + this.descricaoProduto + 
               "\nQuantidade: " + this.quantidade +
               "\nPreco: " + this.precoItem;
    }
}