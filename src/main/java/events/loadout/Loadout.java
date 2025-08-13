package events.loadout;

public record Loadout(String ship, int ShipID, String ShipName,
                      String ShipIdent, long ModulesValue, float HullHealth,
                      float UnladenMass, int CargoCapacity,
                      float MaxJumpRange, long Rebuy, Module[] Modules) {
}
