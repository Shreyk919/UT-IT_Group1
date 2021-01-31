package com.knoldus.validator

import com.knoldus.models.Company
import org.scalatest.flatspec.AnyFlatSpec

class CompanyValidatorTest extends AnyFlatSpec {

  val companyValidator = new CompanyValidator()

  "Company" should "be valid" in {
    val companyTesting: Company = Company("Tesla",
      "abc@tesla.com",
      "Chennai")

    val testResult = companyValidator.companyIsValid(companyTesting)

    assert(testResult)

  }
  "Company" should "not be valid" in {
    val companyTesting: Company = Company("Tesla",
      "abc@tesla...com",
      "Chennai")

    val testResult = companyValidator.companyIsValid(companyTesting)

    assert(!testResult)

  }
  "Company" should "not be valid as it already exist in DB" in {
    val companyTesting: Company = Company("Knoldus",
      "abc@tesla.com",
      "Chennai")

    val testResult = companyValidator.companyIsValid(companyTesting)

    assert(!testResult)

  }



}
