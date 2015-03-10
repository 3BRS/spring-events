package eu.keyup.dto;

/**
 * DTO for greeting.
 */
public class GreetingData {
    private String name;

    public GreetingData(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
