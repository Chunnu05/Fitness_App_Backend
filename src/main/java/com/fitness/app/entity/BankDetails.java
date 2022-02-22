package com.fitness.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankDetails {

    private String bankName;
    private Long accountNubmer;
    private String bankIFSC;
    private Long total_balance;
    private Long tobe_creadited;


}
