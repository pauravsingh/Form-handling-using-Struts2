package comm;

import java.sql.SQLException;
import java.util.ArrayList;


public class MainAction{
	
	
	//Variables to store data from the form
	private int student_id;
	private String student_name;
	private String student_address;
	private String student_city;
	private String student_state;
	private int student_zipcode;
	private String student_phone;
	private String student_email;
	private String student_url;
	private String student_date;
	private String student_month;
	private String student_year;
	private String student_source;
	private String student_recom;
	private String student_comments;
	private String gmu_features;
		
	private String data;
	
	private DataBean cData;
	private StudentBean sData;
	private ArrayList<Integer> list;
	
	
	
	
	/**
	 * @return the student_id
	 */
	public int getStudent_id() {
		return student_id;
	}



	/**
	 * @param student_id the student_id to set
	 */
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}



	/**
	 * @return the student_name
	 */
	public String getStudent_name() {
		return student_name;
	}



	/**
	 * @param student_name the student_name to set
	 */
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}



	/**
	 * @return the student_address
	 */
	public String getStudent_address() {
		return student_address;
	}



	/**
	 * @param student_address the student_address to set
	 */
	public void setStudent_address(String student_address) {
		this.student_address = student_address;
	}



	/**
	 * @return the student_city
	 */
	public String getStudent_city() {
		return student_city;
	}



	/**
	 * @param student_city the student_city to set
	 */
	public void setStudent_city(String student_city) {
		this.student_city = student_city;
	}



	/**
	 * @return the student_state
	 */
	public String getStudent_state() {
		return student_state;
	}



	/**
	 * @param student_state the student_state to set
	 */
	public void setStudent_state(String student_state) {
		this.student_state = student_state;
	}



	/**
	 * @return the student_zipcode
	 */
	public int getStudent_zipcode() {
		return student_zipcode;
	}



	/**
	 * @param student_zipcode the student_zipcode to set
	 */
	public void setStudent_zipcode(int student_zipcode) {
		this.student_zipcode = student_zipcode;
	}



	/**
	 * @return the student_phone
	 */
	public String getStudent_phone() {
		return student_phone;
	}



	/**
	 * @param student_phone the student_phone to set
	 */
	public void setStudent_phone(String student_phone) {
		this.student_phone = student_phone;
	}



	/**
	 * @return the student_email
	 */
	public String getStudent_email() {
		return student_email;
	}



	/**
	 * @param student_email the student_email to set
	 */
	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}



	/**
	 * @return the student_url
	 */
	public String getStudent_url() {
		return student_url;
	}



	/**
	 * @param student_url the student_url to set
	 */
	public void setStudent_url(String student_url) {
		this.student_url = student_url;
	}



	/**
	 * @return the student_date
	 */
	public String getStudent_date() {
		return student_date;
	}



	/**
	 * @param student_date the student_date to set
	 */
	public void setStudent_date(String student_date) {
		this.student_date = student_date;
	}



	/**
	 * @return the student_month
	 */
	public String getStudent_month() {
		return student_month;
	}



	/**
	 * @param student_month the student_month to set
	 */
	public void setStudent_month(String student_month) {
		this.student_month = student_month;
	}



	/**
	 * @return the student_year
	 */
	public String getStudent_year() {
		return student_year;
	}



	/**
	 * @param student_year the student_year to set
	 */
	public void setStudent_year(String student_year) {
		this.student_year = student_year;
	}



	/**
	 * @return the student_source
	 */
	public String getStudent_source() {
		return student_source;
	}



	/**
	 * @param student_source the student_source to set
	 */
	public void setStudent_source(String student_source) {
		this.student_source = student_source;
	}



	/**
	 * @return the student_recom
	 */
	public String getStudent_recom() {
		return student_recom;
	}



	/**
	 * @param student_recom the student_recom to set
	 */
	public void setStudent_recom(String student_recom) {
		this.student_recom = student_recom;
	}



	/**
	 * @return the student_comments
	 */
	public String getStudent_comments() {
		return student_comments;
	}



	/**
	 * @param student_comments the student_comments to set
	 */
	public void setStudent_comments(String student_comments) {
		this.student_comments = student_comments;
	}



	/**
	 * @return the gmu_features
	 */
	public String getGmu_features() {
		return gmu_features;
	}



	/**
	 * @param gmu_features the gmu_features to set
	 */
	public void setGmu_features(String gmu_features) {
		this.gmu_features = gmu_features;
	}



	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}



	/**
	 * @param data the data to set
	 */
	public void setData(String data) {
		this.data = data;
	}



	/**
	 * @return the cData
	 */
	public DataBean getCData() {
		return cData;
	}



	/**
	 * @param cData the cData to set
	 */
	public void setCData(DataBean cData) {
		this.cData = cData;
	}



	/**
	 * @return the list
	 */
	public ArrayList<Integer> getList() {
		return list;
	}



	/**
	 * @param list the list to set
	 */
	public void setList(ArrayList<Integer> list) {
		this.list = list;
	}

	/**
	 * @return the sData
	 */
	public StudentBean getSData() {
		return sData;
	}



	/**
	 * @param sData the sData to set
	 */
	public void setSData(StudentBean sData) {
		this.sData = sData;
	}



	/**
	 * Default COnstructor
	 */
	public MainAction() {
	}


	//Executes when runmain action is called
	public String execute()
	{
		//Inserts the student data into the database
		StudentDAO studentDAO = new StudentDAO();
		String student_grad = student_month+","+student_year;
		try {
				studentDAO.addStudent(student_id, student_name, student_address, student_city, student_state, student_zipcode, student_phone, student_email, student_url, student_grad, student_date, student_recom, student_source, gmu_features, student_comments);
			} 
		catch (SQLException e)
		{
			System.out.println("Insert data error");
			e.printStackTrace();
		}
				
		//Calculates the mean and standard deviation of the data and returns a DataBean object
		DataProcessor dataprocessor = new DataProcessor();
		cData = dataprocessor.calculate(data);
		
		//Gets the list of students
		try {
				list = studentDAO.StudentList();
			} 
		catch (SQLException e) 
		{
			System.out.println("Student list retrive error");
			e.printStackTrace();
		}
		
		
		//IF mean is greater than 90 then redirect to winner acknowledgement 
		if(cData.getMean() > 90.00)
		{
			return "winner";
		}
		else
		{
			return "simple";
		}
			
	}
	
	//Executes when getDetails action is called
	public String fetch() {
		
		//Fetch student details and stores it the student bean 		
		StudentDAO studentDAO = new StudentDAO();
		try {
			sData = studentDAO.getStudent(student_id);
		} catch (SQLException e) {
			System.out.println("Student retrive error");
			e.printStackTrace();
		}
		
		//IF student exists then display details 
		if(sData.getStudent_id() == student_id)
		{
			return "success";
		}
		else
		{
			return "failure";
		}
	}
	
	

}
