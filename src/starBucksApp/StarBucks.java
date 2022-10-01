package starBucksApp;

import java.util.Arrays;

public class StarBucks {
	
	private int id;//ID	
	private String name;
	private String ownershipType;
	private String phoneNumber;
	private String address;
	private String city;
	private String county;
	private int zip;
	private double[] coordinates;
	private String state;
	private String image;
	private String regularHours;
	private String saturdayOpeningTimes;
	private String SundayOpeningTimes;
	private boolean service_24_Hour;
	private boolean reserveCloverBrewed;
	private boolean ovenWarmedFood;
	private boolean freeWiFi;
	private boolean verismoSystem;
	private boolean mobilePayment;
	private boolean digitalRewards;
	private boolean laBoulange;
	private boolean fizzioHandcraftedSodas;
	private boolean driveThru;
	private String link;
	
	public StarBucks(String input) {
		
		String[] fields = input.split(",");
		
		this.id = Integer.parseInt(fields[0]);
		this.name = fields[1];
		this.ownershipType = fields[2];
		this.phoneNumber = fields[3];
		this.address = fields[4];
		this.city = fields[5];
		this.county = fields[6];
		this.zip = Integer.parseInt(fields[7]);
		//System.out.println(fields[8].substring(fields[8].indexOf("\"")));
		double[] array =  { Double.parseDouble(fields[8].substring(fields[8].indexOf("\"")+1)), Double.parseDouble(fields[9].substring(0,fields[9].indexOf("\"")))};
		this.coordinates = array;
		this.state = fields[10];
		this.image = fields[11];
		this.regularHours = fields[12];
		this.saturdayOpeningTimes =  fields[13];
		this.SundayOpeningTimes =  fields[14];
		this.service_24_Hour =  fields[15].equals("Yes");
		this.reserveCloverBrewed = fields[16].equals("Yes");
		this.ovenWarmedFood = fields[17].equals("Yes");
		this.freeWiFi = fields[18].equals("Yes");
		this.verismoSystem = fields[19].equals("Yes");
		this.mobilePayment = fields[20].equals("Yes");
		this.digitalRewards = fields[21].equals("Yes");
		this.laBoulange = fields[22].equals("Yes");
		this.fizzioHandcraftedSodas = fields[23].equals("Yes");
		this.driveThru = fields[24].equals("Yes");
		this.link = fields[25];
	}
	
