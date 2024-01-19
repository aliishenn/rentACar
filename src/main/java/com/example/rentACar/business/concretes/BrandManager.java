package com.example.rentACar.business.concretes;

import com.example.rentACar.business.abstracts.BrandService;
import com.example.rentACar.dataAccess.abstracts.BrandRepository;
import com.example.rentACar.entities.concretes.Brand;

import java.util.List;

public class BrandManager implements BrandService {
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    private BrandRepository brandRepository;
    @Override
    public List<Brand> getAll() {
        return null;
    }
}
