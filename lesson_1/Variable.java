class Variable {
	public static void main(String[] args) {
		byte bitCapacity = 64;
		short coresQuantity = 4;
		int ramSize = 8192; 
		long hddSize = 1024000L;
		float cost = 1200.00f;
		double clockFrequency = 2.80d;
		char type = 'G';
		boolean isPortable = true;

		System.out.println("bitCapacity: " + bitCapacity + "\n" 
			+ "coresQuantity: " + coresQuantity + "\n"
			+ "ramSize: " + ramSize + "\n" 
			+ "hddSize: " + hddSize + "\n"
			+ "cost: " + cost + "\n"
			+ "clockFrequency: " + clockFrequency + "\n"
			+ "type: " + type + "\n"
			+ "isPortable: " + isPortable + "\n" );
	}
}