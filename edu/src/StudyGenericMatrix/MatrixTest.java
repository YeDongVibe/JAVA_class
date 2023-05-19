package StudyGenericMatrix;

public class MatrixTest {

    public static void main(String[] args) {

        // 2행 3열의 Integer 타입 행렬을 랜덤으로 생성
        Matrix<Integer> im1 = new Matrix<Integer>(2, 3, Integer.class);
        im1.showData();
        Matrix<Integer> im2 = new Matrix<Integer>(2, 3, Integer.class);
        im2.showData();

        // 두개의 Integer 타입 행렬을 받아 더한 결과를 반환
        im1.AddMatrix(im2);
        im1.showData();

        // 2행 3열의 Double 타입 행렬을 랜덤으로 생성
        Matrix<Double> dm1 = new Matrix<Double>(2, 3, Double.class);
        dm1.showData();
        Matrix<Double> dm2 = new Matrix<Double>(2, 3, Double.class);
        dm2.showData();

        // 두개의 Double 타입 행렬을 받아 더한 결과를 반환
        dm1.AddMatrix(dm2);
        dm1.showData();

        // 2행 3열의 Long 타입 행렬을 랜덤으로 생성
        Matrix<Long> lm1 = new Matrix<Long>(2, 3, Long.class);
        lm1.showData();
        Matrix<Long> lm2 = new Matrix<Long>(2, 3, Long.class);
        lm2.showData();

        // 두개의 Long 타입 행렬을 받아 더한 결과를 반환
        lm1.AddMatrix(lm2);
        lm1.showData();

        // Method description 테스트 (생성자와 함수들에 마우스 오버 해서 내용 확인)
        Matrix<Integer> m = new Matrix<Integer>(2, 3, Integer.class);
        int r = m.getRows();
        int c = m.getCols();
        Class cl = m.getGenericClass();
        m.AddMatrix(m);
        m.showData();
    }
}