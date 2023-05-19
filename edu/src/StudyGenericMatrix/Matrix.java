package StudyGenericMatrix;


import java.lang.reflect.Array;
import java.util.Random;

public class Matrix<T extends Number> {

    private int rows;
    private int cols;
    private T[][] data;
    private final Class<T> type;

    /**
     * 행렬의 행의 수를 반환한다.
     *
     * @return 이 행렬의 행의 수를 의미하는 {@code int} 값.
     */
    public int getRows() {
        return this.rows;
    }

    /**
     * 행렬의 열의 수를 반환한다.
     *
     * @return 이 행렬의 열의 수를 의미하는 {@code int} 값.
     */
    public int getCols() {
        return this.cols;
    }

    /**
     * 이 인스턴스의 Generic 타입 클래스를 반환한다.
     * <p>
     * 예 :
     * </p>
     * <p>
     * {@code Matrix<Integer> m = new Matrix<Integer>(2, 3, Integer.class); }<br>
     * {@code Class c = m.getGenericClass(); }
     * </p>
     *
     * @return 이 객체의 Generic 클래스를 나타내는 {@code Class} 객체.
     */
    public Class<T> getGenericClass() {
        return this.type;
    }

    /**
     * <P>
     * 생성자.
     * <p>
     * 지정한 행과 열의 개수의 인스턴스를 생성한다. 모든 원소의 값들은
     * 지정한 Generic 타입의 임의의 값으로 설정됨.
     * <p>
     * 2행 3열의 Integer 타입 행렬 생성의 예 :
     * </p>
     * <p>
     * {@Code Matrix<Integer> m = new Matrix<Integer>(2, 3, Integer.class);}
     * </p>
     * 
     * @param row  생성할 행렬의 행의 개수.
     * @param col  생성할 행렬의 열의 개수.
     * @param type 생성할 행렬의 원소들의 타입. Generic 타입과 동일해야 함.
     */
    public Matrix(int row, int col, Class<T> type) {
        this.rows = row;
        this.cols = col;

        // Class 자신이 무슨타입인지 알고있어야 한다.
        // 생성자의 파라미터로 자신의 타입을 받아서 보관하고 있어야 함.
        this.type = type;

        // 행렬 데이터를 생성
        setData();
    } // public Matrix(int row, int col, Class<T> type)

    /**
     * 인스턴스의 행렬 원소들을 Generic 타입에 맞는 임의의 값으로 설정한다.
     * 임의의 값의 범위는 0 ~ Generic 타입 최대값의 제곱근.
     * <p>
     * 예 : Generic 타입이 Integer 인 경우 {@Code Math.sqrt(Integer.MAX_VALUE)}
     * </p>
     */
    private void setData() {
        Random rand = new Random(System.currentTimeMillis());

        // generic 배열은 this.data = new T[this.rows][this.cols] 로 생성 불가능
        this.data = (T[][]) Array.newInstance(this.type, this.rows, this.cols);

        for (int r = 0; r < this.rows; r++) { // 행의 개수
            for (int c = 0; c < this.cols; c++) { // 열의 개수
                if (this.type == Integer.class) {
                    // sqrtMax 는 Integer 가 가질수 있는 최대값의 제곱근.
                    // Math.sqrt() 는 double 형으로 결과를 반환하기 때문에
                    // Math.sqrt(Integer.MAX_VALUE) 를 Double 타입으로 캐스팅한 후
                    // intValue() 메소드를 사용해 다시 int 타입으로 캐스팅한다.
                    // int 타입은 Integer 타입으로 자동으로 변환됨.
                    Integer sqrtMax = ((Double) Math.sqrt(Integer.MAX_VALUE)).intValue();
                    // int 타입을 반환하는 rand.nextInt() 결과를 Integer 로 변환후 다시 T 타입으로 변환
                    data[r][c] = (T) Integer.valueOf(rand.nextInt(sqrtMax));
                } else if (this.type == Double.class) {
                    // sqrtMax 는 Double 이 가질수 있는 최대값의 제곱근.
                    // Math.sqrt() 는 double 형으로 결과를 반환하기 때문에
                    // 형 변환 없이 바로 대입 (double 은 Double 로 자동 캐스팅 됨).
                    Double sqrtMax = Math.sqrt(Double.MAX_VALUE);
                    // double 타입을 반환하는 rand.nextDouble() 결과를 Double 로 변환후 다시 T 타입으로 변환
                    data[r][c] = (T) Double.valueOf(rand.nextDouble(sqrtMax));
                } else if (this.type == Long.class) {
                    // sqrtMax 는 Long 이 가질수 있는 최대값의 제곱근.
                    // Math.sqrt() 는 double 형으로 결과를 반환하기 때문에
                    // Math.sqrt(Long.MAX_VALUE) 를 Double 타입으로 캐스팅한 후
                    // intValue() 메소드를 사용해 다시 long 타입으로 캐스팅한다.
                    // long 타입은 Long 타입으로 자동으로 변환됨.
                    Long sqrtMax = ((Double) Math.sqrt(Long.MAX_VALUE)).longValue();
                    // long 타입을 반환하는 rand.nextLong() 결과를 Long 으로 변환후 다시 T 타입으로 변환
                    data[r][c] = (T) Long.valueOf(rand.nextLong(sqrtMax));
                }
            } // for (int c = 0; c < this.cols; c++)
        } // for (int r = 0; r < this.rows; r++)
    } // private void setData()

