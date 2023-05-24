
package codigo;

/**
 *
 * @author TOSHIBA
 */
public class ObjetoToken {
    
    private String nombreToken;
    private String lexema;

    public ObjetoToken(String nombreToken, String lexema) {
        this.nombreToken = nombreToken;
        this.lexema = lexema;
    }

    public String getNombreToken() {
        return nombreToken;
    }

    public void setNombreToken(String nombreToken) {
        this.nombreToken = nombreToken;
    }

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }
    
    
    
}
