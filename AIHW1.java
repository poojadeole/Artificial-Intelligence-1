/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.Comparator;
import java.util.List;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lenovo
 */
public class homework {
public static Set<String> set = new LinkedHashSet<String>();
   // public static int[][] adjmatrix = null;
    public static Map linkedhmap = new LinkedHashMap(); 
    public static Map<Integer,String> linkedhmap1 = new LinkedHashMap();
    public static PriorityQueue<Node> pqueue = new PriorityQueue<>(new Node());
    public static PriorityQueue<Node1> pqueue1 = new PriorityQueue<>(new Node1());
   

    
    public static void main(String[] args) {
        String fileName = "C://input.txt";
        String line = null;
        Set hmap = new LinkedHashSet();
        try{
            FileReader fileReader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fileReader);
            int i=0, j=0, count = 0, count1 = 0;
            int x = 0, l= 0, n = 0;
            String algorithm = null;
            String source = null;
            String destination = null;
            int noOfTrafficLines = 0;
            String line1 = null;
            String[] array = new String[100];
            String[] array1 = new String[100]; 
            int noOfStraightLines = 0;
            String line2 = null;
            Set<String> set1 = new HashSet<String>();   
            String[] strArray1 = null;
            int[] arrayB = null;
            String[][] matrix =null;
            int[] a = null;
            int[] b = null;
            int[] c = null;
            int counter=0;
            int h = 0;
//            line = br.readLine();
//            System.out.println("the first line is"+line);
              while((line = br.readLine()) != null ){
               if(line.trim().length() == 0){
                   continue;
               }  
               if(i == 0){   
                  algorithm = line.trim(); 
                //  System.out.println(algorithm);
               }
               if(i == 1){
                   source = line.trim();
                  // System.out.println(source);
               }
               if(i == 2) {
                   destination = line.trim();
                 //  System.out.println(destination);
               }
               if(i == 3) {
                   noOfTrafficLines = Integer.parseInt(line.trim());
                 //  System.out.println(noOfTrafficLines);  
                   if(noOfTrafficLines == 0){
                   System.out.println(source + " " + destination + " 0" );
                   System.exit(0);
               }
                   matrix=new String [noOfTrafficLines][3];
                   a = new int[noOfTrafficLines];
                   b = new int[noOfTrafficLines];
                   c = new int[noOfTrafficLines];
                   
               }
               
               
               if(i >= 4 && i< (4 + noOfTrafficLines)){
                   line1 = line.trim();
                   String[] strArray = line1.split(" ");
                   
                   for(int k = 0; k<strArray.length ;k++ ){
                       
                     System.out.print("input " + strArray[k]+" ");
                     if(k!=2)
                        set.add(strArray[k]);
                     matrix[counter][k]=strArray[k];
                
                   }
                   System.out.println(++counter);
               }
               
               if(i == (4 + noOfTrafficLines)){
                     noOfStraightLines = Integer.parseInt(line.trim());
                     System.out.println(noOfStraightLines);
                     arrayB = new int[noOfStraightLines];
                 }
              
                 if(i > (4 + noOfTrafficLines) && i < (5 + noOfTrafficLines + noOfStraightLines)){
                     line2 = line.trim();
                     strArray1 = line2.split(" ");
                     
                     if(set.contains(strArray1[0])){
                     set1.add(strArray1[0]);
                     arrayB[h++] = Integer.parseInt(strArray1[1]);
               //      System.out.println("Hello " +strArray1[1]);
                     }
                     
                }
                   
                                         
               i++;
              }
             // System.out.println("A* "+ arrayB[1]);
              
              
              int[] arrayA = new int[noOfStraightLines];
          //    adjmatrix = new int[set.size()][set.size()];
              
              
              for(int i1=0;i1<matrix.length;i1++){
                  
              System.out.println();
                  for(int j1=0;j1<matrix[i1].length;j1++){
                      System.out.print("matrix element: "+matrix[i1][j1]+" ");
                     
                  }
              }
              
              Iterator it = set.iterator();
              String temp=null;
              while(it.hasNext()){
                temp=(String)it.next();
                System.out.println(" Set element: "+temp);                   
                linkedhmap.put(temp,count++);
                      
              }
              
              int count2 = 0;
              Iterator it1 = set.iterator();
              String temp1 = null;
              while(it1.hasNext()){
                  temp1 = (String)it1.next();
                  linkedhmap1.put(count2++,temp1);
                  
              }
              
              
            Set<String> keys = linkedhmap.keySet();
            for(String k:keys){
                System.out.println("hash map key: "+k + " hash map value: " + linkedhmap.get(k));
            }
            
            Set<Integer> backkeys = linkedhmap1.keySet();
            for(int k2: backkeys){
                System.out.println("hash map key: "+k2+ "hmap value: "+ linkedhmap1.get(k2));
            }
       
            int source1 = (int) linkedhmap.get(source);
            int destination1 = (int) linkedhmap.get(destination);
            
       //     while(line != null){
       //         if(x >= 4 && x<= (4 + noOfTrafficLines)){
                    for(l = 0; l <  noOfTrafficLines; l++){
                        System.out.println();
                        for(n = 0; n < 2; n++){
                            //for(String y: keys){
                              matrix[l][n] = linkedhmap.get(matrix[l][n]).toString();  
                              System.out.print("Matrix element: " + matrix[l][n]+" ");
                            //}
                            
                        }
                    }
                    
                System.out.println(noOfTrafficLines);
                for(int x1 = 0; x1 < noOfTrafficLines; x1++){
                    a[x1] = Integer.parseInt(matrix[x1][0]);
                    System.out.println("A array" +a[x1]);
                }
                  
                for(int x2 = 0; x2 < noOfTrafficLines; x2++)
                    b[x2] = Integer.parseInt(matrix[x2][1]);
                
                for(int x3 = 0; x3 < noOfTrafficLines; x3++)
                    c[x3] = Integer.parseInt(matrix[x3][2]);
                
       
                  h = 0;
                  Iterator it3 = set1.iterator();
                  while(it3.hasNext()){
                     arrayA[(int)linkedhmap.get(it3.next())] = arrayB[h++];
                  }
                  

                if(algorithm.equals("BFS") || algorithm.equals("bfs")){
                   
                    startBFS(source1, destination1, a, b, noOfTrafficLines);
                }
                else if(algorithm.equals("DFS")||algorithm.equals("dfs")){
                    startDFS(source1, destination1, a, b, noOfTrafficLines);
                }
                else if(algorithm.equals("UCS") || algorithm.equals("ucs")){
                    startUCS(source1,destination1, a, b, c, noOfTrafficLines);
                }
                else if(algorithm.equals("A*") || algorithm.equals("a*")){
                    startA(source1,destination1, arrayA,a, b, c, noOfTrafficLines);
                } 
                
            br.close();
           }
        catch(IOException e){
            e.printStackTrace();
            
        }
        
    }
    
    public static void startBFS(int source1, int destination1, int[] a, int[] b, int noOfTrafficLines){
          Queue<Node> queue = new LinkedList<Node>();
          queue.add(new Node(source1,0));
          int[] parent = new int[set.size()];  
          List<Node> explored = new ArrayList<Node>();
          Node child = new Node();
          Queue<Node> children = new LinkedList<Node>();
          System.out.println("destination: "+destination1);
          System.out.println("size: "+set.size());
          System.out.println("I am in BFS");

          while(!queue.isEmpty()){
             Node currentnode = queue.remove();
             if(currentnode.node == destination1){
                 System.out.println("GOAL REACHED");
                 System.out.println("Length of parent array: "+parent.length);
                 for(int i=0;i<parent.length;i++)
                     System.out.println("parent: "+parent[i]);
                 print(parent,source1,destination1);
             }
             else{   
                   explored.add(currentnode);
                    for(int x = 0; x < noOfTrafficLines; x++){
                       if(a[x] == currentnode.node){
                          child=new Node();
                          child.node = b[x];
                          child.parent = currentnode.node;
                      //    parent[child.node] = currentnode.node;
                          children.add(child);
                          
                       }
                   }
                
                   while(!children.isEmpty()){
                       Node z = children.remove();
                       if((!queue.contains(z)) && (!explored.contains(z))){
                           queue.add(z);
                           parent[z.node] = currentnode.node;
                          
                       }
                   }
                    
             }
          }
               
                
          }
      static void print(int[] parent, int source1, int destination1){
          System.out.println("goal reached");
          String temp1 = new String();
          int d = 0, s =0;
          d = destination1;
          s = source1; 
          int l2 = 0;
        
            
          while(d != s){
              temp1 += linkedhmap1.get(d);
              temp1 += "+";
              d = parent[d];
            }
              temp1 += linkedhmap1.get(s);
              temp1 += "+";
              System.out.println(temp1);
              
               String[] str = temp1.split("\\+");
              
            //  System.out.println(str[1]);
             // PrintWriter writer = new PrintWriter("output.txt","UTF-8");
               FileWriter filewrite;
        try {
            filewrite = new FileWriter("D://output.txt");
            for(int n=  str.length -1; n >=0; n--){
                  filewrite.write((str[n]) +" "+ l2+++"\n");
              } 
          //  System.out.println(l2);
            filewrite.close();
        } catch (IOException ex) {
            //Logger.getLogger(homework.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0);
       //     PrintWriter pw = new PrintWriter(filewrite);
                             
       //   System.exit(0);
          
      } 
      
      
      static void startDFS(int source1, int destination1, int[] a, int[] b, int noOfTrafficLines){
          Stack<Node> stack = new Stack<Node>();
          stack.push(new Node(source1,0));
          int[] parent = new int[set.size()];
          System.out.println("I am in DFS");
       //   Sytem.out.println("stack start: "+start)
          List<Node> explored = new ArrayList<Node>();
          Queue<Node> children = new LinkedList<Node>();
          Node child= new Node();
          
          
          while(!stack.isEmpty()){
              Node currentnode = stack.pop();   
           if(currentnode.node == destination1){
                 System.out.println("Length of parent array: "+parent.length);
                 for(int i=0;i<parent.length;i++)
                     System.out.println("parent: "+parent[i]);
                 print(parent,source1,destination1);
             }
           else{
               explored.add(currentnode);
               for(int x = noOfTrafficLines - 1; x >= 0; x--){
                      if(a[x] == currentnode.node){
                      child = new Node();
                      child.node = b[x];
                      child.parent = currentnode.node;
                      children.add(child);
                  }
      }
               while(!children.isEmpty()){
                   Node z = children.remove();
//                   if(stack.contains(z)){
//                       stack.remove(z);
//                       parent[z.node] = currentnode.node;
//                       stack.add(z);
//                   }
                   if(!stack.contains(z) && (!explored.contains(z))){
                       stack.add(z);
                       parent[z.node] = currentnode.node;
                   }
      }
      }
      
      }    
}
       public static void startUCS(int source1, int destination1, int[] a ,int[] b, int[] c, int noOfTrafficLines){
         // Comparsator<Integer> comparator = new ComparatorClass();
          
          int infinity = 9999999;
          int[] cost = new int[set.size()];
          int[] f = new int[set.size()];
          int[] explored = new int[set.size()];
          int[] path = new int[set.size()];
          Queue<Node> children = new LinkedList<Node>();
          List<Node> closed = new ArrayList<Node>();
          Node[] n = new Node[set.size()];
          int timestamp = 1;
//          Iterator iter = pqueue.iterator();
         // int node1;
          //Node a = null;
          int[] parent = new int[set.size()]; 
          
          
          for(int i =0; i < set.size(); i++){
              cost[i] = infinity;
          }
          
          pqueue.add(new Node(source1,0,0, timestamp));
          cost[source1]  =0; 
          
          while(!pqueue.isEmpty()){
//               int currentNode = removeNode();
                 Node currentNode = pqueue.remove();
               if(currentNode.node == destination1){
                  System.out.println("Goal reached");
                  print1(parent,cost,source1,destination1);
              }
           
               for(int v = 0; v < noOfTrafficLines; v++){
                   if(a[v] == currentNode.node){
                       if(cost[b[v]] > c[v] + cost[currentNode.node]){
                           cost[b[v]] = c[v] + cost[currentNode.node];
                           parent[b[v]] = currentNode.node;
                           children.add(new Node(b[v], cost[b[v]], parent[b[v]], timestamp++));
                   }
               }

               
               while(!(children.isEmpty())){
                   Node child = children.remove();
                   if(!pqueue.contains(child) && !(closed.contains(child))){
                       pqueue.add(child);
                   }
                   else if(pqueue.contains(child)){
                       Iterator<Node> iter = pqueue.iterator();
                       while(iter.hasNext()){
                          Node node = iter.next(); 
                          if(child == node){
                              if(child.cost < node.cost){
                                  pqueue.remove(node);
                                  parent[child.parent] = currentNode.node;
                                  pqueue.add(child);
                              }
                          }
                       }
                   }
                   else if(closed.contains(child)){
                       Iterator<Node> iter1 = children.iterator();
                        if(iter1.hasNext()){
                            Node node1 = iter1.next();
                            if(child == node1){
                                closed.remove(node1);
                                parent[child.parent] = currentNode.node;
                                pqueue.add(child);
                            }
                        }
                   }
               }
               
               closed.add(currentNode);
               
          
          
          
      } 
         
          }         
}
       public static void print1(int[] parent,int[] cost, int source1,int destination1){
          System.out.println("goal reached");
          String temp1 = new String();
          int d = 0, s =0;
          d = destination1;
          s = source1; 
          String temp2 = new String();
          
          
          while(d != s){
              temp2 += cost[d];
              temp2 += "+";
              temp1 += linkedhmap1.get(d);
              temp1 += "+";
              d = parent[d];
               
            } 
          
              temp1 += linkedhmap1.get(s);
              temp1 += "+";
              temp2 += 0;
              temp2 += "+";
              System.out.println(temp1);
              System.out.println(temp2);
               String[] str = temp1.split("\\+");
               String[] str1 = temp2.split("\\+");
              
            //  System.out.println(str[1]);
            
            
          FileWriter filewrite;
        try {
            filewrite = new FileWriter("D://output.txt");
            for(int n=  str.length -1; n >=0; n--){
                  filewrite.write((str[n]) +" "+ str1[n]+"\n");
              } 
            filewrite.close();
        } catch (IOException ex) {
            //Logger.getLogger(homework.class.getName()).log(Level.SEVERE, null, ex);
        }
          
            
//              for(int n=  str.length -1; n >=0; n--){
//                  filewrite1.write(str[n]+" "+str1[n]+"\n");
//              }
        
              
              System.exit(0);
          
      }
       
          public static void startA(int source1,int destination1,int[] arrayA, int[] a, int[] b, int[] c, int noOfTrafficLines){
                     
          int infinity = 9999999;
          int[] cost = new int[set.size()];
          int[] f = new int[set.size()];
          int[] path = new int[set.size()];
          Queue<Node1> children = new LinkedList<Node1>();
          List<Node1> closed = new ArrayList<Node1>();
          Node1[] n = new Node1[set.size()];
//          Iterator iter = pqueue.iterator();
         // int node1;
          //Node a = null;
          int[] parent = new int[set.size()]; 
          int timestamp = 0;
         
          
          for(int i =0; i < set.size(); i++){
              cost[i] = infinity;
          }
          
          pqueue1.add(new Node1(source1,0,0,arrayA[source1],0));
          cost[source1]  =0; 
          
          while(!pqueue1.isEmpty()){
//               int currentNode = removeNode();
                 Node1 currentNode = pqueue1.remove();
               if(currentNode.node1 == destination1){
                  System.out.println("Goal reachXed");
                  print1(parent,cost,source1,destination1);
              }
               for(int v = 0; v < noOfTrafficLines; v++){
                    if(a[v] == currentNode.node1){
                        if(cost[b[v]] > c[v] + cost[currentNode.node1]){
                            cost[b[v]] = c[v] + cost[currentNode.node1] ;
                            f[b[v]] = cost[b[v]] + arrayA[b[v]];
                            parent[b[v]] = currentNode.node1;
                            children.add(new Node1(b[v],cost[b[v]], parent[b[v]],f[b[v]],timestamp++)) ;                
                        }
              }
              
          }
               
               while(!(children.isEmpty())){
                   Node1 child = children.remove();
                   if(!pqueue1.contains(child) && !(closed.contains(child))){
                       pqueue1.add(child);
                   }
                   else if(pqueue1.contains(child)){
                       Iterator<Node1> iter = pqueue1.iterator();
                       while(iter.hasNext()){
                          Node1 node1 = iter.next(); 
                          if(child == node1){
                              if(child.cost1 < node1.cost1){
                                  pqueue1.remove(node1);
                                  parent[child.parent1] = currentNode.node1;
                                  pqueue1.add(child);
                              }
                          }
                       }
                   }
                   else if(closed.contains(child)){
                       Iterator<Node1> iter1 = children.iterator();
                        if(iter1.hasNext()){
                            Node1 node2 = iter1.next();
                            if(child == node2){
                                closed.remove(node2);
                                parent[child.parent1] = currentNode.node1;
                                pqueue1.add(child);
                            }
                        }
                   }
               }
               
               closed.add(currentNode);
      } 
         
          
}
  
}


