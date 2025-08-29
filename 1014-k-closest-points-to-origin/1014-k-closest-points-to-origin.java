class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int res[][] = new int[k][2];
        PriorityQueue<dataType> q = new PriorityQueue<> (Collections.reverseOrder());
        for(int i=0;i<k;i++){
            double x = Math.sqrt((points[i][0]*points[i][0])+(points[i][1]*points[i][1]));
            q.offer(new dataType(points[i][0], points[i][1], x));
        }
        for(int i=k;i<points.length;i++){
            double x = Math.sqrt((points[i][0]*points[i][0])+(points[i][1]*points[i][1]));
            if(q.peek().d > x){
                q.poll();
                q.offer(new dataType(points[i][0], points[i][1], x));
            }
        }
        for(int i=0;i<k;i++){
            res[i][0] = q.peek().x;
            res[i][1] = q.peek().y;
            q.poll();
        }
        return res;
    }
}
class dataType implements Comparable<dataType>{
    int x;
    int y;
    double d;
    dataType(int x, int y, double d){
        this.x = x;
        this.y = y;
        this.d = d;
    }
    public int compareTo(dataType t){
        if(t.d>d){
            return -1;
        }
        else{
            return 1;
        }
    }
}