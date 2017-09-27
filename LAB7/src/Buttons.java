public class Buttons {
	public static void Up() {
		if ((MassivLevel.hx - 1) > -1) {
			if (MassivLevel.a[MassivLevel.hx - 1][MassivLevel.hy] == 3) {
				if ((MassivLevel.hx - 2) > -1
						&& MassivLevel.a[MassivLevel.hx - 2][MassivLevel.hy] != 2
						&& MassivLevel.a[MassivLevel.hx - 2][MassivLevel.hy] != 3) {
					MassivLevel.a[MassivLevel.hx - 2][MassivLevel.hy] = 3;
					MassivLevel.a[MassivLevel.hx - 1][MassivLevel.hy] = 1;
					MassivLevel.a[MassivLevel.hx][MassivLevel.hy] = 0;
				}
			}
			if (MassivLevel.a[MassivLevel.hx - 1][MassivLevel.hy] != 2
					&& MassivLevel.a[MassivLevel.hx - 1][MassivLevel.hy] != 3) {
				MassivLevel.a[MassivLevel.hx][MassivLevel.hy] = 0;
				MassivLevel.a[MassivLevel.hx - 1][MassivLevel.hy] = 1;
				MassivLevel.hx = MassivLevel.hx - 1;
			}
		}
	}

	public static void Down() {
		if ((MassivLevel.hx + 1) < MassivLevel.sizex) {
			if (MassivLevel.a[MassivLevel.hx + 1][MassivLevel.hy] == 3) {
				if ((MassivLevel.hx + 2) < MassivLevel.sizex
						&& MassivLevel.a[MassivLevel.hx + 2][MassivLevel.hy] != 2
						&& MassivLevel.a[MassivLevel.hx + 2][MassivLevel.hy] != 3) {
					MassivLevel.a[MassivLevel.hx + 2][MassivLevel.hy] = 3;
					MassivLevel.a[MassivLevel.hx + 1][MassivLevel.hy] = 1;
					MassivLevel.a[MassivLevel.hx][MassivLevel.hy] = 0;
				}
			}
			if (MassivLevel.a[MassivLevel.hx + 1][MassivLevel.hy] != 2
					&& MassivLevel.a[MassivLevel.hx + 1][MassivLevel.hy] != 3) {
				MassivLevel.a[MassivLevel.hx][MassivLevel.hy] = 0;
				MassivLevel.a[MassivLevel.hx + 1][MassivLevel.hy] = 1;
				MassivLevel.hx = MassivLevel.hx + 1;
			}

		}
	}

	public static void Left() {
		if ((MassivLevel.hy - 1) > -1) {
			if (MassivLevel.a[MassivLevel.hx][MassivLevel.hy - 1] == 3) {
				if ((MassivLevel.hy - 2) > -1
						&& MassivLevel.a[MassivLevel.hx][MassivLevel.hy - 2] != 2
						&& MassivLevel.a[MassivLevel.hx][MassivLevel.hy - 2] != 3) {
					MassivLevel.a[MassivLevel.hx][MassivLevel.hy - 2] = 3;
					MassivLevel.a[MassivLevel.hx][MassivLevel.hy - 1] = 1;
					MassivLevel.a[MassivLevel.hx][MassivLevel.hy] = 0;
				}
			}
			if (MassivLevel.a[MassivLevel.hx][MassivLevel.hy - 1] != 2
					&& MassivLevel.a[MassivLevel.hx][MassivLevel.hy - 1] != 3) {
				MassivLevel.a[MassivLevel.hx][MassivLevel.hy] = 0;
				MassivLevel.a[MassivLevel.hx][MassivLevel.hy - 1] = 1;
				MassivLevel.hy = MassivLevel.hy - 1;
			}

		}
	}

	public static void Right() {
		if ((MassivLevel.hy + 1) < MassivLevel.sizey) {
			if (MassivLevel.a[MassivLevel.hx][MassivLevel.hy + 1] == 3) {
				if ((MassivLevel.hy + 2) < MassivLevel.sizey
						&& MassivLevel.a[MassivLevel.hx][MassivLevel.hy + 2] != 2
						&& MassivLevel.a[MassivLevel.hx][MassivLevel.hy + 2] != 3) {
					MassivLevel.a[MassivLevel.hx][MassivLevel.hy + 2] = 3;
					MassivLevel.a[MassivLevel.hx][MassivLevel.hy + 1] = 1;
					MassivLevel.a[MassivLevel.hx][MassivLevel.hy] = 0;
				}
			}
			if (MassivLevel.a[MassivLevel.hx][MassivLevel.hy + 1] != 2
					&& MassivLevel.a[MassivLevel.hx][MassivLevel.hy + 1] != 3) {
				MassivLevel.a[MassivLevel.hx][MassivLevel.hy] = 0;
				MassivLevel.a[MassivLevel.hx][MassivLevel.hy + 1] = 1;
				MassivLevel.hy = MassivLevel.hy + 1;
			}

		}
	}

}
