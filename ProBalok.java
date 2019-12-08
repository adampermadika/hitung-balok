
class ProBalok {
	// instance variable
	double p;
	double l;
	double t;
	double d;
	
	double total;
	
	
	public double VolumeBalok() {
		return (p*l*t); 
	}
	public double LuasBalok() {
		return (2*(p*l+p*t+l*t)); 
	}
	public double KelilingBalok() {
		return (4*(p+l+t)); 
	}
	
	public double LuasPenampang() {
		total = 3.14*((d*2)/4);
		return (total);
	}
	}