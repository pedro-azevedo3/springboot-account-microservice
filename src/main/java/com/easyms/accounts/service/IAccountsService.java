package com.easyms.accounts.service;

import com.easyms.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     *
     * @param customerDto - CustomerDtio Object
     */
    void createAccount(CustomerDto customerDto);

}