	public StarBucks(int id, String name, String ownershipType, String phoneNumber, String address, String city,
			String county, int zip, double[] coordinates, String state, String image, String regularHours,
			String saturdayOpeningTimes, String sundayOpeningTimes, boolean service_24_Hour,
			boolean reserveCloverBrewed, boolean ovenWarmedFood, boolean freeWiFi, boolean verismoSystem,
			boolean mobilePayment, boolean digitalRewards, boolean laBoulange, boolean fizzioHandcraftedSodas,
			boolean driveThru, String link) {
		super();
		this.id = id;
		this.name = name;
		this.ownershipType = ownershipType;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.city = city;
		this.county = county;
		this.zip = zip;
		this.coordinates = coordinates;
		this.state = state;
		this.image = image;
		this.regularHours = regularHours;
		this.saturdayOpeningTimes = saturdayOpeningTimes;
		SundayOpeningTimes = sundayOpeningTimes;
		this.service_24_Hour = service_24_Hour;
		this.reserveCloverBrewed = reserveCloverBrewed;
		this.ovenWarmedFood = ovenWarmedFood;
		this.freeWiFi = freeWiFi;
		this.verismoSystem = verismoSystem;
		this.mobilePayment = mobilePayment;
		this.digitalRewards = digitalRewards;
		this.laBoulange = laBoulange;
		this.fizzioHandcraftedSodas = fizzioHandcraftedSodas;
		this.driveThru = driveThru;
		this.link = link;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwnershipType() {
		return ownershipType;
	}

	public void setOwnershipType(String ownershipType) {
		this.ownershipType = ownershipType;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public double[] getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(double[] coordinates) {
		this.coordinates = coordinates;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getRegularHours() {
		return regularHours;
	}

	public void setRegularHours(String regularHours) {
		this.regularHours = regularHours;
	}

	public String getSaturdayOpeningTimes() {
		return saturdayOpeningTimes;
	}

	public void setSaturdayOpeningTimes(String saturdayOpeningTimes) {
		this.saturdayOpeningTimes = saturdayOpeningTimes;
	}

	public String getSundayOpeningTimes() {
		return SundayOpeningTimes;
	}

	public void setSundayOpeningTimes(String sundayOpeningTimes) {
		SundayOpeningTimes = sundayOpeningTimes;
	}

	public boolean isService_24_Hour() {
		return service_24_Hour;
	}

	public void setService_24_Hour(boolean service_24_Hour) {
		this.service_24_Hour = service_24_Hour;
	}

	public boolean isReserveCloverBrewed() {
		return reserveCloverBrewed;
	}

	public void setReserveCloverBrewed(boolean reserveCloverBrewed) {
		this.reserveCloverBrewed = reserveCloverBrewed;
	}

	public boolean isOvenWarmedFood() {
		return ovenWarmedFood;
	}

	public void setOvenWarmedFood(boolean ovenWarmedFood) {
		this.ovenWarmedFood = ovenWarmedFood;
	}

	public boolean isFreeWiFi() {
		return freeWiFi;
	}

	public void setFreeWiFi(boolean freeWiFi) {
		this.freeWiFi = freeWiFi;
	}

	public boolean isVerismoSystem() {
		return verismoSystem;
	}

	public void setVerismoSystem(boolean verismoSystem) {
		this.verismoSystem = verismoSystem;
	}

	public boolean isMobilePayment() {
		return mobilePayment;
	}

	public void setMobilePayment(boolean mobilePayment) {
		this.mobilePayment = mobilePayment;
	}

	public boolean isDigitalRewards() {
		return digitalRewards;
	}

	public void setDigitalRewards(boolean digitalRewards) {
		this.digitalRewards = digitalRewards;
	}

	public boolean isLaBoulange() {
		return laBoulange;
	}

	public void setLaBoulange(boolean laBoulange) {
		this.laBoulange = laBoulange;
	}

	public boolean isFizzioHandcraftedSodas() {
		return fizzioHandcraftedSodas;
	}

	public void setFizzioHandcraftedSodas(boolean fizzioHandcraftedSodas) {
		this.fizzioHandcraftedSodas = fizzioHandcraftedSodas;
	}

	public boolean isDriveThru() {
		return driveThru;
	}

	public void setDriveThru(boolean driveThru) {
		this.driveThru = driveThru;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@Override
	public String toString() {
		return "StarBucks [id=" + id + ", name=" + name + ", ownershipType=" + ownershipType + ", phoneNumber="
				+ phoneNumber + ", address=" + address + ", city=" + city + ", county=" + county + ", zip=" + zip
				+ ", coordinates=" + Arrays.toString(coordinates) + ", state=" + state + ", image=" + image
				+ ", regularHours=" + regularHours + ", saturdayOpeningTimes=" + saturdayOpeningTimes
				+ ", SundayOpeningTimes=" + SundayOpeningTimes + ", service_24_Hour=" + service_24_Hour
				+ ", reserveCloverBrewed=" + reserveCloverBrewed + ", ovenWarmedFood=" + ovenWarmedFood + ", freeWiFi="
				+ freeWiFi + ", verismoSystem=" + verismoSystem + ", mobilePayment=" + mobilePayment
				+ ", digitalRewards=" + digitalRewards + ", laBoulange=" + laBoulange + ", fizzioHandcraftedSodas="
				+ fizzioHandcraftedSodas + ", driveThru=" + driveThru + ", link=" + link + "]";
	}
	
	

}
