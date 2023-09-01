package repository;

import java.util.List;

import entity.Produto;

public interface ProdutoRepository {

    List<Produto> findAll();

    Produto saveAndFlush(Produto objeto);

    void delete(Produto objeto);

    Object findById(Long id);

}
