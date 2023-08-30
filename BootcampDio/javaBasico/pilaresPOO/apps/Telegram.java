package javaBasico.pilaresPOO.apps;

public class Telegram extends ServicoMensagemInstantanea {
    
    public void enviarMensagem(){
        validarConexaoInterner();
        System.out.println("Enviando Mensagem pelo Telegram");
    }

    public void receberMensagem(){
        System.out.println("Recebendo Mensagem pelo Telegram");
    }

    
}
