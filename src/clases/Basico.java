package clases;

public class Basico implements Plan{
    public double gasto(Cliente cliente) {
        return 30+cliente.getCantMinutosConsumidos()*1; //Un peso el minuto
    }
}
