package LLD.Creational.Builder;

// Product class
class House {
    private String walls;
    private String roof;
    private String foundation;

    // Setters for parts of the house
    public void setWalls(String walls) {
        this.walls = walls;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    @Override
    public String toString() {
        return "House [walls=" + walls + ", roof=" + roof + ", foundation=" + foundation + "]";
    }
}