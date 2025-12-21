package javafundamentals;

public class HLoop {
    public static void main(String[] args) {
    //Have arr have Loop , Have loop have arr
    int[] id = {110, 200, 300, 400,500};
    String[] name = {"Alice", "kiki", "lulu", "Mimi", "Lala"};

    for(int i = 0; i < 5; i++)
    {
        System.out.println("ID :" +  id[i] + ",NAME :" + name[i]);
    }
  }
} 
