package estudoDeCaso;

public final class HourlyWorker extends Employee {

    private double salario;
    private double horas;

    public HourlyWorker(String firstName, String lastName, Double salarioPorHora, Double horasTrabalhadas) {

        super(firstName, lastName);
        setSalario(salarioPorHora);
        setHoras(horasTrabalhadas);
    }

    public void setSalario(Double salarioPorHora) {
        salario = (salarioPorHora > 0 ? salarioPorHora : 0);
    }

    public void setHoras(Double horasTrabalhadas) {
        horas = (horasTrabalhadas > 0 ? horasTrabalhadas : 0);
    }

    public double earning() {
        return salario * horas;
    }

    public String toString() {
        return "Hourly worker: " + super.toString();
    }
}
