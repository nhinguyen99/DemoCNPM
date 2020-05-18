package com.project.demoTest.unitTestExample;
import org.junit.Test;
import org.junit.Assert;
public class BaiTapLonTest {
	@Test
	public void Check1(){Assert.assertEquals ("Input khong hop le", BaiTapLon.Check(-101,-1,-1,-1));}
	@Test
	public void Check2(){Assert.assertEquals("Input khong hop le", BaiTapLon.Check(-1,-101,-1,0));}
	@Test
	public void Check3(){Assert.assertEquals("Input khong hop le", BaiTapLon.Check(-1,-1,-101,1));}
	@Test
	public void Check4(){Assert.assertEquals ("Input khong hop le", BaiTapLon.Check(-1,-1,0,-101));}
	@Test
	public void Check5(){Assert.assertEquals("Cat nhau", BaiTapLon.Check(-1,-1,0,0));}
	@Test
	public void Check6(){Assert.assertEquals("Vuong goc", BaiTapLon.Check(-1,-1,1,1));}
	@Test
	public void Check7(){Assert.assertEquals ("Song song", BaiTapLon.Check(-1,-1,-1,1));}
	@Test
	public void Check8(){Assert.assertEquals("Trung nhau", BaiTapLon.Check(-1,1,-1,1));}
	@Test
	public void Check9(){Assert.assertEquals("Input khong hop le", BaiTapLon.Check(101,-1,101,1));}
	@Test
	public void Check10(){Assert.assertEquals ("Input khong hop le", BaiTapLon.Check(-1,101,-1,1));}
	@Test
	public void Check11(){Assert.assertEquals("Trung nhau", BaiTapLon.Check(-1,0,-1,0));}
	@Test
	public void Check12(){Assert.assertEquals("Input khong hop le", BaiTapLon.Check(-1,0,-1,1));}
	@Test
	public void Check13(){Assert.assertEquals ("Cat nhau", BaiTapLon.Check(-1,0,0,-1));}
	@Test
	public void Check14(){Assert.assertEquals("Cat nhau", BaiTapLon.Check(-1,0,0,0));}
	@Test
	public void Check15(){Assert.assertEquals("Cat nhau", BaiTapLon.Check(-1,0,0,1));}
	@Test
	public void Check16(){Assert.assertEquals ("Vuong goc", BaiTapLon.Check(-1,0,1,-1));}
	@Test
	public void Check17(){Assert.assertEquals("Vuong goc", BaiTapLon.Check(-1,0,1,0));}
	@Test
	public void Check18(){Assert.assertEquals("Vuong goc", BaiTapLon.Check(-1,0,1,1));}
	@Test
	public void Check19(){Assert.assertEquals ("Song song", BaiTapLon.Check(-1,1,-1,-1));}
	@Test
	public void Check20(){Assert.assertEquals("Song song", BaiTapLon.Check(-1,1,-1,0));}
	@Test
	public void Check21(){Assert.assertEquals("Trung nhau", BaiTapLon.Check(-1,1,-1,1));}
	@Test
	public void Chec22(){Assert.assertEquals ("Cat nhau", BaiTapLon.Check(-1,1,0,-1));}
	@Test
	public void Check23(){Assert.assertEquals("Cat nhau", BaiTapLon.Check(-1,1,0,0));}
	@Test
	public void Check24(){Assert.assertEquals("Cat nhau", BaiTapLon.Check(-1,1,0,1));}
	@Test
	public void Check25(){Assert.assertEquals ("Vuong goc", BaiTapLon.Check(-1,1,1,-1));}
	@Test
	public void Check26(){Assert.assertEquals("Vuong goc", BaiTapLon.Check(-1,1,1,0));}
	@Test
	public void Check27(){Assert.assertEquals("Vuong goc", BaiTapLon.Check(-1,1,1,1));}
	@Test
	public void Check28(){Assert.assertEquals ("Cat nhau", BaiTapLon.Check(0,-1,-1,-1));}
	@Test
	public void Check29(){Assert.assertEquals("Cat nhau", BaiTapLon.Check(0,-1,-1,0));}
	@Test
	public void Check30(){Assert.assertEquals("Cat nhau", BaiTapLon.Check(0,-1,-1,1));}
	@Test
	public void Check31(){Assert.assertEquals ("Trung nhau", BaiTapLon.Check(0,-1,0,-1));}
	@Test
	public void Check32(){Assert.assertEquals("Song song", BaiTapLon.Check(0,-1,0,0));}
	@Test
	public void Chec33(){Assert.assertEquals("Song song", BaiTapLon.Check(0,-1,0,1));}
	@Test
	public void Check34(){Assert.assertEquals ("Cat nhau", BaiTapLon.Check(0,-1,1,-1));}
	@Test
	public void Check35(){Assert.assertEquals("Cat nhau", BaiTapLon.Check(0,-1,1,0));}
	@Test
	public void Check36(){Assert.assertEquals("Cat nhau", BaiTapLon.Check(0,-1,1,1));}
	@Test
	public void Check37(){Assert.assertEquals ("Cat nhau", BaiTapLon.Check(0,0,-1,-1));}
	@Test
	public void Check38(){Assert.assertEquals("Cat nhau", BaiTapLon.Check(0,0,-1,0));}
	@Test
	public void Check39(){Assert.assertEquals("Cat nhau", BaiTapLon.Check(0,0,-1,1));}
	@Test
	public void Check40(){Assert.assertEquals ("Song song", BaiTapLon.Check(0,0,0,-1));}
	@Test
	public void Check41(){Assert.assertEquals("Trung nhau", BaiTapLon.Check(0,0,0,0));}
	@Test
	public void Check42(){Assert.assertEquals("Song song", BaiTapLon.Check(0,0,0,1));}
	@Test
	public void Check43(){Assert.assertEquals ("Cat nhau", BaiTapLon.Check(0,0,1,-1));}
	@Test
	public void Check44(){Assert.assertEquals("Cat nhau", BaiTapLon.Check(0,0,1,0));}
	@Test
	public void Check45(){Assert.assertEquals("Cat nhau", BaiTapLon.Check(0,0,1,1));}
	@Test
	public void Check46(){Assert.assertEquals ("Cat nhau", BaiTapLon.Check(0,1,-1,-1));}
	@Test
	public void Check47(){Assert.assertEquals("Cat nhau", BaiTapLon.Check(0,1,-1,0));}
	@Test
	public void Check48(){Assert.assertEquals("Cat nhau", BaiTapLon.Check(0,1,-1,1));}
	@Test
	public void Chec49(){Assert.assertEquals ("Song song", BaiTapLon.Check(0,1,0,-1));}
	@Test
	public void Check50(){Assert.assertEquals("Song song", BaiTapLon.Check(0,1,0,0));}
	@Test
	public void Check51(){Assert.assertEquals("Trung nhau", BaiTapLon.Check(0,1,0,1));}
	@Test
	public void Check52(){Assert.assertEquals ("Cat nhau", BaiTapLon.Check(0,1,1,-1));}
	@Test
	public void Check53(){Assert.assertEquals("Cat nhau", BaiTapLon.Check(0,1,1,0));}
	@Test
	public void Check54(){Assert.assertEquals("Cat nhau", BaiTapLon.Check(0,1,1,1));}
	@Test
	public void Check55(){Assert.assertEquals ("Vuong goc", BaiTapLon.Check(1,-1,-1,-1));}
	@Test
	public void Check56(){Assert.assertEquals("Vuong goc", BaiTapLon.Check(1,-1,-1,0));}
	@Test
	public void Check57(){Assert.assertEquals("Vuong goc", BaiTapLon.Check(1,-1,-1,1));}
	@Test
	public void Check58(){Assert.assertEquals ("Cat nhau", BaiTapLon.Check(1,-1,0,-1));}
	@Test
	public void Check59(){Assert.assertEquals("Cat nhau", BaiTapLon.Check(1,-1,0,0));}
	@Test
	public void Check60(){Assert.assertEquals("Cat nhau", BaiTapLon.Check(1,-1,0,1));}
	@Test
	public void Check61(){Assert.assertEquals ("Trung nhau", BaiTapLon.Check(1,-1,1,-1));}
	@Test
	public void Check62(){Assert.assertEquals("Song song", BaiTapLon.Check(1,-1,1,0));}
	@Test
	public void Check63(){Assert.assertEquals("Song song", BaiTapLon.Check(1,-1,1,1));}
	@Test
	public void Check64(){Assert.assertEquals ("Vuong goc", BaiTapLon.Check(1,0,-1,-1));}
	@Test
	public void Check65(){Assert.assertEquals("Vuong goc", BaiTapLon.Check(1,0,-1,0));}
	@Test
	public void Check66(){Assert.assertEquals("Vuong goc", BaiTapLon.Check(1,0,-1,1));}
	@Test
	public void Check67(){Assert.assertEquals ("Cat nhau", BaiTapLon.Check(1,0,0,-1));}
	@Test
	public void Check68(){Assert.assertEquals("Cat nhau", BaiTapLon.Check(1,0,0,0));}
	@Test
	public void Check69(){Assert.assertEquals("Cat nhau", BaiTapLon.Check(1,0,0,1));}
	@Test
	public void Check70(){Assert.assertEquals ("Song song", BaiTapLon.Check(1,0,1,-1));}
	@Test
	public void Check71(){Assert.assertEquals("Trung nhau", BaiTapLon.Check(1,0,1,0));}
	@Test
	public void Check72(){Assert.assertEquals("Song song", BaiTapLon.Check(1,0,1,1));}
	@Test
	public void Check73(){Assert.assertEquals ("Vuong goc", BaiTapLon.Check(1,1,-1,-1));}
	@Test
	public void Check74(){Assert.assertEquals("Vuong goc", BaiTapLon.Check(1,1,-1,0));}
	@Test
	public void Check75(){Assert.assertEquals("Vuong goc", BaiTapLon.Check(1,1,-1,1));}
	@Test
	public void Chec76(){Assert.assertEquals ("Cat nhau", BaiTapLon.Check(1,1,0,-1));}
	@Test
	public void Check77(){Assert.assertEquals("Cat nhau", BaiTapLon.Check(1,1,0,0));}
	@Test
	public void Check78(){Assert.assertEquals("Cat nhau", BaiTapLon.Check(1,1,0,1));}
	@Test
	public void Check79(){Assert.assertEquals ("Song song", BaiTapLon.Check(1,1,1,-1));}
	@Test
	public void Check80(){Assert.assertEquals("Song song", BaiTapLon.Check(1,1,1,0));}
	@Test
	public void Check81(){Assert.assertEquals("Trung nhau", BaiTapLon.Check(1,1,1,1));}
}