import java.util.*;
import java.text.*;
//import org.apache.commons.lang.ArrayUtils;


public class project {


// ----------------------------------------------------------- Global Variable
	static Scanner sc = new Scanner(System.in);
	//static List<Integer> semuamakan = new ArrayList<>();
	//static List<Integer> totmakan   = new ArrayList<>();
	static Date date = new Date();

// --------------- MAKANAN
	static String makanan [] = new String[100];
	static int harga_makan [] = new int[100];
	static int stok_makanan[] = new int[100];

// --------------- MINUMAN
	static String minuman [] = new String[100];
	static int harga_minum [] = new int[100];
	static int stok_minuman [] = new int[100];


// --------------- ADM00N
	static String username [] = new String [50];
	static String password [] = new String [50];
	static int totadmin = 6;

// --------------- TRANSAKSI

	static int semuamakan [] = new int [100];
	static int totmakan [] = new int [100];
	static int totharga [] = new int [100];

// --------------- REPORT
	static int report_kode_transaksi [] = new int [100];
	static String report_admin [] = new String [100];
	static String report_tanggal [] = new String [100];
	static int report_omset [] = new int [100];

// ---------------- MEJA

	static boolean mejaa [] = new boolean [30];


// --------------- DEKLARASI SESUATU !
	static char pilih, piilih;
	static String option;
	static int admin, makan, minum, pilihsatu, pilihmakan = 1, pilihminum = 1, jummakan = 0, jumminum = 0;
	static int totbeli = 0;
	static int totitem = 0;
	static int totdata = 8;
	static int lap = 0;
	static int batas_meja = 30;
	static int kode_transaksi = 101;
	static int totalharga, bayar, kembalian,asd , qwe, i, re;
	static boolean isRunning, barang_sama;
	static boolean exit = false;

	static String user;

	static String username_form, password_form, barang_baru, barang_edit, pembeli, status, admin_baru, password_baru, pilih_user, username_edit, password_edit;
	static int harga_baru, stok_baru, pilih_kode, harga_edit, stok_edit, tambah_stok, meja, data, index_admin;


	public static void main(String[] args) {

// --------------- ADM00N

		username[0] = "siowner";
		username[1] = "siadm00n";
		username[2] = "siwibu1";
		username[3] = "siwibu2";
		username[4] = "admin123";
		username[5] = "admin";

		password[0] = "ownerlah";
		password[1] = "admftw";
		password[2] = "onichan11";
		password[3] = "oneechan22";
		password[4] = "123";
		password[5] = "admin";

// ------------------ MAKANAN

		makanan[0] = "Ayam Nelongso";
		makanan[1] = "Ayam Keprukin";
		makanan[2] = "Ayam Crispyys";
		makanan[3] = "Ayam di cowek";
		makanan[4] = "Ayam Pedazzzz";
		makanan[5] = "Ayam di Suwir";
		makanan[6] = "Kulit Krenyes";
		makanan[7] = "Jamur Crispyh";

		harga_makan[0] = 6000;
		harga_makan[1] = 9000;
		harga_makan[2] = 11000;
		harga_makan[3] = 15000;
		harga_makan[4] = 9500;
		harga_makan[5] = 12000;
		harga_makan[6] = 12500;
		harga_makan[7] = 7500;

		stok_makanan[0] = 30;
		stok_makanan[1] = 30;
		stok_makanan[2] = 30;
		stok_makanan[3] = 30;
		stok_makanan[4] = 30;
		stok_makanan[5] = 30;
		stok_makanan[6] = 30;
		stok_makanan[7] = 30;

// ------------------ MINUMAN

		minuman[0] = "Es Teh Manis  ";
		minuman[1] = "Es Jeruk      ";
		minuman[2] = "Es Kopi       ";
		minuman[3] = "Es Teh Panas  ";
		minuman[4] = "Kopi Panas    ";
		minuman[5] = "Teh Jahe      ";
		minuman[6] = "Kopi Susu     ";
		minuman[7] = "STMJ          ";
		minuman[8] = "Susu Anget    ";
		minuman[9] = "Es Susu       ";
		minuman[10] = "Air Mineral   ";

		harga_minum[0] = 3000;
		harga_minum[1] = 3000;
		harga_minum[2] = 3000;
		harga_minum[3] = 4000;
		harga_minum[4] = 3500;
		harga_minum[5] = 4000;
		harga_minum[6] = 10000;
		harga_minum[7] = 4000;
		harga_minum[9] = 4000;
		harga_minum[9] = 4000;
		harga_minum[10] = 2500;

		stok_minuman[0] = 30;
		stok_minuman[1] = 30;
		stok_minuman[2] = 30;
		stok_minuman[3] = 30;
		stok_minuman[4] = 30;
		stok_minuman[5] = 30;
		stok_minuman[6] = 30;
		stok_minuman[7] = 30;

// --------------- meja

		for (i = 0 ; i < batas_meja ; i++) {
			
			mejaa[i] = false;

		}

		mejaa[1] = true;
		mejaa[5] = true;
		mejaa[6] = true;
		mejaa[2] = true;
		mejaa[25] = true;


		login_form();

	}

