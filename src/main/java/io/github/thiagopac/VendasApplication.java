package io.github.thiagopac;

import io.github.thiagopac.domain.entity.Cliente;
import io.github.thiagopac.domain.entity.Pedido;
import io.github.thiagopac.domain.entity.Produto;
import io.github.thiagopac.domain.repository.Clientes;
import io.github.thiagopac.domain.repository.Pedidos;
import io.github.thiagopac.domain.repository.Produtos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootApplication
@RestController
public class VendasApplication {

    @Bean
    public CommandLineRunner init(
            @Autowired Clientes clientes,
            @Autowired Pedidos pedidos,
            @Autowired Produtos produtos
    ){
        return args -> {
            Cliente cliente1 = new Cliente("Magnus");
            cliente1.setCpf("12345678901");
            clientes.save(cliente1);

            Produto produto1 = new Produto();
            produto1.setDescricao("Caneta");
            produto1.setPreco(BigDecimal.valueOf(4));
            produtos.save(produto1);

//            Cliente cliente2 = new Cliente("Thiago");
//            clientes.save(cliente2);
//
//            Pedido p = new Pedido();
//            p.setCliente(cliente2);
//            p.setDataPedido(LocalDate.now());
//            p.setTotal(BigDecimal.valueOf(100));
//            pedidos.save(p);

//            Cliente cliente = clientes.findByClienteFetchPedidos(cliente2.getId());
//            System.out.println(cliente);
//            System.out.println(cliente.getPedidos());

//            pedidos.findByCliente(cliente2).forEach(System.out::println);
//
//            clientes.findAll().forEach(System.out::println);
//
//            clientes.findAll().forEach( c -> {
//                c.setNome(c.getNome() + " atualizado");
//                clientes.save(c);
//            });
//            clientes.findAll().forEach(System.out::println);
//
//            clientes.findByNomeLike("Thi").forEach(System.out::println);
//
//            clientes.findAll().forEach(c -> {
//                if (c.getId() == 1) clientes.delete(c);
//            });
//
//            clientes.findAll().forEach(System.out::println);

        };
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}