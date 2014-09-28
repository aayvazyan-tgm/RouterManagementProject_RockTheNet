package rtn.networking;

public class Policy {


    private String displayname;

	private int type;

	private String source;

	private String destination;

    private boolean enabled;

    private Service service;

    private Zone zone;

    Policy(String displayname,int type,String source,String destination,boolean enabled,Service service){
        this.displayname = displayname;
        this.type = type;
        this.source = source;
        this.destination = destination;
        this.enabled = enabled;
        this.service = service;
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }
}
