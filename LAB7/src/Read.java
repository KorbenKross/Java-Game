import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Read {

	static FileInputStream name;

	public Read(String Name) {
		
		try {
			name = new FileInputStream(
					Name);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte[] str = null;
		try {
			str = new byte[name.available()];
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			name.read(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String text = new String(str);

		String[] numbers = text.split("([^-\\d])|(-\\D)");
		MassivLevel.sizex = Integer.parseInt(numbers[0]);
		MassivLevel.sizey = Integer.parseInt(numbers[1]);
		MassivLevel.hx = Integer.parseInt(numbers[2]);
		MassivLevel.hy = Integer.parseInt(numbers[3]);
		MassivLevel.exitkey = Integer.parseInt(numbers[4]);
		int k = 5;
		for (int i = 0; i < MassivLevel.sizex; ++i)
			for (int j = 0; j < MassivLevel.sizey; ++j, ++k)
				if (!"".equals(numbers[k]))
					MassivLevel.a[i][j] = Integer.parseInt(numbers[k]);
				else
					--j;
		for (int i = 0; i < MassivLevel.sizex; ++i)
			for (int j = 0; j < MassivLevel.sizey; ++j, ++k)
				if (!"".equals(numbers[k]))
					MassivLevel.b[i][j] = Integer.parseInt(numbers[k]);
				else
					--j;
	}

}
