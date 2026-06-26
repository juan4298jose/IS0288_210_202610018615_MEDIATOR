public class MediadorConcreto implements Mediador {
    private Alarma alarma;

    // Le pasamos la alarma que debe controlar
    public MediadorConcreto(Alarma alarma) {
        this.alarma = alarma;
    }

    @Override
    public void notificar(String evento) {
        if (evento.equals("PresionarBoton")) {
            System.out.println("Mediador recibe:  PresionarBotón.");
            alarma.encender(); // El mediador le da la orden a la alarma
        }
    }
}