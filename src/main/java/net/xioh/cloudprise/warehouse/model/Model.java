/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.xioh.cloudprise.warehouse.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Gustav
 */
@Entity
public class Model implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String code;
    private String name;
    private String status;
    private Brand brand;
    private Warehouse warehouse;
    private List<Category> categories;
    private List<Manufacturer> manufacturers;
    private List<Supplier> suppliers;
    

    public String getId() {
        return code;
    }

    public void setId(String id) {
        this.code = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Model)) {
            return false;
        }
        Model other = (Model) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.xioh.cloudprise.warehouse.model.Model[ id=" + code + " ]";
    }
    
}
