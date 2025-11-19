
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
   }
   
   public boolean check(){
       if(loanCount < 11){
            System.out.println("대출 가능");
            return true;}
        else{
            System.out.println("대출 불가능");
            return false;
        }
   }
   
   public String getName(){
       return name;
   }
   
   public int getID(){
       return this.stID;
   }
}
