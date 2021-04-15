package br.edu.ifpb.padroes.payment;

import br.edu.ifpb.padroes.domain.Property;

public abstract class PaymentProcessor implements PaymentProcessorHandler {

    private PaymentProcessorHandler next;

    public abstract boolean process(Property p);
    
    public PaymentProcessor setNext(PaymentProcessor n)
    {
        this.next = n;
        return n;
    }

    public boolean checkNext(Property p) {
        if (next == null) {
            return true;
        }
        return next.process(p);
    }
    
   
}
