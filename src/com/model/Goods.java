package com.model;

public class Goods {

	private Integer ID=Integer.getInteger("-1");
	private int typeID=-1;
	private String goodsName="";
	private String introduce="";
	private float price=0f;
	private float nowPrice=0f;
	private String picture="";
	private int newGoods=-1;
	private int sale=-1;
	public void Goods()
	{
		
	}
	public Integer getID()
	{
		return this.ID;
	}
	public void setID(Integer ID)
	{
		this.ID=ID;
	}
	public int getTypeID()
	{
		return this.typeID;
	}
	public void setTypeID(int typeID)
	
	{
		this.typeID=typeID;
	}
	public String getGoodsName()
	{
		return this.goodsName;
	}
	public void setGoodsName(String goodsName)
	{
		this.goodsName=goodsName;
	}
	public String getIntroduce()
	{
		return this.introduce;
	}
	public void setIntroduce(String introduce)
	{
		this.introduce=introduce;
	}
	public float getPrice()
	{
		return this.price;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public float getnowPrice()
	{
		return this.nowPrice;
	}
	public void setnowPrice(float nowPrice)
	{
		this.nowPrice=nowPrice;
	}
	public String getPicture()
	{
		return this.picture;
	}
	public void setPicture(String picture)
	{
		this.picture=picture;
	}
	public int getnewGoods()
	{
		return this.newGoods;
	}
	public void setnewGoods(int newGoods)
	{
		this.newGoods=newGoods;
	}
	public int getSale()
	{
		return this.sale;
	}
	public void setSale(int sale)
	{
		this.sale=sale;
	}
}
