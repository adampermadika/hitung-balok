class ObjBalok {
	
// main method ? Java application
	public static void main(String[] args) {
		
				
		ProBalok balok = new ProBalok();
		
		System.out.print("Masukkan Panjang ke 1=");
		String strPanjang= System.console().readLine(); 	
		balok.p = Double.parseDouble(strPanjang);
		System.out.print("Masukkan Lebar ke 1=");
		String strLebar= System.console().readLine(); 	
		balok.l = Double.parseDouble(strLebar);
		System.out.print("Masukkan Tinggi ke 1=");
		String strTinggi= System.console().readLine(); 	
		balok.t = Double.parseDouble(strTinggi);
		
		System.out.println("Volume Balok = " +balok.VolumeBalok() );
		System.out.println("Luas Balok = " +balok.LuasBalok() );
		System.out.println("Keliling Balok = " +balok.KelilingBalok() );
		System.out.println();
		
		ProBalok balok1 = new ProBalok();
		System.out.print("Masukkan Panjang ke 2=");
		String strPanjang1= System.console().readLine(); 	
		balok1.p = Double.parseDouble(strPanjang1);
		System.out.print("Masukkan Lebar ke 2=");
		String strLebar1= System.console().readLine(); 	
		balok1.l = Double.parseDouble(strLebar1);
		System.out.print("Masukkan Tinggi ke 2=");
		String strTinggi1= System.console().readLine(); 	
		balok1.t = Double.parseDouble(strTinggi1);
		
		System.out.println("Volume Balok = " +balok1.VolumeBalok() );
		System.out.println("Luas Balok = " +balok1.LuasBalok() );
		System.out.println("Keliling Balok = " +balok1.KelilingBalok() );
		System.out.println();

		ProBalok penampang = new ProBalok();
		
		System.out.print("Masukkan Diameter ke 1=");
		String strDiameter1= System.console().readLine(); 	
		penampang.d = Double.parseDouble(strDiameter1);
				
		ProBalok penampang1 = new ProBalok();
		
		System.out.print("Masukkan Diameter ke 2=");
		String strDiameter2= System.console().readLine(); 	
		penampang1.d = Double.parseDouble(strDiameter2);
		
		System.out.println("Luas Penampang ke-1 = " +penampang.LuasPenampang() );		
		System.out.println("Luas Penampang ke-2 = " +penampang1.LuasPenampang() );
		

		
		
}
}