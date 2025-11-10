
/**
 * LibrarayApplication 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class LibraryApplication
{
    private String name;
    
    public LibraryApplication(String name){
        this.name = name;
    }
    
    public void registerOneBorrower(String name){
        /* 1. User객체 생성 파라메타(이름,고유번호)
         * 2. DB에 저장
         */
    }
    
    public void displayBookForLoan(){
        /* [iierator와 while문 사용]
         * 1. 책한권 요청
         * 2. 대출상태 확인check()메소드 활용
         * 3. 대출가능시 display()메소드로 화면 표시
         */
    }
    
    public void lendOneBook(){
        /* 1. findElement를 사용해서 책과 이용자 검색
         * 2. check()메소드 활용해서 대출가능여부 검사
         * 3. 대출 객체 생성
         * 4. 대출정보를 DB 저장
         * 5. 대출정보 표시
         */
    }
}