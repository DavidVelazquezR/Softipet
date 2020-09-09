/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.Connection;

/**
 *
 * @author mosh_
 */
public class ConectarBase
{
    public static Connection conectaBD()
    {
        Conexion conec = new Conexion();
        try
        {
            return conec.Conecta("localhost:3306","softipet","root","",2);
        } catch (Exception e)
        {
            return  null;
        }
    }
    
    public static void desconectaBD(Connection con)
    {
        Conexion conec = new Conexion();
        conec.desconectar(con);
    }
}
