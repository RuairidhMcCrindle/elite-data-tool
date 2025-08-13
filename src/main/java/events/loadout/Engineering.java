package events.loadout;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public record Engineering(long EngineerID, String Engineer, long BlueprintID,
                          String BlueprintName, int Level, float Quality,
                          String ExperimentalEffect,
 String ExperimentalEffect_Localised,
                          Modifier[] Modifiers                          ) {
}
