/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.examplejdbc.controllers;

import co.edu.sena.examplejdbc.bd.DBKey;
import co.edu.sena.examplejdbc.model.Key;
import java.util.List;

/**
 * Date: 25/03/2025
 * @author Ruben Franco
 * Objective: implementar la interface para controlar el modelo Key
 */
public class KeyController implements IKeyController {
    
    private DBKey dbe = new DBKey();

    @Override
    public void insert(Key key) throws Exception {
        if (key == null)
        {
            throw new Exception ("El tipo de llave es nula");
        }
        
        if(key.getId()==0)
        {
            throw new Exception("El Id de la llave es obligatorio");
        }
        
        if("".equals(key.getName()))
        {
             throw new Exception("El nombre de la llave es obligatorio");
        }
        
        if("".equals(key.getRoom()))
        {
             throw new Exception("La habitación es obligatoria");
        }
        
        if(key.getCount()<1)
        {
             throw new Exception("El número de llaves es obligatorio");
        }
        
        //insertar
        dbe.insert(key);
    }

    @Override
    public void update(Key key) throws Exception {
        if (key == null)
        {
            throw new Exception("El tipo de llave es nula");
        }
        
        if(key.getId()==0)
        {
            throw new Exception("El Id de la llave es obligatorio");
        }
        
        if ("".equals(key.getName()))
        {
            throw new Exception("El nombre de la llave es obligatorio");
        }
        
        if ("".equals(key.getRoom()))
        {
            throw new Exception("El nombre de la habitación es obligatorio");
        }
        
        if(key.getCount()<1)
        {
             throw new Exception("El número de llaves es obligatorio");
        }
        
        //consultar si el key existe en la bd
        Key keyExists = dbe.findById(key.getId());
        if (keyExists == null)
        {
            throw new Exception("El tipo de llave es nula");
        }
        
        //actualizar
        dbe.update(key);
    }

    @Override
    public void delete(int id) throws Exception {
        if(id==0)
        {
            throw new Exception("El Id de la llave es obligatorio");
        }
        
        //consultar si el key existe en la bd
        Key keyExists = dbe.findById(id);
        if (keyExists == null)
        {
            throw new Exception("El tipo de llave no existe");
        }
        
        //eliminar
        dbe.delete(id);
    }

    @Override
    public List<Key> findAll() throws Exception {
        return dbe.findAll();
    }

    @Override
    public Key findById(int id) throws Exception {
        if(id==0)
        {
            throw new Exception("El Id es obligatorio");
        }
        return dbe.findById(id);
    }
}
