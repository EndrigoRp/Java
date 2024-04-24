package com.crud.CRUD.Repository;

import com.crud.CRUD.Produto.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository  extends JpaRepository<Produto, Long> {
}
