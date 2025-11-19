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
    
    public Loan(Book bookA,Borrower borrowerA){
    this.bookA = bookA;
    this.borrowerA = borrowerA;
    this.loandate = loandate;
    this.returndate = returndate;
    
    this.bookA.setLoanState("대출중");
}
}
/*
        Calendar cal = Calendar.getInstance();

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);

        String loanDate = "" + year +month + day;
        */