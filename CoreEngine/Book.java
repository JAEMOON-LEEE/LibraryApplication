package CoreEngine;

/**
 * Book 책정보(제목, 저자, 고유번호, 대출상태)
 * 
 * @author (PBL#6팀(2022320019_김승현)
 * @version (2025.12.08)
 */
public class Book implements Comparable<Book>{
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
        return loanState==null;
    }

    /**
     * 책 정보를 출력하는 메소드
     *
     * @return 책 정보
     */
    public String display(){
        return this.title+"/"+this.author+"/"+this.catalogueNumber;
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
     * 책의 정보를 반환하는 메소드
     *
     * @return    책 정보
     */
    public String toString()
    {
        return "책 제목: " + title + ", 저자: " + author + ", 고유번호: " + catalogueNumber; 
    }
    
    /**
     * TreeSet 정렬 기준을 제공하는 메소드
     *
     * @param  y  책 객체
     * @return    정렬 기준
     */
    public int compareTo(Book bookA)
    {
        return this.catalogueNumber - bookA.catalogueNumber;
    }
}
