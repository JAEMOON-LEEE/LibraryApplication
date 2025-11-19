import java.util.TreeSet;
import java.util.Iterator;

/**
 * BookDB 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class BookDB
{
    private TreeSet<Book> bookDB;

    /**
     * BookDB 클래스의 객체 생성자
     */
    public BookDB()
    {
        this.bookDB = new TreeSet<Book>();
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public String findOneBook(int catalogueNumber)
    {
        // 여기에 코드를 작성하세요

        return "hi";
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public String getAvailableBook() {
        String availableBook = ""; 
        Iterator<Book> iter = bookDB.iterator();
        while(iter.hasNext()==true){
            Book book = (Book)iter.next();
            if(book.check()==true){
                availableBook +=book.display()+"\n";
            }
        }
        if(availableBook.equals("")){
            return "대출가능한 책이 없습니다!";
        }
        return availableBook;
    }

    public String getUnavailableBook(){
        String unAvailableBook = ""; 
        Iterator<Book> iter = bookDB.iterator();
        while(iter.hasNext()==true){
            Book book = (Book)iter.next();
            if(book.check()==false){
                unAvailableBook +=book.display()+"\n";
            }
        }
        if(unAvailableBook.equals("")){
            return "대출중인 책이 없습니다!";
        }
        return unAvailableBook;
    }
}