/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.examplejdbc.test;

import co.edu.sena.examplejdbc.bd.DBKey;
import co.edu.sena.examplejdbc.model.Key;
import java.util.List;

/**
 * Date: 20/03/2025
 * @author Ruben Franco
 * Objective: probar consulta/transacciones en tabla key
 */
public class TestKey {
    public static void main(String[] args) {
        DBKey dBKey = new DBKey();
        
        //insertar
//        Key key = new Key(5, "ADSO", "Bicentenario", 4, "Pedirlas en la cafetería");
//        dBKey.insert(key);

        //actualizar
//        key.setId(5);
//        key.setName("Restaurante y Bar");
//        key.setRoom("Palmetto");
//        key.setCount(2);
//        key.setObservation("Debajo del tapete");
//        dBKey.update(key);
        
        //eliminar
//        dBKey.delete(5);

        //consultar todos
//        System.out.println("*****************************");
//        List<Key> findAll = dBKey.findAll();
//        for (Key k : findAll){
//            System.out.println("id:"+ k.getId()+" name:"+ k.getName()+ " room:" + k.getRoom()+ " count:"+ k.getCount() + " observation:" + k.getObservation());
//        }

        //consultar por id
//        System.out.println("****************************");
//        Key key2 = dBKey.findById(4);
//        if(key2 != null)
//        {
//            System.out.println("id:" + key2.getId() + " name:"+key2.getName()+" room:"+key2.getRoom()+" count:"+key2.getCount()+" observation:"+key2.getObservation());
//        }
//        else
//        {
//            System.out.println("No existe la Key con ese id");
//        }
    }
}