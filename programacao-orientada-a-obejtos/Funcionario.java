public class Funcionario extends Pessoa{
    private String id;
    private int comissao ;
    private double salario;
    private double decimoTerceiro;


    
public void setId(String id){
this.id=id;
}
public String getId(){
    return this.id;
    
}
public void setComissao(float comissao,float vendas){
    
   comissao= this.comissao * vendas;

}
public float getComissao(){
    return comissao;
}
public void setSalario(double salario){
    this.salario=salario;

}
public double getSalario(){
    return salario;

}
public void setDecimoTerceiro(double salario){
    decimoTerceiro=salario * 2;

}
public double getDecimoTerceiro(){
    return decimoTerceiro;

}

}

    

