package app.app;

import java.time.LocalDate;

import app.app.pcote1.Funcionario;
import app.app.pcote1.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {

        Pessoa pessoa= new Pessoa();
        Funcionario funcionario= new Funcionario();

         pessoa.setNome("Igor");
         pessoa.setIdade(LocalDate.of(1992, 5, 12));
         funcionario.setId("27.083.619-3");
         funcionario.setSalario(2000.00);
         funcionario.setComissao(2000.00f, 0.03f);
         funcionario.setDecimoTerceiro(2000.00);



         

         System.out.println("Nome: "+ pessoa.getNome());
         System.out.println("A idade: "+ pessoa.getIdade());
         System.out.println("Com a id: " + funcionario.getId());
         System.out.println("Comissão: " + funcionario.getComissao());
         System.out.println("Décimo terceiro: " + funcionario.getDecimoTerceiro());
    }
}