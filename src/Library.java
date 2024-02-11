import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class Library {

	private String bookId;
	private String bookName;

	private String writerName;
	private String quality;
	private String link;
	private String Name;
	private String Adress;
	private String ContactNumber;

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		printings pr = new printings();

		File myfile1 = new File("UserDetails.txt");
		try {
			myfile1.createNewFile();
			writeToFile(myfile1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedWriter bw1 = new BufferedWriter(new FileWriter(myfile1, true));
		BufferedReader br1 = new BufferedReader(new FileReader(myfile1));
		String contents1;

		pr.greeting2();
		System.out.println("WELCOME TO OUR LIBRARY... \n  ");
		while (true) {
			File myfile = new File("bookDetails.txt");
			try {
				myfile.createNewFile();
				writeToFile(myfile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			BufferedWriter bw = new BufferedWriter(new FileWriter(myfile, true));
			BufferedReader br = new BufferedReader(new FileReader(myfile));
			String contents;

			System.out.println(
					"WHAT YO WANT TO DO... \n  1.YOU WANT TO BUY     2. YOU WANT TO SELL   3. CONTACT US  4.HISTORY  5.EXIT \n  ");
			int choice = sc.nextInt();

			if (choice == 2) {
				// ObjectInputStream in= new ObjectInputStream(new FileInputStream(myfile));

				// System.out.println(s1.getBooktID()+" "+s1.getBookName()+"

				System.out.println(
						"Enter the bookId of book which you want to sell(PLEASE ADD BOOKID +1 TO NUMBER OF BOOKS IN FILE bookdetails.txt EHICH HELP US TO MAINTAIN) : ");
				Scanner input = new Scanner(System.in);
				String bookId = input.nextLine();
				System.out.println("Enter the bookName of book which you want to sell : ");
				String bookName = input.nextLine();
				System.out.println("Enter the writerName of book which you want to sell : ");
				String writerName = input.nextLine();
				System.out.println("Enter the quality  of book which you want to sell : ");
				String quality = input.nextLine();
				System.out.println("Enter the price  of book which you want to sell : ");
				String price = input.nextLine();
				System.out.println("Enter the link  of book which you want to sell : ");
				String link = input.nextLine();
				bw.newLine();
				bw.write("bookId is: " + bookId);
				bw.newLine();
				bw.write("bookName is: " + bookName);
				bw.newLine();
				bw.write("writerName is: " + writerName);
				bw.newLine();
				bw.write("quality is: " + quality);
				bw.newLine();
				bw.write("price is: " + price);
				bw.newLine();
				bw.write("link is: " + link);
				bw.newLine();
				bw.newLine();
				bw.close();
				System.out.println("YOUR BOOK INFORMATION IS TAKEN YOUR BOOK WILL BE SOLD BY US SOON.....\n ");

			} else if (choice == 1) {

				System.out.println("SELECT THE 'bookId' OF BOOK WHICH YOU WANT  TO BUY.......\n ");
				while ((contents = br.readLine()) != null) {
					System.out.println(contents);

				}
					
					Scanner input1 = new Scanner(System.in);

					System.out.println("Enter the bookId of book which you want with you  :\n  ");
					String bookId = input1.nextLine();
					System.out.println("Enter the bookName of book which you want with you  :\n  ");
					String bookName = input1.nextLine();

					System.out.println("Enter your name :\n  ");
					String Name = input1.nextLine();
					System.out.println("Enter your adress  :\n  ");
					String Adress = input1.nextLine();
					System.out.println("Enter your contact no.  :\n  ");
					String ContactNumber = input1.nextLine();
					bw1.newLine();
					bw1.write("bookId is: " + bookId);
					bw1.newLine();
					bw1.write("bookName is: " + bookName);
					bw1.newLine();

					bw1.write("User Name : " + Name);
					bw1.newLine();
					bw1.write("User Adress : " + Adress);
					bw1.newLine();
					bw1.write(" Contact No.: " + ContactNumber);
					bw1.newLine();
					bw1.newLine();
					bw1.close();
					System.out.println(
							" Your order is placed successfully  \n YOUR BOOK WILL BE ON YOUR DOOR SOON....\n ");
		    
				

			} else if (choice == 3) {
				System.out.println(
						" EmailID :  bookondoor@gmail.com\n Phone No. : 9657683585\n WE ARE HERE FOR YOU 24*7\n ");
			} else if (choice == 4) {
				while ((contents1 = br1.readLine()) != null) {
					System.out.println(contents1);

				}
			} else if (choice == 5) {
				pr.greeting();
				pr.greeting1();
				break;
			}
			else {
				System.out.println("PLEASE CHOOSE FROM ABOVE OPTIONS... \n ");
			}
		}
	}

	private static void writeToFile(File myfile) {
		// TODO Auto-generated method stub

	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getWriterName() {
		return writerName;
	}

	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}
}
