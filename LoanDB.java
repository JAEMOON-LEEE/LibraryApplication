import java.util.ArrayList;

/**
 * LoanDB 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class LoanDB
{
    private ArrayList<Loan> loanDB;
    /**
     * LoanDB 클래스의 객체 생성자
     */
    public LoanDB()
    {
        this.loanDB = new ArrayList<Loan>();
    }

    /**
     * 예제 메소드 - 이 주석을 사용자에 맞게 바꾸십시오
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 더하기 y의 결과값을 반환
     */
    public String saveLoan(Loan loanA){
        loanDB.add(loanA);
        return loanA.toString();
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public Loan findLoanData(int catalogueNumber, int stID)
    {
        // 여기에 코드를 작성하세요
        return y;
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public boolean removeLoan(Loan loanA)
    {
        return y;
    }
}