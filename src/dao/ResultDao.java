package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.DatabaseConfig;
import model.Result;


public class ResultDao {
	private DatabaseConfig config = new DatabaseConfig();
	
	public void save(Result score) throws SQLException{
		
		Connection connection = config.getConnection();
		String sql = "INSERT INTO calc(first_number, second_number, result, calculation) VALUES (?,?,?,?)";

		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setFloat(1, score.getFirstNumber());
		statement.setFloat(2, score.getSecondNumber());
		statement.setDouble(3, score.getResult());
		statement.setString(4, score.getCalculation());
		statement.executeUpdate();
		
	}
	public List<Result> findAll() throws SQLException {
		Connection connection = config.getConnection();
		String sql = "SELECT id,first_number,second_number,result,calculation FROM calc";
		PreparedStatement statement = connection.prepareStatement(sql);
		
		ResultSet result = statement.executeQuery();
		
		List<Result> resultList = new ArrayList<>();
		
		while(result.next()) {
			int id = result.getInt("id");
			float firstNumber = result.getFloat("first_number");
			float secondNumber = result.getFloat("second_number");
			double  results = result.getDouble("result");
			String calculation = result.getString("calculation");
			resultList.add(new Result(id, firstNumber, secondNumber, calculation, results));
		}
		
		return resultList;
	}

}
