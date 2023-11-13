/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maze_solver;
import java.awt.*;
import java.util.*;
import javax.swing.JFrame;
/**
 *
 * @author LENOVO
 */
public class Maze_solver extends JFrame {
    public int[][] Maze={{1,1,1,1,1,1,1},
                          {1,0,1,0,0,1,1},
                          {1,0,0,1,1,0,1},
                          {1,0,0,0,0,1,1},
                          {1,0,1,0,0,1,1},
                          {1,0,0,0,0,9,1},
                          {1,1,1,1,1,1,1}};
    public ArrayList<Integer> path=new ArrayList<>();
    public Maze_solver(){
        setTitle("Maze");
        setSize(600,460);
        setLocation(450,200);
        //setBackgroundColor(RED);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Logic.pathh(1, 1, path, Maze);
        System.out.print(path);
        }
    @Override
    public void paint(Graphics g)
    {
        Color colour;
        g.translate(180, 80);
        for(int i=0;i<Maze.length;i++)
        {
            for(int j=0;j<Maze.length;j++)
            {
                if(Maze[i][j]==1)
                    colour=Color.BLACK;
                else if(Maze[i][j]==9)
                    colour=Color.RED;
                else
                    colour=Color.WHITE;
                g.setColor(colour);
                g.fillRect((30*i),(30*j),30,30);
                g.setColor(Color.RED);
                g.drawRect((30*i),(30*j),30,30);
            }
        }
        for(int i=0;i<path.size();i+=2)
        {
             g.setColor(Color.YELLOW);
             g.fillRect((30*path.get(i)),(30*path.get(i+1)),30,30);
             g.setColor(Color.RED);
             g.drawRect((30*path.get(i)),(30*path.get(i+1)),30,30);
             
                
            
        }
    }
    public static void main(String[] args) {
        Maze_solver grid=new Maze_solver();
        grid.setVisible(true);
        
        
       
    }
}
