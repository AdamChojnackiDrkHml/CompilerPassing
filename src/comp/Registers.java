package comp;

public enum Registers
{
    a,
    b,
    c,
    d,
    e,
    f,
    g,
    h;

    public Registers fromString(String s)
    {
        return switch (s) {
            case "A" -> a;
            case "B" -> b;
            case "C" -> c;
            case "D" -> d;
            case "E" -> e;
            case "F" -> f;
            case "G" -> g;
            case "H" -> h;
            default -> a;
        };
    }
}
