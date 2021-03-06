package com.nabla.project.application.model.person.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

/**
 * AbstractActivity generated by MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractActivity implements java.io.Serializable
{

    private static final long serialVersionUID = 1L;

    // Fields
    private Long              id;
    private Integer           version;
    private String            name;

    // plus de relation inverse avec Person
    // private Set<Person> persons = new HashSet<Person>(0);

    // Constructors

    /** default constructor */
    public AbstractActivity()
    {
    }

    /** minimal constructor */
    public AbstractActivity(final Long id, final String name)
    {
        this.id = id;
        this.name = name;
    }

    /** full constructor */
    /*
     * public AbstractActivity(Long id, String name, Set<Person> persons) {
     * this.id = id;
     * this.name = name;
     * this.persons = persons;
     * }
     */

    // Property accessors
    @Id
    // @Column( name = "ID", unique = true, nullable = false, insertable = true, updatable = true )
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId()
    {
        return this.id;
    }

    public void setId(final Long id)
    {
        this.id = id;
    }

    @Version
    @Column(name = "VERSION", unique = false, nullable = false, insertable = true, updatable = true)
    public Integer getVersion()
    {
        return this.version;
    }

    public void setVersion(final Integer version)
    {
        this.version = version;
    }

    @Column(name = "NAME", unique = true, nullable = false, insertable = true, updatable = true, length = 30)
    public String getName()
    {
        return this.name;
    }

    public void setName(final String name)
    {
        this.name = name;
    }

    /*
     * @ManyToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY, mappedBy = "activities")
     * public Set<Person> getPersons() {
     * return this.persons;
     * }
     * public void setPersons(Set<Person> persons) {
     * this.persons = persons;
     * }
     */
}
