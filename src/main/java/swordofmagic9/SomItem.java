package swordofmagic9;

import org.bukkit.Material;

public interface SomItem {

    String getId();
    void setId(String id);

    String getDisplay();
    void setDisplay(String display);

    Material getIcon();
    void setIcon(Material icon);
}
