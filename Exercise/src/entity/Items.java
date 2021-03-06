package entity;
//商品类
public class Items {
	private int id;
	private String name;
	private String city;
	private int price;
	private int number;
	private String picture;
	
	public Items(int i, String s1, String s2, int j, int k, String s3) {
		this.id=i;
		this.name=s1;
		this.city=s2;
		this.price=j;
		this.number=k;
		this.picture=s3;
	}
	//封装
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	//重写toString方法
	public String toString(){
		return "商品编号："+this.getId()+"商品名称："+this.getName();
	}
	
	//确保不添加重复的商品记录，只修改数量，重写以下函数
	public int hasCode(){
		return this.getId()+this.getName().hashCode();
	}
	public boolean equals(Object obj){
		if(this==obj){
			return true;
		}
		if(obj instanceof Items){
			Items i=(Items)obj;
			if(this.getId()==i.getId() && this.getName().equals(i.getName())){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
}
