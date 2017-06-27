/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wenbo
 */
public class UserInfo {
    private String[][] userInfo = new String[100][2];
    
     public UserInfo()
    {
        for(int i = 0; i < 100; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                userInfo[i][j] = "Empty";
            }
        }
        
        userInfo[0][0] = "User1";
        userInfo[0][1] = "111111";
    }
     
    public boolean Search(String name, String pass)
    {
        int index = 0;
        for(int i = 0; i < 100; i++)
        {
            if(userInfo[i][0].equals(name))
            {
                index = i;
                break;
            }
        }  
        if(userInfo[index][1].equals(pass))
            return true;
        else
            return false;
    }
     
   
    
}
