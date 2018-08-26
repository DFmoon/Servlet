package entity;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//���ﳵ��
public class Cart {

	//�������Ʒ����
	private HashMap<Items,Integer> goods;
	
	//���ﳵ�ܽ��
	private double totalPrice;
	
	//���췽��
	public Cart(){
		goods=new HashMap<Items,Integer>();
		totalPrice=0.0;
	}
	
	//������Ʒ
	public boolean addGoods(Items item,int number){
		if(goods.containsKey(item)){
			goods.put(item, goods.get(item)+number);
		}else{
			goods.put(item,number);
		}
		calTotal();
		return true;
	}
	
	//ɾ����Ʒ
	public boolean removeGoods(Items item){
		goods.remove(item);
		calTotal();
		return true;
	}
	
	//�����ܼ�
	public double calTotal(){
		double sum=0.0;
		Set<Items> keys=goods.keySet();//��ü��ļ���
		Iterator<Items> it=keys.iterator();//��õ���������
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
	//����
	/*
	public static void main(String[] args){
		Items i1=new Items(1,"��������Ь","����",200,500,"001.jpg");
		Items i2=new Items(2,"�����˶�Ь","����",300,500,"002.jpg");
		
		Cart c=new Cart();
		c.addGoods(i1,1);
		c.addGoods(i2, 2);
		
		//����ȫ����Ʒ
		Set<Map.Entry<Items, Integer>> items=c.getGoods().entrySet();
		for(Map.Entry<Items, Integer> obj:items){
			System.out.println(obj);
		}
		System.out.println("���ﳵ�ܽ�"+c.getTotalPrice());
	}
	*/
}