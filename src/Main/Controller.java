package Main;

public class Controller {
	public static void Sum(int x1, int y1, int x2, int y2) { // 1 변수를 기준으로 합친다.
		DataBase.map[x1][y1] = new Block(DataBase.map[x2][y2].value * 2);
		DataBase.map[x2][y2] = new Block(0);
	}

	public static void Move(int val) {
		// 1. 오른쪽 땡김 2. 0~1 2~3 합쳐봄 3. 다시 오른쪽 당김.
		if (val == 38) { // ↑
			for (int index = 0;; index++) {
				for (int x = 0; x < 4; x++)
					for (int y = 0; y < 4; y++)
						if (DataBase.map[x][y].value != 0)
							try {
								DataBase.map[x][y] = DataBase.map[x][y + 1];
							} catch (Exception e) {
							}

				if (index != 0)
					break;
				else
					for (int x = 0; x < 4; x++)
						for (int y = 0; y < 4; y += 2)
							if (DataBase.map[x][y].value == DataBase.map[x][y + 1].value)
								Sum(x, y, x + 1, y);

			}
		} else if (val == 39) { // →
			for (int index = 0;; index++) {
				for (int y = 0; y < 4; y++)
					for (int x = 3; x > -1; x--)
						if (DataBase.map[x][y].value != 0)
							try {
								DataBase.map[x][y] = DataBase.map[x - 1][y];
							} catch (Exception e) {
							}

				if (index != 0)
					break;
				else
					for (int y = 0; y < 4; y++)
						for (int x = 0; x < 4; x += 2)
							if (DataBase.map[x + 1][y].value == DataBase.map[x][y].value)
								Sum(x, y, x + 1, y);

			}
		} else if (val == 40) { // ↓
			for (int index = 0;; index++) {
				for (int x = 0; x < 4; x++)
					for (int y = 3; y > -1; y--)
						if (DataBase.map[x][y].value != 0)
							try {
								DataBase.map[x][y] = DataBase.map[x][y-1];
							} catch (Exception e) {
							}

				if (index != 0)
					break;
				else
					for (int x = 0; x < 4; x++)
						for (int y = 0; y < 4; y += 2)
							if (DataBase.map[x][y].value == DataBase.map[x][y].value)
								Sum(x, y, x + 1, y);
			
			}

		} else if (val == 37) { // ←

		}// else if (val == )
	}

}