class Node implements Comparator<Node>{
    
    int node;
    int cost;
    int parent;
    int timestamp;
    
    public Node(){
        
    }
    public Node(int node, int path_cost, int parent, int timestamp){
        this.node = node;
        this.cost = path_cost;
        this.parent = parent;
        this.timestamp = timestamp;
    }
    
    public Node(int node, int parent){
        this.node = node;
        this.parent = parent;
    }
    
    @Override 
    public int compare(Node x, Node y){
        if(x.cost < y.cost){
            return -1;
    }
        if(x.cost > y.cost){
            return 1;
        }

        if(x.cost == y.cost){
            if(x.timestamp < y.timestamp){
                return -1;
            }
            if(x.timestamp > y.timestamp){
                return 1;
            }          
        }
       return 0;     
   
    }
    
    
    @Override
     public boolean equals(Object obj)
    {
        if (obj instanceof Node)
        {
            Node node = (Node) obj;
            if (this.node == node.node)
            {
                return true;
            }
        }
        return false;
    }
     
     public int hashcode(){
         return this.node;
     }
}

class Node1 implements Comparator<Node1>{
    int node1;
    int cost1;
    int parent1;
    int f;
    int timestamp;
    
    public Node1(){
        
    }
    
    public Node1(int node1, int path_cost1, int parent1, int f, int timestamp){
        this.node1 = node1;
        this.cost1 = path_cost1;
        this.parent1 = parent1;
        this.f = f;
        this.timestamp = timestamp;
    }
    
    @Override
    public int compare(Node1 x, Node1 y){
        if(x.f < y.f){
          return -1;  
        }
        if(x.f > y.f){
            return 1;
        }
        if(x.f == y.f){
            if(x.timestamp < y.timestamp){
                return -1;
            }
            if(x.timestamp > y.timestamp){
                return 1;
            }          
        }
        
        return 0;
    }
     
    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Node1)
        {
            Node1 node1 = (Node1) obj;
            if (this.node1 == node1.node1)
            {
                return true;
            }
        }
        return false;
    }
     
     public int hashcode(){
         return this.node1;
     }
}    

