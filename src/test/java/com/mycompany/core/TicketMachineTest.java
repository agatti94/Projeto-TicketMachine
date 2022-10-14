package com.mycompany.core;


import com.mycompany.exception.PapelMoedaInvalidaException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TicketMachineTest {


    @Test
    public void testInserirUmaNota()
    {
        TicketMachine ticket = new TicketMachine(1);
        int quantidade = 1;

        assertThrows(PapelMoedaInvalidaException.class, () -> ticket.inserir(quantidade));
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
            fail();
        }
    }

}
