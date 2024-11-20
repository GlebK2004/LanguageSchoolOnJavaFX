package studentmanagementsystem.Models.Entities;

import studentmanagementsystem.Enums.Roles;

import java.util.HashSet;
import java.util.Set;
public class User {

    public static String username;
    public static String path;

    public String getLogin(){return username;}

    public String getPassword(){ return path;}


}