/*
 * Copyright (C) 2013 Ratan
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package Experimental;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 *
 * Author:  Ratan
 * Email:   ratanparai@gmail.com
 * Twitter: http://twitter.com/ratanparai
 */
public class MyPing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        // Create a object of the class MyPing. This is not mendatory. you 
        // can call the function within the parent class without creating 
        // a object of the class. But I'm creating for later purpose(if 
        // I have any :p)
        MyPing ping = new MyPing();
        
        // define a new arrayList named commands
        List<String> commands = new ArrayList<>();
        
        // add command ping
        commands.add("ping");
        // add the address you want to ping
        commands.add("192.168.210.1");
        
        // create a object
        ping.doCommand(commands);
        
        // the programm will autometically exit after executing the code
        // so no need to add anything here :D
        
    }
    
    /**
     * Do the main stuffs here. the function receive a List<String> 
     * and print out the result of the ping
     * 
     * @param command
     * @throws IOException 
     */
    
    public void doCommand(List<String> command) throws IOException{
        // initialize A string for temporary  storing output thrown by
        // the process
        String s = null;
        
        // Create a new instance of ProcessBuilder named pb and start the
        // process
        ProcessBuilder pb = new ProcessBuilder(command);
        Process process = pb.start();
        
        // initialize input Buffer from the process
        // the process return two type of output as inputStream.
        // We are catching both for showing them on our output.
        BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));
        BufferedReader stdError = new BufferedReader(new InputStreamReader(process.getErrorStream()));
        
        /// read the output from the command and print
        /////////////////////////////////////////////
        
        // if there is any input stream (without error) then print the 
        // input
        while ((s = stdInput.readLine()) != null){
            
            // pring the string
            System.out.println(s);
            
            
            
            /**
             * TODO: do something special without showing plain
             * output 
             */
            /*int indexOf = s.indexOf("TTL=");
            //System.out.println(indexOf);
            
            // if ping failed
            //if (indexOf == -1){
                //System.out.println("Server not found");
                System.out.println(s);
                
            //} else {
                //System.out.println(s.substring(11, 24));
                System.out.println(s);
            } */
        }
        
        /// read any error from the attemped command
        /// if the error stream return any error catch and print the 
        /// error message
        while ((s = stdError.readLine()) != null){
            // print the error message
            System.out.println(s);
        }
    }

}
