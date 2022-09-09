package swordofmagic9;

import javax.swing.text.html.parser.Entity;
import java.util.HashMap;

public class StatusHolder {

    private final HashMap<StatusType, Double> status = new HashMap<>();

    public StatusHolder() {
        for (StatusType value : StatusType.values()) {
            status.put(value, 0d);
        }
    }

    public void setStatus(StatusType type, double value) {
        status.put(type, value);
    }

    public void addStatus(StatusType type, double value) {
        status.merge(type, value, Double::sum);
    }

    public double getStatus(StatusType type) {
        return status.get(type);
    }

    private Entity entity;

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    public Entity getEntity() {
        return entity;
    }
}
