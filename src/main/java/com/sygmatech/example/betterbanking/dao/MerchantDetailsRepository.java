package com.sygmatech.example.betterbanking.dao;

import java.util.Optional;

public interface MerchantDetailsRepository {

    Optional<String> findMerchantLogo(final String merchantName);
}
