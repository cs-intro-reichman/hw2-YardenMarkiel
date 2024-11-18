

public class TimeCalc {
    public static void main(String[] args) {
        String s = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);
        int hours=  (s.charAt(0) - '0') * 10 + s.charAt(1) - '0'; 
        int minutes = (s.charAt(3) - '0') * 10 + s.charAt(4) - '0';
        int newMinutes = minutesToAdd + minutes + hours * 60;
        hours = (newMinutes / 60) % 24;
        minutes = newMinutes % 60;
        if(hours < 10){ //loops checking different situation
            if ((minutes < 10) || (minutes == 0)){
                System.out.println("0" + hours + ":0" + minutes);
            }
            else{
                System.out.println("0" + hours + ":" + minutes);
            }   
        } else if((minutes < 10) || (minutes == 0)) {
            System.out.println( hours + ":0" + minutes);
        }
            else{
                System.out.println( hours + ":" + minutes);
            } 
        }
    } 

