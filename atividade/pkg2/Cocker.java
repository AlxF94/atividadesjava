
package atividade.pkg2;

import javax.swing.JOptionPane;

public final class Cocker extends Cachorro {
    private boolean tosa;
    public Cocker(){
    }

    public boolean getTosa() {
        return tosa;
    }

    public void setTosa(boolean tosa) {
        this.tosa = tosa;
    }
    public boolean precisaTosa(){
        if (tosa==true){
       
             JOptionPane.showMessageDialog(null,"Precisa de Tosa");
        }
        else if(tosa==false){
             JOptionPane.showMessageDialog(null,"Não Precisa de Tosa");
        }
        return getTosa();
    }   
    
}