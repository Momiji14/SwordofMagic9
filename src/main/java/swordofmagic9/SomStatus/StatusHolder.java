package swordofmagic9.SomStatus;

import javax.swing.text.html.parser.Entity;
import java.util.HashMap;

public class StatusHolder {

    private final HashMap<StatusList, Double> status = new HashMap<>();

    public StatusHolder() {
        for (StatusList value : StatusList.values()) {
            status.put(value, 0d);
        }
    }

    public void setStatus(StatusList type, double value) {
        status.put(type, value);
    }

    public void addStatus(StatusList type, double value) {
        status.merge(type, value, Double::sum);
    }

    public double getStatus(StatusList type) {
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
