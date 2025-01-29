package ec.edu.espol.sportspredictor;
import ec.edu.espol.sportspredictor.usuario.Cliente;
import java.util.ArrayList;

public class GestorClientes {
    private ArrayList<ApuestasCliente> apostadores;

    public GestorClientes() {
        this.apostadores = new ArrayList<>();
    }

    public ApuestasCliente registrarCliente(Cliente cliente) {
        ApuestasCliente apuestas = new ApuestasCliente(cliente);
        this.apostadores.add(apuestas);
        return apuestas;
    }

    public ArrayList<ApuestasCliente> getApostadores() {
        return apostadores;
    }
}
