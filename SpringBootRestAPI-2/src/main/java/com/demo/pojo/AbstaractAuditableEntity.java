/**
 * 
 */
package com.demo.pojo;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.EntityListeners;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;
import lombok.Setter;

/**
 * @author manu
 *
 */
@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class AbstaractAuditableEntity<U,ID> extends AbstractPersistableEntity<ID> implements Serializable{
	
	@CreatedDate
	LocalDate createDate;
	
	@LastModifiedDate
	LocalDate lastmodifiedDate;
	
	@CreatedBy
	@ManyToOne
	@JoinColumn(name="created_by")
	U createdBy;
	
	
	@LastModifiedBy
	@ManyToOne
	@JoinColumn(name="last_modified_by")
	U lastmodifiedBy;
	

}
