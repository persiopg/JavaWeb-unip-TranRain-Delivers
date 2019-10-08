
package Dao;

import java.util.List;


public class DaoLanches extends DaoUtil{
    
    public List<TbLanches> listar(){
        this.abreConexao();
        List<TbLanches> lanches;
        lanches = em.createQuery("SELECT l from TbLanches as l").getResultList();
        this.fechaConexao();
        
        return lanches;
    }
    
    public TbLanches buscarLanches(int id){
        this.abreConexao();
        TbLanches l = em.find(TbLanches.class, id);
        this.fechaConexao();
        return l;
    }
    
}