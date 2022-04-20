package interfaceEx.milhagem.enunciado;

import java.util.List;

import interfaceEx.milhagem.solucao.Cliente;
import interfaceEx.milhagem.solucao.Funcionario;


public class App {

	public static void main(String[] args){
		try{
            Passageiros_A_Bordo pab = new Passageiros_A_Bordo(1062);
        
//            pab.add(new Funcionario("10098734","Alberto",244));
//            pab.add(new Funcionario("93746293","Lisa",953));
            pab.add(new Funcionario("10098734","Alberto",244, "10001"));
            pab.add(new Funcionario("93746293","Lisa",953, "20002"));
            pab.add(new Cliente("98365209","Suzana",100,CategoriaMilhagem.FidelidadeAzul));
            pab.add(new Cliente("88764552","Alessandra",101,CategoriaMilhagem.FidelidadeAzul));
            pab.add(new Cliente("14737039","Rafel",103,CategoriaMilhagem.FidelidadeVermelho));
            pab.add(new Cliente("57382998","Luiz",104,CategoriaMilhagem.FidelidadeVermelho));
            pab.add(new Cliente("34452781","Elisangela",105,CategoriaMilhagem.FidelidadeVermelho));
            pab.add(new Cliente("76322901","Silvio",106,CategoriaMilhagem.FidelidadeBranco));
            
            System.out.println("Informa��es sobre o voo: "+pab.getNroVoo());
            System.out.println("\nFuncionarios a bordo:");
            List<Funcionario> func = pab.lstFuncionarios();
            for(Funcionario f:func){
            	System.out.println(f.toString());
            }
            System.out.println("\nPassageiros fidelidade azul a bordo:");
            List<Cliente> pfa = pab.lstPassageiros(CategoriaMilhagem.FidelidadeAzul);
            for(Cliente c:pfa){
            	System.out.println(c.toString());
            }
            System.out.println("\nPassageiros fidelidade branca a bordo:");
            List<Cliente> pfb = pab.lstPassageiros(CategoriaMilhagem.FidelidadeBranco);
            for(Cliente c:pfb){
            	System.out.println(c.toString());
            }
            System.out.println("\nPassageiros fidelidade vermelho a bordo:");
            List<Cliente> pfv = pab.lstPassageiros(CategoriaMilhagem.FidelidadeVermelho);
            for(Cliente c:pfv){
            	System.out.println(c.toString());
            }
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
