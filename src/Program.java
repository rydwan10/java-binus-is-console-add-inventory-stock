import java.util.Scanner;

public class Program {

    public static String getUserName () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nama Anda : ");
        String name = scanner.nextLine();

        return name;
    }

    public static int getItemQuantity() {
        Scanner scanner = new Scanner(System.in);

        boolean isQuantityInputCorrect = false;
        int itemQuantity = 0;
        while(!isQuantityInputCorrect) {
            try {
                System.out.println("Masukkan jumlah barang yang mau ditambah : ");
                itemQuantity = Integer.parseInt(scanner.nextLine());
                isQuantityInputCorrect = true;
            } catch (Exception e) {
                System.out.println("Input harus berupa angka dan tidak ada angka dibelakang koma!");
            }
        }
        return itemQuantity;
    }

    public static String getItemName() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nama barang yang mau ditambah : ");
        String itemName = scanner.nextLine();

        return itemName;
    }

    public static double getItemBuyPrice() {
        Scanner scanner = new Scanner(System.in);

        boolean isBuyPriceInputCorrect = false;
        double buyPrice = 0.0;
        while(!isBuyPriceInputCorrect) {
            try{
                System.out.println("Masukkan harga beli untuk barang tersebut : ");
                buyPrice = Double.parseDouble(scanner.nextLine()) ;
                isBuyPriceInputCorrect = true;
            } catch (Exception e) {
                System.out.println("Input harus berupa angka!");
            }
        }

        return buyPrice;
    }

    public static double getItemSellPrice() {
        Scanner scanner = new Scanner(System.in);

        boolean isSellPriceInputCorrect = false;
        double sellPrice = 0.0;
        while(!isSellPriceInputCorrect) {
            try {
                System.out.println("Masukkan harga jual untuk barang tersebut : ");
                sellPrice = Double.parseDouble(scanner.nextLine());
                isSellPriceInputCorrect = true;
            } catch (Exception e) {
                System.out.println("Input harus berupa angka!");
            }
        }

        return sellPrice;
    }

    public static void printResult(String itemName, int itemQuantity, double buyPrice, double sellPrice) {
        System.out.println("Stok Gudang Rincian Barang");
        System.out.println("##########################");
        System.out.println("Nama Barang   : " + itemName);
        System.out.println("Jumlah Barang : " + itemQuantity);
        System.out.println("Harga Beli    : " + buyPrice);
        System.out.println("Harga Jual    : " + sellPrice);
    }
}
