package usuarios;

import regrasnegocio.Tarifas;

/**
 * @author 113946
 */
public class Outros extends Usuario{
    
    //Estado (Entrada) = classe abstrata
    //Construtor (Valores Iniciais)
    public Outros(int consumo){
        super(consumo);
        super.setTarifa(Tarifas.OUTROS);
    }
    //Métodos de Acesso (get e set) = classe abstrata
    //Comportamento (saída) = classe abstrata
    @Override
    public String emitirBoleto(){
        String saida = "***OUTROS USUÁRIOS***";
        saida += super.emitirBoleto();
        return saida;
    }
}