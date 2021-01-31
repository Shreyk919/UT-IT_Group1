package com.knoldus.validator

import com.knoldus.models.User
import org.scalatest.flatspec.AnyFlatSpec

class UserValidatorTest extends AnyFlatSpec {

  val userValidator:UserValidator=new UserValidator()

  behavior of  "this user"

  it should "be valid as its company exist in database and the email id is also written in correct format" in{
    val user:User= User("Shreyash","Kumar","sk199@gmail.com","Knoldus")
    assert(userValidator.userIsValid(user))
  }

  it should "not be valid as its company does not exist in database and the email id is also invalid" in{
    val user:User= User("Mohd","ALimuddin","mdalim@gmail.com","Sun Tech")
    assert(!userValidator.userIsValid(user))
  }

  it should "not be valid as its email id is invalid" in{
    val user:User= User("Diyansh","Devrani","ddevrani@gmail..com","Xiaomi")
    assert(!userValidator.userIsValid(user))
  }

  it should "not be valid as its company does not exist in database" in{
    val user:User= User("Ashish","Chowdhary","achowdhary@gmail.com","Tap Tech")
    assert(!userValidator.userIsValid(user))
  }

}
