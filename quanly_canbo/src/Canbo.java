import java.util.Scanner;

public class Canbo {
    private String fullname,birthday,gender,address;
    public Canbo() {
    }

    public Canbo(String fullname, String birthday, String gender, String address) {
        this.fullname = fullname;
        this.birthday = birthday;
        this.gender = gender;
        this.address = address;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Canbo{" +
                "name='" + fullname + '\'' +
                ", date=" + birthday +
                ", sex='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public void display(){
        System.out.println(this);
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        fullname = scanner.nextLine();
        System.out.println("Nhập date: ");
        birthday = scanner.nextLine();
        System.out.println("Nhập gioi tinh: ");
        gender = scanner.nextLine();
        System.out.println("Nhập dia chi: ");
        address = scanner.nextLine();

    }
}
