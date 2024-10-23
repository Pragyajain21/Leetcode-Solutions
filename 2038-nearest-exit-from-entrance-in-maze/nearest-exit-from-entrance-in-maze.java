class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length;
        int n = maze[0].length;
        Queue<int[]> q = new LinkedList<>();
        q.add(entrance);
        maze[entrance[0]][entrance[1]] = '+';

        int steps = 0;
        int dr[]={-1,0,1,0};
        int dc[]={0,1,0,-1};

        while(!q.isEmpty())
        {
            int len = q.size();
            for(int k=0;k<len;k++)
            {
            int []temp = q.poll();
            int i = temp[0];
            int j = temp[1];
            if((!Arrays.equals(temp,entrance) )&& (i==0 || j==0 || i == m-1 || j== n-1))
            return steps;

            for (int d = 0; d < 4; d++) {
                    int ni = i + dr[d];
                    int nj = j + dc[d];

                    // Check if new position is within bounds and not a wall
                    if (ni >= 0 && ni < m && nj >= 0 && nj < n && maze[ni][nj] == '.') {
                        q.add(new int[]{ni, nj});
                        maze[ni][nj] = '+';  // Mark as visited
                    }
                }

            }
            steps++;

        }
        return -1;
    }
}