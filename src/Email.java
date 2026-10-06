public class Email  implements  Notificador{

    private String de;
    private String para;

    public Email(String de, String para) {
        this.de = de;
        this.para = para;
    }

    @Override
    public String toString() {
        return "Email{" +
                "de='" + de + '\'' +
                ", para='" + para + '\'' +
                '}';
    }

    @Override
    public void enviar(String msg) {
        IO.println("___");
        IO.println("EMAIL ENVIADO;");
        IO.println("de; " + de);
        IO.println("para; " + para);
        IO.println("mensagem; " + msg);
        IO.println("___");
    }
}
