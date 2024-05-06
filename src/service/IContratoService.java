package service;

public interface IContratoService {
    String salvar();

	String buscar(int i);

	boolean excluir(int i);

	boolean atualizar(int i, String string);

    //TODO
    //Fazer métodos de buscar, excluir e atualizar
}
