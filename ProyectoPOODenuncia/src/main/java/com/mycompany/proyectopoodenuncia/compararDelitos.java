import java.util.List;

public class CompararDelitos {
    private AggHistorialExpedientes aggHistorialExpedientes;
    private AggLista aggLista;

    public CompararDelitos(AggHistorialExpedientes aggHistorialExpedientes, AggLista aggLista) {
        this.aggHistorialExpedientes = aggHistorialExpedientes;
        this.aggLista = aggLista;
    }

    public List<Delito> buscarDelitosHistorial(String personaje) {
        return aggHistorialExpedientes.buscarDelitosHistorial(personaje);
    }

    public boolean compararDelitosExpediente(Expediente expediente) {
        List<Delito> delitosExpediente = expediente.getDelitos();
        List<Delito> listaDelitos = aggLista.obtenerListaDelitos();

        for (Delito delitoExpediente : delitosExpediente) {
            for (Delito delitoLista : listaDelitos) {
                if (delitoExpediente.equals(delitoLista)) {
                    return true;
                }
            }
        }

        return false;
    }
}
