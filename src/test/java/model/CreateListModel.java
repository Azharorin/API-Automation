package model;

public class CreateListModel {
    private int boardId;
    private String name;
    private int order;

    // Default constructor
    public CreateListModel() {
    }

    // Parameterized constructor
    public CreateListModel(int boardId, String name, int order) {
        this.boardId = boardId;
        this.name = name;
        this.order = order;
    }

    // Getters and setters
    public int getBoardId() {
        return boardId;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}
