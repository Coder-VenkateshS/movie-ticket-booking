package com.face.bo;

public class RegisterBO {
	private String fname;
	 private String mob;
	 private String ref;
	 private String mail;
	 private String op;
	 private String cname;
	 private String address;
	 public void setfName(String Name)
	 {
	 fname = Name;
	 }
	 public String getfName()
	 {
	 return fname;
	 }
	 public void setmob(String No)
	 {
	 mob=No;
	 }
	 public String getmob()
	 {
	 return mob;
	 }
	 public void setcn(String a)
	 {
	 cname = a;
	 }
	 public String getcn()
	 {
	 return cname;
	 }
	 public void setre(String a)
	 {
	 ref=a;
	 }
	 public String getre()
	 {
	 return ref;
	 }
	 public void setmid(String dt)
	 {
	 mail = dt;
	 }
	 public String getmid()
	 {
	 return mail;
	 }
	
	 public void setoption(String a)
	 {
	 op=a;
	 }
	 public String getoption()
	 {
	 return op;
	 }
	 public void setadd(String a)
	 {
	 address = a;
	 }
	 public String getadd()
	 {
	 return address;
	 }
	}