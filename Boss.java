package estudoDeCaso;

public final class Boss extends Employee {

    private double salarioSemanal;

    public Boss(String firstName, String lastName, Double salario) {
        super(firstName, lastName);
        setSalarioSemanal(salario);

    }

    public void setSalarioSemanal(double salario) {
        salarioSemanal = (salario > 0 ? salario : 0);
        // acima '?'= a um if se true = 1 parametro se false segundo parametro
    }

    public double earning() {
        return salarioSemanal;
    }

    public String toString() {
        return "Boss: " + super.toString();
    }

}
