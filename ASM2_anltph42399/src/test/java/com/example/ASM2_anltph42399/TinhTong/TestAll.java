package com.example.ASM2_anltph42399.TinhTong;

import com.example.ASM2_anltph42399.Phan2.SinhVien;
import com.example.ASM2_anltph42399.Phan2.SinhVienFpoly;
import com.example.ASM2_anltph42399.TinhHieu.TinhHieu;
import com.example.ASM2_anltph42399.TinhTich.TinhTich;
import com.example.ASM2_anltph42399.TinhTrungBinhCong.TrungBinhCong;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

import java.util.List;

public class TestAll {

   SinhVienFpoly list =new SinhVienFpoly();

    //Test Tính Tổng
    @Test
    public void TsetTinhTong1() {
        Assert.assertEquals(5, TinhTong.TinhTong(3, 2));
    }

    @Test
    public void TsetTinhTong2() {
        Assert.assertEquals(6, TinhTong.TinhTong(4, 2));
    }

    @Test
    public void TsetTinhTong3() {
        Assert.assertEquals(2, TinhTong.TinhTong(1, 1));
    }

    @Test
    public void TsetTinhTong4() {
        Assert.assertEquals(7, TinhTong.TinhTong(3, 4));
    }

    @Test
    public void TsetTinhTong5() {
        Assert.assertEquals(7, TinhTong.TinhTong(4, 3));
    }

    @Test
    public void TsetTinhTong6() {
        Assert.assertEquals(7, TinhTong.TinhTong(2, 5));
    }

    @Test
    public void TsetTinhTong7() {
        Assert.assertEquals(7, TinhTong.TinhTong(-2, 9));
    }

    @Test
    public void TsetTinhTong8() {
        Assert.assertEquals(7, TinhTong.TinhTong(0, 7));
    }

    @Test
    public void TsetTinhTong9() {
        Assert.assertEquals(7, TinhTong.TinhTong(7, 0));
    }

    @Test
    public void TsetTinhTong10() {
        Assert.assertEquals(7, TinhTong.TinhTong(3, -10));
    }

    //Tinh Hieu
    @Test
    public void TestHieu1() {
        Assert.assertEquals(4, TinhHieu.TinhHieu(6, 2));
    }

    @Test
    public void TestHieu2() {
        Assert.assertEquals(2, TinhHieu.TinhHieu(4, 2));
    }

    @Test
    public void TestHieu3() {
        Assert.assertEquals(9, TinhHieu.TinhHieu(11, 2));
    }

    @Test
    public void TestHieu4() {
        Assert.assertEquals(-4, TinhHieu.TinhHieu(-2, 2));
    }

    @Test
    public void TestHieu5() {
        Assert.assertEquals(-4, TinhHieu.TinhHieu(0, 4));
    }

    @Test
    public void TestHieu6() {
        Assert.assertEquals(4, TinhHieu.TinhHieu(4, 0));
    }

    @Test
    public void TestHieu7() {
        Assert.assertEquals(-2, TinhHieu.TinhHieu(0, 2));
    }

    @Test
    public void TestHieu8() {
        Assert.assertEquals(2, TinhHieu.TinhHieu(-2, -4));
    }

    @Test
    public void TestHieu9() {
        Assert.assertEquals(-22, TinhHieu.TinhHieu(0, 22));
    }

    @Test
    public void TestHieu10() {
        Assert.assertEquals(22, TinhHieu.TinhHieu(0, -22));
    }
    ///Tich

    @Test
    public void TestTich1() {
        Assert.assertEquals(4, TinhTich.TinhTich(2, 2));
    }

    @Test
    public void TestTich2() {
        Assert.assertEquals(4, TinhTich.TinhTich(1, 4));
    }

    @Test
    public void TestTic3() {
        Assert.assertEquals(4, TinhTich.TinhTich(4, 1));
    }

    @Test
    public void TestTic4() {
        Assert.assertEquals(0, TinhTich.TinhTich(0, 7));
    }

    @Test
    public void TestTic5() {
        Assert.assertEquals(0, TinhTich.TinhTich(9, 0));
    }

    @Test
    public void TestTic6() {
        Assert.assertEquals(1, TinhTich.TinhTich(0, 1));
    }

    @Test
    public void TestTic7() {
        Assert.assertEquals(0, TinhTich.TinhTich(0, 7));
    }

    @Test
    public void TestTic8() {
        Assert.assertEquals(0, TinhTich.TinhTich(0, 7));
    }

    @Test
    public void TestTic9() {
        Assert.assertEquals(-2, TinhTich.TinhTich(1, -2));
    }

    @Test
    public void TestTic10() {
        Assert.assertEquals(-6, TinhTich.TinhTich(-2, 3));
    }


    //Tinh Trung Binh Cong

  @Test
    public void TinhTrungBinhCong1(){
      int[] trungBinhCong1 ={3,2,1};
        Assert.assertEquals(2,TrungBinhCong.TrungBinhCong(trungBinhCong1));
  }
@Test
    public void TinhTrungBinhCong(){
        int [] TBC2={3,2,4};
        Assert.assertEquals(3,TrungBinhCong.TrungBinhCong(TBC2));
}
  @Test
    public void TinhTrungBinhCong3(){
        int [ ] TBC3 ={4,4,4};
        Assert.assertEquals(4,TrungBinhCong.TrungBinhCong(TBC3));
  }

