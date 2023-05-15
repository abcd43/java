import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrafficSignal extends JFrame
{

    private JPanel redLight, yellowLight, greenLight;

    public TrafficSignal() 
    {
        super("Traffic Signal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 400);
        setLocationRelativeTo(null);
        setResizable(false);

        redLight = new Light(Color.RED);
        yellowLight = new Light(Color.YELLOW);
        greenLight = new Light(Color.GREEN);

        JPanel panel = new JPanel(new GridLayout(3, 1));
        panel.add(redLight);
        panel.add(yellowLight);
        panel.add(greenLight);
        add(panel);
        new Thread(new TrafficSignalThread()).start();
    }

    private class TrafficSignalThread implements Runnable
    {
        private int count = 0;

        @Override
        public void run()
        {
            while (true) 
            {

                switch (count) {
                    case 0:
                        setLight(redLight);
                        break;
                    case 1:
                        setLight(yellowLight);
                        break;
                    case 2:
                        setLight(greenLight);
                        break;
                }
                count = (count + 1) % 3;
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        private void setLight(JPanel light)
        {
            redLight.setBackground(Color.BLACK);
            yellowLight.setBackground(Color.BLACK);
            greenLight.setBackground(Color.BLACK);
            light.setBackground(light.getBackground().brighter());
        }
    }

    private class Light extends JPanel 
    {
        private Color color;

        public Light(Color color)
        {
            this.color = color;
            setBackground(Color.BLACK);
            setPreferredSize(new Dimension(100, 100));
        }

        @Override
        protected void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            g.setColor(color);
            g.fillOval(25, 25, 50, 50);
        }
    }

    public static void main(String[] args) 
    {
        new TrafficSignal().setVisible(true);
    }
}
