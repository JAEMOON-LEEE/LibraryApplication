package FrontGUI;
import javax.swing.*;
import java.awt.event.*;
import CoreEngine.*;
import java.awt.*;

/**
 * yourPanel  도서관 관리 시스템 GUI의 패널
 *
 * @author (PBL#6팀(2022320038_이재문,2022320022_전영준,2022320019_김승현)
 * @version (2025.12.08)
 */
public class MyPanel extends JPanel implements ItemListener, ActionListener
{
    private JLabel l_name;
    private JLabel l_stID;
    private JLabel l_title;
    private JLabel l_author;
    private JLabel l_catalogueNumber;

    private JRadioButton loanOneBook;
    private JRadioButton returnOneBook;
    private JRadioButton registerOneBook;
    private JRadioButton registerOneBorrower;
    private JRadioButton displayBookForLoan;
    private JRadioButton displayBookOnLoan;
    private JButton run;

    private JTextArea mta;

    private JTextField name;
    private JTextField stID;
    private JTextField title;
    private JTextField author;
    private JTextField catalogueNumber;
    private String checkObject;
    LibraryApplication libApp = new LibraryApplication("도서관 시스템");

    /**
     * MyPanel 클래스의 객체 생성자
     *
     */
    public MyPanel(){
        this.setLayout(new BorderLayout());
        JPanel top = new JPanel();
        top.setLayout(new GridLayout(0,2))
        ;
        l_name = new JLabel("이용자 이름");
        l_stID = new JLabel("학번");
        l_title = new JLabel("책제목");
        l_author = new JLabel("저자");
        l_catalogueNumber = new JLabel("고유번호");

        name = new JTextField("Your Name", 20);
        stID = new JTextField("your ID",10);
        title = new JTextField("Book Title", 20);
        author= new JTextField("Book Author", 20);
        catalogueNumber = new JTextField("Book ID", 20);
        top.add(l_name);
        top.add(name);

        top.add(l_stID);
        top.add(stID);

        top.add(l_title);
        top.add(title);

        top.add(l_author);
        top.add(author);

        top.add(l_catalogueNumber);
        top.add(catalogueNumber);

        ButtonGroup group = new ButtonGroup();
        loanOneBook =  new JRadioButton("대출");
        returnOneBook =  new JRadioButton("반납");
        registerOneBook =  new JRadioButton("새로운 책 등록");
        registerOneBorrower =  new JRadioButton("새로운 이용자 등록");
        displayBookForLoan=  new JRadioButton("대출가능한 책 디스플레이");
        displayBookOnLoan =  new JRadioButton("대출 중인 책 디스플레이");
        run=new JButton("실행");
        group.add(loanOneBook);           
        group.add(returnOneBook);
        group.add(registerOneBook);       
        group.add(registerOneBorrower);
        group.add(displayBookForLoan);    
        group.add(displayBookOnLoan);

        top.add(loanOneBook);           
        top.add(returnOneBook);
        top.add(registerOneBook);       
        top.add(registerOneBorrower);
        top.add(displayBookForLoan);    
        top.add(displayBookOnLoan);
        top.add(run);
        this.add(top, BorderLayout.NORTH);

        mta = new JTextArea(200, 300);
        this.add(new JScrollPane(mta));

        loanOneBook.addItemListener(this);
        returnOneBook.addItemListener(this);
        registerOneBook.addItemListener(this);
        registerOneBorrower.addItemListener(this);
        displayBookForLoan.addItemListener(this);
        displayBookOnLoan.addItemListener(this);
        run.addActionListener(this);

    }

    /**
     * JRadioButton으로 해당 작업 클릭 시, JTextFeild비할성화 
     *
     * @param stID 아이템 이벤트
     */
    public void itemStateChanged(ItemEvent e){
        if(e.getStateChange() == ItemEvent.SELECTED){
            name.setEnabled(true);
            stID.setEnabled(true);
            title.setEnabled(true);
            author.setEnabled(true);
            catalogueNumber.setEnabled(true);
            checkObject="";
            if((e.getItem()).equals(loanOneBook)){
                name.setEnabled(false);
                title.setEnabled(false);
                author.setEnabled(false);
                checkObject="대출";
            }            
            if((e.getItem()).equals(returnOneBook)){
                name.setEnabled(false);
                title.setEnabled(false);
                author.setEnabled(false);
                checkObject="반납";
            }
            if((e.getItem()).equals(registerOneBook)){
                name.setEnabled(false);
                stID.setEnabled(false);
                checkObject="책등록";
            }
            if((e.getItem()).equals(registerOneBorrower)){
                title.setEnabled(false);
                author.setEnabled(false);
                catalogueNumber.setEnabled(false);
                checkObject="이용자등록";
            }
            if((e.getItem()).equals(displayBookForLoan)){
                name.setEnabled(false);
                stID.setEnabled(false);
                title.setEnabled(false);
                author.setEnabled(false);
                catalogueNumber.setEnabled(false);
                checkObject="대출가능디스플레이";
            }
            if((e.getItem()).equals(displayBookOnLoan)){
                name.setEnabled(false);
                stID.setEnabled(false);
                title.setEnabled(false);
                author.setEnabled(false);
                catalogueNumber.setEnabled(false);
                checkObject="대출중디스플레이";
            }
        }
    }
    
    /**
     * 해당 버튼 선택 및 실행 버튼 클릭 시 해당작업 실시하는 메소드 
     *
     * @param stID 액션아이템 이벤트
     */
    public void actionPerformed(ActionEvent e){
            if( checkObject.equals("대출")&& e.getSource().equals(run)){
            String output = libApp.loanOneBook(Integer.parseInt(catalogueNumber.getText()),Integer.parseInt(stID.getText()));
            mta.append(output + "\n");
        }
        if( checkObject.equals("반납")&& e.getSource().equals(run)){
            String output = libApp.returnOneBook(Integer.parseInt(catalogueNumber.getText()),Integer.parseInt(stID.getText()));
            mta.append(output + "\n");
        }
        if( checkObject.equals("책등록")&& e.getSource().equals(run)){
            String output = libApp.registerOneBook(title.getText(),author.getText(), Integer.parseInt(catalogueNumber.getText()));
            mta.append(output + "\n");
        }
        if( checkObject.equals("이용자등록")&& e.getSource().equals(run)){
            String output = libApp.registerOneBorrower(name.getText(),Integer.parseInt(stID.getText()));
            mta.append(output + "\n");
        }
        if( checkObject.equals("대출가능디스플레이")&& e.getSource().equals(run)){
            String output = libApp.displayBooksForLoan();
            mta.append(output+"\n");
        }
        if( checkObject.equals("대출중디스플레이")&& e.getSource().equals(run)){
            String output = libApp.displayBooksOnLoan();
            mta.append(output+"\n");;
        }
    }
    
}