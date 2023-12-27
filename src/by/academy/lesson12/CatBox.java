package by.academy.lesson12;

public class CatBox {

    private Cat cat;


     public CatBox(Cat cat){
         this.cat = cat;
     }

     public void setCat(Cat cat){
         this.cat = cat;
    }

    public Cat getCat(){
        return cat;
    }
}
