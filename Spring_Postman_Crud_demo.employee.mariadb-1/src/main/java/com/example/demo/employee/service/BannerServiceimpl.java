package com.example.demo.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.employee.entity.Banner;
import com.example.demo.employee.repository.BannerRepository;
@Service
public class BannerServiceimpl implements BannerService{
	
	@Autowired
	private BannerRepository bannerrepository;
	

	@Override
	public List<Banner> getAll() {
	

		return bannerrepository.findAll();
	}

}
