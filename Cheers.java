
public class Cheers {
        public static void main(String[] args) {
                String s = args[0];
                String chant = "";
                String anChar = "AEFHILMNORSX";
                int checkLen = 0;
                while (checkLen < s.length()){
                        int checkAn = 0;
                        int x = 0;
                        for (int i = 0; i < 11; i++) { //checks if we vhave special letter
                                if(s.charAt(checkLen) == anChar.charAt(x)){
                                        chant = chant + s.charAt(checkLen);
                                        System.out.println("Give me an " + s.charAt(checkLen) + ": " + s.charAt(checkLen));
                                        checkAn++;                           
                                }
                                x++;
                        }
                        if(checkAn == 0){ //if we dont have special 
                                chant = chant + s.charAt(checkLen);
                                System.out.println("Give me a " + s.charAt(checkLen) + ": " + s.charAt(checkLen));
                        }
                        checkAn = 0;
                        checkLen++;
                }
                System.out.println("And what we got?");
                for (int i = 0; i < 5; i++) {
                        System.out.println( chant + "!!!");        
                }
                }
                }


