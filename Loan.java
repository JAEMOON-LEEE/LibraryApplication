/**
 * Loan 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class Loan
{
private String loandate;
private String returndate;
private Book bookA;
private Borrower borrowerA;
    
    public Loan(Book bookA,Borrower borrowerA,  String loandate, String returndate){
    this.bookA = bookA;
    this.borrowerA = borrowerA;
    this.loandate = loandate;
    this.returndate = returndate;
}
}