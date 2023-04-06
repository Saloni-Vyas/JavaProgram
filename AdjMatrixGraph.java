public class AdjMatrixGraph {
  private boolean adjMatrix[][];
  private int numVertices;

  // Initialize the matrix
  public AdjMatrixGraph(int numVertices) {
    this.numVertices = numVertices;
    adjMatrix = new boolean[numVertices][numVertices];
  }

  // Add edges
  public void addEdge(int i, int j) {
    adjMatrix[i][j] = true;
    adjMatrix[j][i] = true;
  }

  // Remove edges
  public void removeEdge(int i, int j) {
    adjMatrix[i][j] = false;
    adjMatrix[j][i] = false;
  }

  // Print the matrix
  // public String toString() {
  //   StringBuilder s = new StringBuilder();
  //   for (int i = 0; i < numVertices; i++) {
  //     s.append(i + ": ");
  //     for (boolean j : adjMatrix[i]) {
  //       s.append((j ? 1 : 0) + " ");
  //     }
  //     s.append("\n");
  //   }
  //   return s.toString();
  // }

  public void toPrint()
  {
    System.out.print("  ");
    for(int i=0;i<numVertices;i++)
      System.out.print(i+"-");
      System.out.println();
    for(int i=0;i<numVertices;i++)
    {
     System.out.print(i+"-");
     for(int j=0;j<numVertices;j++)
     {
       if(adjMatrix[i][j] == true)
         System.out.print("1 ");
       else
         System.out.print("0 ");
     }
     System.out.println();
    }
  }

  public static void main(String args[]) {
    AdjMatrixGraph g = new AdjMatrixGraph(4);

    g.addEdge(0, 1);
    g.addEdge(0, 2);
    g.addEdge(1, 2);
    g.addEdge(2, 0);
    g.addEdge(3,2);
    
    g.toPrint();
  }
}