package dao;

public interface IContratoDao {
    void salvar();

	void atualizar(int id, String novosDados);

	void buscar(int id);

	void excluir(int id);

    //TODO
    //Fazer métodos de buscar, excluir e atualizar
}