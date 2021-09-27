package Lab.exp8;

interface GeoAnalyzer {
    final static float pi = 3.142F;
    float area();
    float perimeter();
}

class Circle implements GeoAnalyzer {
    float radius;

    Circle(float r) {
        radius = r;
    }

    public float area() {
        return (pi * radius * radius);
    }

    public float perimeter() {
        return (2 * pi * radius);
    }
}

class Ellipse implements GeoAnalyzer {
    float major;
    float minor;

    Ellipse(float m, float n) {
        major = m;
        minor = n;
    }

    public float area() {
        return (pi * major * minor);
    }

    public float perimeter() {
        return (pi * (major + minor));
    }
}

class Rectangle implements GeoAnalyzer {
    float length;
    float width;

    Rectangle(float l, float w) {
        length = l;
        width = w;
    }

    public float area() {
        return (length * width);
    }

    public float perimeter() {
        return (2 * (length + width));
    }
}

class Geometry {
    static void display(float x, float y) {
        System.out.println("Area = " + x + "Perimeter = " + y);
    }

    public static void main(String args[]) {
        Circle c = new Circle(5.2f);
        Ellipse e = new Ellipse(4.5f, 3.6f);
        Rectangle r = new Rectangle(6.5f, 4.3f);
        GeoAnalyzer geoItem;
        geoItem = c;
        display(geoItem.area(), geoItem.perimeter());
        geoItem = e;
        display(geoItem.area(), geoItem.perimeter());
        geoItem = r;
        display(geoItem.area(), geoItem.perimeter());
    }
}