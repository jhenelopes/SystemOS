package bean;
// Generated 18/10/2022 15:14:45 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Usuario generated by hbm2java
 */
@Entity
@Table(name="usuario"
    ,catalog="db_jheneferlopes"
)
public class Usuario  implements java.io.Serializable {


     private int idusuario;
     private String nome;
     private String apelido;
     private Date dataNas;
     private String cpf;
     private String senha;
     private int nivel;
     private String ativo;

    public Usuario() {
    }

	
   public Usuario(int idusuario, String nome, String cpf, String senha) {
        this.idusuario = idusuario;
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }
    public Usuario(int idusuario, String nome, String apelido, Date dataNas, String cpf, String senha, int nivel, String ativo) {
       this.idusuario = idusuario;
       this.nome = nome;
       this.apelido = apelido;
       this.dataNas = dataNas;
       this.cpf = cpf;
       this.senha = senha;
       this.nivel = nivel;
       this.ativo = ativo;
    }
   
     @Id 

    
    @Column(name="idusuario", unique=true, nullable=false)
    public int getIdusuario() {
        return this.idusuario;
    }
    
    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    
    @Column(name="nome", nullable=false, length=45)
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    @Column(name="apelido", length=10)
    public String getApelido() {
        return this.apelido;
    }
    
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="data_nas", length=10)
    public Date getDataNas() {
        return this.dataNas;
    }
    
    public void setDataNas(Date dataNas) {
        this.dataNas = dataNas;
    }

    
    @Column(name="cpf", nullable=false, length=14)
    public String getCpf() {
        return this.cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    @Column(name="senha", nullable=false, length=20)
    public String getSenha() {
        return this.senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    @Column(name="nivel")
    public int getNivel() {
        return this.nivel;
    }
    
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    
    @Column(name="ativo", length=1)
    public String getAtivo() {
        return this.ativo;
    }
    
    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }




}


