 class HoaDon {
    private String tenSP;
    private long gia;
    private long soLuong;
    private String maHD;

     public HoaDon(int STT,String maHD,String tenSP, long gia, long soLuong) {
         this.tenSP = tenSP;
         this.gia = gia;
         this.soLuong = soLuong;
         this.maHD = maHD+"-"+String.format("%03d",STT);
     }

     public long thanhTien()
     {
         return gia*soLuong;
     }

     public long giamGia()
     {
         if(soLuong>=150)
         {
             return thanhTien()*50/100;
         }
         else if(soLuong>=100)
         {
             return  thanhTien()*30/100;
         }
         else if(soLuong>=50)
         {
             return thanhTien()*15/100;
         }
         else
         {
             return 0;
         }
     }

     public long phaiTra()
     {
         return thanhTien()-giamGia();
     }


     @Override
     public String toString()
     {
         return maHD+" "+ tenSP+" "+ giamGia()+" "+ phaiTra();
     }


 }
