import java.util.TreeSet;
import java.util.Iterator;

/**
 * BookDB 책 정보를 저장 및 관리
 * 
 * @author (PBL#6팀(2022320038_이재문,2022320022_전영준,2022320019_김승현)
 * @version (2025.12.10)
 */
public class BookDB {
    private TreeSet<Book> bookDB;

    /**
     * BookDB 클래스의 객체 생성자
     */
    public BookDB(){
        this.bookDB = new TreeSet<Book>();
    }

    /**
     * 책 번호로 책을 찾는 메소드
     *
     * @param catalogueNumber 책 번호
     * @return                해당 책 정보를 반환
     */
    public Book findOneBook(int catalogueNumber) {
        Iterator<Book> iter = bookDB.iterator();
        while(iter.hasNext()==true){
            Book bookA = (Book)iter.next();
            if(bookA.getID()==catalogueNumber){
                return bookA;
            }
        }
        return null;
    }

    /**
     * 대출중인 책을 반환하는 메소드
     *
     * @return 대출중인 책 정보
     */
    public void getUnavailableBook(){
        Iterator<Book> iter = bookDB.iterator();
        while(iter.hasNext()==true){
            Book bookA = (Book)iter.next();
            if(bookA.check()==true){
                bookA.display();
            }
        }
    }

    /**
     * 대출 가능한 책을 반환하는 메소드
     *
     * @return 대출 가능한 책 정보
     */
    public void getAvailableBook(){
        Iterator<Book> iter = bookDB.iterator();
        while(iter.hasNext()==true){
            Book bookA = (Book)iter.next();
            if(bookA.check()==false){
                bookA.display();
            }
        }
    }

    /**
     * 책을 저장하는 메소드
     *
     * @param bookA 저장할 책
     * @return      저장 완료 메시지를 반환
     */
    public String saveBook(Book bookA){
        bookDB.add(bookA);
        return "저장완료";
    }

}
