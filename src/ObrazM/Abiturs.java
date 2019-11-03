package ObrazM;

import java.io.*;
import java.util.ArrayList;

public class Abiturs implements java.io.Serializable {
    private ArrayList<Abitur> abiturs;

    public Abiturs()
    {
        abiturs = new ArrayList<>();
    }

    public void Add(Abitur abitur)
    {
        this.abiturs.add(abitur);
    }

    public void Save(String filename)
    {
        try
        {
            FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(abiturs);
            out.close();
            fileOut.close();
            System.out.print("Serialized data is saved in file: " + filename);
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }

    public void Load(String filename)
    {
        try
        {
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            this.abiturs = (ArrayList<Abitur>) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException ex)
        {
            ex.printStackTrace();
            return;
        } catch (ClassNotFoundException c)
        {
            System.out.println("Pirate class not found");
            c.printStackTrace();
            return;
        }
    }
    public void Clear() {this.abiturs.clear();}

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Abitur a : this.abiturs)
            result.append(a.toString());
        return result.toString();
    }
}
