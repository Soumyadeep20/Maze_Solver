/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maze_solver;
import java.util.*;
/**
 *
 * @author LENOVO
 */
public class Logic {
    public static boolean pathh(int x,int y,ArrayList<Integer> path,int[][] Maze)
    {
        if(Maze[y][x]==9)
        {
            //path.add(x);
            //path.add(y);
            return true;
        }
        int arr[][]={{1,0},{-1,0},{0,1},{0,-1}};
        if(Maze[y][x]==0)
        {
            Maze[y][x]=2;
            for(int i=0;i<4;i++)
            {
              if( pathh(x+arr[i][0],y+arr[i][1],path,Maze))
                {
                  path.add(x);
                  path.add(y);
                  return true;
                }
            }
        }
        return false;
    }
}
