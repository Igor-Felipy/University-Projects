package usuarios;//definição do pacote
import regrasnegocio.Cobranca;
import regrasnegocio.Tarifas;//biblioteca externas
/**
 * @author 113946
 */
public abstract class Usuario implements Cobranca {//regras gerais, sem objeto
    
    // Estado - dados conhecidos
    protected int consumo;
    protected Tarifas tarifa;//proteção intermediária
    private final int MINIMO = 30;
    
    // Construtor
    public Usuario (){
        this.consumo = this.MINIMO;
    }
    public Usuario (int consumo){
        this.consumo = (consumo > MINIMO) ? consumo : MINIMO;
    }
        
    // Métodos de Acesso
    public int getConsumo (){
        return this.consumo;
    }    
    public void setConsumo(int consumo){
        this.consumo = consumo;
    }    
    public void setTarifa(Tarifas tarifa){
        this.tarifa = tarifa;
    }
            
            
    // Comportamento quando necessário
    
    @Override
    public float getValorBase(){
        return getConsumo()*(tarifa.getTE() + tarifa.getTUSD());
    }
    @Override
    public String emitirBoleto(){
        String saida = "\nCONTA DE LUZ\n ";
        saida += "Consumo (kWh): " + getConsumo();
        saida += "\nTarifa Energia Elétrica             (TE)   R$ " + tarifa.getTE();
        saida += "\nTarifa Sistema de Distribuição      (TUSD) R$ " + tarifa.getTUSD();
        saida += "\nValor Base (Sem Impostos)                  R$ " + this.getValorBase();
        return saida;
    }
}
