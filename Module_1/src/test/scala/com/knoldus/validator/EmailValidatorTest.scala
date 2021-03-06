package com.knoldus.validator

import org.scalatest.flatspec.AnyFlatSpec

class EmailValidatorTest extends AnyFlatSpec {

  val emailValidator: EmailValidator = new EmailValidator()

  "This Email" should "be valid" in {

    val email = "sk199@gmail.com"
    assert(emailValidator.isEmailValid(email))
  }

  it should "also be valid if written in this way" in {

    val email= "sk199@gmail.com.org"
    assert(emailValidator.isEmailValid(email))
  }

  it should "not valid if it contains blank spaces" in {

    val email= "sk 199@gmail.com" //email containing blank space
    assert(!emailValidator.isEmailValid(email))

  }

  it should "also not valid if it contains two or more than two dot's" in {

    val email = "sk199@gmail...com" // email containing multiple dots.
    assert(!emailValidator.isEmailValid(email))
  }

  it should "also invalid if it is not having @ Symbol in it" in {

    val email= "sk199gmail.com" // @ Symbol not present.
    assert(!emailValidator.isEmailValid(email))
  }
}

