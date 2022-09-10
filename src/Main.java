import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = Program.getUserName();

        boolean isProgramRunning = true;
        while(isProgramRunning) {
            Scanner scanner = new Scanner(System.in);


            System.out.println("Stok Gudang Input Barang");
            System.out.println("#######################");

            System.out.println("Selamat Datang " + name);

            String itemName = Program.getItemName();
            int itemQuantity = Program.getItemQuantity();
            double buyPrice = Program.getItemBuyPrice();
            double sellPrice = Program.getItemSellPrice();

            Program.printResult(itemName, itemQuantity, buyPrice, sellPrice);

            boolean inputConfirmValid = false;
            while(!inputConfirmValid) {
                try{
                    System.out.println("Ulangi program? tekan y untuk ulangi program atau tekan n untuk mengakhiri program");
                    String inputConfirmation = scanner.nextLine();
                    if(inputConfirmation.toLowerCase(Locale.ROOT).equals("n")) {
                        inputConfirmValid = true;
                        isProgramRunning = false;
                        System.out.println("Terimakasih telah menggunakan program ini ❤️");
                        return;
                    } else if(inputConfirmation.toLowerCase(Locale.ROOT).equals("y")) {
                        inputConfirmValid = true;
                    } else {
                        System.out.println("Input tidak sesuai!");
                    }
                } catch (Exception e) {
                    System.out.println("Input tidak sesuai! tekan y untuk ulangi program atau tekan n untuk mengakhiri program");
                }
            }
        }
    }
}