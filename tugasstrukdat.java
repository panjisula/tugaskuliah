import java.util.Scanner;
public class tugasstrukdat{
public static void main(String[] args){
	int i, j, c, d, baru, loc=0, tanda=1;
	int a[];
	a = new int[5];
	a[0]=1;
	a[1]=2;
	a[2]=3;
	a[3]=4;
	a[4]=5;
	for(i=0; i<a.length;i++){
		System.out.println("Index ke"+i+":"+a[i]);
	}
	System.out.print("masukkan index array yang diganti :");

	c=input();
		System.out.print("data pengganti :");

	baru=input();
	
	i=c;
	a[i]=baru;
	System.out.println("data setelah diganti :");

	for(i=0; i<a.length;i++){
	System.out.println(a[i]);
	}
	//hapus data
	System.out.print("Data yang ingin dihapus :");
	d=input();
	for(i = 0; i < a.length; i++){
		if(a[i]==d)
		{
		tanda = 1;
		loc = i;
		break;
		}
		else
		{
		tanda = 0;
		}
	}	
	if(tanda == 1)
	{
		for(i = loc+1; i<a.length; i++)
		{
			a[i-1] = a[i];
		}
		System.out.print("Setelah dihapus : ");
		for(i = 0; i<a.length-2; i++)
		{
			System.out.print(a[i]+",");
		}
		System.out.print(a[a.length-2]);
	}	
	else
	{
		System.out.println("Elemen tidak ditemukan.");
	}
}
	  public static int input(){
        Scanner a=new Scanner(System.in);
        int b=a.nextInt();
        return b;
    }
}
