package hillel.lesson10.homework3;

class Computer {
    private int id;
    private int price;
    private String processor;
    private String graphicCard;

    public Computer(int id, int price, String processor, String graphicCard) {
        this.id = id;
        this.price = price;
        this.processor = processor;
        this.graphicCard = graphicCard;
    }

    public Computer() {
        id = 0;
        price = 0;
        processor = "unknown";
        graphicCard = "unknown";
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getProcessor() {
        return processor;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    void show() {
        System.out.println("id:" + id + ";\nPrice: " + price + ";\nProcessor: " + processor + ";\nGraphic Card: " + graphicCard);
    }
}
