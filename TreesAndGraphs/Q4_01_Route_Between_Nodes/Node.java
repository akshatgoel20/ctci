package com.starksky.ctci.TreesAndGraphs.Q4_01_Route_Between_Nodes;

class Node {
    private Node adjacent[];
    public int adjacentCount;
    private String vertex;
    public com.starksky.ctci.TreesAndGraphs.Q4_01_Route_Between_Nodes.Question.State state;
    public Node(String vertex, int adjacentLength) {
        this.vertex = vertex;                
        adjacentCount = 0;        
        adjacent = new Node[adjacentLength];
    }
    
    public void addAdjacent(Node x) {
        if (adjacentCount < adjacent.length) {
            this.adjacent[adjacentCount] = x;
            adjacentCount++;
        } else {
            System.out.print("No more adjacent can be added");
        }
    }
    public Node[] getAdjacent() {
        return adjacent;
    }
    public String getVertex() {
        return vertex;
    }
}
