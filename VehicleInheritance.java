abstract class Vehicle{
    private String make;
    private String model;
    private int year;
    
    public Vehicle(String make, String model, int year){
        this.make=make;
        this.model=model;
        this.year=year;
    }
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    
    public abstract void displayInfo();
        
}

class Car extends Vehicle{
    private int numDoors;
    
    public Car(String make, String model, int year,int numDoors){
        super(make,model,year);
        this.numDoors=numDoors;
    }
    @Override
    public void displayInfo(){
        System.out.println("Car:" + getMake()+" " + getModel()+ ",Year: " + getYear()+ ", Doors: "+ numDoors);
    }
}

class Bike extends Vehicle{
    private int sideCar;

    public Bike(String make, String model, int year,int sideCar){
        super(make,model,year);
        this.sideCar=sideCar;
    }
    @Override
    public void displayInfo(){
        System.out.println("Bike:"+ getMake()+" "+ getModel()+ ", Year:" + getYear()+", sidecar:"+sideCar);
    }
}
class Truck extends Vehicle{
    private double capacity;

    public Truck(String make, String model, int year,double capacity){
        super(make,model,year);
        this.capacity=capacity;
    }
    @Override
    public void displayInfo(){
        System.out.println("Truck:" + getMake() +" "+getModel()+", Year:" + getYear()+",capacity:"+capacity +"tons");
    }
}
public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    Vehicle[] vehicles = new Vehicle[3];
    System.out.println("Enter car details");
    System.out.println("Make:");
    String carMake=scanner.nextLine();
    System.out.println("Model:");
    String carModel=scanner.nextLine();
    System.out.println("Year:");
    int carYear=scanner.nextInt();
    System.out.println("numofDoors:");
    int numDoors=scanner.nextInt();
    scanner.nextLine();

    vehicles[0]= new Car(carMake,carModel,carYear,numDoors);

    System.out.println("Enter bike details:");
    System.out.println("Make:");
    String bikeMake=scanner.nextLine();
    System.out.println("Model:");
    String bikeModel=scanner.nextLine();
    System.out.prinln("Year:");
    int bikeYear=scanner.nextInt();
    System.out.prinln("sidecar:");
    int sidecar=scanner.nextInt();
    scanner.nextLine();

    vehicles[1]=new Bike(bikeMake,bikeModel,bikeYear,sidecar);

    System.out.println("Enter Truck details:");
    System.out.println("Make:");
    String truckeMake=scanner.nextLine();
    System.out.println("Model:");
    String truckModel=scanner.nextLine();
    System.out.prinln("Year:");
    int truckYear=scanner.nextInt();
    System.out.println("capacity:");
    int capacity=scanner.nextInt();
    vehicles[2]=new Truck(truckeMake,truckModel,truckYear,capacity);

    scanner.close();

    System.out.prinln(".\nvehicle details");{
        for(Vehicle v : vehicles){
            v.displayInfo();
        }
    }
}
