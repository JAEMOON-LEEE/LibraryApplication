
/**
 * Book 클래스의 설명을 작성하세요.
 *
 * @author (소프트웨ㅇ)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class Book implements Comparable<Book>
{
    private String title;
    private String author;
    private int catalogueNumber;
    private String loanState;

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public Book(String title, String author, int catalogueNumber)
    {
        this.title = title;
        this.author = author;
        this.catalogueNumber = catalogueNumber;
        this.loanState = null;
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public boolean check()
    {
        if(loanState == null){
            return true;}
        return false;

    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public String display()
    {
        return this.title+"/"+this.author+"/"+this.catalogueNumber;
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public int getID()
    {
        // 여기에 코드를 작성하세요
        return this.catalogueNumber;
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public void setLoanState(String state)
    {
        // 여기에 코드를 작성하세요
        this.loanState = state;
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public int compareTo(Book bookA) {
        return this.catalogueNumber - bookA.catalogueNumber;

    }
}