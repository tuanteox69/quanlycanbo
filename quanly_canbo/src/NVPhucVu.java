import java.util.Scanner;

public class NVPhucVu extends Canbo{
 String congViec;
public NVPhucVu(){

}
    public NVPhucVu(String fullname, String birthday, String gender, String address, String congviec) {
        super(fullname, birthday, gender, address);
        this.congViec = congviec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return super.toString() + ",congviec = " + congViec;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập công việc: ");
        congViec = scanner.nextLine();
    }
}
