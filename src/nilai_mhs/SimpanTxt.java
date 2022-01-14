
package nilai_mhs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class SimpanTxt {
    private static final String NAMA_FILE = "D:\\AA KULIAH\\PBO\\FAHMI_GUI\\Nilai.txt";
    
    //Simpan NilaiMhs
    public static void Simpan(String n, String r,String g, String h) {
            
            BufferedWriter bufferedWriter = null;
            FileWriter fileWriter = null;
            //MenambahkanKontenFile.membacaFile();
            
        try {    
            String kontenFile = n + '\n'+ r + '\n'+ g + '\n'+ h + '\n';
            
            File file = new File(NAMA_FILE);
            
            //Jika file tidak ada, maka file akan dibuat
            if(!file.exists()){
                file.createNewFile();
            }else{
                 System.out.println("File telah ada sebelumnya dan " + "kontennya akan ditambah");
                 
            }
               
            //Contructor FileWriter yang akan menambahkan konnten file
            fileWriter = new FileWriter(file.getAbsoluteFile(), true);
            bufferedWriter = new BufferedWriter(fileWriter);
            
            bufferedWriter.newLine();
            bufferedWriter.write(kontenFile);
            System.out.println("Konten telah selesai ditambahkan");
            JOptionPane.showMessageDialog(null, "Success : Data Berhasil Disimpan! ",
                    "Success:  Berhasil ", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            ex.printStackTrace();
            
        }finally{
            try{
                if(bufferedWriter != null){
                    bufferedWriter.close();
                }
                if(fileWriter != null){
                    fileWriter.close();
                }
                
                //MenambahkanKontenFile.membacaFile();
                
            }catch (IOException ex){
                ex.printStackTrace();
            }  
        }
    }
    
//    Simpan MHS
    public static void Simpan(String n, String npm, String j, String a, String p) {
            
            BufferedWriter bufferedWriter = null;
            FileWriter fileWriter = null;
            //MenambahkanKontenFile.membacaFile();
            
        try {    
            String kontenFile = n + ' '+ npm + ' '+ j + ' '+ a + ' '+ p;
            
            File file = new File("D:\\AA KULIAH\\PBO\\FAHMI_GUI\\Mhs.txt");
            
            //Jika file tidak ada, maka file akan dibuat
            if(!file.exists()){
                file.createNewFile();
            }else{
                 System.out.println("File telah ada sebelumnya dan " + "kontennya akan ditambah");
                 
            }
               
            //Contructor FileWriter yang akan menambahkan konnten file
            fileWriter = new FileWriter(file.getAbsoluteFile(), true);
            bufferedWriter = new BufferedWriter(fileWriter);
            
            bufferedWriter.newLine();
            bufferedWriter.write(kontenFile);
            System.out.println("Konten telah selesai ditambahkan");
            JOptionPane.showMessageDialog(null, "Success : Data Berhasil Disimpan! ",
                    "Success:  Berhasil ", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            ex.printStackTrace();
            
        }finally{
            try{
                if(bufferedWriter != null){
                    bufferedWriter.close();
                }
                if(fileWriter != null){
                    fileWriter.close();
                }
                
                //MenambahkanKontenFile.membacaFile();
                
            }catch (IOException ex){
                ex.printStackTrace();
            }  
        }
    }
    
    
    //Method untuk membaca file
    static void membacaFile(){
        System.out.println("Sekarang konten myfile.txt adalah: ");
        try {
             
            BufferedReader bufferedReader = 
                    new BufferedReader(new FileReader(NAMA_FILE));
             
            String baris;
            //Ketika baris tidak null maka baris tersebut akan dicetak
            
            while((baris = bufferedReader.readLine()) != null){
                System.out.println(baris);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
