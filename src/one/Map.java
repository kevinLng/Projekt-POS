/**
 * 
 */
package one;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import one.Window;

/**
 * @author kevinlang
 *
 */
public class Map {
	private Window g;
	private int x;
	private int y;
	
	private int tileSize;
	private int[][] map;
	
	private int mapWidth;
	private int mapHeight;
	
	public Map(String s, int tileSize) throws NumberFormatException, IOException{
		this.tileSize = tileSize;
		// g = new Window();
		
			BufferedReader br;
			try {
				br = new BufferedReader(new FileReader(s));
			
			mapHeight = Integer.parseInt(br.readLine());
			mapWidth = Integer.parseInt(br.readLine());

			map = new int[mapHeight][mapWidth];
			
			String delimiters = " ";
			for(int row = 0; row < mapHeight; row++){
				String line = br.readLine();
				String[] tokens = line.split(delimiters);
				for(int col = 0; col < mapWidth; col++){
					map[row][col] = Integer.parseInt(tokens[col]);
				}
			}
			}
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	
	public void draw(){
		for(int row = 0; row < mapHeight; row++){
			for(int col = 0; col < mapWidth; col++){
				
				int color = map[row][col];
	
//				//if(color == 0){
////					Rectangle r = new Rectangle(x, y, Color.YELLOWGREEN);
////					r.setTranslateX((x * 32));
////					r.setTranslateY(y * 32);
//					
//					//g.getGroup().getChildren().add(r);
//				}
				
				if(color == 0){
					Rectangle r = new Rectangle(x, y, Color.BLACK);
					r.setTranslateX((x * 32));
					r.setTranslateY(y * 32);
					
					g.getGroup().getChildren().add(r);
				}
				
			}
		}
	}

	

}
