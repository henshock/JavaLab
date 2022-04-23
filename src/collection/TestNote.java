package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import encap.Car;

public class TestNote {
    public static void main(String[] args) {
        NoteString note1 = new NoteString("java gc");
        System.out.println(note1.getContent());

        NoteInt note2 = new NoteInt(1);
        System.out.println(note2.getContent());
        
        Note<Double> note3 = new Note<>(3.0);
        System.out.println(note3.getContent());
        
        //Note<Car> note4 = new Note<>(new Car("B"));
        
        
        List<String> list = Arrays.asList("Hello","World");//shit+alt+l
        List<String> l = new ArrayList<>();
        l.add("Hello");
        l.add("World");
    }

 
}
