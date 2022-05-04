import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;

class ServiceClass
{
    static HashSet<String> mtnSet;
    static HashSet<String> airtelSet;
    static HashSet<String> globacomSet;
    static HashSet<String> nineMobileSet;
    static HashSet<String> mtelSet;

    public static void main(String[] args) throws FileNotFoundException, IOException {

        mtnSet = new HashSet<String>();
        airtelSet= new HashSet<String>();
        globacomSet = new HashSet<String>();
        nineMobileSet = new HashSet<String>();
        mtelSet = new HashSet<String>();
        
        //Initialize 
        loadHashSet();
        
            try(BufferedReader br = Files.newBufferedReader(Paths.get("PhoneNumbers.txt"), StandardCharsets.UTF_8)){
            String sc;
            while((sc = br.readLine()) != null){
                if(mtnSet.contains(sc.substring(0, 4)) || mtnSet.contains(sc.substring(0, 5))){
                    System.out.println("MTN:- "+sc);
                }else if(airtelSet.contains(sc.substring(0, 4))){
                    System.out.println("Airtel:- "+sc);
                }else if(globacomSet.contains(sc.substring(0, 4))){
                    System.out.println("Globacom:- "+sc);
                }else if(nineMobileSet.contains(sc.substring(0, 4))){
                    System.out.println("9mobile:- "+sc);
                }else if(mtelSet.contains(sc.substring(0, 4))){
                    System.out.println("Mtel:- "+sc);
                }else{
                    System.out.println("No Service provider:- "+sc);
                }
            
            }
        }
    


	}

    public static void loadHashSet(){

        //add the mtn prefixes
        mtnSet.add("0703");
        mtnSet.add("0706");
        mtnSet.add("0803");
        mtnSet.add("0806");
        mtnSet.add("0810");
        mtnSet.add("0813");
        mtnSet.add("0814");
        mtnSet.add("0816");
        mtnSet.add("0903");
        mtnSet.add("0906");
        mtnSet.add("0913");
        mtnSet.add("0916");
        mtnSet.add("0704");
        mtnSet.add("07025");
        mtnSet.add("07026");

        //add airtel prefixes
        airtelSet.add("0701");
        airtelSet.add("0708");
        airtelSet.add("0802");
        airtelSet.add("0808");
        airtelSet.add("0812");
        airtelSet.add("0902");
        airtelSet.add("0904");
        airtelSet.add("0907");
        airtelSet.add("0912");

        //add glo prefixes
        globacomSet.add("0705");
        globacomSet.add("0805");
        globacomSet.add("0807");
        globacomSet.add("0811");
        globacomSet.add("0815");
        globacomSet.add("0905");
        globacomSet.add("0915");

        //add 9mobile prefixes
        nineMobileSet.add("0809");
        nineMobileSet.add("0817");
        nineMobileSet.add("0818");
        nineMobileSet.add("0909");
        nineMobileSet.add("0908");

        //add mtel prefix
        mtelSet.add("0804");
    }
}