package counter;

import java.awt.*;

public class Counter extends Panel {
    private int count=0;
    private Label label;
    private long maxValue=20;
    public void setMaxValue(long max) {
        maxValue = max;
    }
    public long getMaxValue() {
        return maxValue;
    }
    public Counter() {
        setBackground(Color.blue);setForeground(Color.white);
        label = new Label(""+count);
        add(label);
    }
    public void increment () {
        if (count < maxValue) {
            count++;
            label.setText(count+" ");
        }
        else label.setText("!!");
    }

    public int getValueCount(){
        return count;
    }
    
    public String getvalue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}