import javax.swing.*;
class Window extends JFrame
{
    public static void main(String[] args) {
    
    JPanel pnl = new JPanel();

    JFrame public Window() {
        
        super("Swing Window");
        setSize(500,200);
        setDefaultCloseOperation (EXIT_ON_CLOSE);
        add(pnl);
        setVisible (true);
    }
}