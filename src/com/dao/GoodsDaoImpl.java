package com.dao;

import com.model.Goods;
import com.tools.ChStr;
import com.tools.ConnDB;

public class GoodsDaoImpl implements GoodsDao{

	ConnDB conn=new ConnDB();
	ChStr chStr=new ChStr();
	@Override
	public int insert(Goods g) {
		int ret=-1;
		try
		{
			String sql="Insert into tb_doods(TypeID,GoodsName,Introduce,Price,nowPrice,picture,newGoods,sale)values("
					+g.getTypeID()+",'"+chStr.chStr(g.getGoodsName())+"','"+chStr.chStr(g.getIntroduce())+"',"+g.getPrice()+",'"+chStr.chStr(g.getPicture())+"',"+g.getnewGoods()+","+g.getSale()+")";
			ret=conn.executeUpdate(sql);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			ret=0;
		}
		conn.close();
		return ret;
	}

	@Override
	public int update(Goods g) {
		int ret=-1;
		try
		{
			String sql="update tb_goods set TypeID="+g.getTypeID()+",GoodsName='"+chStr.chStr(g.getGoodsName())+"',introduce='"+chStr.chStr(g.getIntroduce())+"',price="+g.getPrice()+",nowprice="+
		    g.getnowPrice()+",picture='"+chStr.chStr(g.getPicture())+"',newgoods="+g.getnewGoods()+",sale="+g.getSale()+"where ID="+g.getID();
			ret=conn.executeUpdate(sql);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			ret=0;
		}
		conn.close();
		return ret;
	}

	@Override
	public int delete(Goods g) {
		int ret=-1;
		try
		{
			String sql="delete from tb_goods where ID="+g.getID();
			ret=conn.executeUpdate(sql);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			ret=0;
		}
		conn.close();
		return ret;
	}

}
