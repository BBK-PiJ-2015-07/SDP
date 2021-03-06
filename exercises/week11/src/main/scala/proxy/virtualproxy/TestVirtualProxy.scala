package proxy.virtualproxy

object TestVirtualProxy extends App {
  var contactList: ContactList = new ContactListProxyImpl()
  val company: Company =
    new Company("ABC Company", "Alabama", "011-2845-8965", contactList)
  println("Company Name: " + company.companyName)
  println("Company Address: " + company.companyAddress)
  println("Company Contact No.: " + company.companyContactNo)
  println("Requesting for contact list")
  contactList = company.contactList
  val empList = contactList.employeeList
  for (emp <- empList) {
    println(emp)
  }

  println("Requesting for contact list again")
  var contactList2 = company.contactList
  val empList2 = contactList2.employeeList
  for (emp <- empList2) {
    println(emp)
  }
}
