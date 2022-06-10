package Excepciones;

public class UPBException extends Exception{
    private short codigoError;
    @Override
    public String getMessage(){
        return "hola";
    }
    public UPBException(short codigoError, String message){
        super(message);
        this.codigoError = codigoError;
    }
}
