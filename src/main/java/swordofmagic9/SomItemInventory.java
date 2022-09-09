package swordofmagic9;

import java.util.List;

public interface SomItemInventory {

    List<SomItemStack> getList();
    void add(SomItemStack itemStack);
    void add(SomItem item, int amount);
    void add(String id, int amount);
    void remove(SomItemStack itemStack);
    void remove(SomItem item, int amount);
    void remove(String id, int amount);
}
