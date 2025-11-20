import java.util.ArrayList;
import java.util.Iterator;

/**
 * BorrwoerDB 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class BorrowerDB
{
    // 인스턴스 변수 - 다음의 예제를 사용자에 맞게 변경하세요.
    private ArrayList<Borrower>borrowerDB;

    /**
     * BorrwoerDB 클래스의 객체 생성자
     */
    public BorrowerDB()
    {
        this.borrowerDB = new ArrayList<Borrower>();
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public String saveBorrower(Borrower borrowerA)
    {
        if(findOneBorrower(borrowerA.getID()) == null) {
            borrowerDB.add(borrowerA);
            return "저장완료";

        }
        return "중복등록";
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */ 
    public Borrower findOneBorrower(int stID)
    {
        Iterator<Borrower> iterator = borrowerDB.iterator();
        while(iterator.hasNext()){
            Borrower borrower = iterator.next();
            if(borrower.getID() == stID){
                return borrower;
            }
        }
        return null;
        }
        
    }