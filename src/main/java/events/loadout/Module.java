package events.loadout;

public record Module(String Slot, String Item, boolean On, int Priority,
                     float Health, long Value, int AmmoInClip,
                     int AmmoInHopper, Engineering Engineering) {
}
