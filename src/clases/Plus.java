package clases;

public class Plus implements Plan {
    public double gasto(Cliente cliente) {
        return 150+cliente.getCantNumerosFree()*5;
    }
}
