package readAllClassName;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ClassReader {
    public static void main(String[] args) {
        String packageName = "abstract1";
        InputStream stream = ClassLoader.getSystemClassLoader().getResourceAsStream(packageName.replaceAll(".","/"));
        assert stream != null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
//        reader.lines()
//                .filter(line -> line.endsWith(".class"))
//                .map(line -> getClass)
    }
}
