void main() {

    String msg = IO.readln("Mensagem Email: ");
    String de = IO.readln("Remetente: ");
    String para = IO.readln("Destinatario: ");
    Email email= new Email(de, para);
    email.enviar(msg);


    String msgSms = IO.readln("Mensagem Sms: ");
    String telefone = IO.readln("Remetente: ");
    String telefone1 = IO.readln("Destinatario: ");
    Sms sms = new Sms(telefone, telefone1);
    sms.enviar(msgSms);

}