  @Test
    public void TrungBinhCong4(){
        int [] TBC4 = {8,8,8};
        Assert.assertEquals(8,TrungBinhCong.TrungBinhCong(TBC4));
  }
  @Test
    public void TrungBinhCong5(){
          int []TBC5 ={2,2,2};
        Assert.assertEquals(2,TrungBinhCong.TrungBinhCong(TBC5));
  }
  @Test
    public void TrungBinhCong6(){
        int [] TBC6 ={9,6,3};
        Assert.assertEquals(6,TrungBinhCong.TrungBinhCong(TBC6));
  }

    @Test
    public void TrungBinhCong7(){
        int [] TBC6 ={-3,6,3};
        Assert.assertEquals(2,TrungBinhCong.TrungBinhCong(TBC6));
    }

    //Truy Xuat Phan tu
    @Test
    public void TruyXuatPhanTu(){
        int [] DSMang={2,3,5,3,8,9};
        int TXM =DSMang[4];
        Assert.assertEquals(8,TXM);
    }
    @Test
    public void TruyXuatPhanTu2(){
        int[] DSMang2={1,2,35,7,2,8};
        int TXM =DSMang2[2];
        Assert.assertEquals(32,TXM);
    }
    @Test
    public void TruyXuatMang3(){
        int [] DSM3={4,2,-22,4,9,0,4};
        int TXM = DSM3[2];
        Assert.assertEquals(-22,TXM);
    }

 ////// Phan 2
    //ThemSV
 @Test
 public void testTimKiemTheoMaSV_TonTai() {
     SinhVien sv1 = new SinhVien("1", "Nguyen Van A", "CT1", "CNTT", "SV001");
     listSV.add(sv1);
     SinhVien result = listSV.timKiemTheoMaSV("SV001");
     assertNotNull(result);
     assertEquals("SV001", result.getMaSV());
 }

    @Test
    public void testTimKiemTheoMaSV_KhongTonTai() {
        SinhVien sv1 = new SinhVien("1", "Nguyen Van A", "CT1", "CNTT", "SV001");
        listSV.add(sv1);
        SinhVien result = listSV.timKiemTheoMaSV("SV002");
        assertNull(result);
    }

    @Test
    public void testTimKiemTheoMaSV_MaSVNull() {
        try {
            listSV.timKiemTheoMaSV(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Mã sinh viên không được null hoặc rỗng", e.getMessage());
        }
    }

    @Test
    public void testTimKiemTheoMaSV_MaSVEmpty() {
        try {
            listSV.timKiemTheoMaSV("");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Mã sinh viên không được null hoặc rỗng", e.getMessage());
        }
    }

    @Test
    public void testAdd_SinhVienHopLe() {
        SinhVien sv1 = new SinhVien("1", "Nguyen Van A", "CT1", "CNTT", "SV001");
        listSV.add(sv1);
        assertEquals(1, listSV.getAll().size());
    }

    @Test
    public void testAdd_SinhVienTenLopKhongHopLe() {
        SinhVien sv1 = new SinhVien("1", "Nguyen Van A", "CT1!", "CNTT", "SV001");
        try {
            listSV.add(sv1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Tên không chưa kí tự đặc biệt", e.getMessage());
        }
    }

    @Test
    public void testAdd_SinhVienNull() {
        try {
            listSV.add(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testGetAll_DanhSachRong() {
        List<SinhVien> result = listSV.getAll();
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testGetAll_DanhSachKhongRong() {
        SinhVien sv1 = new SinhVien("1", "Nguyen Van A", "CT1", "CNTT", "SV001");
        listSV.add(sv1);
        List<SinhVien> result = listSV.getAll();
        assertNotNull(result);
        assertFalse(result.isEmpty());
        assertEquals(1, result.size());
    }
    @Test
    public void testTimKiemTheoMaSV1() {
        SinhVien sv1 = new SinhVien("1", "Nguyen Van A", "CT1", "CNTT", "SV001");
        listSV.add(sv1);
        SinhVien result = listSV.timKiemTheoMaSV("SV001");
        assertNotNull(result);
        assertEquals("SV001", result.getMaSV());
    }

    @Test
    public void testTimKiemTheoMaSV2() {
        SinhVien sv1 = new SinhVien("1", "Nguyen Van A", "CT1", "CNTT", "SV001");
        listSV.add(sv1);
        SinhVien result = listSV.timKiemTheoMaSV("SV002");
        assertNull(result);
    }

    @Test
    public void testTimKiemTheoMaSV3() {
        SinhVien sv1 = new SinhVien("1", "Nguyen Van A", "CT1", "CNTT", "SV001");
        SinhVien sv2 = new SinhVien("2", "Nguyen Van B", "CT2", "CNTT", "SV002");
        listSV.add(sv1);
        listSV.add(sv2);
        SinhVien result = listSV.timKiemTheoMaSV("SV002");
        assertNotNull(result);
        assertEquals("SV002", result.getMaSV());
    }

    @Test
    public void testTimKiemTheoMaSV4() {
        SinhVien sv1 = new SinhVien("1", "Nguyen Van A", "CT1", "CNTT", "SV001");
        listSV.add(sv1);
        SinhVien result = listSV.timKiemTheoMaSV(null);
        try {
            listSV.timKiemTheoMaSV(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Mã sinh viên không được null hoặc rỗng", e.getMessage());
        }
    }

    @Test
    public void testTimKiemTheoMaSV5() {
        SinhVien sv1 = new SinhVien("1", "Nguyen Van A", "CT1", "CNTT", "SV001");
        listSV.add(sv1);
        SinhVien result = listSV.timKiemTheoMaSV("");
        try {
            listSV.timKiemTheoMaSV("");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Mã sinh viên không được null hoặc rỗng", e.getMessage());
        }
    }

}
