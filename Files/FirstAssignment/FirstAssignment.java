/**
 *	FirstAssignment.java
 *	Display a brief description of your summer vacation on the screen.
 *
 *	To compile Linux:	javac -cp .:mvAcm.jar FirstAssignment.java
 *	To execute Linux:	java -cp .:mvAcm.jar FirstAssignment
 *
 *	To compile MS Powershell:	javac -cp ".;mvAcm.jar" FirstAssignment.java
 *	To execute MS Powershell:	java -cp ".;mvAcm.jar" FirstAssignment
 *
 *	@author	Jasmine Zhao
 *	@since	August 23, 2024
 */
import java.awt.Font;

import acm.program.GraphicsProgram;
import acm.graphics.GLabel;

public class FirstAssignment extends GraphicsProgram {
    
    public void run() {
    	//	The font to be used
    	Font f = new Font("Serif", Font.BOLD, 18);
    	
    	//	Line 1
    	GLabel s1 = new GLabel("What I did on my summer vacation ...", 10, 20);
    	s1.setFont(f);
    	add(s1);
    	    	
    	//	Continue adding lines until you have 12 to 15 lines
    	GLabel s2 = new GLabel(" I first went to China, I visited Xi'an first"
    	+ " to see my mom's side of the family. We stayed there", 10, 40);
    	s2.setFont(f);
    	add(s2);
    	
    	GLabel s3 = new GLabel(" for about 3 weeks. Then we went to Beijing"
    	+ " and some smaller cities for about 2 weeks. Last, we", 10, 60);
    	s3.setFont(f);
    	add(s3);
    	
    	GLabel s4 = new GLabel(" went to Shanghai and flew back to the US."
    	+ " While we were in China, we went to lots of shopping", 10, 80);
    	s4.setFont(f);
    	add(s4);
    	
    	GLabel s5 = new GLabel(" centers. Since everything in China is way"
    	+ " cheaper than in the US, I bought tons of stuff.", 10, 100);
    	s5.setFont(f);
    	add(s5);
    	
    	GLabel s6 = new GLabel(" I didn't get to see a lot of my family since"
    	+ " they were sick or traveling. Back in Cupertino, ", 10, 120);
    	s6.setFont(f);
    	add(s6);
    	
    	GLabel s7 = new GLabel(" I went to the Santa Cruz boardwalk and often"
    	+ " went out to eat with my friends. For 3 weeks,", 10, 140);
    	s7.setFont(f);
    	add(s7);
    	
    	GLabel s8 = new GLabel(" I volunteered at my art school camps. This"
    	+ " was extremely fun and tiring at the same time.", 10, 160);
    	s8.setFont(f);
    	add(s8);
    	
    	GLabel s9 = new GLabel(" I also went to skit decs 3 times a week in"
    	+ " the afternoons. At skit decs, we worked on our class's", 10, 180);
    	s9.setFont(f);
    	add(s9);
    	
    	GLabel s10 = new GLabel(" homecoming backdrops. I got to see lots of"
    	+ " my friends and work on art. This also helped me ", 10, 200);
    	s10.setFont(f);
    	add(s10);
    	
    	GLabel s11 = new GLabel(" get lots of hours for my leadership class."
    	+ " towards the end of the summer, I went to a leadership ", 10, 220);
    	s11.setFont(f);
    	add(s11);
    	
    	GLabel s12 = new GLabel(" retreat where we prepared for the first day"
    	+ ", along with learning how the class worked & meeting ", 10, 240);
    	s12.setFont(f);
    	add(s12);
    	
    	GLabel s13 = new GLabel(" our new classmates. Throughout the summer,"
    	+ " I played video games and called with friends. ", 10, 260);
    	s13.setFont(f);
    	add(s13);
    	
    	GLabel s14 = new GLabel(" Also hanging out in person at the pool and"
    	+ " the mall. I started getting back to working on my", 10, 280);
    	s14.setFont(f);
    	add(s14);
    	
    	GLabel s15 = new GLabel(" art portfolio. I also started making more"
    	+ " 3D art and sculptures. I ended the summer with a few", 10, 300);
    	s15.setFont(f);
    	add(s15);
    	
    	GLabel s16 = new GLabel(" lazy days where I just stayed home and "
    	+ "caught up with some new movies and TV shows.", 10, 320);
    	s16.setFont(f);
    	add(s16);
    }
    
}
