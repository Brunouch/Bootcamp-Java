package javaBasico.pilaresPOO.apps;

public class MsnMessenger extends ServicoMensagemInstantanea {
    
    public void enviarMensagem(){
        validarConexaoInterner();
        System.out.println("Enviando Mensagem pelo Msn");
    }

    public void receberMensagem(){
        System.out.println("Recebendo Mensagem pelo Msn");
    }

    
}
