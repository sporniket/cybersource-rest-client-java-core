
# Ptsv2paymentsidcapturesAggregatorInformation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregatorId** | **String** | Value that identifies you as a payment aggregator. Get this value from the processor.  **CyberSource through VisaNet**\\ The value for this field corresponds to the following data in the TC 33 capture file5: - Record: CP01 TCR6 - Position: 95-105 - Field: MasterCard Payment Facilitator ID  **FDC Compass**\\ This value must consist of uppercase characters.  ccAuthService\\ **American Express Direct**: R for all aggregator transactions.\\ **CyberSource through VisaNet**: R for Mastercard aggregator transactions and for American Express aggregator authorizations; otherwise, not used.\\ **FDC Compass**: R for all aggregator transactions.\\ **FDC Nashville Global**: R for all aggregator transactions.  For processor-specific information, see the &#x60;aggregator_id&#x60; field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)  |  [optional]
**name** | **String** | Your payment aggregator business name.  **American Express Direct**\\ The maximum length of the aggregator name depends on the length of the sub-merchant name. The combined length for both values must not exceed 36 characters.\\  **CyberSource through VisaNet**\\ With American Express, the maximum length of the aggregator name depends on the length of the sub-merchant name. The combined length for both values must not exceed 36 characters. The value for this field does not map to the TC 33 capture file5.  **FDC Compass**\\ This value must consist of uppercase characters.  For processor-specific information, see the aggregator_name field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)  |  [optional]
**subMerchant** | [**Ptsv2paymentsidcapturesAggregatorInformationSubMerchant**](Ptsv2paymentsidcapturesAggregatorInformationSubMerchant.md) |  |  [optional]