	static void login_form() {

		isRunning = true;
		while (isRunning == true && exit == false ) {

			username_form = "";
			password_form = "";

			System.out.println("================================================");
			System.out.println("                           LOGIN AYAM NELANGSAY ");
			System.out.println("================================================");

			System.out.print("\nUsername\t: ");
			username_form = sc.nextLine();
			System.out.print("Password\t: ");
			password_form = sc.nextLine();


			for (admin = 0; admin < totadmin; admin++) {

			if (username_form.equals(username[admin]) && password_form.equals(password[admin])) {

					System.out.println("\n           BERHASIL");
					isRunning = false;
					index_admin = admin;
					main_menu();
					break;

				}

			}

			System.out.println("\n================================================");
		}
		isRunning = true;
	}



	static void main_menu() {

		isRunning = true;
		while (isRunning == true) {

			System.out.println("================================================");
			System.out.println("                          MAIN MENU THIS KASEER ");
			System.out.println("================================================");
			System.out.println("[1] Data menu makanan");
			System.out.println("[2] Pembelian");
			System.out.println("[3] Laporan Pendapatan");
			if (index_admin ==  0) {
				System.out.println("[4] Data admin");
			}
			System.out.println("\n[99] Logout ");
			System.out.println("[00] Keluar Program");
			System.out.println("");

			System.out.print("> ");
			option = sc.nextLine();

			switch (option) {

				case "1":
					menu_atur_makanan();
					break;

				case "2":
					menu_beli();
					break;

				case "3":
					show_reports();
					break;

				case "4":
					if (index_admin == 0) {
						menu_admin();
					} else {
						System.out.println("Inputan tidak valid");
					}
					break;

				case "99":
					System.out.println("Anda telah logout");
					isRunning = false;
					break;

				case "00":
					System.out.println(" ---------- PROGRAM BERHENTI ------------");
					exit = true;
					isRunning = false;
					break;

				default:
					System.out.println("Inputan tidak valid");

			}

		}
		isRunning = true;


	}

// -----------------------------------------------------------MENU ADMIN

    static void menu_admin() {

		while ( isRunning == true ) {

    	System.out.println("================================================");
	    System.out.println("                                     MENU ADMIN ");
		System.out.println("================================================");
		System.out.println("[1] Lihat data admin");
		System.out.println("[2] Tambah data admin");
		System.out.println("[3] Edit data admin");
		System.out.println("[4] Hapus data admin");
		System.out.println("[99] Kembali");
		System.out.print("> ");
		option = sc.nextLine();
		System.out.println("================================================");

		switch (option) {

				case "1":
					show_admin();
					break;

				case "2":
					add_admin();
					break;

				case "3":
					edit_admin();
					break;

				case "4":
					hapus_admin();
					break;

				case "99":
					isRunning = false;
					break;

				default:
					System.out.println("Inputan tidak valid");

			}
		}
		isRunning = true;

    }

	static void add_admin() {

		while (isRunning == true) {

	    	System.out.println("================================================");
		    System.out.println("                                   TAMBAH ADMIN ");
			System.out.println("================================================");
			System.out.println("[1] Lihat data admin");
			System.out.println("[2] Masukkan data admin");
			System.out.println("[99] Kembali\n");
			System.out.print("> ");
			option = sc.nextLine();
			System.out.println("================================================");
			switch (option) {

				case "1":
					show_admin();
					break;

				case "2":
					insert_admin_next();
					break;

				case "99":
					isRunning = false;
					break;

				default:
					System.out.println("Inputan tidak valid");

			}
		}
		isRunning = true;

	}

