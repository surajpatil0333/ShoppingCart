 package cart;

 public class CartItem{

private String cartItemId;
private Item item;
private int quantity;

public CartItem()
{

}
public CartItem(final String cartItemId,final Item item,final int quantity)
{
    this.cartItemId=cartItemId;
    this.item=item;
    this.quantity=quantity;
}
public void setCartItemId(final String cartItemId)
{
    this.cartItemId=cartItemId;
}
public String getCartItemId()
{
    return cartItemId;
}
public void setItem(final  Item item)
{
    this.item=item;
}
public Item getItem()
{
    return item;
}
public void setQuantity(final int quantity)
{
  this.quantity=quantity;
}
public int getQuantity()
{
    return quantity;
 }
 public boolean equals(Object o)
 {
    return ((CartItem)o).cartItemId.equals(cartItemId);
 }
 };