    /**
     * 인스턴스의 행렬 데이터를 터미널에 출력.
     * 행렬의 Generic 타입을 먼저 출력 한 후
     * 각각의 원소를 행과 열에 맞춰 출력한다.
     */
    protected void showData() {
        // 이 객체의 generic 타입을 출력
        System.out.println("- " + this.type.getSimpleName() + " 타입 행렬의 데이터");
        for (int i = 0; i < this.rows; i++) { // 행의 개수
            for (int j = 0; j < this.cols; j++) { // 열의 개수
                System.out.print(this.data[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    } // protected void showData()

    /**
     * 함수를 호출하는 인스턴스의 원소값에 파라미터로 제공되는 행렬의 원소값을 더함.
     * 예 : {@code a.AddMatrix(b) } 는 {@code a = a + b } 와 같은 결과.
     * 
     * @param m 값을 더할 행렬의 인스턴스
     */
    public void AddMatrix(Matrix<T> m) {

        for (int r = 0; r < this.rows; r++) { // 행의 개수
            for (int c = 0; c < this.cols; c++) { // 열의 개수
                if (this.type == Integer.class) {
                    // this.data[r][c] 와 m.data[r][c] 을 Integer 형으로 캐스팅한 뒤 더하고
                    // 그 결과를 다시 Number 형으로 변환한 후 T 형으로 변환해 this.data[r][c] 에 값을 대입한다.
                    this.data[r][c] = (T) (Number) ((Integer) this.data[r][c] + (Integer) m.data[r][c]);
                } else if (this.type == Double.class) {
                    // this.data[r][c] 와 m.data[r][c] 을 Double 형으로 캐스팅한 뒤 더하고
                    // 그 결과를 다시 Number 형으로 변환한 후 T 형으로 변환해 this.data[r][c] 에 값을 대입한다.
                    this.data[r][c] = (T) (Number) ((Double) this.data[r][c] + (Double) m.data[r][c]);
                } else if (this.type == Long.class) {
                    // this.data[r][c] 와 m.data[r][c] 을 Long 형으로 캐스팅한 뒤 더하고
                    // 그 결과를 다시 Number 형으로 변환한 후 T 형으로 변환해 this.data[r][c] 에 값을 대입한다.
                    this.data[r][c] = (T) (Number) ((Long) this.data[r][c] + (Long) m.data[r][c]);
                }
            } // for (int c = 0; c < this.cols; c++)
        } // for (int r = 0; r < this.rows; r++)
    } // public void AddMatrix(Matrix<T> m)

}