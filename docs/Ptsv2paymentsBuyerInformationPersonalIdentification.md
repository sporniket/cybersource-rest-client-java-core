
# Ptsv2paymentsBuyerInformationPersonalIdentification

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | The type of the identification.  Possible values:   - &#x60;NATIONAL&#x60;   - &#x60;CPF&#x60;   - &#x60;CPNJ&#x60;   - &#x60;CURP&#x60;   - &#x60;SSN&#x60;   - &#x60;DRIVER_LICENSE&#x60;  This field is supported only on the following processors.  #### ComercioLatino Set this field to the Cadastro de Pessoas Fisicas (CPF).  #### CyberSource Latin American Processing Supported for Redecard in Brazil. Set this field to the Cadastro de Pessoas Fisicas (CPF), which is required for AVS for Redecard in Brazil. **Note** CyberSource Latin American Processing is the name of a specific processing connection that CyberSource supports. In the CyberSource API documentation, CyberSource Latin American Processing does not refer to the general topic of processing in Latin America. The information in this field description is for the specific processing connection called CyberSource Latin American Processing. It is not for any other Latin American processors that CyberSource supports.  |  [optional]
**id** | **String** | The value of the identification type. This field is supported only on the following processors.  #### ComercioLatino Set this field to the Cadastro de Pessoas Fisicas (CPF).  #### CyberSource Latin American Processing Supported for Redecard in Brazil. Set this field to the Cadastro de Pessoas Fisicas (CPF), which is required for AVS for Redecard in Brazil. **Note** CyberSource Latin American Processing is the name of a specific processing connection that CyberSource supports. In the CyberSource API documentation, CyberSource Latin American Processing does not refer to the general topic of processing in Latin America. The information in this field description is for the specific processing connection called CyberSource Latin American Processing. It is not for any other Latin American processors that CyberSource supports.  For processor-specific information, see the &#x60;personal_id&#x60; field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)    If &#x60;type &#x3D; PASSPORT&#x60;, this is the cardholder&#39;s passport number. Recommended for Discover ProtectBuy.  |  [optional]
**issuedBy** | **String** | The government agency that issued the driver&#39;s license or passport.  If **type**&#x60; &#x3D; DRIVER_LICENSE&#x60;, this is the State or province where the customer’s driver’s license was issued.  If **type**&#x60; &#x3D; PASSPORT&#x60;, this is the Issuing country for the cardholder’s passport. Recommended for Discover ProtectBuy.  Use the two-character State, Province, and Territory Codes for the United States and Canada.  #### TeleCheck Contact your TeleCheck representative to find out whether this field is required or optional.  #### All Other Processors Not used.  For details about the country that issued the passport, see &#x60;customer_passport_country&#x60; field description in [CyberSource Payer Authentication Using the SCMP API] (https://apps.cybersource.com/library/documentation/dev_guides/Payer_Authentication_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  For details about the state or province that issued the passport, see &#x60;driver_license_state&#x60; field description in [Electronic Check Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/EChecks_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
NATIONAL | &quot;NATIONAL&quot;
CPF | &quot;CPF&quot;
CPNJ | &quot;CPNJ&quot;
CURP | &quot;CURP&quot;
SSN | &quot;SSN&quot;
DRIVER_LICENSE | &quot;DRIVER_LICENSE&quot;


