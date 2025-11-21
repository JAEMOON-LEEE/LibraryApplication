
/**
 * Borrower 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class Borrower
{
   private String name;
   private int stID;
   private int loanCount;
   
   public Borrower(String name, int stID){
       this.name = name;
       this.stID = stID;
       this.loanCount = 0;
   }
   
   public boolean check(){
       return loanCount <11;
   }
   
   public int getID(){
       return this.stID;
   }
   
   public void increaseLoanCount(){
       loanCount++;
   }
   
   public void decreaseLoanCount(){
       loanCount--;
   }
   
   public String getName(){
       return name;
   }
}
