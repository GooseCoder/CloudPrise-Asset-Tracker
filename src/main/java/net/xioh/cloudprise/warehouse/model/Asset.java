/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.xioh.cloudprise.warehouse.model;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import net.xioh.cloudprise.warehouse.rbac.User;

/**
 *
 * @author Gustav
 */
@Entity
public class Asset implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String code;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date inclusionDate;
    private String inclusionDetails;
    private String status;
    private String setOfAssets;
    private Model model;
    private OrganizationalUnit oUnit;
    private User assignedTo;

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
        if (!(object instanceof Asset)) {
            return false;
        }
        Asset other = (Asset) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.xioh.cloudprise.warehouse.model.Asset[ id=" + code + " ]";
    }
    
}
