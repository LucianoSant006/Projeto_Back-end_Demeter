package service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import entity.Produto;
import repository.ProdutoRepository;

public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List <Produto> buscarTodos(){
        return produtoRepository.findAll();
    }

    public Produto insirer(Produto objeto){
        objeto.setDataCriacao(new Date());
        Produto objetoNovo = produtoRepository.saveAndFlush(objeto);
        return objetoNovo;
    }

    public Produto alterar (Produto objeto){
        objeto.setDataAtualizacao(new Date());
        return produtoRepository.saveAndFlush(objeto);

    }
   
    
    
}