	static void insert_admin_next() {

		do {
			{

			    System.out.print("Username \t: ");
				admin_baru = sc.nextLine();

				barang_sama = false;

				for (data = 0; data < totadmin ; data++) {

					if (admin_baru.equals(username[data])) {
						barang_sama = true;
					}

				}

				if (barang_sama == false) {
					break;
				} else {
					System.out.println("Username sudah ada, silahkan isi kembali ..");
				}

			}
		} while ( isRunning == true );

		System.out.print("Password \t: ");
		password_baru = sc.nextLine();

		username[totadmin] = admin_baru;
		password[totadmin] = password_baru;
		
		totadmin ++;

		System.out.println("\n SELESAI ..");


	}

	static void edit_admin() {

		isRunning = true;
		while (isRunning == true) {

	    	System.out.println("================================================");
		    System.out.println("                                     EDIT ADMIN ");
			System.out.println("================================================");
			System.out.println("[1] Lihat data admin");
			System.out.println("[2] Ganti password admin");
			System.out.println("[99] Kembali");
			System.out.print("> ");
			option = sc.nextLine();
			System.out.println("================================================");

			switch (option) {

				case "1":
					show_admin();
					break;

				case "2":
					show_admin();
					edit_admin_next();
					break;

				case "99":
					isRunning = false;
					break;

			}

		}
		isRunning = true;

	}

	static void edit_admin_next() {

		do {
			{
				System.out.print("Pilih id: ");
	    		data = sc.nextInt();

	    		for (admin = 0; admin < totadmin; admin++) {

					if (data > 0 && data <= totadmin) {

						if (username[data-1] != null) {
							index_admin = data-1;
							edit_password();
							break;							
						} 

					}

				}

				if (index_admin == data-1) {
					break;
				} else {
					System.out.println("Username tidak ditemukan, silahkan isi kembali");
				}

			}
		} while ( isRunning == true );

	}

	/*static void edit_username() {

    	System.out.println("================================================");

	   	System.out.print("Edit username ? (Y/n)");
	   	pilih = sc.next().charAt(0);

	   	do {
	   		{

	   			if (pilih == 'Y' || pilih == 'y') {

					System.out.println("================================================");
					System.out.println("Username lama\t: " + username[data-1]);
	   				
					barang_sama = false;
	   				do {
						{

							System.out.print ("Username baru\t: ");
							sc.nextLine();
							username_edit = sc.nextLine();
							


							for (data = 0; data < totadmin ; data++) {

								if (username_edit.equals(username[data-1])) {
									barang_sama = true;
								}

							}

							if (barang_sama == true) {
								System.out.println("username sudah ada, silahkan isi kembali ..");
							} else {
								break;
							}

						}
					} while ( isRunning == true );
					username[data-1] = username_edit;
					edit_password();
					break;

				} else if (pilih == 'N' || pilih == 'n') {

					edit_password();
					break;

				} else {

					System.out.println("Inputan tidak valid");

				}
			}
		} while ( isRunning == true );

    }*/

    static void edit_password() {

    	System.out.println("================================================");

	   	System.out.print("Edit password ? (Y/n)");
	   	pilih = sc.next().charAt(0);

	   	sc.nextLine();
	   	do {
	   		{

	   			if (pilih == 'Y' || pilih == 'y') {

					System.out.println("================================================");
					System.out.println("Password lama\t: " + password[data-1]);

					System.out.print  ("Password baru\t: ");
					password_edit = sc.nextLine();
	
					password[data-1] = password_edit;
					isRunning = false;
					break;

				} else if (pilih == 'N' || pilih == 'n') {

					isRunning = false;
					break; 

				} else {

					System.out.println("Inputan tidak valid");

				}
			}
		} while ( isRunning == true );

    }

	static void hapus_admin() {

		while (isRunning == true) {

    		System.out.println("================================================");
		    System.out.println("                                   DELETE ADMIN ");
			System.out.println("================================================");
			System.out.println("[1] Lihat Data");
			System.out.println("[2] Delete Data");
			System.out.println("[99] Kembali\n");
			System.out.print(">  ");
			option= sc.nextLine();
			System.out.println("================================================");

			switch (option) {

				case "1":
					show_admin();
					break;

				case "2":
					hapus_admin_next();
					break;

				case "99":
					isRunning = false;
					break;

				default:
					System.out.println("Inputan tidak valid");

			}

		}
    	isRunning = true;

	}

