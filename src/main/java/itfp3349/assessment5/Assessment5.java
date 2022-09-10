/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package itfp3349.assessment5;

import java.util.*;

/**
 *
 * @author jmazzie
 */
public class Assessment5 {

    public static void main(String[] args) 
    {
        System.out.println("Enter 3 collections of course codes one collection per line:");
        Scanner userInput = new Scanner(System.in);
        for(int i = 0; i < 3; i++)
        {
            String code = userInput.nextLine();
            String[] courses = code.split(" ");
            LinkedList<String> sortList = new LinkedList<>(Arrays.asList(courses));
            Collections.sort(sortList);
            System.out.print("Size: " + sortList.size() + " Sorted: ");
            Iterator<String> nextCourse = sortList.iterator();
            while (nextCourse.hasNext()) 
            {
                System.out.print(nextCourse.next() + " ");
            }
            System.out.println("\n");
        }
    }
}

