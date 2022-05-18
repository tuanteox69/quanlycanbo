import java.util.Scanner;

public class CognNhan extends Canbo{
    public static final int BAC_MAX = 7;
    int bac;

    public CognNhan() {
    }

    public CognNhan(String fullname, String birthday, String gender, String address, int bac) {
        super(fullname, birthday, gender, address);
        this.bac = bac;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    @Override
    public String toString() {
        return super.toString() + ", bac = " + bac;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập bậc của nhân viên: ");
        bac = Integer.parseInt(scanner.nextLine());
    }
}
