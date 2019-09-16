package clases;

public class Basico implements Plan{
    public double gasto(Cliente cliente) {
        return 30+cliente.getCantMinutosConsumidos()*valorMinuto; //Un peso el minuto
    }
}
