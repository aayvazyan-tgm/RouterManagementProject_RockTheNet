package rtn.networking;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Action {
    private static final Logger logger = LoggerFactory.getLogger(Action.class);

	private String name;

    public Action(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
