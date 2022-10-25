public final class ComissionWorker extends Employee {

    private double salario;
    private double comissao;
    private int quantidadeItens;

    public ComissionWorker(String firstName, String lastName, double salario, double comissao, int quantidadeItens){
        super(firstName,lastName);
        setSalario(salario);
        setComissao(comissao);
        setQuantidadeItens(quantidadeItens);
    }
    
    public void setSalario(double salarioSemanal)
    {
        salario = (salarioSemanal > 0 ? salarioSemanal : 0);
    }

    public void setComissao(double itemComissao)
    {
        comissao = (itemComissao > 0 ? itemComissao : 0);
    }

    public void setQuantidadeItens(int totalVendido)
    {
        quantidadeItens = (totalVendido > 0 ? totalVendido : 0);
    }

    public double earning()
    {
        return salario + comissao * quantidadeItens;
    }

    public String toString()
    {
        return "comission worker: " + super.toString();
    }
}
