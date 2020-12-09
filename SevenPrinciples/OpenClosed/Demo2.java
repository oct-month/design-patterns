package SevenPrinciples.OpenClosed;

public class Demo2
{
    public static void main(String[] args)
    {
        GraphicEditor2 graphicEditor = new GraphicEditor2();
        graphicEditor.drawShape(new Rectangle2());
        graphicEditor.drawShape(new Circle2());
        graphicEditor.drawShape(new Triangle2());
        graphicEditor.drawShape(new OtherGraphic());
    }
}
