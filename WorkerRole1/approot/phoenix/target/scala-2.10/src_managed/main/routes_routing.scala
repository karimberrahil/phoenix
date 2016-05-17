// @SOURCE:C:/Users/Karim/Desktop/deploy/azure/phoenix/conf/routes
// @HASH:70117884ca44e0798574f336cf9a687b36be7505
// @DATE:Tue May 17 21:57:34 CEST 2016


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_Assets_at1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:13
private[this] lazy val controllers_Application_index2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users"))))
        

// @LINE:15
private[this] lazy val controllers_Application_register3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("register"))))
        

// @LINE:16
private[this] lazy val controllers_Application_newUser4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("register"))))
        

// @LINE:18
private[this] lazy val controllers_Session_login5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:19
private[this] lazy val controllers_Session_authenticate6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:20
private[this] lazy val controllers_Session_logout7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:22
private[this] lazy val controllers_Application_confirmDon8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("validate/"),DynamicPart("id_prj", """[^/]+""",true))))
        

// @LINE:23
private[this] lazy val controllers_Application_validate9 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("validate"))))
        

// @LINE:25
private[this] lazy val controllers_Projects_listAll10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projects"))))
        

// @LINE:26
private[this] lazy val controllers_Projects_show11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projects/"),DynamicPart("id", """[0-9]+""",false))))
        

// @LINE:28
private[this] lazy val controllers_Events_listAll12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("events"))))
        

// @LINE:29
private[this] lazy val controllers_Events_show13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("events/"),DynamicPart("id", """[0-9]+""",false))))
        

// @LINE:31
private[this] lazy val controllers_Projects_newProject14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ajoutProjet"))))
        

// @LINE:32
private[this] lazy val controllers_Projects_addProject15 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ajoutProjet"))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users""","""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """register""","""controllers.Application.register()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """register""","""controllers.Application.newUser()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Session.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Session.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Session.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """validate/$id_prj<[^/]+>""","""controllers.Application.confirmDon(id_prj:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """validate""","""controllers.Application.validate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projects""","""controllers.Projects.listAll()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projects/$id<[0-9]+>""","""controllers.Projects.show(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """events""","""controllers.Events.listAll()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """events/$id<[0-9]+>""","""controllers.Events.show(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ajoutProjet""","""controllers.Projects.newProject()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ajoutProjet""","""controllers.Projects.addProject()""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_Assets_at1(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:13
case controllers_Application_index2(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """""", Routes.prefix + """users"""))
   }
}
        

// @LINE:15
case controllers_Application_register3(params) => {
   call { 
        invokeHandler(controllers.Application.register(), HandlerDef(this, "controllers.Application", "register", Nil,"GET", """""", Routes.prefix + """register"""))
   }
}
        

// @LINE:16
case controllers_Application_newUser4(params) => {
   call { 
        invokeHandler(controllers.Application.newUser(), HandlerDef(this, "controllers.Application", "newUser", Nil,"POST", """""", Routes.prefix + """register"""))
   }
}
        

// @LINE:18
case controllers_Session_login5(params) => {
   call { 
        invokeHandler(controllers.Session.login(), HandlerDef(this, "controllers.Session", "login", Nil,"GET", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:19
case controllers_Session_authenticate6(params) => {
   call { 
        invokeHandler(controllers.Session.authenticate(), HandlerDef(this, "controllers.Session", "authenticate", Nil,"POST", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:20
case controllers_Session_logout7(params) => {
   call { 
        invokeHandler(controllers.Session.logout(), HandlerDef(this, "controllers.Session", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:22
case controllers_Application_confirmDon8(params) => {
   call(params.fromPath[Long]("id_prj", None)) { (id_prj) =>
        invokeHandler(controllers.Application.confirmDon(id_prj), HandlerDef(this, "controllers.Application", "confirmDon", Seq(classOf[Long]),"GET", """""", Routes.prefix + """validate/$id_prj<[^/]+>"""))
   }
}
        

// @LINE:23
case controllers_Application_validate9(params) => {
   call { 
        invokeHandler(controllers.Application.validate(), HandlerDef(this, "controllers.Application", "validate", Nil,"POST", """""", Routes.prefix + """validate"""))
   }
}
        

// @LINE:25
case controllers_Projects_listAll10(params) => {
   call { 
        invokeHandler(controllers.Projects.listAll(), HandlerDef(this, "controllers.Projects", "listAll", Nil,"GET", """""", Routes.prefix + """projects"""))
   }
}
        

// @LINE:26
case controllers_Projects_show11(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Projects.show(id), HandlerDef(this, "controllers.Projects", "show", Seq(classOf[Long]),"GET", """""", Routes.prefix + """projects/$id<[0-9]+>"""))
   }
}
        

// @LINE:28
case controllers_Events_listAll12(params) => {
   call { 
        invokeHandler(controllers.Events.listAll(), HandlerDef(this, "controllers.Events", "listAll", Nil,"GET", """""", Routes.prefix + """events"""))
   }
}
        

// @LINE:29
case controllers_Events_show13(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Events.show(id), HandlerDef(this, "controllers.Events", "show", Seq(classOf[Long]),"GET", """""", Routes.prefix + """events/$id<[0-9]+>"""))
   }
}
        

// @LINE:31
case controllers_Projects_newProject14(params) => {
   call { 
        invokeHandler(controllers.Projects.newProject(), HandlerDef(this, "controllers.Projects", "newProject", Nil,"GET", """""", Routes.prefix + """ajoutProjet"""))
   }
}
        

// @LINE:32
case controllers_Projects_addProject15(params) => {
   call { 
        invokeHandler(controllers.Projects.addProject(), HandlerDef(this, "controllers.Projects", "addProject", Nil,"POST", """""", Routes.prefix + """ajoutProjet"""))
   }
}
        
}

}
     