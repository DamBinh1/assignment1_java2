package assigmennt1_java2;

public class Class {
    String name;
    String room;
    String key;

    public Class(String name, String room, String key) {
        this.name = name;
        this.room = room;
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return name+" - "+room+" - "+"key";
    }
}
