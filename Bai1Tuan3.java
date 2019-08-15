import java.util.Scanner;

// class  dc dung nhu kieu du lieu kieu phan so
class Rational 
{
	private  int tu;
	private int mau;
	
	
	
	public Rational()
	{
		
	}
	
	public Rational(int a , int b)
	{
		this.tu=a;
		this.mau=b;
	}
	
	//----------------------------------------
	public  void setTu(int i)
	{
		this.tu=i;
	}
	
	public void setMau(int i)
	{
		this.mau=i;
	}
	
	public int getTu()
	{
		return this.tu;
		
	}
	
	public int getMau()
	{
		return this.mau;
		
	}
	//------------------------------------------------------
}

    


class PS
{
	private int ucln;
	private Rational phanso;
	
	
	//ham dung ko co tham so
	public PS()
	{	
		Rational x = new Rational();
		this.phanso=x;	
	}
	//ham dung voi tham so truyen vao la 1 phan so
	public PS(Rational p)
	{
		this.phanso=p;
		
	}
	
	//set gia tri cho thuoc tinh phan so
	public void setPhanso(Rational p)
	{
		this.phanso=p;
	}
	
	//get thuoc tinh phan so
	public Rational getPhanso()
	{
		return this.phanso;
	}
	
	
	// tim ucln cua tu , mau
		public  int uscln()
		{
			int a,b;
			a=phanso.getTu();
			b=phanso.getMau();
			a=Math.abs(phanso.getTu());
			b=Math.abs(phanso.getMau());
			if(a==0 || b==0)
					return a+b;
			while(a!=b)
			{
				if(a>b)
					a=a-b;
				else
					b=b-a;
				
			}
			return a;
			
		}
	
	//set gia tri cho thuoc tinh ucln
	public void setUcln()
	{
		this.ucln= uscln();
	}
	
	//get  ucln
	public int getUcln()
	{
		return ucln;
	}
	
	// rut gon tu mau voi ucln
	public  void rutgon()
	{
		phanso.setTu(phanso.getTu()/ucln) ;
		phanso.setMau(phanso.getMau()/ucln);
	}
	
	
	//cong 2 phan so
	public Rational cong(Rational obj1 ,Rational obj2)
	{
		
		phanso.setTu(obj1.getTu()*obj2.getMau()+obj2.getTu()*obj1.getMau());
		phanso.setMau(obj1.getMau()*obj2.getMau());
			
		return phanso;
	}	
	
	//tru 2 phan so
	public Rational tru(Rational obj1,Rational obj2)
	{
		phanso.setTu(obj1.getTu()*obj2.getMau()-obj2.getTu()*obj1.getMau());
		phanso.setMau(obj1.getMau()*obj2.getMau());
		return phanso;
		
	}
	
	// nhan 2 phan so
	public Rational nhan(Rational obj1,Rational obj2)
	{
		phanso.setTu(obj1.getTu()*obj2.getTu());
		phanso.setMau(obj1.getMau()*obj2.getMau());
		return phanso;
		
	}
	//chia 2 phan so
	public Rational chia(Rational obj1,Rational obj2)
	{
		phanso.setTu(obj1.getTu()*obj2.getMau());
		phanso.setMau(obj1.getMau()*obj2.getTu());
		return phanso;
	}
}

    //clas de chua main de chay
class phan_so_test {
	
	public static void main(String[] ahedh)
	{
		//tao doi tuong kieu phan so de truyen gia tri tu,mau
		Rational a=new Rational(1,9);
		Rational  b=new Rational(2,4);
		//doi tuong kq de luu kq sau khi tinh
		Rational kq=new Rational();
			
		//tao doi tuong kieu ps de thuc hien cac phep toan
		PS		p2=new PS();
		kq=p2.cong(a, b);
		p2.setPhanso(kq);
		p2.setUcln();
		p2.rutgon();
		System.out.println(kq.getTu()+"/"+kq.getMau());
    }
}
