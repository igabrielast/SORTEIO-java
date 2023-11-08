package sorteio.repository;

import sorteio.entities.Participante;

public interface SorteioRepository {
    void adicionar(Participante participante);
    boolean remover(int id);
    void mostrar();

}
