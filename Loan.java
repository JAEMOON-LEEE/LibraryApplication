import java.text.SimpleDateFormat;
import java.util.Calendar;

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
        
        Calendar cal = Calendar.getInstance();

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);

        cal.add(Calendar.DATE, 14);
        int returnYear = cal.get(Calendar.YEAR);
        int returnMonth = cal.get(Calendar.MONTH) + 1;
        int retrunDay = cal.get(Calendar.DAY_OF_MONTH);

        this.returndate = returnYear + "-" + returnMonth + "-" + retrunDay;


        this.bookA.setLoanState("대출중");
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public String toString()
    {
        // 여기에 코드를 작성하세요
        return "대출정보:"+bookA.display()+"대출자:"+borrowerA.getName()+ "(" + borrowerA.getID() + ")"  + " / 대출일: " + loandate  + " / 반납예정일: " + returndate;
    }

}
