public class Triangle {
    private double firstSide, secondSide, thirdSide;

    public Triangle(double firstSide, double secondSide, double thirdSide) throws IllegalTriangleException {
        if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0) {
                throw new IllegalTriangleException("Độ dài của cạnh tam giác không thể nhỏ hơn hoặc bằng 0");
        }
        if (firstSide + secondSide <= thirdSide || secondSide + thirdSide <= firstSide || firstSide + thirdSide <= secondSide) {
                throw new IllegalTriangleException("Tổng độ dài hai cạnh bất kỳ của tam giác phải lớn hơn độ dài cạnh còn lại");
        }

        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(double thirdSide) {
        this.thirdSide = thirdSide;
    }
}
