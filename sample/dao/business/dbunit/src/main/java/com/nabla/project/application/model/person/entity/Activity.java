package com.nabla.project.application.model.person.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Activity generated by MyEclipse Persistence Tools
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "ACTIVITY", schema = "" /*
                                       * , uniqueConstraints =
                                       * {
                                       * @UniqueConstraint( columnNames =
                                       * {
                                       * "NAME"}
                                       * )
                                       * }
                                       */)
public class Activity extends AbstractActivity implements java.io.Serializable
{
    // Constructors

    /** default constructor */
    public Activity()
    {
    }

    /** minimal constructor */
    public Activity(final Long id, final String name)
    {
        super(id, name);
    }

    /** full constructor */
    /*
     * public Activity(Long id, String name, Set<Person> persons) {
     * super(id, name, persons);
     * }
     */
    public Activity(final Long id, final int version, final String name)
    {
        super();
        this.setId(id);
        this.setVersion(version);
        this.setName(name);
    }

    @Override
    public String toString()
    {
        return String.format("Ac[%d,%d,%s]", this.getId(), this.getVersion(), this.getName());
    }
}
