package clases;

public class Cliente {

    private double idcliente;
    private double cantMinutosConsumidos;
    private double cantNumerosFree;
    private Plan plan;

    public double getCantMinutosConsumidos() {
        return cantMinutosConsumidos;
    }

    public Plan getPlan() {
        return plan;
    }

    public double getCantNumerosFree() {
        return cantNumerosFree;
    }


    public double getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(double idcliente) {
        this.idcliente = idcliente;
    }

    public void setCantMinutosConsumidos(double cantMinutosConsumidos) {
        this.cantMinutosConsumidos = cantMinutosConsumidos;
    }

    public void setCantNumerosFree(double cantNumerosFree) {
        this.cantNumerosFree = cantNumerosFree;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public void aumentarNrofree(double cantidad) {
        this.cantNumerosFree = this.cantNumerosFree + cantidad;
    }

    public double montoafacturar(Plan plan) {
        return plan.gasto(this); //Aca le paso el mismo objeto sobre el que trabajo
        //Osea este cliente
    }

}
