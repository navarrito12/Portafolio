public class Bola
{
    private Color color;        // NO NULO
    
    public Bola(Color color)  {
        setColor(color);
    }
    
    public Color getColor()  {
        return color;
    }
    
    public void setColor(Color color)  {
        assert color!=null: "El color de una bola no puede ser nulo";
        this.color=color;
    }
    
    public String toString()  {
        return "Bola [%s]".formatted(color);
    }
}