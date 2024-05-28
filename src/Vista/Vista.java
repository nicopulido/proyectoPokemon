package Vista;

import Controlador.PC;

public class Vista {
    private VentanaPC ventana;

    public Vista(PC pc) {
        this.ventana = new VentanaPC(pc);
    }

    public VentanaPC getVentana() {
        return ventana;
    }

    public void setVentana(VentanaPC ventana) {
        this.ventana = ventana;
    }
    
}
