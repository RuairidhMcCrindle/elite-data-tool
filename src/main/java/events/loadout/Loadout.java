package events.loadout;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Loadout(String Ship, int ShipID, String ShipName,
                      String ShipIdent, long ModulesValue, float HullHealth,
                      float UnladenMass, int CargoCapacity,
                      float MaxJumpRange, long Rebuy, Module[] Modules) {
}
