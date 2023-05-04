    package BakingDog.recursion;

    // Z

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.StringTokenizer;

    public class boj_1074 {

        static int num = 0;
        static int N,R,C;

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            R = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());

            partition(0,0,(int)Math.pow(2,N));

        }

        public static void partition(int r, int c, int size){
            if(size == 1){
                System.out.println(num);
                return;
            }

            int newSize = size/2;
            if(R < r + newSize && C < c + newSize){
                partition(r,c,newSize);
            }
            if(R < r + newSize && c + newSize <= C){
                num += (size*size/4);
                partition(r,c+newSize, newSize);
            }
            if(r + newSize <= R && C < c + newSize){
                num += ((size*size) / 4 ) * 2;
                partition(r+newSize, c , newSize);
            }
            if(r + newSize <= R && c + newSize <= C){
                num += ((size*size) / 4) * 3;
                partition(r+newSize, c+newSize, newSize);
            }
        }
    }
