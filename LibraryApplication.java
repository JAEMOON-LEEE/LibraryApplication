
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
        String id = "Borrower" + (borrower.size() + 1); // 고유번호
        borrower borrower = new borrower(name, id);
        borrower.add(borrower); // DB에 저장
        System.out.println("회원 등록 완료: " + name + " (ID: " + id + ")");
    
    }
    
    public void displayBookForLoan(){
        Iterator<Book> it = books.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            if (book.check()) { // 대출 가능 여부 확인
                book.display(); // 화면에 표시
            }
        }
    }
    
    public void lendOneBook(){
        Book foundBook = null;
        User foundUser = null;

        // findElement 역할: 책과 사용자 검색
        for (Book b : books) {
            if (b.getTitle().equals(bookTitle)) {
                foundBook = b;
                break;
            }
        }
        for (User u : users) {
            if (u.getName().equals(userName)) {
                foundUser = u;
                break;
            }
        }

        if (foundBook == null || foundUser == null) {
            System.out.println("책 또는 사용자를 찾을 수 없습니다.");
            return;
        }

        // check()로 대출 가능 여부 검사
        if (!foundBook.check()) {
            System.out.println("이미 대출 중인 책입니다.");
            return;
        }

        // 대출 처리
        foundBook.loan();
        Loan loan = new Loan(foundUser, foundBook);
        loans.add(loan); // DB 저장
        loan.display();  // 대출 정보 출력
    }
}