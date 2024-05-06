package service;

import dao.IContratoDao;


public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String buscar(int id) {
        contratoDao.buscar(id);
        return "Resultado da busca";
    }

    @Override
    public boolean excluir(int id) {
        contratoDao.excluir(id); 
        return true; 
    }

    @Override
    public boolean atualizar(int id, String novosDados) {
        contratoDao.atualizar(id, novosDados); 
        return true; 
    }

	@Override
	public String salvar() {	
		return "Sucesso";
	}
}