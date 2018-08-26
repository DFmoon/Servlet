package entity;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//购物车类
public class Cart {

	//购买的商品集合
	private HashMap<Items,Integer> goods;
	
	//购物车总金额
	private double totalPrice;
	
	//构造方法
	public Cart(){
		goods=new HashMap<Items,Integer>();
		totalPrice=0.0;
	}
	
	//添加商品
	public boolean addGoods(Items item,int number){
		if(goods.containsKey(item)){
			goods.put(item, goods.get(item)+number);
		}else{
			goods.put(item,number);
		}
		calTotal();
		return true;
	}
	
	//删除商品
	public boolean removeGoods(Items item){
		goods.remove(item);
		calTotal();
		return true;
	}
	
	//计算总价
	public double calTotal(){
		double sum=0.0;
		Set<Items> keys=goods.keySet();//获得键的集合
		Iterator<Items> it=keys.iterator();//获得迭代器对象
		while(it.hasNext()){
			Items i=it.next();
			sum+=i.getPrice()*goods.get(i);
		}
		this.setTotalPrice(sum);
		return this.getTotalPrice();
	}

	public HashMap<Items, Integer> getGoods() {
		return goods;
	}

	public void setGoods(HashMap<Items, Integer> goods) {
		this.goods = goods;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	//测试
	/*
	public static void main(String[] args){
		Items i1=new Items(1,"沃特篮球鞋","温州",200,500,"001.jpg");
		Items i2=new Items(2,"李宁运动鞋","广州",300,500,"002.jpg");
		
		Cart c=new Cart();
		c.addGoods(i1,1);
		c.addGoods(i2, 2);
		
		//遍历全部商品
		Set<Map.Entry<Items, Integer>> items=c.getGoods().entrySet();
		for(Map.Entry<Items, Integer> obj:items){
			System.out.println(obj);
		}
		System.out.println("购物车总金额："+c.getTotalPrice());
	}
	*/
}
