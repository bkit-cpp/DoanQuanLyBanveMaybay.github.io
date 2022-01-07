package maybay;
import java.util.Arrays;
import java.util.Scanner;

public  class QLDatVeMayBay extends DatVe implements DocghiFile {
	int n;
	public DatVe[]dv;
	public QLDatVeMayBay (int ngaydatVe, String maphieuDat, int soGhe) {
		dv=new  DatVe[0];
	}
	public  QLDatVeMayBay(int n, DatVe[]dv)
	{
		this.n=n;
		this.dv=dv;
	}
	public static void dauvao(DatVe dv)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap Ma Ve");
		dv.maVe=sc.nextLine();
		System.out.println("Nhap tinh trang ve");
		dv.tinhtrangVe=sc.nextLine();
		System.out.println("Nhap gia ve");
		dv.giave=Float.parseFloat(sc.nextLine());
		System.out.println("Nhap thue VAT");
		dv.VAT=Float.parseFloat(sc.nextLine());
		System.out.println("Nhap phi quan tri");
		dv.phiquantri=Float.parseFloat(sc.nextLine());
		System.out.println("Nhap phi san bay");
		dv.phisanbay=Float.parseFloat(sc.nextLine());
		System.out.println("Nhap phi dich vu");
		dv.phidichvu=Float.parseFloat(sc.nextLine());
		System.out.println("Nhap ngay dat ve");
		dv.ngaydatVe=Integer.parseInt(sc.nextLine());
		System.out.println("Nhap ma phieu dat ve:");
		dv.maphieuDat=sc.nextLine();
		System.out.println("Nhap so ghe:");
		dv.soGhe=Integer.parseInt(sc.nextLine());
	
	}
@Override
public  void tongtienphaitra()
{
	System.out.println(" So tien phai tra:");
	float s;
	s=(super.giave+super.phidichvu+super.phiquantri+super.phisanbay)*super.giave;
	System.out.println("Ket qua:"+s);
}
@Override
public void  docfile(){
	
}
@Override
public void ghifile() {
	
}
public void SetList(int i, DatVe[] dv)
{
	Scanner sc=new Scanner(System.in);
	dv[i]=new DatVe ();
	do {
		System.out.println("\t\t\t\t  ********************************************************  \t\t\t\t\t");
		System.out.println("\t\t\t\t  *       1. Nhap Thong tin Phieu Dat Ve                 *\t\t\t\t\t");
		System.out.println("\t\t\t\t  *       2. Hien thi thong tin Phieu Dat Ve             *\t\t\t\t\t");
		System.out.println("\t\t\t\t  *       3. Tong tien phai tra                          *\t\t\t\t\t");
		System.out.println("\t\t\t\t  *       4. Huy Ve                                      *\t\t\t\t\t");
		System.out.println("\t\t\t\t  *       5.Thoat                                        *\t\t\t\t\t");
		System.out.println("\t\t\t\t  ********************************************************\t\t\t\t\t");
		System.out.println("Nhap lua chon cua ban");
		int choice=Integer.parseInt(sc.nextLine());
		switch(choice)
		{
		case 1: System.out.println("Nhap so luong Ve Can Dat");
		n=Integer.parseInt(sc.nextLine());
		dv=new DatVe[n];
		for( i=0;i<n;i++)
		{
			System.out.println("Nhap Thong Tin Phieu Thu:"+(i+1));
			dv[i]=new DatVe();
			dauvao(dv[i]);
			
		}
		break;
		case 2:
			for(i=0;i<dv.length;i++)
			{
				System.out.println("Hien thi ket qua:"+dv[i].toString());
				dv[i].tongtienphaitra();
			}
			break;
		case 3:
			
			dv[i].tongtienphaitra();
			break;
		case 4:
			while(dv.length!=0)
			{
				DatVe booktick=new DatVe();
				System.out.println("Nhap ma Chuyen Bay");
				booktick.maphieuDat=sc.nextLine();
				for(i=0;i<dv.length-1;i++)
				{
					if(dv[i].maphieuDat.equals(booktick.maphieuDat))	
					{
						for(int j=i;j<dv.length;j++)
						{
							dv[j]=dv[j+1];
						}
						break;
					}
				}
				
			
			dv=Arrays.copyOf(dv, dv.length-1);
			break;
			}
			break;
		case 5:
			break;
		
		}
		
	}while(true);
}
}
