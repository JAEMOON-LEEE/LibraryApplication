import java.util.Iterator;
import java.util.ArrayList;

/**
 * LoanDB 대출정보를 저장 및 관리
 * 
 * @author (PBL#6팀(2022320038_이재문,2022320022_전영준,2022320019_김승현)
 * @version (2025.12.10)
 */
public class LoanDB {

    private ArrayList<Loan> loanDB;

    /**
     * LoanDB 클래스의 객체 생성자
     */
    public LoanDB(){
        loanDB = new ArrayList<Loan>();
    }

    /**
     * 대출 정보를 저장하는 메소드
     *
     * @param loanA 대출 객체
     * @return      저장 완료 메시지 반환
     */
    public String saveLoan(Loan loanA){
        loanDB.add(loanA);
        return "저장완료";
    }

    /**
     * 대출 객체를 찾는 메소드
     *
     * @param catalogueNumber 책 번호
     * @param stID            이용자 ID
     * @return                해당 대출 정보 반환
     */
    public Loan findLoanData(int catalogueNumber, int stID){
        Iterator<Loan> iter = loanDB.iterator();
        while (iter.hasNext()){
            Loan loanA = (Loan) iter.next();
            if(loanA.getBook().getID()==catalogueNumber&&loanA.getBorrower().getID()==stID){
                return loanA;
            }

        }
        return null;

    }

    /**
     * 대출 정보를 삭제하는 메소드
     *
     * @param loanA  삭제할 Loan 객체
     * @return        삭제 성공 여부를 반환
     */
    public void removeLoan(Loan loanA){
        loanDB.remove(loanA);
    }
}
