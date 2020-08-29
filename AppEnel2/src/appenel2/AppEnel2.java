package appenel2;
import java.util.Scanner;
import usuarios.Residencial;
import usuarios.Publico;
import usuarios.Rural;
import usuarios.Social;
import usuarios.Outros;

/**
 * @author 113946
 */
public class AppEnel2 {

    public static void main(String[] args) {
       
        //INTERFACE COM O USUÁRIO
        Scanner scan = new Scanner(System.in);
        System.out.print("Qual o consumo do Usuário?\n");
        int consumo = scan.nextInt();
        System.out.println("qual o tipo do usuario ?");
        System.out.println("1 - Usuario Residencial ");
        System.out.println("2 - Usuario Residencial de Baixa Renda ");
        System.out.println ("3 - Usuario Rural ");
        System.out.println ("4 - Usuario Público ");
        System.out.println ("5 - Usuario Não Categorizado ");
        int opcaoMenu = scan.nextInt();
        //Usuario user;instaciar uma unica classe usuario. 
        
        switch (opcaoMenu){
            case 1 : Residencial user = new Residencial (consumo);
                    System.out.println (user.emitirBoleto());
                    break;
            case 2 : Social user2 = new Social (consumo);
                    System.out.println (user2.emitirBoleto());
                    break;
        
            case 3 : Rural user3 = new Rural(consumo);
                     System.out.println (user3.emitirBoleto());
                     break;
                     
            
            case 4 : Publico user4 = new Publico(consumo);
                     System.out.println (user4.emitirBoleto());
                     break;
                     
            
            case 5 : Outros user5 = new Outros(consumo);
                     System.out.println (user5.emitirBoleto());
                     break;
                     
            default : System.out.println("Opção Invalida");
        }
        
        Residencial user = new Residencial(consumo);
        System.out.println(user.emitirBoleto());
        
        // Interface Gráfica para Uso
    }
    
}
