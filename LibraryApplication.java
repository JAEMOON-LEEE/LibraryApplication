import java.util.Iterator;
import java.util.Calendar;

/**
 * LibrarayApplication 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class LibraryApplication
{
    private String name;

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public LibraryApplication()
    {
        this.name = name;
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
        Borrower.setBorrower(borrowerA);
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
        
        Calendar cal = Calendar.getInstance();

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);

        String loanDate = "" + year +month + day;

        bookA.check();
        Loan loanA = new Loan(bookA,borrowerA,loanDate,returnDate);
        LoanDB.setLoan(loanA);
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public void displayBooksForLoan()
    {
        Iterator<book> iter = BookDB.iterator();
        while(iter.hasNext()==true){
            Book book = (Book)iter.next();
            if(book.check()==true){
                book.display();
            }
        }
    }  
}