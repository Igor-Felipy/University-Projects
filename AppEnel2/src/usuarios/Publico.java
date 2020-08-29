package usuarios;

import regrasnegocio.Tarifas;

/**
 * @author 113946
 */
public class Publico extends Usuario{
    
    //Estado (Entrada) = classe abstrata
    //Construtor (Valores Iniciais)
    public Publico(int consumo){
        super(consumo);
        super.setTarifa(Tarifas.PUBLICO);
    }
    //Métodos de Acesso (get e set) = classe abstrata
    //Comportamento (saída) = classe abstrata
    @Override
    public String emitirBoleto(){
        String saida = "***USUÁRIO PÚBLICO***";
        saida += super.emitirBoleto();
        return saida;
    }
}