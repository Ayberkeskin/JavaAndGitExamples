import java.util.Scanner;

public class Main {
	
	public static int Toplama(int sayi1,int sayi2,int sayi3)
	{
		return (sayi1+sayi2+sayi3);
	}

	public static int Toplama(int sayi1,int sayi2)
	{
		return (sayi1+sayi2);
	}
	public static int Çikartma(int sayi1,int sayi2,int sayi3)
	{
		return (sayi1-sayi2-sayi3);
	}

	public static int Çikartma(int sayi1,int sayi2)
	{
		return (sayi1-sayi2);
	}	
	public static int Carpma(int sayi1,int sayi2,int sayi3)
	{
		return (sayi1*sayi2*sayi3);
	}
	public static int Carpma(int sayi1,int sayi2)
	{
		return (sayi1*sayi2);
	}
	public static int Bölme(int sayi1,int sayi2,int sayi3)
	{
		return (sayi1/sayi2/sayi3);
	}
	public static int Bölme(int sayi1,int sayi2)
	{
		return (sayi1/sayi2);
	}
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		String islemler="1.Toplama işlemi\n"+
						"2.Çıkarma işlemi\n"+
						"3.Çarpma işlemi\n"+
						"4.Bölme işlemi*n"+
						"Çıkış için q'ya basın";
		System.out.println("*********************************************");
		System.out.println(islemler);
		System.out.println("*********************************************");
		
		while(true) {
			System.out.println("İşleminizi Seçin : ");
			String islem=scanner.nextLine();
			if(islem.equals("q"))
			{
				System.out.println("Programdan Çıkılıyor.");
				break;
			}
			else if(islem.equals("1")) 
			{
				System.out.println("Kaç değer toplayacaksınız?(2 veya 3)");
				int adet=scanner.nextInt();
				if(adet==2)
				{
					System.out.println("1.Sayıyı giriniz");
					int sa1=scanner.nextInt();
					System.out.println("2.Sayıyı giriniz");
					int sa2=scanner.nextInt();
					System.out.println("İşlemin sounucu  : "+Toplama(sa1,sa2));
					break;
				}
				else if(adet==3) 
				{
					System.out.println("1.Sayıyı giriniz");
					int sa1=scanner.nextInt();
					System.out.println("2.Sayıyı giriniz");
					int sa2=scanner.nextInt();
					System.out.println("3.Sayıyı giriniz");
					int sa3=scanner.nextInt();
					System.out.println("İşlemin sounucu : "+Toplama(sa1,sa2,sa3));
					break;
				}
				else
				{
					System.out.println("Bunu için uygun metod bulunmuyor");
				}
			}
			else if(islem.equals("2")) 
			{
				System.out.println("Kaç değer Çıkarıcaksınız?(2 veya 3)");
				int adet=scanner.nextInt();
				if(adet==2)
				{
					System.out.println("1.Sayıyı giriniz");
					int sa1=scanner.nextInt();
					System.out.println("2.Sayıyı giriniz");
					int sa2=scanner.nextInt();
					System.out.println("İşlemin sounucu : "+Çikartma(sa1,sa2));
					break;
				}
				else if(adet==3) 
				{
					System.out.println("1.Sayıyı giriniz");
					int sa1=scanner.nextInt();
					System.out.println("2.Sayıyı giriniz");
					int sa2=scanner.nextInt();
					System.out.println("3.Sayıyı giriniz");
					int sa3=scanner.nextInt();
					System.out.println("İşlemin sounucu : "+Çikartma(sa1,sa2,sa3));
					break;
				}
				else
				{
					System.out.println("Bunu için uygun metod bulunmuyor");
				}
			}
			else if(islem.equals("3")) 
			{
				System.out.println("Kaç değer Çarpacaksınız?(2 veya 3)");
				int adet=scanner.nextInt();
				if(adet==2)
				{
					System.out.println("1.Sayıyı giriniz");
					int sa1=scanner.nextInt();
					System.out.println("2.Sayıyı giriniz");
					int sa2=scanner.nextInt();
					System.out.println("İşlemin sounucu : "+Carpma(sa1,sa2));
					break;
				}
				else if(adet==3) 
				{
					System.out.println("1.Sayıyı giriniz");
					int sa1=scanner.nextInt();
					System.out.println("2.Sayıyı giriniz");
					int sa2=scanner.nextInt();
					System.out.println("3.Sayıyı giriniz");
					int sa3=scanner.nextInt();
					System.out.println("İşlemin sounucu : "+Carpma(sa1,sa2,sa3));
					break;
				}
				else
				{
					System.out.println("Bunu için uygun metod bulunmuyor");
				}
			}
			else if(islem.equals("4")) 
			{
				System.out.println("Kaç değer Böleceksiniz?(2 veya 3)");
				int adet=scanner.nextInt();
				if(adet==2)
				{
					System.out.println("1.Sayıyı giriniz");
					int sa1=scanner.nextInt();
					System.out.println("2.Sayıyı giriniz");
					int sa2=scanner.nextInt();
					System.out.println("İşlemin sounucu : "+Bölme(sa1,sa2));
					break;
				}
				else if(adet==3) 
				{
					System.out.println("1.Sayıyı giriniz");
					int sa1=scanner.nextInt();
					System.out.println("2.Sayıyı giriniz");
					int sa2=scanner.nextInt();
					System.out.println("3.Sayıyı giriniz");
					int sa3=scanner.nextInt();
					System.out.println("İşlemin sounucu : "+Bölme(sa1,sa2,sa3));
					break;
				}
				else
				{
					System.out.println("Bunu için uygun metod bulunmuyor");
				}
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
	}

}
