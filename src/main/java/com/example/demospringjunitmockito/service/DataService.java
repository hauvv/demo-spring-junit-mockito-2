package com.example.demospringjunitmockito.service;

import org.springframework.stereotype.Repository;

@Repository
public interface DataService {
	public int[] retrieveAllData();
}
