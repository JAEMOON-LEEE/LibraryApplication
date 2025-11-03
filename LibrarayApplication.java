
/**
 * LibrarayApplication 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class LibrarayApplication
{
    private String name;
    
    public Library(String name){
        this.name = name;
    }
    
    public void registerOneBorrower(String name, int stID){
        System.out.println("대출자 등록 완료:");
        System.out.println("이름: " + name);
        System.out.println("학생 ID: " + stID);
    }
    
    public void displayBookForLoan(){
        System.out.println("대출 가능한 책 목록을 표시합니다.");
        System.out.println("소프트웨어 분석설계");
    }
    
    public void lendOneBook(){
        System.out.println("책을 한 권 대출");
    }
}