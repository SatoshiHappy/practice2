public class book extends TangibleAsset{
	private String lsbn;
	public book(String name,int price ,String color,String lsbn){
		super(name,price,color);
		this.lsbn = lsbn;
		}
	public getLsbn(){
		return this.lsbn;}
}
