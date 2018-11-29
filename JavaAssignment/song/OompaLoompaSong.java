package song;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class OompaLoompaSong
{
    private int numberOfLines;

    //Constructors:
    public OompaLoompaSong(int _numberOfLines)
    {
        this.numberOfLines = _numberOfLines;
    }

    //Getter
    public int getNumberOfLines()
    {
        return this.numberOfLines;
    }

    // Return a String with the song
    public String sing()
    {
        List<String> songLines = new ArrayList<>();
        String filename = "OompaLoompaSong.txt";
        Scanner scanFile;

        try
        {
            scanFile = new Scanner(new BufferedReader(new FileReader(filename)));

            while (scanFile.hasNextLine())
            {
                songLines.add(scanFile.nextLine());
            }
        }
        catch (FileNotFoundException err)
        {
            System.out.println("Oompaloompa is too sick to sing.\n" + err);
        }

        String song = "";
        Random randomIndex = new Random();
        int randomLine;

        for (int i = 0; i < numberOfLines; ++i)
        {
            randomLine = randomIndex.nextInt(22);
            song = song.concat(songLines.get(randomLine));
            song = song.concat("\n");
        }
        return song;
    }
}