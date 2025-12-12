package FrontGUI;

import javax.swing.*;

/**
 * LibraryApplication의 프레임
 *
 * @author (PBL#6팀(2022320038_이재문,2022320022_전영준,2022320019_김승현)
 * @version (2025.12.08)
 */
public class MyFrame extends JFrame
{
    public MyFrame(){
        this.setTitle("도서관 관리 시스템");
        this.setSize(800,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.add(new MyPanel());
        this.setVisible(true);
    }
}