	static void hapus_admin_next() {

		while (isRunning == true) {

	    	System.out.print("Pilih id: ");
	    	pilih_kode = sc.nextInt();
	    	if (pilih_kode > 0 && pilih_kode < totadmin+1 && username[pilih_kode-1] != null) {


				System.out.println("================================================");
	    		System.out.println("Username \t : " + username[pilih_kode-1]);
	    		System.out.println("Password \t : " + password[pilih_kode-1]);

	    		do {
	    			{

	    				System.out.print("Apakah anda yakin akan menghapus data ini ? ");
			    		pilih = sc.next().charAt(0);

			    		if (pilih == 'Y' || pilih == 'y') {

							username[pilih_kode-1] = username[totadmin];
							password[pilih_kode-1] = password[totadmin];
							//totdata--;
							System.out.println("================================================");
							break;

						} else if (pilih == 'N' || pilih == 'n') {

							break;

						} else {

					    	System.out.println("Inputan tidak valid");

						}

	    			}
	    		} while ( isRunning == true);
	    		break;

	    	} else {

	    		System.out.println("Inputan tidak valid");

	    	}

    	}
    	isRunning = true;


	}

    static void show_admin() {

    	System.out.println("\n================================================");
        System.out.println("\tUsername  \t  Password");
        for ( admin = 0; admin < totadmin; admin++) {

        	if (username[admin] == null) {
        		continue;
        	} else {
				System.out.println("| ["+ (admin+1) +"] "+ username[admin] + "\t|  " + password[admin] + " ");
        	}

        }
        System.out.println("\n================================================");

    }

    // -----------------------------------------------------------MENU MAKANAN
    // -----------------------------------------------------------MENU MAKANAN
    // -----------------------------------------------------------MENU MAKANAN
    // -----------------------------------------------------------MENU MAKANAN
    // -----------------------------------------------------------MENU MAKANAN
    // -----------------------------------------------------------MENU MAKANAN
    // -----------------------------------------------------------MENU MAKANAN
    // -----------------------------------------------------------MENU MAKANAN

    static void menu_atur_makanan() {

    	while (isRunning == true) {

	    	System.out.println("================================================");
	    	System.out.println("                            MENU PRODUK MAKANAN ");
			System.out.println("================================================");
	    	System.out.println("[1] Insert");
	    	System.out.println("[2] Edit");
	    	System.out.println("[3] Delete");
	    	System.out.println("[4] Tambah stok");
	    	System.out.println("[5] Lihat data");
	    	System.out.println("[99] kembali \n");

	    	System.out.print("> ");
			option = sc.nextLine();

			switch (option) {

				case "1":
					insert_data();
					break;

				case "2":
					edit_data();
					break;

				case "3":
					delete_data();
					break;

				case "4":
					tambah_stok();
					break;

				case "5":
					show_menu();
					break;

				case "99":
					isRunning = false;
					break;

				default:
					System.out.println("Inputan tidak valid");

			}
		}
		isRunning = true;

    }

    static void show_menu() {

        System.out.println("\n================================================");
        for ( makan = 0; makan < totdata; makan++) {
        	if (harga_makan[makan] == 0 && stok_makanan[makan] == 0) {
        		continue;
        	} else {
				System.out.println("["+ (makan+1) +"] "+ makanan[makan] + "\t = " + harga_makan[makan] + " \tstok("+ stok_makanan[makan] +")");
        	}
        }
        System.out.println("\n================================================");

    }
    
    static void insert_data() {

    	while (isRunning == true) {

	    	System.out.println("================================================");
		    System.out.println("                                          INSERT");
			System.out.println("================================================");
			System.out.println("[1] Lihat data");
			System.out.println("[2] Masukkan data");
			System.out.println("[99] Kembali\n");
			System.out.print("> ");
			option = sc.nextLine();
			System.out.println("================================================");
			switch (option) {

				case "1":
					show_menu();
					break;

				case "2":
					insert_data_next();
					break;

				case "99":
					isRunning = false;
					break;

				default:
					System.out.println("Inputan tidak valid");

			}
		}
		isRunning = true;




    }

