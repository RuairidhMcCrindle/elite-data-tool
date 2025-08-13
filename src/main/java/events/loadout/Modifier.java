package events.loadout;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Modifier(String Label, float Value, float OriginalValue,
                       boolean LessIsGood) {

}
