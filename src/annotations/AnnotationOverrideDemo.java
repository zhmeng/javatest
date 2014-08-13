/**
 * Project Name:java
 * File Name:AnnotationOverrideDemo.java
 * Package Name:annotations
 * Date:2014-8-12下午2:28:10
 *
*/

package annotations;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * ClassName:AnnotationOverrideDemo
 * Function: TODO ADD FUNCTION.
 * Date:     2014-8-12 下午2:28:10 
 * @author   张猛
 */
public class AnnotationOverrideDemo extends Frame{
	public AnnotationOverrideDemo(){
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		setSize(200,100);
		setTitle("Annotation Override Demo");
		setVisible(true);
	}
	public static void main(String[] args) { 
		new AnnotationOverrideDemo(); 
	}
}

