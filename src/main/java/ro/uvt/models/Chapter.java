package ro.uvt.models;

import java.util.ArrayList;

public class Chapter implements Element {
    private String name;
    private ArrayList<SubChapter> subChapters = new ArrayList<SubChapter>();

    public void print() {
        //System.out.println("\tChapter: " + name);
    }

    public Chapter(String name) {
        this.name = name;
    }

    public int createSubChapter(String name) {
        SubChapter createdSubChapter = new SubChapter(name);
        this.subChapters.add(createdSubChapter);
        return this.subChapters.indexOf(createdSubChapter);
    }

    public SubChapter getSubChapter(int index)
    {
        return this.subChapters.get(index);
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
