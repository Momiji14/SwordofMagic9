package swordofmagic9;

public interface SomStatus {

    double getStatus(StatusType type);
    void setStatus(StatusType type, double value);

    int getExp();
    void setExp(int exp);

    int getLevel();
    void setLevel(int level);
}
