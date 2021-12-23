package maybay;
import java.util.Scanner;
import java.util.Arrays;
import java.io.*;
public class QLDanhSachKhachHang extends KhachHang {
	int n;
public KhachHang[]kh;
public QLDanhSachKhachHang(String makhachHang, String diaChi, int sohanhLi, String choNgoi, String loaiVe, String hangVe) {
	kh=new KhachHang[0];
}
public QLDanhSachKhachHang(int n, KhachHang[] kh)
{
	this.n=n;
	this.kh=kh;
}


public static void input(KhachHang kh)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Nhap vao ma khach hang:");
	 kh.makhachHang=sc.nextLine();
	System.out.print("Nhap vao dia chi:");
	  kh.diaChi=sc.nextLine();
	System.out.println("Nhap So hanh Ly");
 kh.sohanhLi=Integer.parseInt(sc.nextLine());
	System.out.println("Nhap cho ngoi");
kh.choNgoi=sc.nextLine();
	System.out.println("Nhap Loai ve");
kh.loaiVe=sc.nextLine();
	System.out.println( "Nhap Hang ve");
	kh.hangVe=sc.nextLine();
	}
public void docfile()
{
	try {
		FileReader fr=new FileReader("C:/InputKH.txt");
		BufferedReader br=new BufferedReader(fr);
		while(true)
		{
			String line=br.readLine();
			if(line==null)
			{
				break;
			}
			String []t=line.split("--");
			String makhachHang=t[0];
			String diaChi=t[1];
			int sohanhLi=Integer.parseInt(t[2]);
			String choNgoi=t[3];
			String loaiVe=t[4];
			String hangVe=t[5];
			if(kh[0]!=null)
			kh=Arrays.copyOf(kh,kh.length+1);
			kh[kh.length-1]=new QLDanhSachKhachHang(makhachHang,diaChi,sohanhLi,choNgoi,loaiVe,hangVe);
		}
		
	}catch(IOException e) {
		System.out.println("Error");
	}
}
public void ghifile()
{
	try {
	FileWriter fw=new FileWriter("C:/OutputKH.txt");
	BufferedWriter bw=new BufferedWriter(fw);
	for(int i=0;i<kh.length;i++)
	{
		bw.write(kh[i].getMakhachHang());
		bw.newLine();
		bw.write(kh[i].getDiaChi());
		bw.newLine();
		bw.write(kh[i].getChoNgoi());
		bw.newLine();
		bw.write(kh[i].getSohanhLi());
		bw.newLine();
		bw.write(kh[i].getLoaiVe());
		bw.newLine();
		bw.write(kh[i].getHangVe());
		bw.newLine();
	}
	}catch(IOException e)
	{
		System.out.println("Error");
	}
}
public void LaPDs(int i, KhachHang[]kh)
{
	kh[i]=new KhachHang();
	Scanner sc=new Scanner(System.in);
	do {
System.out.println("\t\t\t\t****************************************************\t\t\t\t");
System.out.println("\t\t\t\t*        1.Nhap Thong tin Khach Hang               *\t\t\t\t");
System.out.println("\t\t\t\t*        2. Sua thong tin khach hang               *\t\t\t\t");
System.out.println("\t\t\t\t*        3.Tim Kiem Thong tin Khach Hang theo IDKH *\t\t\t\t");
System.out.println("\t\t\t\t*        4.Them thong tin Khach Hang theo ID       *\t\t\t\t");
System.out.println("\t\t\t\t*        5. Xoa thong tin Khach Hang theo ID       *\t\t\t\t");
System.out.println("\t\t\t\t*        6.Sap xep thong tin tang dan theo Cho ngoi*\t\t\t\t ");
System.out.println("\t\t\t\t*        7.Hien thi thong tin khach hang           *\t\t\t\t");
System.out.println("\t\t\t\t*        8.Thoat                                   *\t\t\t\t ");
System.out.println("\t\t\t\t****************************************************\t\t\t\t\t");
System.out.println("Moi Nhap Lua Chon");
		int choice=Integer.parseInt(sc.nextLine());
		switch(choice)
		{
		
		case 1:
			System.out.println("Nhap so luong Hanh Khach");
			n=Integer.parseInt(sc.nextLine());
			kh=new KhachHang[n];

			for(i=0;i<n;i++)
			{
				System.out.println("----Nhap Khach Hang:-----"+(i+1));
				kh[i]=new KhachHang();
				input(kh[i]);
			}
				break;
				
		case 2:
			System.out.println("Nhap ma khach hang khach hang can sua");
			int flag2=0;
			String KhachHang=sc.nextLine();
			for( i=0;i<kh.length;i++)
			{
			if(kh[i].getMakhachHang().equals(KhachHang))
			{
				flag2=1;
				input(kh[i]);
				break;
			}
			}
			break;
			
		case 3:
			System.out.println("Tim thong tin Khach Hang theo Ma Khach Hang");
			int flag=0;
			String Customer=sc.nextLine();
				for( i=0;i<kh.length;i++)
				{
					if(kh[i].getMakhachHang().equals(Customer))
					{
						flag=1;
						System.out.println("Ket qua tim kiem: "+kh[i].toString());
						System.out.println();
						break;
					}
				}
				if(flag==0)
					System.out.println("Khong tim thay ket qua ");
		break;
		case 4:
			int B=kh.length;
			kh=Arrays.copyOf(kh, B+1);
			kh[B]=new KhachHang();
			input(kh[B]);
				break;	
		case 5:
			while(kh.length>0)
			{
			KhachHang customer=new KhachHang();
			
			customer.makhachHang=sc.nextLine();
			for( i = 0; i < kh.length-1; i++)
	        {
				
	        if(kh[i].makhachHang.equals(customer.makhachHang))
	            {
	            for(int j = i; j <kh.length; j++)
	            kh[j] = kh[j+1];
	            
	             break;
	            }
	        }
			kh=Arrays.copyOf(kh,kh.length-1);
			break;
			}
		case 6:
			KhachHang t=kh[0];
			for(i=0;i<kh.length-1;i++)
			{
				for(int j=i+1;j<kh.length;j++)
				{
					if(kh[i].choNgoi.compareTo(kh[j].choNgoi)>0)
					{
					t=kh[i];
					kh[i]=kh[j];
					kh[j]=t;
					
					}
				}
			}
			System.out.println("OK");
			break;
		case 7:
			for(i=0;i<kh.length;i++)
			{
				System.out.println("Ket qua:"+kh[i].toString());
			}
			break;
		
		
		case 8:
			System.out.println("Cam on da su dung Dich vu, See you again");
			break;
		}
	}
		
	while(true);
}
}
