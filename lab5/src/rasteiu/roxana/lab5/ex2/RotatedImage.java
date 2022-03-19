package rasteiu.roxana.lab5.ex2;

public class RotatedImage implements Image {
    private String fileName;
    public RotatedImage(String fileName){
        this.fileName=fileName;
        Rotat(fileName);
    }
    @Override
    public void display(){
        System.out.println("Displaying "+ fileName);
    }
    private void Rotat(String fileName){
        System.out.println("Display rotated"+ fileName);
    }
}
