package OOP_Project.WeaponGameProject;

	public class User {
		public static void main(String[] args) {
			Game g=new Game();
			//System.out.println(g.selectWeapon());
			Weapon w=g.selectWeapon();
			w.use();
		}

	}

