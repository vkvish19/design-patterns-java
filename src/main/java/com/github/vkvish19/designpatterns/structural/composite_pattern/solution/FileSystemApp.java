package com.github.vkvish19.designpatterns.structural.composite_pattern.solution;

public class FileSystemApp
{
    public static void main(String[] args)
    {
        FileSystemComponent file1 = new File("file1.txt");
        FileSystemComponent file2 = new File("file2.txt");
        Folder folder = new Folder("Documents");

        folder.addComponent(file1);
        folder.addComponent(file2);

        //subfolder
        FileSystemComponent file3 = new File("file3.txt");
        Folder subfolder = new Folder("Subfolder");
        subfolder.addComponent(file3);
        folder.addComponent(subfolder);

        // showDetails at root level
        folder.showDetails();
    }
}
