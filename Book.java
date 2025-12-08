/**
 * Book 책정보(제목, 저자, 고유번호, 대출상태)
 * 
 * @author (PBL#6팀(2022320019_김승현)
 * @version (2025.12.10)
 */
public class Book{
    private String title;
    private String author;
    private int catalogueNumber;
    private String loanState;

    /**
     * Book 클래스의 객체 생성자
     *
     * @param title            제목
     * @param author           저자
     * @param catalogueNumber  책 번호
     */
    public Book(String title, String author, int catalogueNumber){
        this.title = title;
        this.author = author;
        this.catalogueNumber = catalogueNumber;
        this.loanState = null;
    }

    /**
     * 책의 대출 가능 여부를 확인하는 메소드
     *
     * @return 대출 가능 여부
     */
    public boolean check(){
        return loanState=="";
    }

    /**
     * 책 정보를 출력하는 메소드
     *
     * @return 책 정보
     */
    public void display(){
        System.out.println(this.title+"/"+this.author+"/"+this.catalogueNumber);
    }

    /**
     * 책 고유번호를 반환하는 메소드
     *
     * @return 책 번호
     */
    public int getID(){
        return catalogueNumber;
    }

    /**
     * 책의 대출 상태를 설정하는 메소드
     *
     * @param loanState 대출 상태
     */
    public void setLoanState(String loanState){
        this.loanState=loanState;
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public String toStirng()
    {
        return this.title+"/"+this.author+"/"+this.catalogueNumber;
    }


}
