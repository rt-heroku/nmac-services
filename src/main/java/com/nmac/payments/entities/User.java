/*
 * Created on 7 Sep 2017 ( Time 17:05:08 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
// This Bean has a basic Primary Key (not composite) 

package com.nmac.payments.entities;

import java.io.Serializable;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

import javax.persistence.*;

/**
 * Persistent class for entity stored in table "user"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="user", schema="salesforce" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="User.countAll", query="SELECT COUNT(x) FROM User x" )
} )
public class User implements Serializable
{
    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id", nullable=false)
    private Integer    id           ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    

    @Column(name="sfid", length=18)
    private String     sfid         ;


    @Column(name="firstname", length=40)
    private String     firstname    ;


    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="createddate")
    private Date       createddate  ;


    @Column(name="name", length=121)
    private String     name         ;


    @Transient
    @JsonIgnore
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="systemmodstamp")
    private Date       systemmodstamp ;


    @Column(name="aas_user_name__c", length=255)
    private String     aasUserNameC ;


    @Column(name="lastname", length=80)
    private String     lastname     ;


    @Column(name="email", length=128)
    private String     email        ;


    @Column(name="federationidentifier", length=512)
    private String     federationidentifier ;


    @Transient
    @JsonIgnore
    @Column(name="_hc_err", length=2147483647)
    private String     hcErr        ;


    @Column(name="username", length=80)
    private String     username     ;


    @Transient
    @JsonIgnore
    @Column(name="_hc_lastop", length=32)
    private String     hcLastop     ;


    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="creationdate__c")
    private Date       creationdateC ;


    @Column(name="profileid", length=18)
    private String     profileid    ;



    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public User()
    {
		super();
    }

    public User update(User a) {
		this.id = a.id;
        this.sfid = a.sfid;
        this.firstname = a.firstname;
        this.createddate = a.createddate;
        this.name = a.name;
        this.systemmodstamp = a.systemmodstamp;
        this.aasUserNameC = a.aasUserNameC;
        this.lastname = a.lastname;
        this.email = a.email;
        this.federationidentifier = a.federationidentifier;
        this.hcErr = a.hcErr;
        this.username = a.username;
        this.hcLastop = a.hcLastop;
        this.creationdateC = a.creationdateC;
        this.profileid = a.profileid;



		return a;
	}

    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setId( Integer id )
    {
        this.id = id ;
    }
    public Integer getId()
    {
        return this.id;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : sfid ( varchar ) 
    public void setSfid( String sfid )
    {
        this.sfid = sfid;
    }
    public String getSfid()
    {
        return this.sfid;
    }

    //--- DATABASE MAPPING : firstname ( varchar ) 
    public void setFirstname( String firstname )
    {
        this.firstname = firstname;
    }
    public String getFirstname()
    {
        return this.firstname;
    }

    //--- DATABASE MAPPING : createddate ( timestamp ) 
    public void setCreateddate( Date createddate )
    {
        this.createddate = createddate;
    }
    public Date getCreateddate()
    {
        return this.createddate;
    }

    //--- DATABASE MAPPING : name ( varchar ) 
    public void setName( String name )
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }

    //--- DATABASE MAPPING : systemmodstamp ( timestamp ) 
    public void setSystemmodstamp( Date systemmodstamp )
    {
        this.systemmodstamp = systemmodstamp;
    }
    public Date getSystemmodstamp()
    {
        return this.systemmodstamp;
    }

    //--- DATABASE MAPPING : aas_user_name__c ( varchar ) 
    public void setAasUserNameC( String aasUserNameC )
    {
        this.aasUserNameC = aasUserNameC;
    }
    public String getAasUserNameC()
    {
        return this.aasUserNameC;
    }

    //--- DATABASE MAPPING : lastname ( varchar ) 
    public void setLastname( String lastname )
    {
        this.lastname = lastname;
    }
    public String getLastname()
    {
        return this.lastname;
    }

    //--- DATABASE MAPPING : email ( varchar ) 
    public void setEmail( String email )
    {
        this.email = email;
    }
    public String getEmail()
    {
        return this.email;
    }

    //--- DATABASE MAPPING : federationidentifier ( varchar ) 
    public void setFederationidentifier( String federationidentifier )
    {
        this.federationidentifier = federationidentifier;
    }
    public String getFederationidentifier()
    {
        return this.federationidentifier;
    }

    //--- DATABASE MAPPING : _hc_err ( text ) 
    public void setHcErr( String hcErr )
    {
        this.hcErr = hcErr;
    }
    public String getHcErr()
    {
        return this.hcErr;
    }

    //--- DATABASE MAPPING : username ( varchar ) 
    public void setUsername( String username )
    {
        this.username = username;
    }
    public String getUsername()
    {
        return this.username;
    }

    //--- DATABASE MAPPING : _hc_lastop ( varchar ) 
    public void setHcLastop( String hcLastop )
    {
        this.hcLastop = hcLastop;
    }
    public String getHcLastop()
    {
        return this.hcLastop;
    }

    //--- DATABASE MAPPING : creationdate__c ( timestamp ) 
    public void setCreationdateC( Date creationdateC )
    {
        this.creationdateC = creationdateC;
    }
    public Date getCreationdateC()
    {
        return this.creationdateC;
    }

    //--- DATABASE MAPPING : profileid ( varchar ) 
    public void setProfileid( String profileid )
    {
        this.profileid = profileid;
    }
    public String getProfileid()
    {
        return this.profileid;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(id);
        sb.append("]:"); 
        sb.append(sfid);
        sb.append("|");
        sb.append(firstname);
        sb.append("|");
        sb.append(createddate);
        sb.append("|");
        sb.append(name);
        sb.append("|");
        sb.append(systemmodstamp);
        sb.append("|");
        sb.append(aasUserNameC);
        sb.append("|");
        sb.append(lastname);
        sb.append("|");
        sb.append(email);
        sb.append("|");
        sb.append(federationidentifier);
        sb.append("|");
        sb.append(hcErr);
        sb.append("|");
        sb.append(username);
        sb.append("|");
        sb.append(hcLastop);
        sb.append("|");
        sb.append(creationdateC);
        sb.append("|");
        sb.append(profileid);
        return sb.toString(); 
    } 

}