package maybay;
import java.util.Scanner;
import java.io.*;
public class Program {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        KhachHang[]kh=new KhachHang[10];
		QLDanhSachKhachHang ql=new QLDanhSachKhachHang(0,kh);
		DatVe dv=new DatVe();
		do
		{
			System.out.println("\t\t\t\t ***********************************************\t\t\t\t\t\t");
	System.out.println("\t\t\t\t *        QUAN LY BAN VE MAY BAY               *\t\t\t\t");
System.out.println("\t\t\t\t *        Moi Chon Giao Dich                   * \t\t\t\t");
 System.out.println("\t\t\t\t *        1. Dich Vu Khach Hang                *  \t\t\t\t");
System.out.println("\t\t\t\t *        2. Thanh Toan tien Ve                *   \t\t\t\t");
System.out.println("\t\t\t\t *        3. Thoat                             *\t\t\t\t");
		    System.out.println("\t\t\t\t ***********************************************\t\t\t\t");
		    System.out.println("Moi Nhap lua Chon:");
		    int chon=Integer.parseInt(sc.nextLine());
		switch(chon)
		{
		
		case 1:
	     ql.LaPDs(0, kh);
	     break;
		case 2:
	     dv.input();
			dv.toString();
			dv.tongtienphaitra();
			dv.tongtienphaitra();
			break;
		case 3:
			System.out.println("See you again");
			break;
		
		}
	}while(true);
	}
}
