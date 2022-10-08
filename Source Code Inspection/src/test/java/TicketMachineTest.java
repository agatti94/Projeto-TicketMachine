package test.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;
import org.junit.TestCouldNotBeSkippedException;

import br.calebe.ticketmachine.core.TicketMachine;

public class TicketMachineTest {
    @Test
    public void testInserirUmaNota()
    {
        TicketMachine ticket = new TicketMachine(1);
        int quantidade = 1;
        try{
            ticket.inserir(quantidade);

            assertEquals(2, ticket.getSaldo());
        }
        catch(Exception e){
            Assert.fail();
        }
    }

    @Test
    public void testImprimeValor(){
        TicketMachine ticket = new TicketMachine(0);
        int valor = 0;
        String result = "*****************\n";
        result += "*** R$ " + valor + ",00 ****\n";
        result += "*****************\n";
        try{
            String a = ticket.imprimir();
            assertEquals(result, a);
        }
        catch(Exception e){
            Assert.fail();
        }
    }

}
