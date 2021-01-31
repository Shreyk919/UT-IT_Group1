package com.knoldus.validator
import java.util.regex._

class EmailValidator {

val emailRegex: String ="^[_A-Za-z0-9]+@"+"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
val pattern: Pattern =Pattern.compile(emailRegex)

  //the method given below will return true if given email address is valid, else it will return false.
  def isEmailValid(email:String): Boolean={
    val matcher:Matcher= pattern.matcher(email)
    matcher.matches
  }
}
