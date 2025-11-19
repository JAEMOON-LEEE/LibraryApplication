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
    public void registerOneBorrower(String name, int stID)
    {
        Borrower borrowerA = new Borrower("전영준", 2022320022);
        borrowerDB.saveBorrower(borrowerA);
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public String LendOneBook(int catalogueNumber, int stID)
    {
        Book bookA = BookDB.findOneBook(catalogueNumber);
        Borrower borrowerA = BorrowerDB.findOneBorrower(stID);
        if(bookA.check()==true && borrowerA.check()==true){
            Loan loanA = new Loan(bookA,borrowerA);
            LoanDB.saveLoan(loanA);
            System.out.println("대출완료");
        }
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