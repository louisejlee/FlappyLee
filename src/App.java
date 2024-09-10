import javax.swing. *;

public class App {
    public static void main(String[] args) throws Exception {
        int boardWidth = 360; // initialize game size
        int boardHeight = 640;

        JFrame frame = new JFrame ("Flappy Lee");
        frame.setSize(boardWidth, boardHeight); // set frame size
        //frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // when user clicks 'x' on program, it terminates program

        FlappyBird flappybird = new FlappyBird();
        frame.add(flappybird);
        frame.pack(); //keeps titlebar white
        flappybird.requestFocus();
        frame.setVisible(true);
    }
}
