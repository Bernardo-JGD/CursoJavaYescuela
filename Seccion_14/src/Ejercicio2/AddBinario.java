
package Ejercicio2;

import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;


public class AddBinario extends ObjectOutputStream{

    public AddBinario(OutputStream out) throws IOException {
        super(out);
    }

    public AddBinario() throws IOException, SecurityException {
    }
    
    @Override
    public void writeStreamHeader () throws IOException{
        
        File archivo = new File("registroAtletas.bin");
        
        if (archivo.length() == 0) {//si el archivo está vacio
            super.writeStreamHeader();
        }else{
            reset();
        }
        
    }
    
}
