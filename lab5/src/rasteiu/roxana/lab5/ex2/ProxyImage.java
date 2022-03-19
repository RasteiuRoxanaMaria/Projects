package rasteiu.roxana.lab5.ex2;

public class ProxyImage implements Image {
    private RealImage realImage;
    private RotatedImage rotatedImage;
    private String fileName;
    private int x;

    public ProxyImage(String fileName, int x){
        this.fileName=fileName;
        if(x==0) this.x=0;
        if(x==1) this.x=1;
    }

    @Override
    public void display(){
        if(this.x==0) {
            if (realImage == null) {
                realImage = new RealImage(fileName);
            }
            realImage.display();
        }
        else
        {
            if (rotatedImage == null) {
                rotatedImage = new RotatedImage(fileName);
            }
            rotatedImage.display();
        }
    }
}