    static void insert_data_next() {

		do {
			{

			    System.out.print("Nama \t: ");
				barang_baru = sc.nextLine();

				barang_sama = false;

				for (data = 0; data < totdata ; data++) {

					if (barang_baru.equals(makanan[data])) {
						barang_sama = true;
					}

				}

				if (barang_sama == false) {
					break;
				} else {
					System.out.println("Nama sudah ada, silahkan isi kembali ..");
				}

			}
		} while ( isRunning == true );
		isRunning = true;

		do {
			{

				System.out.print("Harga \t: ");
				harga_baru = sc.nextInt();

				if (harga_baru >= 0) {
					break;
				} else {
					System.out.println("Inputan tidak valid");
				}

			}
		} while ( isRunning == true );

		do {
			{

				System.out.print("Stok \t: ");
				stok_baru = sc.nextInt();

				if (stok_baru >= 0) {
					break;
				} else {
					System.out.println("Inputan tidak valid");
				}

			}
		} while ( isRunning == true);

		makanan[totdata] = barang_baru;
		harga_makan[totdata] = harga_baru;
		stok_makanan[totdata] = stok_baru;

		totdata ++;

		System.out.println("\n SELESAI ..");


    }

    static void edit_data() {

    	isRunning = true;
    	while (isRunning == true) {

	    	System.out.println("================================================");
		    System.out.println("                                           EDIT ");
			System.out.println("================================================");
			System.out.println("[1] Edit data");
			System.out.println("[2] Lihat data");
			System.out.println("[99] Kembali");
			System.out.print("> ");
			option = sc.nextLine();
			System.out.println("================================================");

			switch (option) {

				case "1":
					show_menu();
					edit_data_next();
					break;

				case "2":
					show_menu();
					break;

				case "99":
					isRunning = false;
					break;

			}

		}
		isRunning = true;

    }

    static void edit_data_next() {

    	while (isRunning == true) {

    		System.out.print("Masukkan kode barang (99 untuk kembali):");
    		pilih_kode = sc.nextInt();

    		if (pilih_kode >= 0 && pilih_kode <= totdata && harga_makan[pilih_kode-1] != 0 && stok_makanan[pilih_kode-1] != 0) {

    			edit_nama();
    			break;

    		} else if (pilih_kode == 99) {

    			break;

    		} else {

    			System.out.println("Inputan tidak valid");

    		}

    	}
    	isRunning = true;

    }

    static void edit_nama() {

    	while (isRunning == true) {

    		System.out.println("================================================");

	    	System.out.print("Edit nama ? (Y/n)");
		   	pilih = sc.next().charAt(0);

			if (pilih == 'Y' || pilih == 'y') {

				System.out.println("================================================");
				System.out.println("Nama lama\t: " + makanan[pilih_kode-1]);
				sc.nextLine();
				do {
					{

						System.out.print  ("Nama baru\t: ");
						barang_edit = sc.nextLine();

						barang_sama = false;

						for (data = 0; data < totdata ; data++) {

							if (barang_edit.equals(makanan[data])) {
								barang_sama = true;
							}

						}

						if (barang_sama == false) {
							break;
						} else {
							System.out.println("Nama sudah ada, silahkan isi kembali ..");
						}

					}
				} while ( isRunning == true );
				makanan[pilih_kode-1] = barang_edit;
				System.out.println("================================================");
				edit_harga();
				break;

			} else if (pilih == 'N' || pilih == 'n') {

				edit_harga();
				break;

			} else {

				System.out.println("Inputan tidak valid");

			}

		}
    	isRunning = true;

    }

    static void edit_harga() {

    	while (isRunning == true) {

	    	System.out.print("Edit harga ? (Y/n)");
	    	pilih = sc.next().charAt(0);

			if (pilih == 'Y' || pilih == 'y') {

				System.out.println("================================================");
				System.out.println("Harga lama\t: " + harga_makan[pilih_kode-1]);
				while (isRunning == true ) {

					System.out.print  ("Harga baru\t: ");
					harga_edit = sc.nextInt();
					
					if (harga_edit >= 0) {
						break;
					} else {
						System.out.println("Inputan tidak valid");
					}

				}
				harga_makan[pilih_kode-1] = harga_edit;
				System.out.println("================================================");
				break;

			} else if (pilih == 'N' || pilih == 'n') {

				isRunning = false;
				break;

			} else {

			    System.out.println("Inputan tidak valid");

			}

		}
    	isRunning = true;


    }

    static void delete_data() {

    	while (isRunning == true) {

    		System.out.println("================================================");
		    System.out.println("                                          DELETE");
			System.out.println("================================================");
			System.out.println("[1] Lihat Data");
			System.out.println("[2] Delete Data");
			System.out.println("[99] Kembali\n");
			System.out.print(">  ");
			option= sc.nextLine();
			System.out.println("================================================");

			switch (option) {

				case "1":
					show_menu();
					break;

				case "2":
					delete_data_next();
					break;

				case "99":
					isRunning = false;
					break;

				default:
					System.out.println("Inputan tidak valid");

			}

		}
    	isRunning = true;

    }

