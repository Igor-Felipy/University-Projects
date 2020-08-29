package regrasnegocio;

/**
 * @author 113946
 */

public interface Impostos {
        
    final float PIS = 0.0107f;
    final float COFINS = 0.0491f;
    final float COSIP = 9.51f;
    
    public float getPIS();
    public float getCOFINS();
    public float getCOSIP();
    
    public float getTotalImpostos();
    
}
