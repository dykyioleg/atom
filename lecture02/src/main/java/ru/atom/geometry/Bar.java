package ru.atom.geometry;

public class Bar  implements Collider{

    private int  firstCornerX ;
    private int  firstCornerY ;
    private int  secondCornerX ;
    private int  secondCornerY ;

    public int getFirstCornerX() {
        return firstCornerX;
    }

    public void setFirstCornerX(int firstCornerX) {
        this.firstCornerX = firstCornerX;
    }

    public int getFirstCornerY() {
        return firstCornerY;
    }

    public void setFirstCornerY(int firstCornerY) {
        this.firstCornerY = firstCornerY;
    }

    public int getSecondCornerX() {
        return secondCornerX;
    }

    public void setSecondCornerX(int secondCornerX) {
        this.secondCornerX = secondCornerX;
    }

    public int getSecondCornerY() {
        return secondCornerY;
    }

    public void setSecondCornerY(int secondCornerY) {
        this.secondCornerY = secondCornerY;
    }

    @Override
    public boolean isColliding(Collider other) {
        Point point = getClass() != other.getClass() ? (Point) other  : null;
        Bar bar = null;



        return this.firstCornerX == bar.firstCornerX && this.secondCornerX == bar.secondCornerX
                && this.firstCornerY == bar.firstCornerY && this.secondCornerY == bar.secondCornerY
                || this.firstCornerY == bar.secondCornerX && this.secondCornerX == bar.secondCornerY
                || this.firstCornerX == bar.secondCornerX && this.secondCornerY == bar.secondCornerY
                || this.secondCornerX > point.getX() && this.secondCornerY > point.getY();
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bar bar = (Bar) o;

        return this.firstCornerX == bar.firstCornerX && this.secondCornerX == bar.secondCornerX
                && this.firstCornerY == bar.firstCornerY && this.secondCornerY == bar.secondCornerY
                || this.firstCornerX == bar.secondCornerX && this.firstCornerY == bar.secondCornerY
                || this.firstCornerY == bar.firstCornerX && this.secondCornerX == bar.firstCornerY
                || this.secondCornerX == bar.firstCornerX && this.secondCornerY == bar.secondCornerY;
    }
}
