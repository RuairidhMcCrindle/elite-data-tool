package events;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record FSDTarget(String Name,
                        long SystemAddress,
                        String StarClass,
                        String RemainingJumpsInRoute) {
}
