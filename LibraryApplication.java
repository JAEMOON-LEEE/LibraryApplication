/**
 * LibraryApplication 도서 대출, 반납, 새로운 이용자 등록, 새로운 책 등록, 대출중인 책 디스플레이, 대출가능한 책 디스플레이 기능을 관리
 *
 * @author (PBL#6팀(2022320038_이재문,2022320022_전영준,2022320019_김승현)
 * @version (2025.12.10)
 */
public class LibraryApplication {
    private String name;
    private BorrowerDB borrowerDB;
    private BookDB bookDB;
    private LoanDB loanDB;

    /**
     * LibraryApplication 클래스의 객체 생성자
     */
    LibraryApplication(String l_name){
        this.name = l_name;
        this.bookDB = new BookDB();
        this.borrowerDB = new BorrowerDB();
        this.loanDB = new LoanDB();
    }

    /**
     * 한 권의 책을 대출 처리하는 메소드
     *
     * @param catalogueNumber  책 번호
     * @param stID             이용자 학번
     * @return                 대출 결과 반환
     */
    public String lendOneBook(int catalogueNumber,int stID){
        Book bookA = bookDB.findOneBook(catalogueNumber);
        if(bookA==null){
            return "등록되지 않은 책";
        }
        Borrower borrowerA = borrowerDB.findOneBorrower(stID);
        if(borrowerA==null){
            return "등록되지 않은 이용자";
        }

        if(bookA.check()==false){
            return "대출 불가 책";
        }
        if(borrowerA.check()==false){
            return "대출 건수 초과";
        }
        Loan loanA = new Loan(bookA,borrowerA);
        borrowerA.increaseLoanCount();
        bookA.setLoanState("대출중");
        loanDB.saveLoan(loanA);
        return loanA.toString();
    }

    /**
     * 한 권의 책을 반납 처리하는 메소드
     *
     * @param catalogueNumber  책 번호
     * @param stID             이용자 학번
     * @return                 반납 결과 반환
     */
    public String returnOneBook(int catalogueNumber, int stID){
        Loan loanA=loanDB.findLoanData(catalogueNumber,stID);
        if(loanA ==null){
            return "대출이력이 없습니다.";
        }
        loanDB.removeLoan(loanA);
        Borrower borrowerA = borrowerDB.findOneBorrower(stID);
        borrowerA.decreaseLoanCount();
        Book bookA = bookDB.findOneBook(catalogueNumber);
        bookA.setLoanState(null);
        return "반납완료";
    }

    /**
     * 새로운 이용자 한 명 등록하는 메소드
     *
     * @param name   이름
     * @param stID   학번
     * @return       등록 결과 반환
     */
    public String registerOneBorrower(String name, int stID){
        Borrower borrowerB =borrowerDB.findOneBorrower(stID);
        if(borrowerB!=null){
            return "중복등록";
        }
        Borrower borrowerA = new Borrower(name,stID);
        borrowerDB.saveBorrower(borrowerA);
        return borrowerA.toString();
    }

    /**
     * 새로운 책 한 권 등록하는 메소드
     *
     * @param title            제목
     * @param author           저자
     * @param catalogueNumber  책 번호
     * @return                 등록된 책 정보 반환
     */
    public String registerOneBook(String title, String author, int catalogueNumber){
        Book bookB = bookDB.findOneBook(catalogueNumber);
        if(bookB!=null){
            return "중복등록";
        }
        Book bookA = new Book(title,author,catalogueNumber);
        bookDB.saveBook(bookA);
        return bookA.toString();
    }

    /**
     * 대출 가능한 책을 디스플레이하는 메소드
     *
     * @return 대출 가능한 책 정보
     */
    public void displayBooksOnLoan(){
        bookDB.getUnavailableBook();
    }

    /**
     * 현재 대출 중인 책을 디스플레이하는 메소드
     *
     * @return 대출 중인 책 정보
     */
    public void displayBooksForLoan(){
        bookDB.getAvailableBook();
    }
}
