

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    private String nome;
    private LocalDate idade;

    

    public void setNome(String nome ){
    this.nome= nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setIdade(LocalDate dataNAscimento ){
        this.idade= dataNAscimento;
    }
    public int getIdade(){
        LocalDate dataAtual=LocalDate.now();
        Period periodo=Period.between(dataAtual,idade);
        
        return periodo.getYears() * -1;
        
    }


}