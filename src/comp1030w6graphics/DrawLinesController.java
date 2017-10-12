package comp1030w6graphics;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author JWright  
 */
public class DrawLinesController implements Initializable {

    @FXML private Canvas canvas;

    
    public void button1Pushed(ActionEvent event)
    {
        //get the GraphicsContext, which is used to draw on the canvas
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        //clear any content out of the canvas
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        
        //draw line from upper-left to lower-right of the canvas
        gc.strokeLine(0, 0, canvas.getWidth(), canvas.getHeight());
        
        //draw line from upper-right to lower-left corner
        gc.strokeLine(canvas.getWidth(), 0, 0, canvas.getHeight());
        
    }
    
    
    public void button2Pushed(ActionEvent event)
    {
        //get the GraphicsContext, which is used to draw on the canvas
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        
       //draw line from 0,0 to lower right
       for (int start = 0; start <= canvas.getWidth(); start += 20)
            gc.strokeLine(start, canvas.getHeight()-start, canvas.getWidth(), canvas.getHeight());
    
       
       for (int start = 0; start <= canvas.getWidth(); start += 20)
            gc.strokeLine(0, 0, start, canvas.getHeight()-start);
  
    }
    
     public void button3Pushed(ActionEvent event)
    {
        //get the GraphicsContext, which is used to draw on the canvas
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
       
       
            
    }
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    
}
