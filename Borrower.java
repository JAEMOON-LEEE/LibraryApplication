
/**
 * Borrower 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class Borrower
{
   private String name;
   private int sID;
   
   public Borrower(String borrowerName, int stID){
       this.name = borrowerName;
       this.sID = stID;
   }
   
   public boolean check(){
       return true;
   }
}
