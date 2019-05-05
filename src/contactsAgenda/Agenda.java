package contactsAgenda;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Timer;
import java.util.TimerTask;

public class Agenda implements Serializable {

    public static List<Contact> Contacts = new ArrayList<>();
    //where contacts are saved please have this file already created! windows only for now
    public static final String PATH = "C:\\savedAgenda";

    Timer saveTimer = new Timer();
    TimerTask task = new TimerTask() {
        public void run() {
            try {
                Agenda.save(PATH);
            } catch (IOException ex) {
                Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    };

    Agenda() throws Exception {
        //when program starts after 1s save to file will be called every 1s
        saveTimer.scheduleAtFixedRate(task, 1000, 1000);
        //Contacts.add(new Contact("aaA", "gigI", "11/12/1985", "0333355455"));
        //Contacts.add(new Contact("Aasdas", "gigI", "11/12/1985", "0333355455"));
        //Contacts.add(new Contact("Basdas", "gigI", "11/12/1985", "0333355455"));
    }

    //serialization to file from PATH
    public static void save(String path) throws FileNotFoundException, IOException {
        FileOutputStream fout = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        oos.writeObject(Contacts);
        fout.close();
        oos.close();
        System.out.println("Objects has been serialized to file " + PATH);
    }

    //deserialization from file PATH
    public static void open(String path) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fin = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fin);
        Contacts = (List) ois.readObject();
        ois.close();
        fin.close();
        System.out.println("Objects has been deserialized from file " + PATH);
    }
}
