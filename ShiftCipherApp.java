import java.util.Scanner;

class ShiftCipherApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int shift;
		String message;
		System.out.println("Shift Cipher Algorithm");
		System.out.println("===========================");
		System.out.print("Enter the number of shifting: ");

		try {
			shift = input.nextInt();
			input.nextLine(); 
		} catch (Exception e) {
			System.out.println("Not an integer.");
			System.exit(0);
			return;
		}

		System.out.println("Enter a message you want to encrypt,then press Enter.");
		message = input.next();
		input.close();

		ShiftCipher shiftC = new ShiftCipher(message, shift);
		System.out.println("Message: " + message);

		
		shiftC.cipher();
		System.out.println("Encrypt Message: " + shiftC.getCiphered());
		
		shiftC.decipher();
		System.out.println("Decrypt Message: " + shiftC.getDeciphered());
	}
}