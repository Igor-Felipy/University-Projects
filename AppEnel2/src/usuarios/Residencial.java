package usuarios;

import regrasnegocio.Tarifas;

/**
 * @author 113946
 */
public class Residencial extends Usuario{
    
    //Estado (Entrada) = classe abstrata
    //Construtor (Valores Iniciais)
    public Residencial(int consumo){
        super(consumo);
        super.setTarifa(Tarifas.RESIDENCIAL);
    }
    //Métodos de Acesso (get e set) = classe abstrata
    //Comportamento (saída) = classe abstrata
    @Override
    public String emitirBoleto(){
        String saida = "***USUÁRIO RESIDENCIAL***";
        saida += super.emitirBoleto();
        return saida;
    }
}