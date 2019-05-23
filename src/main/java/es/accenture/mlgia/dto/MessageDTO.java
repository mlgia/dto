package es.accenture.mlgia.dto;

import java.sql.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author josemaria.palma
 *
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MessageDTO implements Cloneable {
 
    private String messageIn;
    
    private String messageOut;
    
    private String messagePredictOut;
 
    private Date date;
    
    private String conversationId;
    
    private List<String> options;
    
	public MessageDTO clone() throws CloneNotSupportedException {
		return (MessageDTO) super.clone();
	}
    
}
