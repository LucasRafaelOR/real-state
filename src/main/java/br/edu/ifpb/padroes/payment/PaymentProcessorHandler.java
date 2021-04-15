package br.edu.ifpb.padroes.payment;

import br.edu.ifpb.padroes.domain.Property;

public interface PaymentProcessorHandler {
    public static final PaymentProcessorHandler next = null;

	abstract boolean process(Property p);

}
