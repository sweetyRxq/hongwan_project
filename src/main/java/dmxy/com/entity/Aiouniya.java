package dmxy.com.entity;
import java.io.Serializable;
import java.util.List;
import java.util.Date;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table(name = "app_aiouniya")
public class Aiouniya extends Gailun implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
//GENERATE_START 
	/**
	 * 艾瑞利亚：
	 */
	/**
	 *Aiouniya
	 */
	@Transient
	private String dataType = "Aiouniya";

	public Aiouniya getAiruiliya() {
		return airuiliya;
	}
	public void setAiruiliya(Aiouniya airuiliya) {
		this.airuiliya = airuiliya;
	}
    public String getDataType() {
    	return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
//GENERATE_END
}