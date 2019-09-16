package clases;

import junit.framework.TestCase;

public class ClienteTest extends TestCase {
    Cliente lucas= new Cliente();
    Plan planbasico= new Basico();
    Plan planplus= new Plus();
    Plan plansuper= new Super();

    public void setUp() {
        lucas.setIdcliente(5);
        lucas.setCantMinutosConsumidos(120);
        lucas.setCantNumerosFree(3);
        lucas.setPlan(plansuper);

    }

    public void testPlanLucas(){
        assertTrue(lucas.montoafacturar(lucas.getPlan())==200);
    }

    public void testAgregarFree(){
        lucas.aumentarNrofree(2);
        assertTrue(lucas.getCantNumerosFree()==5);
    }

    public void testPlanLucasBasico(){
        lucas.setPlan(planbasico);
        assertTrue(lucas.montoafacturar(lucas.getPlan())==150);
    }

    public void testPlanLucasPlus(){
        lucas.setPlan(planplus);
        assertTrue(lucas.montoafacturar(lucas.getPlan())==165);
    }


}