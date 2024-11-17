
public class Cheers {
        public static void main(String[] args) {
                String s = args[0];
                int times = Integer.parseInt(args[1]);
                String chant = "";
                String anChar = "AEFHILMNORSXaefhilmnorsx";
                String fixedS = "";
                int checkLen = 0;
                char c =' ';
                int x = 0;
                while ( (x < s.length())) {// need to convert low letters to high
                        if ((s.charAt(x) >= 'a') && (s.charAt(x) <= 'z')){
                                c = s.charAt(x);
                                c = (char)(c - 32); 
                                fixedS = fixedS + c;
                        } else{
                                fixedS = fixedS + s.charAt(x);
                        }
                        x++;
                }
                while (checkLen < fixedS.length()){
                        int checkAn = 0;
                        x = 0;
                        for (int i = 0; i < 11; i++) { //checks if we vhave special letter
                                if(fixedS.charAt(checkLen) == anChar.charAt(x)){
                                        chant = chant + fixedS.charAt(checkLen);
                                        System.out.println("Give me an " + fixedS.charAt(checkLen) + ": " + fixedS.charAt(checkLen));
                                        checkAn++;                           
                                }
                                x++;
                        }
                        if(checkAn == 0){ //if we dont have special 
                                chant = chant + fixedS.charAt(checkLen);
                                System.out.println("Give me a " + fixedS.charAt(checkLen) + ": " + fixedS.charAt(checkLen));
                        }
                        checkAn = 0;
                        checkLen++;
                }
                System.out.println("And what we got?");
                for (int i = 0; i < times; i++) {
                        System.out.println( chant + "!!!");        
                }
                }
                }


