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
    
    public Loan(Book book,Borrower borrower,  String loandate, String returndate){
    this.book = book;
    this.borrower = borrower;
    this.loandate = loandate;
    this.returndate = returndate;
}
}