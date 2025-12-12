package CoreEngine;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * BorrowerDB 이용자 정보를 저장 및 관리
 * 
 * @author (PBL#6팀(2022320038_이재문,2022320022_전영준,2022320019_김승현)
 * @version (2025.12.08)
 * 
 */
public class BorrowerDB {
    private ArrayList<Borrower> borrowerDB;

    /**
     * BorrowerDB 클래스의 객체 생성자
     */
    public BorrowerDB() {
        borrowerDB = new ArrayList<Borrower>();
    }

    /**
     * 이용자를 저장하는 메소드
     *
     * @param borrowerA 저장할 이용자객체
     * @return          저장 완료 메시지 반환
     */
    public String saveBorrower(Borrower borrowerA) {
        borrowerDB.add(borrowerA);
        return "저장완료";
    }

    /**
     * 학번으로 이용자를 찾는 메소드
     *
     * @param stID 학번
     * @return     해당 이용자를 반환
     */
    public Borrower findOneBorrower(int stID) {
        Iterator<Borrower> iter = borrowerDB.iterator();
        while (iter.hasNext() == true) {
            Borrower borrowerA = (Borrower) iter.next();
            if (borrowerA.getID() == stID) {
                return borrowerA;
            }
        }
        return null;
    }
}
