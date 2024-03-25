package seat_reservation;
import java.io.*;
public class reservation{
    public void Birdland_write(int row, int colum) throws IOException{
        FileWriter fw = new FileWriter("C:\\Users\\TUF GAMING\\Documents\\NetBeansProjects\\Seat_reservation\\src\\txt\\Birdland_reservation.txt",true);
        BufferedWriter bw = new BufferedWriter (fw);
                    System.out.print("Birdland_write \n"); //if movie is birdland
                    bw.write(row + "," + colum); //write row and colum with "," in middle 
                    bw.write(System.getProperty("line.separator")); //write in new line 
            bw.close(); fw.close();
    }
    
    public void Joking_write(int row, int colum) throws IOException{
        FileWriter fw = new FileWriter("C:\\Users\\TUF GAMING\\Documents\\NetBeansProjects\\Seat_reservation\\src\\txt\\Joking_reservation.txt",true);
        BufferedWriter bw = new BufferedWriter (fw);
                    System.out.print("Joking_write \n");
                    bw.write(row + "," + colum);
                    bw.write(System.getProperty("line.separator"));
            bw.close(); fw.close();
    }
    
    public void Pangpond_write(int row, int colum) throws IOException{
        FileWriter fw = new FileWriter("C:\\Users\\TUF GAMING\\Documents\\NetBeansProjects\\Seat_reservation\\src\\txt\\Pangpond_reservation.txt",true);
        BufferedWriter bw = new BufferedWriter (fw);
                    System.out.print("Pangpond_write \n");
                    bw.write(row + "," + colum);
                    bw.write(System.getProperty("line.separator"));
            bw.close(); fw.close();
    }
    
    public void the_snake_write(int row, int colum) throws IOException{
        FileWriter fw = new FileWriter("C:\\Users\\TUF GAMING\\Documents\\NetBeansProjects\\Seat_reservation\\src\\txt\\The_snake_reservation.txt",true);
        BufferedWriter bw = new BufferedWriter (fw);
                    System.out.print("the_snake_write \n");
                    bw.write(row + "," + colum);
                    bw.write(System.getProperty("line.separator"));
            bw.close(); fw.close();
    }
    
    public void reserve(int row, int colum, int m){
        try {
            if(m == 0){
             Birdland_write(row, colum);
            }
            
            if(m == 1){
             Joking_write(row, colum);
            }
            
            if(m == 2){
             Pangpond_write(row, colum);
            }
            
            if(m == 3){
             the_snake_write(row, colum);
            }
            
            System.out.print("already write \n");
            } catch (Exception e) {
                System.out.print(e);
            }

    }
}
