
public class WTTextual {
    private String nickname;
    private boolean estaOnline;
    Mensagem msgAtual;
    
    public String WTTextual(String nickname){
        return nickname;
    }
    public void enviarMsg(WTTextual dest, int opc){
       
        msgAtual = new QuickEmoticonMsg(nickname, dest);
        if(dest.estaOnline==true){
            if(opc==1){
                
               
            }
        }
    
    }
    public void enviarMsg(WTTextual dest, String txt){
    if(dest.estaOnline==true){
    msgAtual = new LongTextMsg(nickname, dest, txt);
    
        }
    }
    public void conectar(){
        estaOnline = true;
        }
    public void desconectar(){
        estaOnline = false;
        }
    public String verStatus(){
       if(estaOnline==true){return nickname+" estar Online :)";}
       else{return nickname+" estar Offline :(";}
      }
    public boolean estaOnline(){
        if(estaOnline==true){return true;}
        else{return false;}
    }
    public void receberMsg(Mensagem m){
       
        System.out.println(nickname + "--> "+m);
    }
}
