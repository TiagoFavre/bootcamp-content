package projeto.console;

import java.util.Optional;

import projeto.basedados.Banco;
import projeto.entidade.*;
import projeto.negocio.ClienteNegocio;
import projeto.negocio.PedidoNegocio;
import projeto.negocio.ProdutoNegocio;
import projeto.utilidade.LeitoraDados;

/*Classe responsável por controlar a execução da aplicação.*/
public class Start {

   private static Cliente clienteLogado = null;

   private static Banco banco = new Banco();

   private static ClienteNegocio clienteNegocio = new ClienteNegocio(banco);
   private static PedidoNegocio pedidoNegocio = new PedidoNegocio(banco);
   private static ProdutoNegocio produtoNegocio = new ProdutoNegocio(banco);

   /*Método utilitário para inicializar a aplicação.
    @param args Parâmetros que podem ser passados para auxiliar na execução.*/
 
   public static void main(String[] args) {

       System.out.println("Bem vindo ao e-Compras");

       String opcao = "";

       while(true) {

           if (clienteLogado == null) {

               System.out.println("Digite o cpf:");

               String cpf = "";
               cpf = LeitoraDados.lerDado();

               identificarUsuario(cpf);
           }

           System.out.println("Selecione uma opção:");
           System.out.println("1 - Cadastrar Livro");
           System.out.println("2 - Excluir Livro");
           System.out.println("3 - Cadastrar Caderno");
           System.out.println("4 - Excluir Caderno");
           System.out.println("5 - Fazer pedido");
           System.out.println("6 - Excluir pedido");
           System.out.println("7 - Listar produtos");
           System.out.println("8 - Listar pedidos");
           System.out.println("9 - Deslogar");
           System.out.println("10 - Sair");

           opcao = LeitoraDados.lerDado();

           switch (opcao) {
               case "1":
                   Livro livro = LeitoraDados.lerLivro();
                   produtoNegocio.salvar(livro);
                   break;
               case "2":
                   System.out.println("Digite o código do livro");
                   String codigoLivro = LeitoraDados.lerDado();
                   produtoNegocio.excluir(codigoLivro);
                   break;
               case "3":
                   Caderno caderno = LeitoraDados.lerCaderno();
                   produtoNegocio.salvar(caderno);
                   break;
               case "4":
                   System.out.println("Digite o código do caderno");
                   String codigoCaderno = LeitoraDados.lerDado();
                   produtoNegocio.excluir(codigoCaderno);
                   break;
               case "5":
                   Pedido pedido = LeitoraDados.lerPedido(banco);
                   Optional<Cupom> cupom = LeitoraDados.lerCupom(banco);

                   if (cupom.isPresent()) {
                       pedidoNegocio.salvar(pedido, cupom.get());
                   } else {
                       pedidoNegocio.salvar(pedido);
                   }
                   break;
               case "6":
                   System.out.println("Digite o código do pedido");
                   String codigoPedido = LeitoraDados.lerDado();
                   pedidoNegocio.excluir(codigoPedido);
                   break;
               case "7":
                   produtoNegocio.listarTodos();
                   break;
               case "8":
                   pedidoNegocio.listarTodos();
                   break;
               case "9":
                   System.out.println(String.format("Volte sempre %s!", clienteLogado.getNome()));
                   clienteLogado = null;
                   break;
               case "10":
                   System.out.println("Aplicação encerrada.");
                   System.exit(0);
                   break;
               default:
                   System.out.println("Opção invalida.");
                   break;
           }
       }
   }

   /*Procura o usuário na base de dados.
    @param cpf CPF do usuário que deseja logar na aplicação*/
   
   private static void identificarUsuario(String cpf) {

       Optional<Cliente> resultado = clienteNegocio.consultar(cpf);

       if (resultado.isPresent()) {

           Cliente cliente = resultado.get();
           System.out.println(String.format("Ola %s! Você esta logado.", cliente.getNome()));
           clienteLogado = cliente;
       } else {
           System.out.println("Usuario nao cadastrado.");
           System.exit(0);
       }
   }
}

