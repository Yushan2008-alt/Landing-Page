class encapsiswa {
    private String name;
    private String address;
    private int age;
    
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void setAge (int newAge){
        age=newAge;
    }
    public void setName (String newName){
        name=newName;
    }
    public void setAddress (String newAddress){
        address=newAddress;
    }
    
}

public class TestSiswa {

    public static void main(String[] args) {
        // TODO code application logic here
    encapsiswa siswa = new encapsiswa();
    siswa.setName("agus");
    siswa.setAge(20);
    siswa.setAddress("Malang");
    
        System.out.println("nama: "+siswa.getName()
        + " alamat "+siswa.getAddress()+ " berumur "+siswa.getAge()
        + " tahun");
    }
    
}
