package es.accenture.mlgia.dto;

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
public class TextToSpeechDTO {

    private byte[] message;

}