    static void delete_data_next() {

    	while (isRunning == true) {

	    	System.out.print("Pilih kode data :");
	    	pilih_kode = sc.nextInt();
	    	if (pilih_kode > 0 && pilih_kode < totdata+1) {

				System.out.println("================================================");
	    		System.out.println(makanan[pilih_kode-1]+" \t\t= "+harga_makan[pilih_kode-1]+" \t\tstok("+stok_makanan[pilih_kode-1]+")");

	    		do {
	    			{

	    				System.out.print("Apakah anda yakin akan menghapus data ini ? ");
			    		pilih = sc.next().charAt(0);

			    		if (pilih == 'Y' || pilih == 'y') {

							makanan[pilih_kode-1] = makanan[totdata];
							harga_makan[pilih_kode-1] = harga_makan[totdata];
							stok_makanan[pilih_kode-1] = stok_makanan[totdata];
							//totdata--;
							System.out.println("================================================");
							break;

						} else if (pilih == 'N' || pilih == 'n') {

							break;

						} else {

					    	System.out.println("Inputan tidak valid");

						}

	    			}
	    		} while ( isRunning == true);
	    		break;

	    	} else {

	    		System.out.println("Inputan tidak valid");

	    	}

    	}
    	isRunning = true;

    }

    static void tambah_stok() {

    	while (isRunning == true) {

	    	System.out.println("================================================");
		    System.out.println("                                    TAMBAH STOK ");
			System.out.println("================================================");
			System.out.println("[1] Lihat Data");
			System.out.println("[2] Tambah Stok");
			System.out.println("[99] Kembali\n");
			System.out.print(">  ");
			option= sc.nextLine();
			System.out.println("================================================");

			switch (option) {

				case "1":
					show_menu();
					break;

				case "2":
					show_menu();
					tambah_stok_next();
					break;

				case "99":
					isRunning = false;
					break;

				default:
					System.out.println("Inputan tidak valid");

			}

		}
    	isRunning = true;

    }

    static void tambah_stok_next() {

		tambah_stok = 0;

    	do {
    		{

					System.out.print("Pilih kode data :");
					pilih_kode = sc.nextInt();
					if (pilih_kode >= 0 && pilih_kode < totdata+1 && harga_makan[pilih_kode-1] != 0 && stok_makanan[pilih_kode-1] != 0) {
						break;
					} else {
		    			System.out.println("Inputan tidak valid");
		    		}

			}
    	} while ( isRunning == true );


	    		System.out.println("================================================");
	    		System.out.println( makanan[pilih_kode-1] +"\t Stok lama = "+ stok_makanan[pilih_kode-1]);


			do {
				{

					System.out.print("Tambah berapa ? ");
					tambah_stok = sc.nextInt();

					if ( tambah_stok > 0 ) {

							stok_makanan[pilih_kode-1] = stok_makanan[pilih_kode-1] + tambah_stok;
							System.out.println( makanan[pilih_kode-1] +"\t Stok baru = "+ stok_makanan[pilih_kode-1]);
							System.out.println("================================================");

							break;

					} else {

						System.out.println("Inputan tidak valid");

					}



				}
			} while ( isRunning == true );

    }


	static void menu_beli() {

		do {
			{

				show_menu();

				do {
					{

						System.out.print("Pilih makanan : ");
						pilihmakan = sc.nextInt();

						if  ( pilihmakan > 0 && pilihmakan <= totdata && harga_makan[pilihmakan-1] != 0 && stok_makanan[pilihmakan-1] != 0 ) {
							break;
						} else {
							System.out.println("Inputan tidak valid");
						}

					}
				} while ( isRunning == true );

				do {
					{

						System.out.print("Berapa banyak ? ");
						jummakan = sc.nextInt();

						if ( jummakan > 0 && jummakan <= stok_makanan[pilihmakan-1]) {

							if ( jummakan > stok_makanan[pilihmakan-1]) {
								System.out.println("Inputan melebihi stok.");
							} 
							stok_makanan[pilihmakan-1] = stok_makanan[pilihmakan-1] - jummakan;
							break;

						} else {

							System.out.println("Inputan tidak valid. ");

						}

					}
				} while ( isRunning == true );

				//semuamakan.add(totbeli, pilihmakan-1);
				//totmakan.add(totbeli, jummakan);

				semuamakan[totbeli] = pilihmakan-1;
				totmakan[totbeli] = jummakan;
				totharga[totbeli] = harga_makan[totbeli] * totmakan[totbeli];

				totbeli++;
				totitem = totitem + jummakan;

				System.out.println("");

				do {
					{

						System.out.print("Ada yang lain ? (Y/n) ");
						pilih = sc.next().charAt(0);

						if (pilih == 'y' || pilih == 'Y') {
							break;
						} else if (pilih == 'n' || pilih == 'N') {
							break;
						} else {
							System.out.println("Inputan tidak valid");
						}

					}
				} while ( isRunning = true );

			}
		} while (pilih == 'y' || pilih == 'Y');

		totalharga = 0;
		kembalian = 0;

		info_in();

		System.out.println("================================================");

		proses_bayar();

		System.out.println("================================================");

		nota();

		report();

	}



// -------------------------------------------------------------------------------//
// ------------------------- NOTAAAAAAAAAAAAAAAA ---------------------------------//
// -------------------------------------------------------------------------------//

