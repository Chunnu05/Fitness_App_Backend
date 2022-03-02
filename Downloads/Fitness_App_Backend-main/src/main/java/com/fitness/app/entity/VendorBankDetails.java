package com.fitness.app.entity;


import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(value = "vendor_bank")
public class VendorBankDetails {

	
	@Field
	private String email;
	@Field
	private String accountant_name;
	@Field
    private String bank_name;
	@Field
    private String branch_name;
	@Field
    private Long account_nubmer;
	@Field
    private String bank_IFSC;


}
