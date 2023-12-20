package by.academy.lesson11;

public enum CoffeeSize implements Coffee{
    BIG(350, "Brasil") {
        @Override
        public void buy() {
            System.out.println("Покупка бразильского");
        }
    },
    HUGE(500), OVERWELMING(1000);

    final int ml;
    String producer;

    CoffeeSize(int ml) {
        this.ml = ml;
    }

    CoffeeSize(int ml, String producer) {
        this.ml = ml;
        this.producer = producer;
    }


    @Override
    public void buy() {
        System.out.println("Покупка");
    }








}




