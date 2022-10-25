public final class PieceWorker extends Employee {

    private double valorPorItem;
    private int quantidadeItens;

    public PieceWorker(String firstName, String lastName, double valorPorItem, int quantidadeItens)
    {
        super(firstName,lastName);
        setValorPorItem(valorPorItem);
        setQuantidadeItens(quantidadeItens);
    }

    private void setQuantidadeItens(int numeroDeItens) 
    {
        quantidadeItens= (numeroDeItens > 0 ? numeroDeItens : 0);

    }

    public void setValorPorItem(double remuneracao)
    {
        valorPorItem=(remuneracao > 0 ? remuneracao : 0);
    }

    public double earning(){
        return quantidadeItens * valorPorItem;
    }

    public String toString(){
        return "piece worker: " + super.toString();
    }
}
