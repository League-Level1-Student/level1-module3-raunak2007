package _06_gridworld;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
	public static void main(String[] args) { 
	World w=new World();
	w.show();
	Bug b=new Bug();
	Bug b1=new Bug(new Color(0,0,255));
	w.add(new Location(5,7),b);
	int x=new Random().nextInt(10);
	int y=new Random().nextInt(10);
	w.add(new Location(x,y),b1);
	b1.turn();
	b1.turn();
	Flower f=new Flower();
	Flower f1=new Flower();
	for(int i=0;i<10;i++) {
		for(int j=0;j<10;j++) {
			w.add(new Location(i,j),new Flower());
		}
	}
	}

}
