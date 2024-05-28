package Vista;

import Controlador.PC;

public class Vista {
    private VentanaPC ventana;

    public Vista(PC pc) {
        this.ventana = new VentanaPC(pc);
    }
    
}
