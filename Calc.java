import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Calc{
    public static void main(String[] args) {
        Calculator obj =new Calculator();
    }
}
class Calculator extends JFrame implements ActionListener{
    JLabel L,res;
    JTextField t1,t2;
    JButton a,b,c,d,e;
    public Calculator(){
        L =new JLabel("Enter the numbers:");
        t1 =new JTextField(16);
        a =new JButton("+");
        b =new JButton("-");
        c =new JButton("X");
        d =new JButton("/");
        t2 =new JTextField(16);
        res =new JLabel("Result");
        add(L);
        add(t1);add(t2);
        add(a);add(b);add(c);add(d);
        add(res);
        a.addActionListener(this);
        b.addActionListener(this);
        c.addActionListener(this);
        d.addActionListener(this);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(220,180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int result=0;
        int x=Integer.parseInt(t1.getText());
        int y=Integer.parseInt(t2.getText());
        if(e.getSource()==a){
            result=x+y;            
        }
        else if(e.getSource()==b){
            result=x-y;
        }
        else if(e.getSource()==c){
            result=x*y;
        }
        else if(e.getSource()==d){
            if(x>y){
                result=x/y;
            }
            else{
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
        }
        res.setText("The Result is: " + result);
    }
}