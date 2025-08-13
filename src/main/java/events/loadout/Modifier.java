package events.loadout;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public record Modifier(String Label, float Value, float OriginalValue,
                       boolean LessIsGood) {

}
