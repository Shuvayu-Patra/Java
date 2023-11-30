class Volume {
     int volume(){
        return 0;
     }
}
class Cube extends Volume{
    int volume(int a){
        return (a*a*a);
    }
}

class Cylinder extends Volume{
    double volume(double h, double r){
        return (3.14*r*r*h);
    }
}
class Sphere extends Volume{
    double volume(double r){
        return (4*3.14*r*r*r)/3;
    }
}

public class overload {
    public static void main(String[] args) {
        Cube a = new Cube();
        Cylinder b = new Cylinder();
        Sphere c = new Sphere();
        System.out.println(a.volume(2));
        System.out.println(b.volume(2, 5));
        System.out.println(c.volume(7.26));
    }
}
