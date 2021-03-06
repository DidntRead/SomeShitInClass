package proj.cs2d.collision;

import java.awt.Point;
import java.awt.Rectangle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import proj.cs2d.map.MapObject;

public class Quadtree implements Serializable {
	protected final static int MAX_OBJECTS = 10;
	protected final static int MAX_LEVELS = 5;
	
	private Node root;
	
	public Quadtree(int size) {
		this.root = new Node(new Rectangle(0, 0, size, size), 0);
	}
	
	public void insert(MapObject obj) {
		root.insert(obj);
	}
	
	public void remove(MapObject obj) {
		root.remove(obj);
	}
	
	public List<MapObject> getAll() {
		ArrayList<MapObject> list = new ArrayList<MapObject>();
		root.getAll(list);
		return list;
	}
	
	public List<MapObject> getAllCollision(Rectangle rect) {
		List<MapObject> set = new ArrayList<MapObject>(20);
		root.getAllIn(rect, set);
		return set;
	}
	
	public List<MapObject> getAllCollision(Point p) {
		List<MapObject> set = new ArrayList<MapObject>(20);
		root.getAllIn(p, set);
		return set;
	}
}
