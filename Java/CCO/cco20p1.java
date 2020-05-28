import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class cco20p1 {

	static final int MAXN = 100001;

	public static class Line implements Comparable<Line> {

		int pos;
		boolean start;

		public Line(int p, boolean s) {
			pos = p;
			start = s;
		}

		public int compareTo(Line o) {
			if (pos != o.pos)
				return pos-o.pos;
			return start ? 1:-1;
		}

	};

	public static void main (String[] args) throws IOException {

		Reader sc = new Reader();

		int n = sc.nextInt();
		int l = sc.nextInt();
		int r = sc.nextInt();
		int y = sc.nextInt();

		Line [] points = new Line [MAXN*2];
		
		for (int i=0; i<n; i++) {
			int x = sc.nextInt();
			double v = sc.nextInt();
			double h = sc.nextInt();
			points[i] = new Line((int)Math.floor(x - y*h/v + 1), true);
			points[i+n] = new Line((int)Math.ceil(x + y*h/v), false);
		}

		Arrays.sort(points, 0, 2*n);

		int [] counter = new int [MAXN];
		int sweep = 0;
		double prevPos = l;
		int i = 0;
		
		Line line = points[i];
		while (line.pos < l) {
			i++;
			sweep += line.start ? 1:-1;
			line = points[i];
		}

		while (i<2*n) {
			line = points[i];
			double pos = line.pos;
			
			if (pos > r) break;
			
			boolean start = line.start;
			
			counter[sweep] += pos - prevPos;
			
			int move = start ? 1:-1;
			sweep += move;
			while (true) {
				i++;
				if (i >= 2*n) break;
				Line next = points[i];
				if (pos == next.pos && start == next.start)
					sweep += move;
				else break;
			}
			prevPos = pos;
		}

		counter[sweep] += r + 1 - prevPos;

		int num = 0;
		for (int j=0; j<=n; j++) {
			num += counter[j];
			System.out.println(num);
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
