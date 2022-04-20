package interfaceEx.milhagem.enunciado;

import java.util.*;

import interfaceEx.milhagem.solucao.Cliente;
import interfaceEx.milhagem.solucao.Funcionario;

public class Passageiros_A_Bordo {
    private int nroVoo;
    private List<Passageiro> passageiros;
    
    public Passageiros_A_Bordo(int nv)throws Exception{
    	if (nv < 100) throw new Exception("Nro de voo invalido");
    	nroVoo = nv;
    	passageiros = new ArrayList<Passageiro>();
    }
    
    public void add(Passageiro p){
    	passageiros.add(p);
    }

    public int getNroVoo(){
    	return(nroVoo);
    }
    
    public int qtdadePassageiros(CategoriaMilhagem m){
        int cont = 0;
        
        for (Passageiro p:passageiros)
        	if  ((p instanceof Cliente) && ((Cliente)p).getCategoriaMilhagem().equals(m))
        		cont ++;
        
        return cont;
    }
    
    public int qtdadeFuncionarios(){
        int cont = 0;
        
        for (Passageiro p:passageiros)
        	if (p instanceof Funcionario)
        		cont ++;
        
        return cont;
    }
    
    public List<Cliente> lstPassageiros(CategoriaMilhagem m){
    	List<Cliente> lst = new LinkedList<>();
        
        for (Passageiro p:passageiros)
        	if  ((p instanceof Cliente) && ((Cliente)p).getCategoriaMilhagem().equals(m))
        		lst.add((Cliente)p);
        
        return lst;
    }
    
    public List<Funcionario> lstFuncionarios(){
    	List<Funcionario> lst = new LinkedList<>();
        
        for (Passageiro p:passageiros)
        	if (p instanceof Funcionario)
        		lst.add((Funcionario)p);
        
        return lst;
    }
}
