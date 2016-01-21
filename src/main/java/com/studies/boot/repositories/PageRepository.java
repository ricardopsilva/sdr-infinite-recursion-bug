package com.studies.boot.repositories;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.studies.boot.model.Page;

@RepositoryRestResource(collectionResourceRel="pages", path="pages")
public interface PageRepository extends PagingAndSortingRepository<Page, UUID>{

}
