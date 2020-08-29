package regrasnegocio;
/**
 * @author 113946
 */
public enum Tarifas {
    
       RESIDENCIAL      (0.00f, 0.00f),
       SOCIAL_000_030   (0.72f, 0.65f),
       SOCIAL_031_100   (0.50f, 0.40f),
       SOCIAL_101_220   (0.30f, 0.10f),
       SOCIAL_221       (0.25f, 0.00f),
       RURAL            (0.30f, 0.20f),
       PUBLICO          (0.40f, 0.40f),
       OUTROS           (0.00f, 0.00f),
       ;

    Tarifas (float descTU, float descTE){
        TUSD = TUSD_PLENA*(1 - descTU);
        TE = TE_PLENA*(1 - descTE);
    }

    private final float TE;
    private final float TUSD;

    private final float TE_PLENA = 0.27087f;
    private final float TUSD_PLENA = 0.21276f;

    public float getTE(){
        return TE;
    }

    public float getTUSD(){
        return TUSD;
    }
}