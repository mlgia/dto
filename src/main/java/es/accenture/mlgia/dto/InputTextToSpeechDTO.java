package es.accenture.mlgia.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author juan.m.cintas.pena
 *
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InputTextToSpeechDTO {

    private String text;

}
