/** Двумерный класс точки **/
public class Point2d {
/** Координата X **/
        private double xCoord;
/** Координата Y **/
        private double yCoord;
/** Кнструктор инициализации **/
        public Point2d(double x, double y) {
            xCoord = x;
            yCoord = y;
        }
/** Кнструктор по умолчанию **/
        public Point2d() {
// Вызовите конструктор с двумя параметрами и определите источник.
            this(0, 0);
        }
/** Вовращение координаты X **/
        public double getX () {
            return xCoord;
        }
/** Вовращение координаты Y **/
        public double getY () {
            return yCoord;
        }
/** Установка значения координаты X. **/
        public void setX ( double val) {
            xCoord = val;
        }
/** Установка значения координаты Y. **/
        public void setY ( double val) {
            yCoord = val;
        }
}
