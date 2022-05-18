import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class QLCB {
    static List<Canbo> canboList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choose;
        do {
            Showmenu();
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    inputData();
                    break;
                case 2:
                    seachByname();
                    break;
                case 3:
                    showData();
                    break;
                case 4:
                    System.out.println("Thoát!");
                    break;
                default:
                    System.out.println("Nhập sai!");
                    break;
            }
        } while (choose != 4);
    }

    private static void showData() {
        for (Canbo canbo : canboList) canbo.display();
    }

    private static void seachByname() {
        System.out.println("Nhập tên cán bộ cần tìm kiếm: ");
        String fullname = scanner.nextLine();
        for (Canbo canbo: canboList){
            if (canbo.getFullname().equals(fullname)){
                canbo.display();
            }
        }
        
    }
    static Canbo createCanbo(){
        Canbo canbo = null;
        System.out.println("1.Nhập thông tin Cong nhan");
        System.out.println("2.Nhập thôgn tin Ky su");
        System.out.println("3.Nhập thôgn tin Nhan vien phuc vu");
        System.out.println("Chọn: ");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                canbo = new CognNhan();
                break;
            case 2:
                canbo = new KySu();
                break;
            case 3:
canbo = new NVPhucVu();
                break;
        }
        canbo.input();
        return canbo;

    }

    private static void inputData() {
        System.out.println("Nhập số cán bộ cần thêm:");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ; i++) {
            Canbo canbo = createCanbo();
            canboList.add(canbo);
        }

    }

    static void Showmenu() {
        System.out.println("Menu");
        System.out.println("• Nhập thông tin mới cho cán bộ");
        System.out.println("• Tìm kiếm theo họ tên");
        System.out.println("• Hiển thị thông tin cán bộ tìm được");
        System.out.println("Thoát");
        System.out.println("Chọn: ");
    }
}
