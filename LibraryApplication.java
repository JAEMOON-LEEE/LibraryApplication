import java.util.Iterator;

/**
 * LibrarayApplication 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class LibraryApplication
{
    private String name;

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public LibraryApplication()
    {
        this.name = name;
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public void registerOneBorrower(String name, int stID)
    {
        Borrower borrowerA = new Borrower("전영준", 2022320022);
        Borrower.setBorrower(borrowerA);
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public void LendOneBook()
    {
        // 여기에 코드를 작성하세요
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public void displayBooksForLoan()
    {
        Iterator iter = BookDB.iterator();
        while(iter.hasNext()==true){
            Book book = (Book)iter.next();
            if(book.check()==null){
                book.display();
            }
        }
    }  
}