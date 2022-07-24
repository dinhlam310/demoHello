import java.util.Scanner;
public class demoHello {
    public static void main(String[] args) {
        int n;
        Scanner abc = new Scanner(System.in);
        do {
            System.out.println("Nhap vao so phan tu cua mang : ");
            n = abc.nextInt();
        } while (n < 1);
        int array[] = new int[n];
        System.out.println("Nhap cac phan tu cho mang: ");
        for (int i = 0;i < n;i++) {
            nhap(n, array[i]);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    public static void nhap(int n,int arr[]){
        Scanner abcd = new Scanner(System.in);
        for (int i = 0; i < n;i++){
            arr[i] = abcd.nextInt();
        }
    }
}




