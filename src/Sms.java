public class Sms implements Notificador {

    private String telefone;
    private String telefone1;

    public Sms(String telefone, String telefone1) {
        this.telefone = telefone;
        this.telefone1 = telefone1;
    }

    @Override
    public String toString() {
        return "Sms{" +
                "de='" + telefone + '\'' +
                ", para='" + telefone1 + '\'' +
                '}';
    }

    @Override
    public void enviar(String msg) {
        IO.println("____");
        IO.println("SMS ENVIADO; ");
        IO.println("de; " + telefone);
        IO.println("para; " + telefone1);
        IO.println("mensagem; " + msg);
        IO.println("___");
    }
}
