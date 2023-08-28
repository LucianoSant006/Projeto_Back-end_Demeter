package entity;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
	public class ItemPedidoPk {
		
		@ManyToOne
	    @JoinColumn(name = "products_id")
	    private Produto produto;

	    @ManyToOne
	    @JoinColumn(name = "list_id")
	    private ProdutoList list;

		public ItemPedidoPk() {
			super();
			this.produto = produto;
			this.list = list;
		}

		public Produto getProduto() {
			return produto;
		}

		public void setProduto(Produto produto) {
			this.produto = produto;
		}

		public ProdutoList getList() {
			return list;
		}

		public void setList(ProdutoList list) {
			this.list = list;
		}

		@Override
		public int hashCode() {
			return Objects.hash(list, produto);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			ItemPedidoPk other = (ItemPedidoPk) obj;
			return Objects.equals(list, other.list) && Objects.equals(produto, other.produto);
		}

}
