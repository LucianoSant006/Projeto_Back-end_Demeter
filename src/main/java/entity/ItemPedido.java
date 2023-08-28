package entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_item_pedido")
public class ItemPedido {
	
    @EmbeddedId
	private ItemPedidoPk id = new ItemPedidoPk();

	private Integer position;
	
		public void setProduto(Produto produto) {
		id.setProduto(produto);
	}

	public Produto getProduto() {
		return id.getProduto();
	}

	public void setList(ProdutoList list) {
		id.setList(list);
	}

	public ProdutoList getList() {
		return id.getList();
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	
	    
}