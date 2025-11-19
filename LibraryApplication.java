import java.util.Iterator;

/**
 * LibrarayApplication 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class LibraryApplication
{
    private String name;
    BookDB bookDB;
    BorrowerDB borrowerDB;
    LoanDB loanDB;

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
    public void LendOneBook()
    {
        Book bookA= BookDB.findOneBook(123);
        Borrower borrowerA = BorrowerDB.findOneBorrower(2022320038);
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