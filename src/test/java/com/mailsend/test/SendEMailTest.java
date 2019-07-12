package com.mailsend.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class SendEMailTest 
{
	public SendMail mail;
  
  @BeforeClass
  public void beforeClass() 
  {
	  mail = new SendMail();
  }
  
  @Test
  public void sendingEmail() 
  {
	  mail.sendanEmail();
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("Mail Sent Successfully From AfterClass");
  }

}
