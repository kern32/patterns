package visitor.Shop;

public interface ItemElement {
	public int accept(ShoppingCartVisitor visitor);
}
