/**
 * Borrower 이용자 정보(이름, 고유번호, 대출 건수)
 * 
 * @author (PBL#6팀(,2022320022_전영준)
 * @version (2025.12.10)
 */
public class Borrower {

    private String name;
    private int stID;
    private int loanCount;

    /**
     * Borrower 클래스의 객체 생성자
     *
     * @param name 이름
     * @param stID 학번
     */
    public Borrower(String name,int stID){
        this.name = name;
        this.stID = stID;
        loanCount = 0;
    }

    /**
     * 대출 가능 여부를 확인하는 메소드
     *
     * @return 대출 가능 여부 반환
     */
    public boolean check(){
        return loanCount <11;
    }

    /**
     * 이용자 ID를 반환하는 메소드
     *
     * @return 학번
     */
    public int getID(){
        return this.stID;
    }

    /**
     * 대출건 수를 증가시키는 메소드
     */
    public void increaseLoanCount(){
        loanCount++;
    }

    /**
     * 대출건 수를 감소시키는 메소드
     */
    public void decreaseLoanCount(){
        loanCount--;
    }
    
    /**
     * 이용자 정보를 반환하는 메소드
     *
     * @return 이용자 정보 문자열
     */
    public String toString(){
        return "이름:"+name+"  학번:"+stID;
    }
}
