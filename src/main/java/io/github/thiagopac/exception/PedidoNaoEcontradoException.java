package io.github.thiagopac.exception;

public class PedidoNaoEcontradoException extends RuntimeException {

    public PedidoNaoEcontradoException() {
        super("Pedido não encontrado");
    }
}
