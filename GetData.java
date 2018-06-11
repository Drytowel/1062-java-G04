import java.sql.*;
public class GetData {
	int score;
	int ID;
	int Gender;
	String Gamer;
	
	public GetData(){
		score=0;
		ID=0;
		Gender=0;
	}
	public void score_update(int score) throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try {
            Connection object = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/score?serverTimezone=UTC&useSSL=false", "root", "ck1030580");
            Statement statement = object.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            String sql = "SELECT * FROM score.score";
            ResultSet data = statement.executeQuery(sql);
            while (data.next()){
                data.updateInt("score",score);
                data.updateRow();
            }
            object.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
	
	public void ID_update(int ID) throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try {
            Connection object = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/score?serverTimezone=UTC&useSSL=false", "root", "ck1030580");
            Statement statement = object.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            String sql = "SELECT * FROM score.score";
            ResultSet data = statement.executeQuery(sql);
            while (data.next()){
                data.updateInt("ID",ID);
                data.updateRow();
            }
            object.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	public void Gender_update(int Gender) throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try {
            Connection object = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/score?serverTimezone=UTC&useSSL=false", "root", "ck1030580");
            Statement statement = object.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            String sql = "SELECT * FROM score.score";
            ResultSet data = statement.executeQuery(sql);
            while (data.next()){
                data.updateInt("Gender",Gender);
                data.updateRow();
            }
            object.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	public void Gamer_update(String Gamer) throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try {
            Connection object = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/score?serverTimezone=UTC&useSSL=false", "root", "ck1030580");
            Statement statement = object.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            String sql = "SELECT * FROM score.score";
            ResultSet data = statement.executeQuery(sql);
            while (data.next()){
                data.updateNString("Gamer", Gamer);
                data.updateRow();
            }
            object.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
