package comp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Core {
    public static void main(String[] args) throws IOException {
        if(args.length == 2)
        {
            Compilationation comp = new Compilationation();
            Path p = Path.of(args[0]);
            String output = args[1];
            String read = Files.readString(p);
            comp.calculate(read, output);
        }
    }



}
