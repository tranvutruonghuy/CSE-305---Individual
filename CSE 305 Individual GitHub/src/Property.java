public class Property {
    private String propertyID;
    private String description;
    private String PropertyOwnerId;
    public Property(String propertyID, String description, String propertyOwnerId) {
        this.propertyID = propertyID;
        this.description = description;
        PropertyOwnerId = propertyOwnerId;
    }
    public String getPropertyID() {
        return propertyID;
    }
    public void setPropertyID(String propertyID) {
        this.propertyID = propertyID;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getPropertyOwnerId() {
        return PropertyOwnerId;
    }
    public void setPropertyOwnerId(String propertyOwnerId) {
        PropertyOwnerId = propertyOwnerId;
    }

    
}
