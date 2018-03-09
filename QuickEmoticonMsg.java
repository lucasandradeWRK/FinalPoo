
public class QuickEmoticonMsg extends Mensagem{
    final String SMILE_FACE = ":D";
    final String SAD_FACE = ":/";
    final String CRYING_FACE = "T-T";
    final String SURPRISE_FACE = ":O";
    final String HEART = "<3";
    
    public QuickEmoticonMsg(String remetente, WTTextual destinatario){}
    public String selecionarOpc(String opcao){
        if(opcao=="SMILE_FACE"){opcao=this.SMILE_FACE;}
        else if(opcao=="SAD_FACE"){opcao=this.SAD_FACE;}
        else if(opcao=="CRYING_FACE"){opcao=this.CRYING_FACE;}
        else if(opcao=="SURPRISE_FACE"){opcao=this.SURPRISE_FACE;}
        else if(opcao=="HEART"){opcao=this.HEART;}
        
        return opcao;}
}
