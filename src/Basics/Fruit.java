package Basics;

public class Fruit implements Comparable<Fruit>{

        private String fruitName;
        private String fruitDesc;
        private int quantity;

        public Fruit(String fruitName, String fruitDesc, int quantity) {
            this.fruitName = fruitName;
            this.fruitDesc = fruitDesc;
            this.quantity = quantity;
        }

        public String getFruitName() {
            return fruitName;
        }
        public void setFruitName(String fruitName) {
            this.fruitName = fruitName;
        }
        public String getFruitDesc() {
            return fruitDesc;
        }
        public void setFruitDesc(String fruitDesc) {
            this.fruitDesc = fruitDesc;
        }
        public int getQuantity() {
            return quantity;
        }
        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public String toString() {
            return this.fruitName + " " + this.fruitDesc +
                    " " + this.quantity;
        }


   /* this is to compare quantities
   @Override
    public int compareTo(Fruit o) {
        return quantity-o.getQuantity();
    }
   */

    // below function is to compare alphabetically
    @Override
    public int compareTo(Fruit o) {
        return fruitName.compareTo(o.fruitName);
    }
}


