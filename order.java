package com.mycompany.oop;

import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author Raiza Rahman
 */
public class order {
    int freelancerCategory, freelancerNumber, packageNumber, fee;
    
    // Masukkin data ke dalam file .txt
    public order(int freelancerCategory, int freelancerNumber, int packageNumber) throws IOException{
        this.freelancerCategory = freelancerCategory;
        this.freelancerNumber = freelancerNumber;
        this.packageNumber = packageNumber;
        
        try(FileWriter orderList = new FileWriter("orderList.txt", true)){
            if(freelancerCategory == 1){
                orderList.append("Error!\n");
            }else if(freelancerCategory == 2){
                orderList.append("Error!\n");
            }else if(freelancerCategory == 3){
                orderList.append("Error!\n");
            }else if(freelancerCategory == 4){
                if(freelancerNumber == 1){
                    if(packageNumber == 1){
                        orderList.append("SugaPackageOne: Rp15.000.000\n");
                    }else if(packageNumber == 2){
                        orderList.append("SugaPackageTwo: Rp10.000.000\n");
                    }
                }else if(freelancerNumber == 2){
                    if(packageNumber == 1){
                        orderList.append("ApoyPackageOne: Rp7.500.000\n");
                    }else if(packageNumber == 2){
                        orderList.append("ApoyPackageTwo: Rp3.000.000\n");
                    }
                }else if(freelancerNumber == 3){
                    if(packageNumber == 1){
                        orderList.append("JaePackageOne\n");
                    }else if(packageNumber == 2){
                        orderList.append("JaePackageTwo\n");
                    }
                }else if(freelancerNumber == 4){
                    if(packageNumber == 1){
                        orderList.append("RaindepPackageOne\n");
                    }else if(packageNumber == 2){
                        orderList.append("RaindepPackageTwo\n");
                    }
                }
            }
            // Ribet yah
        }catch(IOException e1){
        
        }
    }
}
