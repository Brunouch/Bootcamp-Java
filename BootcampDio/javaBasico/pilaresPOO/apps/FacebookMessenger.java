package javaBasico.pilaresPOO.apps;

public class FacebookMessenger extends ServicoMensagemInstantanea {
 
    public void enviarMensagem(){
        validarConexaoInterner();
        System.out.println("Enviando Mensagem pelo Facebook");
    }

    public void receberMensagem(){
        System.out.println("Recebendo Mensagem pelo Facebook");
    }

    
}
