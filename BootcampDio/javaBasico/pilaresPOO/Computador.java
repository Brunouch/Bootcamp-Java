package javaBasico.pilaresPOO;

import javaBasico.pilaresPOO.apps.FacebookMessenger;
import javaBasico.pilaresPOO.apps.MsnMessenger;
import javaBasico.pilaresPOO.apps.Telegram;

public class Computador {
    public static void main(String[] args) {
        System.out.println("MSN");
        MsnMessenger msn = new MsnMessenger();

        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("\nFacebook");
        FacebookMessenger fcb = new FacebookMessenger();

        fcb.enviarMensagem();
        fcb.receberMensagem();

        System.out.println("\nTelegram");

        Telegram tl = new Telegram();

        tl.enviarMensagem();
        tl.receberMensagem();
    }
}
