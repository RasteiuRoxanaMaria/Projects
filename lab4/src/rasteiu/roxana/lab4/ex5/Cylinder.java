package rasteiu.roxana.lab4.ex5;

import rasteiu.roxana.lab4.ex1.Circle;

public class Cylinder extends Circle {
        private double height=1.0;
        public Cylinder(){
            this.height=1.0;
        }
        public Cylinder(double radius){

            super(radius);
        }
        public Cylinder(double radius,double height){
            super(radius);
            this.height=height;
        }
        public double getHeight(){

            return  height;
        }
        @Override
        public double getArea(){
           double r=this.getRadius();
           double h=this.getHeight();
           return 3.14*r*r+2*3.14*r*h;
        }
        public double getVolume(){
           double r=this.getRadius();
           double h=this.getHeight();
           return 3.14*r*r*h;
        }
}