	static void nota() {

		header();
		info();
		list_beli();
		footer();

	}


	static void proses_bayar() {

		for (int ma = 0; ma < totbeli; ma++) {

			asd = semuamakan[ma];
			qwe = totmakan[ma];
			totharga[ma] = harga_makan[asd] * qwe;
			System.out.println(makanan[asd]);
			System.out.println("\t"+harga_makan[asd] +" x "+ qwe + " \t\t\t " + totharga[ma]);
			totalharga = totalharga + totharga[ma];

		}

		System.out.println("================================================");
		System.out.println("Total harga  :\t\t\t\t " + totalharga);
		System.out.println("================================================");

		proses_bayar_next();

		/*do {
			{

				System.out.println(" Lanjutkan ? (Y/n) ");
				pilih = sc.next().charAt(0);

				if (pilih == 'y' || pilih == 'Y') {
					proses_bayar_next();
					break;
				} else if (pilih == 'n' || pilih == 'N') {
					menu_batal_pesan();
				} else {
					System.out.println("Inputan tidak valid");
				}
				
			}
		} while ( isRunning == true );*/


	}

	static void proses_bayar_next() {

			do {
			{

				System.out.print  ("Bayar        :\t\t\t\t ");
				bayar = sc.nextInt();

				if (bayar > 0 && bayar <= 10000000) {
					if (bayar < totalharga) {
						System.out.println("  UANG KURANG ");
					} else {
						break;
					}
				} else {
					System.out.println("Inputan tidak valid");
				}

			}
		} while (isRunning == true);

		kembalian = bayar - totalharga;

	}

	static void info_in() {

		isRunning = true;
		while (isRunning == true) {

			System.out.println("================================================");

			System.out.print("Pembeli : " );
			sc.nextLine();
			pembeli = sc.nextLine();

			do {
				{

					System.out.print("Bawa pulang ? (Y/n)  ");
					piilih = sc.next().charAt(0);
					if (piilih == 'y' || piilih == 'Y') {
						status = "*bawa pulang*";
						break;
					} else if (piilih == 'n' || piilih == 'N') {
						status = "*makan ditempat*";
						break;
					} else {
						System.out.println("Inputan tidak valid");
					}

				}
			} while ( isRunning == true );

			if (status == "*makan ditempat*") {
			
				do {
				{

					System.out.print("Meja (30 meja) : " );
					meja = sc.nextInt();

					if ( meja > 0 && meja <= batas_meja) {
						if ( mejaa[meja-1] == false) {
							mejaa[meja-1] = true;
							break;
						} else {
							System.out.println("Meja sedang ditempati");
						}
					} else {
						System.out.println("Inputan tidak valid");
					}

					}
				} while ( isRunning == true );


			} 

			System.out.println("================================================");

			break;

		}

	}

	static void header() {


		System.out.println("||================================================||");
		System.out.println("||                                                ||");
		System.out.println("||          _------_                              ||");
		System.out.println("||         /  _____ \\                             ||");
		System.out.println("||  ____--/  ( 0 /   \\         AYAM GORENG        ||");
		System.out.println("|| /_______  ^^^^     |             NELONGSO      ||");
		System.out.println("||  \\_____           /                            ||");
		System.out.println("||        \\         /                             ||");
		System.out.println("||        /        /                              ||");
		System.out.println("||       /        (                               ||");
		System.out.println("||      (          \\                              ||");
		System.out.println("||       \\           \\                            ||");
		System.out.println("||        -___________-/                          ||");
		System.out.println("||                                                ||");
		System.out.println("||                                                ||");
		System.out.println("||                                                ||");
		System.out.println("||          AYAM GORENG NELONGSO SULFAT           ||");
		System.out.println("||        Jln. Raya Sulfat No. 108, Malang        ||");
		System.out.println("||             Telp: (083) - 113388512            ||");
		System.out.println("||------------------------------------------------||");

	}

