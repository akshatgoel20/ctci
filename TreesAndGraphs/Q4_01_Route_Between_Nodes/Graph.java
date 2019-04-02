package com.starksky.ctci.TreesAndGraphs.Q4_01_Route_Between_Nodes;

public class Graph {
	public static int MAX_VERTICES = 6;
	private com.starksky.ctci.TreesAndGraphs.Q4_01_Route_Between_Nodes.Node vertices[];
	public int count;
	public Graph() {
		vertices = new com.starksky.ctci.TreesAndGraphs.Q4_01_Route_Between_Nodes.Node[MAX_VERTICES];
		count = 0;
    }
	
    public void addNode(com.starksky.ctci.TreesAndGraphs.Q4_01_Route_Between_Nodes.Node x) {
		if (count < vertices.length) {
			vertices[count] = x;
			count++;
		} else {
			System.out.print("Graph full");
		}
    }
    
    public com.starksky.ctci.TreesAndGraphs.Q4_01_Route_Between_Nodes.Node[] getNodes() {
        return vertices;
    }
}

