
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
   
   public Borrower(String name, int stID){
       this.name = name;
       this.stID = stID;
   }
   
   public boolean check(){
       return true;
   }
   
   public String getName(){
       return name;
   }
   
   public int getID(){
       return this.stID;
   }
}
