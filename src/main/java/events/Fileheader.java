package events;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Fileheader(int part, String language, boolean Odyssey,
                         String gameversion, String build) {
}
