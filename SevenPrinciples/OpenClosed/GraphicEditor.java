package SevenPrinciples.OpenClosed;

public class GraphicEditor
{
    public void drawShape(Shape s)
    {
        if (s.m_type == Shape.RECTANGLE)
            drawRectangle(s);
        else if (s.m_type == Shape.CIRCLE)
            drawCircle(s);
        else if (s.m_type == Shape.TRIANGLE)
            drawTriangle(s);
    }

    private void drawRectangle(Shape r)
    {
        System.out.println("绘制矩形");
    }

    private void drawCircle(Shape c)
    {
        System.out.println("绘制圆形");
    }

    private void drawTriangle(Shape t)
    {
        System.out.println("绘制三角形");
    }
}
