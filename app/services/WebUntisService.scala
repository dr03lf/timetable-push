package services

import scaldi.{Injector, Injectable}


class WebUntisService(implicit inj: Injector) extends Injectable{

  val network = inject[Network]

  def getTimetable(serverUrl: String, cookie: Seq[String], elementType: Int, elementId: Int, date: Int) = {
    network.getTimetable(serverUrl, cookie, elementType, elementId, date)
  }

  def auth2(serverUrl: String, school: String, username: String, password: String) = {
    network.authenticate(serverUrl, school, username, password)
  }

  def getList(serverUrl: String, authCookie: Seq[String], elementType: Int) = {
    network.getList(serverUrl, authCookie, elementType)
  }

  def schoolSearch(searchParams: String) = {
    network.schoolSearch(searchParams)
  }

}
