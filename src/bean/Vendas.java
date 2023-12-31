package bean;
// Generated 18/10/2022 15:14:45 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Vendas generated by hbm2java
 */
@Entity
@Table(name="vendas"
    ,catalog="db_jheneferlopes"
)
public class Vendas  implements java.io.Serializable {


     private int idvendas;
     private Clientes clientes;
     private Vendedor vendedor;
     private Date data;
     private double total;


    public Vendas() {
    }

	
   public Vendas(int idvendas, Clientes clientes, Vendedor vendedor, Date data, double total) {
        this.idvendas = idvendas;
        this.clientes = clientes;
        this.vendedor = vendedor;
        this.data = data;
        this.total = total;
    }
    
     @Id 

    
    @Column(name="idvendas", unique=true, nullable=false)
    public int getIdvendas() {
        return this.idvendas;
    }
    
    public void setIdvendas(int idvendas) {
        this.idvendas = idvendas;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idcliente", nullable=false)
    public Clientes getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="vendedor", nullable=false)
    public Vendedor getVendedor() {
        return this.vendedor;
    }
    
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="data", nullable=false, length=10)
    public Date getData() {
        return this.data;
    }
    
    public void setData(Date data) {
        this.data = data;
    }

    
    @Column(name="total", nullable=false, precision=10)
    public double getTotal() {
        return this.total;
    }
    
    public void setTotal(double total) {
        this.total = total;
    }


}


