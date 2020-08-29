package usuarios;

import regrasnegocio.Tarifas;

/**
 * @author 113946
 */
public class Rural extends Usuario{
    
    //Estado (Entrada) = classe abstrata
    //Construtor (Valores Iniciais)
    public Rural(int consumo){
        super(consumo);
        super.setTarifa(Tarifas.RURAL);
    }
    //Métodos de Acesso (get e set) = classe abstrata
    //Comportamento (saída) = classe abstrata
    @Override
    public String emitirBoleto(){
        String saida = "***USUÁRIO RURAL***";
        saida += super.emitirBoleto();
        return saida;
    }
}