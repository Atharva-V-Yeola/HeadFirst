import java.util.*;

class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();//object for drumkit class
        d.playSnare();//calls method on drumkit object d
        d.snare = false;//Sets the snare attribute of the DrumKit object d to false
        d.playTopHat();//Calls the playTopHat() method on the DrumKit object d
//         Checks if the snare attribute of the DrumKit object d is true. If it is, it calls the playSnare() method again.
// Since d.snare was set to false earlier, this block of code will not execute.
        if(d.snare==true){
            d.playSnare();
        }
    }
}
class DrumKit{
    //Two instace of drumkit class
    boolean topHat = true;
    boolean snare = true;
    //two method of drumkit class
    void playTopHat(){
        System.out.println("ding ding da-ding");
    }
    void playSnare(){
        System.out.println("bang bang ba-bang");
    }
}
