

import java.util.Scanner;


public class b2 {
    public static boolean isAlpha(String name) {
        char[] chars = name.toCharArray();
        for (char c : chars) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a valid plate number: ");
        String plate = scn.next();
        plate = plate.toUpperCase();

        if (plate.length() == 8) {
            if (plate.contains("-")) {
                String[] sp = plate.split("-");

                    if (isAlpha(sp[0]) && sp[0].length() == 3) {
                        try {
                            Integer.parseInt(sp[1]);
                            System.out.println(plate + " is a a valid plate number.");
                        } catch (Exception e) {
                            System.out.println(plate + " is a an invalid plate number.");
                        }
                    } else {
                        System.out.println(plate + " is a an invalid plate number.");
                    }
                } else {
                    System.out.println(plate + " is a an invalid plate number.");
                }
            } else System.out.println(plate + " is a an invalid plate number.");
        }
    }
    
//kali douleia.bravo!!
