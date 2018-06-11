import java.sql.*;
public class DataBase {	
	int score=0;
	int ID=0;
	int Gender=0;
	String Gamer;
	
	String sql;
	
	GetData getdata;

    public DataBase() throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try{
            Connection object = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/score?serverTimezone=UTC&useSSL=false","root","ck1030580");
            Statement statement = object.createStatement();
            sql = "SELECT * FROM score.score";   //你要從資料庫拿的東西
            ResultSet data = statement.executeQuery(sql);
            while (data.next()){
                score = data.getInt("score");
                ID = data.getInt("ID");
                Gender = data.getInt("Gender");
                Gamer = data.getString("Gamer");
            }
            object.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

    }
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getGender() {
		return Gender;
	}

	public void setGender(int gender) {
		Gender = gender;
	}

	public String getGamer() {
		return Gamer;
	}

	public void setGamer(String gamer) {
		Gamer = gamer;
	}


	//TESTING
	public static void main(String[] args) {
		
	}
}

