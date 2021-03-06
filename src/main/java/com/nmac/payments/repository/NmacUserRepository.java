/*
 * Created on 7 Sep 2017 ( Time 17:05:08 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */

package com.nmac.payments.repository;

import com.nmac.payments.entities.NmacUser ;

import org.springframework.data.repository.PagingAndSortingRepository;



/**
 * Spring JPA Repository for User
 * 
 * @author Rodrigo Torres (Heroku)
 *
 */
public interface NmacUserRepository extends PagingAndSortingRepository<NmacUser, Integer> {

}