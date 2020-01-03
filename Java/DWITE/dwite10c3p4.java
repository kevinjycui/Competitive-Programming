import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedList;

public class dwite10c3p4 {

	public static void main(String[] args) throws IOException {

		Reader sc = new Reader();
		
		char [][] graph = new char [10][10];
		
		LinkedList<Integer> xq = new LinkedList<Integer>();
		LinkedList<Integer> yq = new LinkedList<Integer>();
		
		for (int t=0; t<5; t++) {
			
			int sources = 0;
			int trees = 0;
			
			for (int i=0; i<10; i++) {
				String s = sc.readLine();
				for (int j=0; j<10; j++) {
					graph[i][j] = s.charAt(j);
					if (s.charAt(j) == 'F') {
						xq.add(i);
						yq.add(j);
						sources++;
					}
					else if (s.charAt(j) == 'T') {
						trees++;
					}
				}
			}
			sc.readLine();
			
			int time = 0;
			
			while (!xq.isEmpty()) {
				time++;
				int curr = sources;
				for (int i=0; i<curr; i++) {
					int x = xq.pop();
					int y = yq.pop();
																				
					if (x+1 < 10 && graph[x+1][y] == 'T') {
						graph[x+1][y] = 'F';
						trees--;
						sources++;
						xq.add(x+1);
						yq.add(y);
					}
					
					if (x-1 >= 0 && graph[x-1][y] == 'T') {
						graph[x-1][y] = 'F';
						trees--;
						sources++;
						xq.add(x-1);
						yq.add(y);
					}
					
					if (y+1 < 10 && graph[x][y+1] == 'T') {
						graph[x][y+1] = 'F';
						trees--;
						sources++;
						xq.add(x);
						yq.add(y+1);
					}
					
					if (y-1 >= 0 && graph[x][y-1] == 'T') {
						graph[x][y-1] = 'F';
						trees--;
						sources++;
						xq.add(x);
						yq.add(y-1);
					}
					
					sources--;
				}
			}
			
			if (trees == 0) System.out.println(time-1);
			else System.out.println(-1);
			
		}
		
	}
	
	static class Reader 
    { 
        final private int BUFFER_SIZE = 1 << 16; 
        private DataInputStream din; 
        private byte[] buffer; 
        private int bufferPointer, bytesRead; 
  
        public Reader() 
        { 
            din = new DataInputStream(System.in); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public Reader(String file_name) throws IOException 
        { 
            din = new DataInputStream(new FileInputStream(file_name)); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public String readLine() throws IOException 
        { 
            byte[] buf = new byte[64]; // line length 
            int cnt = 0, c; 
            while ((c = read()) != -1) 
            { 
                if (c == '\n') 
                    break; 
                buf[cnt++] = (byte) c; 
            } 
            return new String(buf, 0, cnt); 
        } 
  
        public int nextInt() throws IOException 
        { 
            int ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do
            { 
                ret = ret * 10 + c - '0'; 
            }  while ((c = read()) >= '0' && c <= '9'); 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public long nextLong() throws IOException 
        { 
            long ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public double nextDouble() throws IOException 
        { 
            double ret = 0, div = 1; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
  
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
  
            if (c == '.') 
            { 
                while ((c = read()) >= '0' && c <= '9') 
                { 
                    ret += (c - '0') / (div *= 10); 
                } 
            } 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        private void fillBuffer() throws IOException 
        { 
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
            if (bytesRead == -1) 
                buffer[0] = -1; 
        } 
  
        private byte read() throws IOException 
        { 
            if (bufferPointer == bytesRead) 
                fillBuffer(); 
            return buffer[bufferPointer++]; 
        } 
  
        public void close() throws IOException 
        { 
            if (din == null) 
                return; 
            din.close(); 
        } 
    }

}
