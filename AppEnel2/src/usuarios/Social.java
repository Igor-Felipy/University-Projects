package usuarios;

import regrasnegocio.Tarifas;

/**
 * @author 113946
 */
public class Social extends Usuario{
    
    //Estado (Entrada) = classe abstrata
    //Construtor (Valores Iniciais)
    public Social(int consumo){
        super(consumo);
        if (super.consumo <= 30){
        super.setTarifa(Tarifas.SOCIAL_000_030);
    }
        else if (super.consumo >=31 && super.consumo <=100){
            super.setTarifa(Tarifas.SOCIAL_031_100);
        }
        else if (super.consumo >=101 && super.consumo <=220){
            super.setTarifa(Tarifas.SOCIAL_101_220);
        }
        else if (super.consumo >= 221){
            super.setTarifa(Tarifas.SOCIAL_221);
        }
    }    
    //Métodos de Acesso (get e set) = classe abstrata
    //Comportamento (saída) = classe abstrata
    
    @Override
    public String emitirBoleto(){
        String saida = "***USUÁRIO RESIDENCIAL SOCIAL***";
        saida += super.emitirBoleto();
        return saida;
    }
}
    