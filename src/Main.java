import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Snake Game");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            GamePanel panel = new GamePanel(); //Alterada depois de GamePanel
            frame.add(panel); //alterado
            frame.pack(); //alterado
            frame.setVisible(true);
        });

    }
}