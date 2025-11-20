import java.util.Iterator;
import java.util.Scanner;

/**
 * LibrarayApplication 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class LibraryApplication
{
    private String name;
    private BookDB bookDB;
    private BorrowerDB borrowerDB;
    private LoanDB loanDB;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryApplication app = new LibraryApplication();

        while(true) {
            System.out.println("\n===== 도서관 시스템 =====");
            System.out.println("1. 도서 대출");
            System.out.println("2. 회원 등록");
            System.out.println("3. 대출 중인 현황");
            System.out.println("4. 대출 가능한 현황");
            System.out.println("0. 종료");
            System.out.print("메뉴 선택: ");

            int menu = scanner.nextInt();
            scanner.nextLine();

            switch(menu) {

                case 1:
                    System.out.print("대출할 책의 번호 입력: ");
                    int bookID = scanner.nextInt();
                    System.out.print("회원 학번 입력: ");
                    int stID = scanner.nextInt();

                    String lendResult = app.lendOneBook(bookID, stID);
                    System.out.println(lendResult);
                    break;

                case 2:
                    System.out.print("회원 이름 입력: ");
                    String name = scanner.nextLine();
                    System.out.print("학번 입력: ");
                    int newID = scanner.nextInt();

                    String saveResult = app.registerOneBorrower(name, newID);
                    System.out.println(saveResult);
                    break;

                case 3:
                    System.out.println("\n=== 대출 중인 책 ===");
                    System.out.println(app.displayBooksOnLoan());
                    break;

                case 4:
                    System.out.println("\n=== 대출 가능한 책 ===");
                    System.out.println(app.displayBooksForLoan());
                    break;

                case 0:
                    System.out.println("프로그램 종료");
                    return;
            }
        }
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public LibraryApplication()
    {
        this.name = name;
        bookDB = new BookDB();
        borrowerDB = new BorrowerDB();
        loanDB = new LoanDB();
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public String registerOneBorrower(String name, int stID)
    {
        Borrower borrowerB = borrowerDB.findOneBorrower(stID);
        if(borrowerB != null){
            return "중복등록";}
        Borrower borrowerA = new Borrower(name, stID);
        return borrowerDB.saveBorrower(borrowerA);
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public String lendOneBook(int catalogueNumber, int stID)
    {
        Book bookA = bookDB.findOneBook(catalogueNumber);
        if(bookA==null){
            return "등록되지 않은 책입니다.";
        }
        Borrower borrowerA = borrowerDB.findOneBorrower(stID);
        if(borrowerA == null){
            return "등록되지 않은 이용자 입니다.";}
        if(bookA.check() == false){
            return "이미 대출된 책입니다.";
        }
        if(borrowerA.check() == false){
            return "대출 건수 초과";
        }
        Loan loanA = new Loan(bookA, borrowerA);
        loanDB.saveLoan(loanA);
        borrowerA.increaseLoanCount();

        return "대출완료:" + loanA.toString();
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public String displayBooksForLoan()
    {
        return bookDB.getAvailableBook();
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public String displayBooksOnLoan()
    {
        return bookDB.getUnavailableBook();
    }

}