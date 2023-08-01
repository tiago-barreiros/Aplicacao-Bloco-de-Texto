package contarPalavra;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author jpc
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    public CheckBox maiusculas;
    @FXML
    private TextField txtPalavra;
    @FXML
    private TextArea txtTexto;
    @FXML
    private Label contagem;
    
    public void actionContar(ActionEvent e){
        int contador = 0;
        String palavra = txtPalavra.getText();
        String[] palavras = txtTexto.getText().split(" ");
        
        if (maiusculas.isSelected()) {
            for (String string : palavras) {
                if (string.equalsIgnoreCase(palavra)) {
                    contador++;
                }
            }
        } else{
            for (String string : palavras) {
                if (string.equals(palavra)) {
                    contador++;
                }
            }
        }
        
        contagem.setText(String.valueOf(contador));
    }
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        txtTexto.requestFocus();
    }    
    
}
