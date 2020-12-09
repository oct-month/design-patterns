package SevenPrinciples.OpenClosed;

// 新增画Triangle时修改了GraphicEditor的源码
public class Demo1
{
    public static void main(String[] args)
    {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }
}