	static void info() {

		System.out.println("||                                                ||");
		System.out.println("|| Kode nota :\t\t\t AYMNLGSO" + kode_transaksi + "      ||");
		System.out.println("|| Tanggal : \t\t\t" + Date() +" "+ Time() + "  ||");
		System.out.println("|| User    : \t\t\t\t" + username_form+ "\t  ||");
		System.out.println("|| Pembeli : \t\t\t\t" + pembeli+ "\t  ||");
		System.out.println("|| Meja    : \t\t\t\t" + meja+ "\t  ||");
		System.out.println("|| Status  : \t\t\t" + status+ "\t  ||");
		System.out.println("||                                                ||");
		System.out.println("||------------------------------------------------||");


	}

	static void list_beli() {

		for (int ma = 0; ma < totbeli; ma++) {

			asd = semuamakan[ma];
			qwe = totmakan[ma];
			System.out.println("|| "+makanan[asd]+ "\t\t\t\t  ||");
			System.out.println("||\t"+harga_makan[asd] +" x "+ qwe + " \t\t\t " + totharga[ma] +"\t  ||");

		}

		System.out.println("||------------------------------------------------||");
		System.out.println("||                                                ||");
		System.out.println("|| "+totitem +"  ITEMS \t\t\t\t\t  ||");
		System.out.println("||   TOTAL HARGA \t\t\t " + totalharga + "\t  ||");
		System.out.println("||   BAYAR \t\t\t\t " + bayar+ "\t  ||");
		System.out.println("||                                                ||");
		System.out.println("||   KEMBALI \t\t\t\t " + kembalian+ "\t  ||");
		System.out.println("||                                                ||");
		System.out.println("||------------------------------------------------||");

	}

	static void footer() {

		System.out.println("||------------------------------------------------||");
		System.out.println("||                                                ||");
		System.out.println("||        Terima Kasih atas Kunjungan Anda        ||");
		System.out.println("||               www.nelangsay.com                ||");
		System.out.println("||             IG: @ayamnelangsay                 ||");
		System.out.println("||             FB: GriyaNelangsay                 ||");
		System.out.println("|| *Note : Nota yang telah tercetak tidak dapat   ||");
		System.out.println("||                 dibatalkan                     ||");
		System.out.println("||                                                ||");
		System.out.println("||================================================||");

	}

	static void show_reports() {

		System.out.println("================================================");
		System.out.println("                       TABEL LAPORAN PENDAPATAN ");
		System.out.println("================================================");

			System.out.println("________________________________________________________________________________");
			System.out.println("| Penjualan | Kode Nota \t| Admin \t| Tanggal   \t| Pendapatan \t|");
			System.out.println("________________________________________________________________________________");

		for (re = 1 ; re <= lap ; re++) {

			System.out.print("|    "+ re +"\t    ");
			System.out.print("| AYMNLGSO"+ report_kode_transaksi[re-1]+"\t");
			System.out.print("| "+   report_admin[re-1]+"\t\t");
			System.out.print("| "+   report_tanggal[re-1]+"\t");
			System.out.print("| "+   report_omset[re-1]+" \t|\n");

		}

			System.out.println("________________________________________________________________________________");

		System.out.println("");

	}


	static void report() {

		report_kode_transaksi[lap] = kode_transaksi;
		report_admin[lap] = username_form;
		report_tanggal[lap] = Date();
		report_omset[lap] = totalharga;

		lap++;
		kode_transaksi++;

		reset();

	}

	static void reset() {

		for ( int i = 0; i < totbeli; i++) {

			semuamakan[i] = 0;
			totmakan[i] = 0;
			totharga[i] = 0;


		}
			totbeli = 0;

	}

	static int kali(int a, int b) {

		int c = a * b;
		return c;

	}

	static String Date() {

        DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
        return dateFormat.format(date);

    }

    static String Time() {

        DateFormat dateFormat = new SimpleDateFormat("hh:mm");
        return dateFormat.format(date);

    }

}
