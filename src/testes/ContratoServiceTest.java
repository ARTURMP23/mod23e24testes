package testes;

import dao.IContratoDao;
import daomocks.ContratoDaoMock;
import service.ContratoService;
import service.IContratoService;
import org.junit.Assert;
import org.junit.Test;


public class ContratoServiceTest {

    @Test
    public void salvarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
    
   
    @Test
    public void buscarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String resultadoBusca = service.buscar(1); 
        Assert.assertNotNull(resultadoBusca);
    }
    

    @Test
    public void excluirTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        boolean resultadoExclusao = service.excluir(1); 
        Assert.assertTrue(resultadoExclusao);
    }
    

    @Test
    public void atualizarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        boolean resultadoAtualizacao = service.atualizar(1, "Novos Dados"); 
        Assert.assertTrue(resultadoAtualizacao);
    }
    

    //TODO
    //Fazer métodos de buscar, excluir e atualizar
}