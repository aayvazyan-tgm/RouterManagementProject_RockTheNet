package rtn.networking;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Service {
    private static final Logger logger = LoggerFactory.getLogger(Service.class);

	private String name;

    public Service(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
