package seongduck;

public class PointTest {
	

		public static void main(String[] args) {

			Point p1 = new Point(10, 20);
			Point p2 = new Point(-1, -2);

			double dist = Point.distance(p1, p2);

			System.out.printf("The distance between the two points %.2f and %.2f is %.2f ", p1.toStr(), p2.toStr(), dist);

		}

	}

	class Point {

		int x;
		int y;

		Point(int _x, int _y) {
			x = _x;
			y = _y;

		}

		String toStr() {

			return String.format("%d, %d", x, y);
		}

		 static double distance(Point p, Point q) {
			 
		
			 double dX = p.x - q.x; // x좌 표 변화 량
		   	 double dY = p.y - q.y; // y좌표 변화

			return Math.sqrt((dX * dX) + (dY * dY));
		}

	}


