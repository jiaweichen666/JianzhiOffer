package GraphDFS;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {
    private ArrayList vertexList;
    private int[][] edges;
    private int numOfEdges;
    public Graph(int n){
        edges = new int[n][n];
        vertexList = new ArrayList(n);
        numOfEdges = 0;
    }
    public int getNumberOfVertix(){
        return vertexList.size();
    }
    public int getNumOfEdges(){
        return numOfEdges;
    }
    public Object getValueByIndex(int i){
        return vertexList.get(i);
    }
    public int getWeight(int v1,int v2){
        return edges[v1][v2];
    }
    public void insertVertex(Object vertex){
        vertexList.add(vertexList.size(),vertex);
    }
    public void insertEdge(int v1,int v2,int weight){
        edges[v1][v2] = weight;
        numOfEdges++;
    }
    public void deleteEdge(int v1,int v2){
        edges[v1][v2] = 0;
        numOfEdges--;
    }
    public int getFirstNeighbour(int index){
        for (int i = 0; i < vertexList.size(); i++) {
            if (edges[index][i] > 0)
                return i;
        }
        return -1;
    }
    public int getNextNeighbour(int i,int index){
        for (int j = i+ 1; j < vertexList.size() ; j++) {
            if (edges[index][j] > 0)
                return j;
        }
        return -1;
    }
    public void depthFirstSearch(boolean[] isVisited,int i) {
        System.out.print(getValueByIndex(i)+" ");
        isVisited[i] = true;
        int w = getFirstNeighbour(i);
        while (w != -1) {
            if (!isVisited[w]) {
                depthFirstSearch(isVisited, w);
            }
            w = getNextNeighbour(w, i);
        }
    }
    public void depthFirstSearch(){
        boolean[] isVisited  = new boolean[vertexList.size()];
        for (int i = 0; i < getNumberOfVertix(); i++) {
            if (!isVisited[i]){
                depthFirstSearch(isVisited,i);
            }
        }
    }
    private void broadFirstSearch(boolean[] isVisited,int i){
        int u,w;
        LinkedList queue = new LinkedList();
        System.out.print(getValueByIndex(i)+" ");
        isVisited[i] = true;
        queue.addLast(i);
        while (!queue.isEmpty()){
            u = ((Integer) queue.removeFirst()).intValue();
            w = getFirstNeighbour(u);
            while (w != -1){
                if(!isVisited[w]){
                    System.out.print(getValueByIndex(w)+" ");
                    isVisited[w] = true;
                    queue.addLast(w);
                }
                w = getNextNeighbour(w,u);
            }
        }
    }
    public void broadFirstSearch(){
        boolean[] isVisited = new boolean[vertexList.size()];
        for (int i = 0; i < getNumberOfVertix(); i++) {
            if(!isVisited[i]){
                broadFirstSearch(isVisited,i);
            }
        }
    }
}
