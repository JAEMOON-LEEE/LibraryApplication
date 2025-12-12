package CoreEngine;

import java.util.Calendar;

/**
 * Loan 대출정보(책정보, 이용자 정보, 대출일시, 반납 일시)
 * 
 * @author (PBL#6팀(2022320038_이재문)
 * @version (2025.12.08)
 */
public class Loan {
    private String loanDate;
    private String returnDate;
    private Book bookA;
    private Borrower borrowerA;

    /**
     * Loan 클래스의 객체 생성자
     * 
     *
     * @param bookA     책 객체
     * @param borrowerA 이용자 객체
     */
    public Loan(Book bookA,Borrower borrowerA){
        this.bookA=bookA;
        this.borrowerA=borrowerA;

        Calendar cal = Calendar.getInstance();

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);

        this.loanDate = year + "-" + month + "-" + day;

        cal.add(Calendar.DAY_OF_MONTH,14);
        int returnYear = cal.get(Calendar.YEAR);
        int returnMonth = cal.get(Calendar.MONTH) + 1;
        int returnDay = cal.get(Calendar.DAY_OF_MONTH);

        this.returnDate = returnYear + "-" + returnMonth + "-" + returnDay;
    }

    /**
     * 대출 정보를 반환하는 메소드
     *
     * @return 대출 정보
     */
    public String toString(){
        return "책 정보: "+ bookA.toString()+"이용자 정보: "+borrowerA.toString()+"대출일시: "+loanDate+"반납 예정일"+returnDate;
    }

    /**
     * 책 객체를 반환하는 메소드
     *
     * @return Book 객체
     */
    public Book getBook(){
        return bookA;
    }

    /**
     * 이용자 객체를 반환하는 메소드
     *
     * @return Borrower 객체
     */
    public Borrower getBorrower(){
        return borrowerA;
    }
}
