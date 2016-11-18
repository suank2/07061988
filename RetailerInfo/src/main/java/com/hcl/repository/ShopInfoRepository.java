package com.hcl.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hcl.entity.ShopInfoEntityBean;


@RepositoryRestResource
public interface ShopInfoRepository extends CrudRepository<ShopInfoEntityBean, Long> {

}
