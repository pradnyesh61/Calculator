import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

public class Calculator extends WindowAdapter implements ActionListener
{
    Frame f=new Frame("Calculator..!!");

    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b11,b12,b13,b14,b15,b16,b17,b18;
    Panel p;
    TextField t;
    GridLayout g;
    String s1,s2,s3,s4,s5;
    float f1;
    String count;

    Calculator()
    {
        b0=new Button("0");
        b1=new Button("1");
        b2=new Button("2");
        b3=new Button("3");
        b4=new Button("4");
        b5=new Button("5");
        b6=new Button("6");
        b7=new Button("7");
        b8=new Button("8");
        b9=new Button("9");

        b11=new Button("+");
        b12=new Button("-");
        b13=new Button("*");
        b14=new Button("/");
        b15=new Button("%");

        b16=new Button("=");
        b17=new Button("c");
        b18=new Button(".");

        //When button is clicked then something must happens for that those buttons added to actionlistener

        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);    

        t=new TextField(30);        //only 30 character can be allowed

        g=new GridLayout(5,5,30,25);    

        p=new Panel();      //for the same layout of buttons

        p.setLayout(g);         //buttond must be in a form for that Gridlayout added to panel

        // All the buttons added

        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(b11);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b12);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b13);
        p.add(b18);
        p.add(b0);  
        p.add(b15);
        p.add(b14);
        p.add(b16);
        p.add(b17);
       
        f.add(t);
        f.add(p);
      //  f.add(t,BorderLayout.NORTH);  // use this for layout cut to cut
      //  f.add(p,BorderLayout.CENTER);
    
        // applied the color
        f.setBackground(Color.WHITE);
        p.setBackground(Color.WHITE);        
        b0.setBackground(Color.WHITE);
        b1.setBackground(Color.WHITE);
        b2.setBackground(Color.WHITE);
        b3.setBackground(Color.WHITE);
        b4.setBackground(Color.WHITE);
        b5.setBackground(Color.WHITE);
        b6.setBackground(Color.WHITE);
        b7.setBackground(Color.WHITE);
        b8.setBackground(Color.WHITE);
        b9.setBackground(Color.WHITE);
        b11.setBackground(Color.WHITE);
        b12.setBackground(Color.WHITE);
        b13.setBackground(Color.WHITE);
        b14.setBackground(Color.WHITE);
        b15.setBackground(Color.WHITE);
        b16.setBackground(Color.WHITE);
        b17.setBackground(Color.WHITE);
        b18.setBackground(Color.WHITE);

        
        f.addWindowListener(this);      //window closing

        f.setLayout(new FlowLayout()); //for textFied and panel must be in proper way
        f.setSize(320,320);
       //f.pack();      //for cut to cut layout 
        f.setVisible(true);
    }

    //all the function after clicking the buttons what to do

   public void actionPerformed(ActionEvent e)
 {
    if(e.getSource()==b0)       // which button is clicked
    {
        s3=t.getText();     // taken all the text 
        s4="0";
        s5=s3+s4;       // if wants to use more than single digit
        t.setText(s5);
    }

    if(e.getSource()==b1)
    {
        s3=t.getText();
        s4="1";
        s5=s3+s4;
        t.setText(s5);
    }

    if(e.getSource()==b2)
    {
        s3=t.getText();
        s4="2";
        s5=s3+s4;
        t.setText(s5);
    }

    if(e.getSource()==b3)
    {
        s3=t.getText();
        s4="3";
        s5=s3+s4;
        t.setText(s5);
    }

    if(e.getSource()==b4)
    {
        s3=t.getText();
        s4="4";
        s5=s3+s4;
        t.setText(s5);
    }

    if(e.getSource()==b5)
    {
        s3 = t.getText();
        s4 = "5";
        s5 = s3+s4;
        t.setText(s5);
    }

    if(e.getSource()==b6)
    {
        s3=t.getText();
        s4="6";
        s5=s3+s4;
        t.setText(s5);
    }

    if(e.getSource()==b7)
    {
        s3=t.getText();
        s4="7";
        s5=s3+s4;
        t.setText(s5);
    }

    if(e.getSource()==b8)
    {
        s3=t.getText();
        s4="8";
        s5=s3+s4;
        t.setText(s5);
    }

    if(e.getSource()==b9)
    {
        s3=t.getText();
        s4="9";
        s5=s3+s4;
        t.setText(s5);
    }

    if(e.getSource()==b11)
    {
        s1=t.getText();
        t.setText("");
        count="+";   // for further comparision
    }
    
    if(e.getSource()==b12)
    {
        s1=t.getText();
        t.setText("");
        count="-";
    }
    
    if(e.getSource()==b13)
    {
        s1=t.getText();
        t.setText("");
        count="*";
    }
    
    if(e.getSource()==b14)
    {
        s1=t.getText();
        t.setText("");
        count="/";
    }
    
    if(e.getSource()==b15)
    {
        s1=t.getText();
        t.setText("");
        count="%";
    }


    
    if(e.getSource()==b16)
    {
        s2=t.getText();

        // what to do for the operator press // compare here
        if(count=="+")
        {
            f1=Float.parseFloat(s1)+Float.parseFloat(s2);
            t.setText(String.valueOf(f1));
        }

        if(count=="-")
        {
            f1=Float.parseFloat(s1)-Float.parseFloat(s2);
            t.setText(String.valueOf(f1));
        }

        if(count=="*")
        {
            f1=Float.parseFloat(s1)*Float.parseFloat(s2);
            t.setText(String.valueOf(f1));
        }

        if(count=="/")
        {
            try
            {
                float n=Float.parseFloat(s2);
                if(n!=0)
                {
                    f1=Float.parseFloat(s1)/Float.parseFloat(s2);
                    t.setText(String.valueOf(f1));
                }
                else
                {
                    t.setText("divide by zero , wrong operation..!!");
                }
            }
            catch(Exception i)
            {
            }
        }

        if(count=="%")
        {
            s2=t.getText();
            f1=Float.parseFloat(s1)%Float.parseFloat(s2);
            t.setText(String.valueOf(f1));
        }
    }

    if(e.getSource()==b17)
    {
        t.setText("");
    }

    if(e.getSource()==b18)
    {
        s3=t.getText();
        s4=".";
        s5=s3+s4;
        t.setText(s5);
    }
 }
 
    public void windowClosing(WindowEvent e)
    {
        f.dispose();
    }
 
 public static void main(String []args)
    {
        Calculator b=new Calculator();
    }
}